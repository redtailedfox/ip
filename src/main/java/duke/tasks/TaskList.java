package duke.tasks;

import java.util.ArrayList;

public class TaskList {
    private ArrayList<Task> l = new ArrayList<>();

    public TaskList(ArrayList<Task> list) {
        this.l = list;
    }

    public void add(Task task) {
        this.l.add(task);
    }

    public void del(int idx) {
        this.l.remove(idx-1);
    }

    public int getSize() {
        return l.size();
    }

    public Task get(int idx) {
        return this.l.get(idx-1);
    }

    public String format() {
        String res = "";
        for(int i = 0; i < l.size(); ++i) {
            res += l.get(i).makeFormat();
        }
        return res;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for(int i = 1; i <= l.size(); ++i) {
            res.append(String.format("%d. %s\n" , i, l.get(i-1)));
        }
        return res.toString();
    }
}
package de.marvnet.mnlib.log;

import java.util.ArrayList;

public class Logger {

    private int i;
    private ArrayList<LogEntry>  entries = new ArrayList<LogEntry>();

    public Logger(int unique_id) {
        this.i = unique_id;
    }

    public void addEntry(LogEntry entry) {
        this.entries.add(entry);
    }

    public ArrayList<LogEntry> getEntries() {
        return this.entries;
    }
}

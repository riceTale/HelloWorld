package org.example;

import java.util.*;

public class Trial<T> {
    private Map<String, T> map;
    public Trial () {
        this.map = new HashMap<>();
    }

    public T returnValue(String key) {
        return map.get(key);
    }

    public void insert(String key, T value) {
        map.put(key, value);
    }
}

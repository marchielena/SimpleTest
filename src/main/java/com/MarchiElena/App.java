package com.MarchiElena;

import java.util.Arrays;

public class App {
    public static boolean comp(int[] a, int[] b) {
        if (a == null || b == null || a.length != b.length) {
            return false;
        }
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.pow(a[i], 2);
        }
        Arrays.sort(a);
        Arrays.sort(b);
        for (int i = 0; i < a.length; ++i) {
            if (a[i] != b[i]) {
                return false;
            }
        }
        return true;
    }
}
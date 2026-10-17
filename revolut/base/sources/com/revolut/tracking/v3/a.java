package com.revolut.tracking.v3;

/* JADX INFO: loaded from: classes12.dex */
public enum a {
    STATIC(1),
    DYNAMIC(2),
    ACTION_NOT_SET(0);

    private final int value;

    a(int i) {
        this.value = i;
    }

    public static a a(int i) {
        if (i == 0) {
            return ACTION_NOT_SET;
        }
        if (i == 1) {
            return STATIC;
        }
        if (i != 2) {
            return null;
        }
        return DYNAMIC;
    }
}

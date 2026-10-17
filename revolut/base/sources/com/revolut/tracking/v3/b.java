package com.revolut.tracking.v3;

/* JADX INFO: loaded from: classes12.dex */
public enum b {
    MOBILE(9),
    WEB(10),
    DEVICE_NOT_SET(0);

    private final int value;

    b(int i) {
        this.value = i;
    }

    public static b a(int i) {
        if (i == 0) {
            return DEVICE_NOT_SET;
        }
        if (i == 9) {
            return MOBILE;
        }
        if (i != 10) {
            return null;
        }
        return WEB;
    }
}

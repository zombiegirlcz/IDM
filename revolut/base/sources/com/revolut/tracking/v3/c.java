package com.revolut.tracking.v3;

/* JADX INFO: loaded from: classes12.dex */
public enum c {
    UI_INTERACTION(1),
    SCREEN_METADATA(2),
    METADATA_NOT_SET(0);

    private final int value;

    c(int i) {
        this.value = i;
    }

    public static c a(int i) {
        if (i == 0) {
            return METADATA_NOT_SET;
        }
        if (i == 1) {
            return UI_INTERACTION;
        }
        if (i != 2) {
            return null;
        }
        return SCREEN_METADATA;
    }
}

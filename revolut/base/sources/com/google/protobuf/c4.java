package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum c4 {
    NULL_VALUE(1),
    NUMBER_VALUE(2),
    STRING_VALUE(3),
    BOOL_VALUE(4),
    STRUCT_VALUE(5),
    LIST_VALUE(6),
    KIND_NOT_SET(0);

    private final int value;

    c4(int i) {
        this.value = i;
    }
}

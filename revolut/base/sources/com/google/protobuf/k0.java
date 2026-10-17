package com.google.protobuf;

/* JADX INFO: loaded from: classes.dex */
public enum k0 {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    k0(boolean z) {
        this.isList = z;
    }
}

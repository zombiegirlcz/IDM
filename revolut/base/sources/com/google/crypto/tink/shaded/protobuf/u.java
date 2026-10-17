package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public enum u {
    SCALAR(false),
    VECTOR(true),
    PACKED_VECTOR(true),
    MAP(false);

    private final boolean isList;

    u(boolean z) {
        this.isList = z;
    }
}

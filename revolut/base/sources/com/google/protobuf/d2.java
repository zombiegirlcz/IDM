package com.google.protobuf;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public interface d2 extends e2 {
    m2 getParserForType();

    int getSerializedSize();

    c2 newBuilderForType();

    c2 toBuilder();

    byte[] toByteArray();

    void writeTo(y yVar);

    void writeTo(OutputStream outputStream);
}

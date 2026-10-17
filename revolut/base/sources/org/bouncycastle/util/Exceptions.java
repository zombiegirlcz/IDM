package org.bouncycastle.util;

import java.io.IOException;

/* JADX INFO: loaded from: classes14.dex */
public class Exceptions {
    public static IllegalArgumentException illegalArgumentException(String str, Throwable th10) {
        return new IllegalArgumentException(str, th10);
    }

    public static IllegalStateException illegalStateException(String str, Throwable th10) {
        return new IllegalStateException(str, th10);
    }

    public static IOException ioException(String str, Throwable th10) {
        return new IOException(str, th10);
    }
}

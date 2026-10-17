package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes.dex */
public abstract class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f49738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f49739b;

    static {
        Charset.forName("US-ASCII");
        f49738a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f49739b = bArr;
        ByteBuffer.wrap(bArr);
        t.h(bArr, 0, 0, false);
    }

    public static void a(Object obj2, String str) {
        if (obj2 == null) {
            throw new NullPointerException(str);
        }
    }

    public static int b(long j2) {
        return (int) (j2 ^ (j2 >>> 32));
    }
}

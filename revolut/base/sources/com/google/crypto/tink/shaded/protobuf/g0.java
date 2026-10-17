package com.google.crypto.tink.shaded.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes17.dex */
public abstract class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f49364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f49365b;

    static {
        Charset.forName("US-ASCII");
        f49364a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f49365b = bArr;
        ByteBuffer.wrap(bArr);
        cd.e.i(bArr, 0, 0, false);
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

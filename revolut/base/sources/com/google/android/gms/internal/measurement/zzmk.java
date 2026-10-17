package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes16.dex */
public final class zzmk {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final Charset f40465zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final byte[] f40466zzb;

    static {
        Charset.forName("US-ASCII");
        f40465zza = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f40466zzb = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zzle(bArr, 0, 0, false, null).zza(0);
        } catch (zzmm e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i5 = 0; i5 < i3; i5++) {
            i = (i * 31) + bArr[i5];
        }
        return i;
    }

    public static Object zzc(Object obj2, String str) {
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException("messageType");
    }
}

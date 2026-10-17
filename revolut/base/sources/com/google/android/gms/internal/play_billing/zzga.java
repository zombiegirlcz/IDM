package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes16.dex */
public final class zzga {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final Charset f46029zza = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final byte[] f46030zzb;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f46030zzb = bArr;
        ByteBuffer.wrap(bArr);
        try {
            new zzew(bArr, 0, 0, false, null).zza(0);
        } catch (zzgc e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    public static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i = (i * 31) + bArr[i5];
        }
        return i;
    }
}

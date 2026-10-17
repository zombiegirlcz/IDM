package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes16.dex */
public final class zzfa {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    static final Charset f39045zza = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    static final Charset f39046zzb = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    static final Charset f39047zzc = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    public static final byte[] f39048zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    public static final ByteBuffer f39049zze;

    /* JADX INFO: renamed from: zzf, reason: collision with root package name */
    public static final zzej f39050zzf;

    static {
        byte[] bArr = new byte[0];
        f39048zzd = bArr;
        f39049zze = ByteBuffer.wrap(bArr);
        zzeh zzehVar = new zzeh(bArr, 0, 0, false, null);
        try {
            zzehVar.zza(0);
            f39050zzf = zzehVar;
        } catch (zzfb e) {
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

    public static String zzd(byte[] bArr) {
        return new String(bArr, f39046zzb);
    }
}

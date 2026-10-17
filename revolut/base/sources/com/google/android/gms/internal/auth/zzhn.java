package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes16.dex */
final class zzhn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    public static final /* synthetic */ int f39136zza = 0;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private static final zzhl f39137zzb;

    static {
        if (zzhj.zzu() && zzhj.zzv()) {
            int i = zzds.f38996zza;
        }
        f39137zzb = new zzhm();
    }

    public static /* bridge */ /* synthetic */ int zza(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte b4 = bArr[i - 1];
        if (i3 == 0) {
            if (b4 > -12) {
                return -1;
            }
            return b4;
        }
        if (i3 == 1) {
            byte b5 = bArr[i];
            if (b4 > -12 || b5 > -65) {
                return -1;
            }
            return (b5 << 8) ^ b4;
        }
        if (i3 != 2) {
            throw new AssertionError();
        }
        byte b7 = bArr[i];
        byte b13 = bArr[i + 1];
        if (b4 > -12 || b7 > -65 || b13 > -65) {
            return -1;
        }
        return (b13 << 16) ^ ((b7 << 8) ^ b4);
    }

    public static boolean zzb(byte[] bArr) {
        return f39137zzb.zzb(bArr, 0, bArr.length);
    }

    public static boolean zzc(byte[] bArr, int i, int i2) {
        return f39137zzb.zzb(bArr, i, i2);
    }
}

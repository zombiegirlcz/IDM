package com.google.android.gms.internal.fido;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes16.dex */
public abstract class zzft {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final char[] f39460zza = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    public static final /* synthetic */ int f39461zzb = 0;

    public final boolean equals(Object obj2) {
        if (obj2 instanceof zzft) {
            zzft zzftVar = (zzft) obj2;
            if (zzb() == zzftVar.zzb() && zzc(zzftVar)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (zzb() >= 32) {
            return zza();
        }
        byte[] bArrZze = zze();
        int i = bArrZze[0] & UnsignedBytes.MAX_VALUE;
        for (int i2 = 1; i2 < bArrZze.length; i2++) {
            i |= (bArrZze[i2] & UnsignedBytes.MAX_VALUE) << (i2 * 8);
        }
        return i;
    }

    public final String toString() {
        byte[] bArrZze = zze();
        int length = bArrZze.length;
        StringBuilder sb6 = new StringBuilder(length + length);
        for (byte b4 : bArrZze) {
            char[] cArr = f39460zza;
            sb6.append(cArr[(b4 >> 4) & 15]);
            sb6.append(cArr[b4 & 15]);
        }
        return sb6.toString();
    }

    public abstract int zza();

    public abstract int zzb();

    public abstract boolean zzc(zzft zzftVar);

    public abstract byte[] zzd();

    public byte[] zze() {
        throw null;
    }
}

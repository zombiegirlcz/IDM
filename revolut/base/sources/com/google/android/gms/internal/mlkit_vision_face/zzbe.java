package com.google.android.gms.internal.mlkit_vision_face;

import a0.d;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: loaded from: classes16.dex */
final class zzbe {
    public static int zza(int i) {
        return (i + 1) * (i < 32 ? 4 : 2);
    }

    public static int zzb(Object obj2, Object obj3, int i, Object obj4, int[] iArr, Object[] objArr, Object[] objArr2) {
        int i2;
        int i3;
        int iZza = zzbf.zza(obj2);
        int i5 = iZza & i;
        int iZzc = zzc(obj4, i5);
        if (iZzc != 0) {
            int i6 = ~i;
            int i21 = iZza & i6;
            int i22 = -1;
            while (true) {
                i2 = iZzc - 1;
                i3 = iArr[i2];
                if ((i3 & i6) != i21 || !zzx.zza(obj2, objArr[i2]) || (objArr2 != null && !zzx.zza(obj3, objArr2[i2]))) {
                    int i32 = i3 & i;
                    if (i32 == 0) {
                        break;
                    }
                    i22 = i2;
                    iZzc = i32;
                } else {
                    break;
                }
            }
            int i33 = i3 & i;
            if (i22 == -1) {
                zze(obj4, i5, i33);
                return i2;
            }
            iArr[i22] = (i33 & i) | (iArr[i22] & i6);
            return i2;
        }
        return -1;
    }

    public static int zzc(Object obj2, int i) {
        return obj2 instanceof byte[] ? ((byte[]) obj2)[i] & UnsignedBytes.MAX_VALUE : obj2 instanceof short[] ? (char) ((short[]) obj2)[i] : ((int[]) obj2)[i];
    }

    public static Object zzd(int i) {
        if (i < 2 || i > 1073741824 || Integer.highestOneBit(i) != i) {
            throw new IllegalArgumentException(d.n("must be power of 2 between 2^1 and 2^30: ", i));
        }
        return i <= 256 ? new byte[i] : i <= 65536 ? new short[i] : new int[i];
    }

    public static void zze(Object obj2, int i, int i2) {
        if (obj2 instanceof byte[]) {
            ((byte[]) obj2)[i] = (byte) i2;
        } else if (obj2 instanceof short[]) {
            ((short[]) obj2)[i] = (short) i2;
        } else {
            ((int[]) obj2)[i] = i2;
        }
    }
}

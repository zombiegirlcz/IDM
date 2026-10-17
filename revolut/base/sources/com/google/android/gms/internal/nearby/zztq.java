package com.google.android.gms.internal.nearby;

import a0.d;

/* JADX INFO: loaded from: classes16.dex */
public final class zztq {
    public static int zza(int i, int i2, String str) {
        String strZza;
        if (i >= 0 && i < i2) {
            return i;
        }
        if (i < 0) {
            strZza = zzts.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
        } else {
            if (i2 < 0) {
                throw new IllegalArgumentException(d.n("negative size: ", i2));
            }
            strZza = zzts.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IndexOutOfBoundsException(strZza);
    }

    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzi(i, i2, "index"));
        }
        return i;
    }

    public static Object zzc(Object obj2, Object obj3) {
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException((String) obj3);
    }

    public static void zzd(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void zze(boolean z, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException((String) obj2);
        }
    }

    public static void zzf(boolean z, String str, char c2) {
        if (!z) {
            throw new IllegalArgumentException(zzts.zza(str, Character.valueOf(c2)));
        }
    }

    public static void zzg(boolean z, String str, Object obj2) {
        if (!z) {
            throw new IllegalArgumentException(zzts.zza(str, obj2));
        }
    }

    public static void zzh(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            throw new IndexOutOfBoundsException((i < 0 || i > i3) ? zzi(i, i3, "start index") : (i2 < 0 || i2 > i3) ? zzi(i2, i3, "end index") : zzts.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i)));
        }
    }

    private static String zzi(int i, int i2, String str) {
        if (i < 0) {
            return zzts.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return zzts.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        throw new IllegalArgumentException(d.n("negative size: ", i2));
    }
}

package com.google.android.gms.internal.nearby;

import a0.d;

/* JADX INFO: loaded from: classes16.dex */
public final class zzue {
    public static Object zza(Object obj2, int i) {
        if (obj2 != null) {
            return obj2;
        }
        throw new NullPointerException(d.n("at index ", i));
    }

    public static Object[] zzb(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            zza(objArr[i2], i2);
        }
        return objArr;
    }
}

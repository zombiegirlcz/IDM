package com.google.android.gms.internal.play_billing;

import a0.d;

/* JADX INFO: loaded from: classes16.dex */
public final class zzcc {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(d.n("at index ", i2));
            }
        }
        return objArr;
    }
}

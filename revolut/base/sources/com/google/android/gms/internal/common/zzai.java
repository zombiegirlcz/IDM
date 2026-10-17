package com.google.android.gms.internal.common;

import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes16.dex */
public final class zzai {
    public static Object[] zza(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                throw new NullPointerException(a.s(new StringBuilder(String.valueOf(i2).length() + 9), "at index ", i2));
            }
        }
        return objArr;
    }
}

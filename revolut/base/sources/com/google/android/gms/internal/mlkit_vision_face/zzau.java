package com.google.android.gms.internal.mlkit_vision_face;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class zzau {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(a.k(i, str, " cannot be negative but was: "));
    }

    public static void zzb(Object obj2, Object obj3) {
        if (obj2 == null) {
            Objects.toString(obj3);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj3)));
        }
        if (obj3 == null) {
            throw new NullPointerException(v0.a.h(obj2, "null value in entry: ", "=null"));
        }
    }
}

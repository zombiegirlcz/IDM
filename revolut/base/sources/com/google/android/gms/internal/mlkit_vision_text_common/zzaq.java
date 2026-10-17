package com.google.android.gms.internal.mlkit_vision_text_common;

import com.google.android.gms.internal.mlkit_vision_face.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzaq {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(a.k(i, str, " cannot be negative but was: "));
    }

    public static void zzb(Object obj2, Object obj3) {
        if (obj2 == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj3)));
        }
        if (obj3 == null) {
            throw new NullPointerException(p.a.p("null value in entry: ", obj2.toString(), "=null"));
        }
    }
}

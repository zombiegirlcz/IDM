package com.google.android.gms.internal.mlkit_vision_common;

import java.util.Objects;
import v0.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzi {
    public static void zza(Object obj2, Object obj3) {
        if (obj2 == null) {
            Objects.toString(obj3);
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj3)));
        }
        if (obj3 == null) {
            throw new NullPointerException(a.h(obj2, "null value in entry: ", "=null"));
        }
    }
}

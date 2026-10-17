package com.google.android.gms.internal.mlkit_common;

import p.a;

/* JADX INFO: loaded from: classes16.dex */
final class zzw {
    public static void zza(Object obj2, Object obj3) {
        if (obj2 == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj3)));
        }
        if (obj3 == null) {
            throw new NullPointerException(a.p("null value in entry: ", obj2.toString(), "=null"));
        }
    }
}

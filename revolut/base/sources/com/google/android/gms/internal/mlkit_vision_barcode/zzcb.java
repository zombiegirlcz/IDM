package com.google.android.gms.internal.mlkit_vision_barcode;

/* JADX INFO: loaded from: classes.dex */
final class zzcb {
    public static int zza(int i, String str) {
        if (i >= 0) {
            return i;
        }
        throw new IllegalArgumentException(com.google.android.gms.internal.mlkit_vision_face.a.k(i, str, " cannot be negative but was: "));
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

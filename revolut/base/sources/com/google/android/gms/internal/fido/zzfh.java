package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes16.dex */
enum zzfh {
    BOOLEAN,
    STRING,
    LONG,
    DOUBLE;

    public static /* bridge */ /* synthetic */ zzfh zza(Object obj2) {
        if (obj2 instanceof String) {
            return STRING;
        }
        if (obj2 instanceof Boolean) {
            return BOOLEAN;
        }
        if (obj2 instanceof Long) {
            return LONG;
        }
        if (obj2 instanceof Double) {
            return DOUBLE;
        }
        throw new AssertionError("invalid tag type: ".concat(String.valueOf(obj2.getClass())));
    }
}

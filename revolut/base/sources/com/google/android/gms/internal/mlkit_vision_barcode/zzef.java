package com.google.android.gms.internal.mlkit_vision_barcode;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzef {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj2, long j2, Object obj3, Object obj4) {
        while (!a.a(unsafe, obj2, j2, obj3, obj4)) {
            if (unsafe.getObject(obj2, j2) != obj3) {
                return false;
            }
        }
        return true;
    }
}

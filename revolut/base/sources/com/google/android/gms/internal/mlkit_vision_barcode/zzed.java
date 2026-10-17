package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzed {
    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj2, Object obj3, Object obj4) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj2, obj3, obj4)) {
            if (atomicReferenceFieldUpdater.get(obj2) != obj3 && atomicReferenceFieldUpdater.get(obj2) != obj3) {
                return false;
            }
        }
        return true;
    }
}

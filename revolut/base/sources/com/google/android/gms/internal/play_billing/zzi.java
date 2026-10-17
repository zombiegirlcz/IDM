package com.google.android.gms.internal.play_billing;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes16.dex */
public final /* synthetic */ class zzi {
    public static /* synthetic */ boolean zza(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj2, Object obj3, Object obj4) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj2, obj3, obj4)) {
            if (atomicReferenceFieldUpdater.get(obj2) != obj3 && atomicReferenceFieldUpdater.get(obj2) != obj3) {
                return false;
            }
        }
        return true;
    }
}

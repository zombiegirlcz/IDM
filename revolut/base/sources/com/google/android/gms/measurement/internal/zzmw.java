package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzmw extends zzgn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47491zza;

    public zzmw(zzny zznyVar, AtomicReference atomicReference) {
        this.f47491zza = atomicReference;
    }

    @Override // com.google.android.gms.measurement.internal.zzgo
    public final void zze(List list) {
        AtomicReference atomicReference = this.f47491zza;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}

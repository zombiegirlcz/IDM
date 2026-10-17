package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzmx extends zzgq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47492zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzny f47493zzb;

    public zzmx(zzny zznyVar, AtomicReference atomicReference) {
        this.f47492zza = atomicReference;
        this.f47493zzb = zznyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final void zze(zzpe zzpeVar) {
        AtomicReference atomicReference = this.f47492zza;
        synchronized (atomicReference) {
            this.f47493zzb.zzu.zzaW().zzj().zzb("[sgtm] Got upload batches from service. count", Integer.valueOf(zzpeVar.f47650zza.size()));
            atomicReference.set(zzpeVar);
            atomicReference.notifyAll();
        }
    }
}

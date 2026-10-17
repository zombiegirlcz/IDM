package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzll implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47369zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47370zzb;

    public zzll(zzlw zzlwVar, AtomicReference atomicReference) {
        this.f47369zza = atomicReference;
        this.f47370zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f47369zza;
        synchronized (atomicReference) {
            try {
                try {
                    zzlw zzlwVar = this.f47370zzb;
                    atomicReference.set(zzlwVar.zzu.zzf().zzr(zzlwVar.zzu.zzh().zzm(), zzgi.zzaa));
                } finally {
                    this.f47369zza.notify();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}

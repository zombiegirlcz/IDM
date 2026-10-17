package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzlo implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47375zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47376zzb;

    public zzlo(zzlw zzlwVar, AtomicReference atomicReference) {
        this.f47375zza = atomicReference;
        this.f47376zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f47375zza;
        synchronized (atomicReference) {
            try {
                try {
                    zzlw zzlwVar = this.f47376zzb;
                    atomicReference.set(Double.valueOf(zzlwVar.zzu.zzf().zza(zzlwVar.zzu.zzh().zzm(), zzgi.zzad)));
                } finally {
                    this.f47375zza.notify();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}

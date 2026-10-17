package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzlm implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47371zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47372zzb;

    public zzlm(zzlw zzlwVar, AtomicReference atomicReference) {
        this.f47371zza = atomicReference;
        this.f47372zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f47371zza;
        synchronized (atomicReference) {
            try {
                try {
                    zzlw zzlwVar = this.f47372zzb;
                    atomicReference.set(Long.valueOf(zzlwVar.zzu.zzf().zzk(zzlwVar.zzu.zzh().zzm(), zzgi.zzab)));
                } finally {
                    this.f47371zza.notify();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}

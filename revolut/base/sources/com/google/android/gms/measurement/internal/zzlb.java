package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzlb implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47345zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47346zzb;

    public zzlb(zzlw zzlwVar, AtomicReference atomicReference) {
        this.f47345zza = atomicReference;
        this.f47346zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f47345zza;
        synchronized (atomicReference) {
            try {
                try {
                    zzlw zzlwVar = this.f47346zzb;
                    atomicReference.set(Boolean.valueOf(zzlwVar.zzu.zzf().zzx(zzlwVar.zzu.zzh().zzm(), zzgi.zzZ)));
                } finally {
                    this.f47345zza.notify();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}

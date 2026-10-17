package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzln implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47373zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzlw f47374zzb;

    public zzln(zzlw zzlwVar, AtomicReference atomicReference) {
        this.f47373zza = atomicReference;
        this.f47374zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f47373zza;
        synchronized (atomicReference) {
            try {
                try {
                    zzlw zzlwVar = this.f47374zzb;
                    atomicReference.set(Integer.valueOf(zzlwVar.zzu.zzf().zzh(zzlwVar.zzu.zzh().zzm(), zzgi.zzac)));
                } finally {
                    this.f47373zza.notify();
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }
}

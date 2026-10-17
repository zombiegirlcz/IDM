package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzlc implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ AtomicReference f47347zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ boolean f47348zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzlw f47349zzc;

    public zzlc(zzlw zzlwVar, AtomicReference atomicReference, boolean z) {
        this.f47347zza = atomicReference;
        this.f47348zzb = z;
        this.f47349zzc = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47349zzc.zzu.zzu().zzJ(this.f47347zza, this.f47348zzb);
    }
}

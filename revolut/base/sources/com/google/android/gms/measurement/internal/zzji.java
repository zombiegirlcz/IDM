package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
final class zzji implements Callable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47228zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzjp f47229zzb;

    public zzji(zzjp zzjpVar, zzr zzrVar) {
        this.f47228zza = zzrVar;
        this.f47229zzb = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjp zzjpVar = this.f47229zzb;
        zzjpVar.f47248zza.zzL();
        return new zzap(zzjpVar.f47248zza.zzd(this.f47228zza.f47736zza));
    }
}

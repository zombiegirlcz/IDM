package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzjf implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47222zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzjp f47223zzb;

    public zzjf(zzjp zzjpVar, zzr zzrVar) {
        this.f47222zza = zzrVar;
        this.f47223zzb = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f47223zzb;
        zzjpVar.f47248zza.zzL();
        zzpv zzpvVar = zzjpVar.f47248zza;
        zzpvVar.zzaX().zzg();
        zzpvVar.zzM();
        zzr zzrVar = this.f47222zza;
        Preconditions.checkNotEmpty(zzrVar.f47736zza);
        zzpvVar.zzg(zzrVar);
    }
}

package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
final class zzjh implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47226zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzjp f47227zzb;

    public zzjh(zzjp zzjpVar, zzr zzrVar) {
        this.f47226zza = zzrVar;
        this.f47227zzb = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f47227zzb;
        zzjpVar.f47248zza.zzL();
        zzpv zzpvVar = zzjpVar.f47248zza;
        zzpvVar.zzaX().zzg();
        zzpvVar.zzM();
        zzr zzrVar = this.f47226zza;
        Preconditions.checkNotEmpty(zzrVar.f47736zza);
        zzpvVar.zzak(zzrVar);
        zzpvVar.zzai(zzrVar);
    }
}

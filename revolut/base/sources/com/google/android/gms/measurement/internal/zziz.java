package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zziz implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzai f47199zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzr f47200zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzjp f47201zzc;

    public zziz(zzjp zzjpVar, zzai zzaiVar, zzr zzrVar) {
        this.f47199zza = zzaiVar;
        this.f47200zzb = zzrVar;
        this.f47201zzc = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f47201zzc;
        zzjpVar.f47248zza.zzL();
        zzai zzaiVar = this.f47199zza;
        if (zzaiVar.f46858zzc.zza() == null) {
            zzjpVar.f47248zza.zzaf(zzaiVar, this.f47200zzb);
        } else {
            zzjpVar.f47248zza.zzao(zzaiVar, this.f47200zzb);
        }
    }
}

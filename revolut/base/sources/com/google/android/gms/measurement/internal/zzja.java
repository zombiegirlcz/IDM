package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzja implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzai f47204zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzjp f47205zzb;

    public zzja(zzjp zzjpVar, zzai zzaiVar) {
        this.f47204zza = zzaiVar;
        this.f47205zzb = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f47205zzb;
        zzjpVar.f47248zza.zzL();
        zzai zzaiVar = this.f47204zza;
        if (zzaiVar.f46858zzc.zza() == null) {
            zzjpVar.f47248zza.zzae(zzaiVar);
        } else {
            zzjpVar.f47248zza.zzan(zzaiVar);
        }
    }
}

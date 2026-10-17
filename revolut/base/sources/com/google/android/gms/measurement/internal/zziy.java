package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zziy implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47194zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47195zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47196zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ long f47197zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzjp f47198zze;

    public zziy(zzjp zzjpVar, String str, String str2, String str3, long j2) {
        this.f47194zza = str;
        this.f47195zzb = str2;
        this.f47196zzc = str3;
        this.f47197zzd = j2;
        this.f47198zze = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f47194zza;
        if (str == null) {
            zzjp zzjpVar = this.f47198zze;
            zzjpVar.f47248zza.zzaj(this.f47195zzb, null);
        } else {
            zzmh zzmhVar = new zzmh(this.f47196zzc, str, this.f47197zzd);
            zzjp zzjpVar2 = this.f47198zze;
            zzjpVar2.f47248zza.zzaj(this.f47195zzb, zzmhVar);
        }
    }
}

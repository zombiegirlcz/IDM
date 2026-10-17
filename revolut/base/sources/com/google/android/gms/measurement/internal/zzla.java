package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzla implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47340zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47341zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ Object f47342zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ long f47343zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzlw f47344zze;

    public zzla(zzlw zzlwVar, String str, String str2, Object obj2, long j2) {
        this.f47340zza = str;
        this.f47341zzb = str2;
        this.f47342zzc = obj2;
        this.f47343zzd = j2;
        this.f47344zze = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47344zze.zzan(this.f47340zza, this.f47341zzb, this.f47342zzc, this.f47343zzd);
    }
}

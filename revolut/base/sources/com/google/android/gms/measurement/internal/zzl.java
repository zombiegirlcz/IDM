package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzl implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy f47335zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47336zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47337zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ boolean f47338zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f47339zze;

    public zzl(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar, String str, String str2, boolean z) {
        this.f47335zza = zzcyVar;
        this.f47336zzb = str;
        this.f47337zzc = str2;
        this.f47338zzd = z;
        this.f47339zze = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47339zze.f46833zza.zzu().zzK(this.f47335zza, this.f47336zzb, this.f47337zzc, this.f47338zzd);
    }
}

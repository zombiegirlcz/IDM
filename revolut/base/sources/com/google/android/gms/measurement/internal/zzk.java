package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzk implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy f47279zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzbh f47280zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47281zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f47282zzd;

    public zzk(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar, zzbh zzbhVar, String str) {
        this.f47279zza = zzcyVar;
        this.f47280zzb = zzbhVar;
        this.f47281zzc = str;
        this.f47282zzd = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47282zzd.f46833zza.zzu().zzN(this.f47279zza, this.f47280zzb, this.f47281zzc);
    }
}

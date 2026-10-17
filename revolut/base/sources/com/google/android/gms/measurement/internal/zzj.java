package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzj implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy f47202zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f47203zzb;

    public zzj(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.f47202zza = zzcyVar;
        this.f47203zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47203zzb.f46833zza.zzu().zzD(this.f47202zza);
    }
}

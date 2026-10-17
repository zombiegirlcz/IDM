package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzo implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.internal.measurement.zzcy f47580zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f47581zzb;

    public zzo(AppMeasurementDynamiteService appMeasurementDynamiteService, com.google.android.gms.internal.measurement.zzcy zzcyVar) {
        this.f47580zza = zzcyVar;
        this.f47581zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AppMeasurementDynamiteService appMeasurementDynamiteService = this.f47581zzb;
        appMeasurementDynamiteService.f46833zza.zzw().zzT(this.f47580zza, appMeasurementDynamiteService.f46833zza.zzI());
    }
}

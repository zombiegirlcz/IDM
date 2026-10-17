package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzm implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzp f47412zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ AppMeasurementDynamiteService f47413zzb;

    public zzm(AppMeasurementDynamiteService appMeasurementDynamiteService, zzp zzpVar) {
        this.f47412zza = zzpVar;
        this.f47413zzb = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47413zzb.f46833zza.zzq().zzah(this.f47412zza);
    }
}

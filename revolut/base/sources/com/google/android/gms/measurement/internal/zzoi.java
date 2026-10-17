package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzoi implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ long f47603zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzop f47604zzb;

    public zzoi(zzop zzopVar, long j2) {
        this.f47603zza = j2;
        this.f47604zzb = zzopVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzop.zzj(this.f47604zzb, this.f47603zza);
    }
}

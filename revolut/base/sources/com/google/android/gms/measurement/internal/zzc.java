package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzc implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ long f46955zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzd f46956zzb;

    public zzc(zzd zzdVar, long j2) {
        this.f46955zza = j2;
        this.f46956zzb = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f46956zzb.zzj(this.f46955zza);
    }
}

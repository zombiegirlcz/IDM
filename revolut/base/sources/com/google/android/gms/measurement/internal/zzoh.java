package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzoh implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ long f47601zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzop f47602zzb;

    public zzoh(zzop zzopVar, long j2) {
        this.f47601zza = j2;
        this.f47602zzb = zzopVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzop.zzl(this.f47602zzb, this.f47601zza);
    }
}

package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zza implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f46835zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ long f46836zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzd f46837zzc;

    public zza(zzd zzdVar, String str, long j2) {
        this.f46835zza = str;
        this.f46836zzb = j2;
        this.f46837zzc = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.zza(this.f46837zzc, this.f46835zza, this.f46836zzb);
    }
}

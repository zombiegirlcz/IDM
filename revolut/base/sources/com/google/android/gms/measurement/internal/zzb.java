package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzb implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f46920zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ long f46921zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzd f46922zzc;

    public zzb(zzd zzdVar, String str, long j2) {
        this.f46920zza = str;
        this.f46921zzb = j2;
        this.f46922zzc = zzdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzd.zzb(this.f46922zzc, this.f46920zza, this.f46921zzb);
    }
}

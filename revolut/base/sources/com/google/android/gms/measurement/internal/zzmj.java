package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzmj implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzmh f47446zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzmh f47447zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ long f47448zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ boolean f47449zzd;

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    final /* synthetic */ zzmo f47450zze;

    public zzmj(zzmo zzmoVar, zzmh zzmhVar, zzmh zzmhVar2, long j2, boolean z) {
        this.f47446zza = zzmhVar;
        this.f47447zzb = zzmhVar2;
        this.f47448zzc = j2;
        this.f47449zzd = z;
        this.f47450zze = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f47450zze.zzB(this.f47446zza, this.f47447zzb, this.f47448zzc, this.f47449zzd, null);
    }
}

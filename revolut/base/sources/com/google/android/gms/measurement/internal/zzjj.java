package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzjj implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbh f47230zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzr f47231zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzjp f47232zzc;

    public zzjj(zzjp zzjpVar, zzbh zzbhVar, zzr zzrVar) {
        this.f47230zza = zzbhVar;
        this.f47231zzb = zzrVar;
        this.f47232zzc = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbh zzbhVar = this.f47230zza;
        zzr zzrVar = this.f47231zzb;
        zzjp zzjpVar = this.f47232zzc;
        zzjpVar.zzJ(zzjpVar.zzb(zzbhVar, zzrVar), zzrVar);
    }
}

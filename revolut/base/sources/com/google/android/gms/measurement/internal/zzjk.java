package com.google.android.gms.measurement.internal;

/* JADX INFO: loaded from: classes16.dex */
final class zzjk implements Runnable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzbh f47233zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47234zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzjp f47235zzc;

    public zzjk(zzjp zzjpVar, zzbh zzbhVar, String str) {
        this.f47233zza = zzbhVar;
        this.f47234zzb = str;
        this.f47235zzc = zzjpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzjp zzjpVar = this.f47235zzc;
        zzjpVar.f47248zza.zzL();
        zzjpVar.f47248zza.zzT(this.f47233zza, this.f47234zzb);
    }
}

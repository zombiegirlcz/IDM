package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
final class zzjb implements Callable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47206zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47207zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47208zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzjp f47209zzd;

    public zzjb(zzjp zzjpVar, String str, String str2, String str3) {
        this.f47206zza = str;
        this.f47207zzb = str2;
        this.f47208zzc = str3;
        this.f47209zzd = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjp zzjpVar = this.f47209zzd;
        zzjpVar.f47248zza.zzL();
        return zzjpVar.f47248zza.zzj().zzF(this.f47206zza, this.f47207zzb, this.f47208zzc);
    }
}

package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
final class zzje implements Callable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47218zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47219zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47220zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzjp f47221zzd;

    public zzje(zzjp zzjpVar, String str, String str2, String str3) {
        this.f47218zza = str;
        this.f47219zzb = str2;
        this.f47220zzc = str3;
        this.f47221zzd = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjp zzjpVar = this.f47221zzd;
        zzjpVar.f47248zza.zzL();
        return zzjpVar.f47248zza.zzj().zzB(this.f47218zza, this.f47219zzb, this.f47220zzc);
    }
}

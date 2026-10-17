package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
final class zzjc implements Callable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47210zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47211zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47212zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzjp f47213zzd;

    public zzjc(zzjp zzjpVar, String str, String str2, String str3) {
        this.f47210zza = str;
        this.f47211zzb = str2;
        this.f47212zzc = str3;
        this.f47213zzd = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjp zzjpVar = this.f47213zzd;
        zzjpVar.f47248zza.zzL();
        return zzjpVar.f47248zza.zzj().zzF(this.f47210zza, this.f47211zzb, this.f47212zzc);
    }
}

package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
final class zzjd implements Callable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47214zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ String f47215zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ String f47216zzc;

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    final /* synthetic */ zzjp f47217zzd;

    public zzjd(zzjp zzjpVar, String str, String str2, String str3) {
        this.f47214zza = str;
        this.f47215zzb = str2;
        this.f47216zzc = str3;
        this.f47217zzd = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjp zzjpVar = this.f47217zzd;
        zzjpVar.f47248zza.zzL();
        return zzjpVar.f47248zza.zzj().zzB(this.f47214zza, this.f47215zzb, this.f47216zzc);
    }
}

package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
final class zziv implements Callable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ String f47188zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zzjp f47189zzb;

    public zziv(zzjp zzjpVar, String str) {
        this.f47188zza = str;
        this.f47189zzb = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjp zzjpVar = this.f47189zzb;
        zzjpVar.f47248zza.zzL();
        return zzjpVar.f47248zza.zzj().zzE(this.f47188zza);
    }
}

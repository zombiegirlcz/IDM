package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
final class zzjo implements Callable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47245zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Bundle f47246zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzjp f47247zzc;

    public zzjo(zzjp zzjpVar, zzr zzrVar, Bundle bundle) {
        this.f47245zza = zzrVar;
        this.f47246zzb = bundle;
        this.f47247zzc = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjp zzjpVar = this.f47247zzc;
        zzjpVar.f47248zza.zzL();
        return zzjpVar.f47248zza.zzF(this.f47245zza, this.f47246zzb);
    }
}

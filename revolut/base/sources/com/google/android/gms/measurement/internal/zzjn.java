package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes16.dex */
final class zzjn implements Callable {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzr f47242zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ Bundle f47243zzb;

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    final /* synthetic */ zzjp f47244zzc;

    public zzjn(zzjp zzjpVar, zzr zzrVar, Bundle bundle) {
        this.f47242zza = zzrVar;
        this.f47243zzb = bundle;
        this.f47244zzc = zzjpVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() throws Exception {
        zzjp zzjpVar = this.f47244zzc;
        zzjpVar.f47248zza.zzL();
        return zzjpVar.f47248zza.zzF(this.f47242zza, this.f47243zzb);
    }
}

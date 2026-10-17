package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzss extends zzpu {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45682zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zztc f45683zzb;

    public zzss(zztc zztcVar, TaskCompletionSource taskCompletionSource) {
        this.f45683zzb = zztcVar;
        this.f45682zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzpv
    public final void zzd(zzrx zzrxVar) {
        this.f45683zzb.f45704zzc = new UwbAddress(zzrxVar.zzb());
        this.f45682zza.setResult(this.f45683zzb.f45704zzc);
    }
}

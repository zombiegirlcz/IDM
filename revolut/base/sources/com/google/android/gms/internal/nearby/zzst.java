package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.UwbComplexChannel;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzst extends zzpx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45684zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ zztc f45685zzb;

    public zzst(zztc zztcVar, TaskCompletionSource taskCompletionSource) {
        this.f45685zzb = zztcVar;
        this.f45684zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzpy
    public final void zzd(zzsc zzscVar) {
        UwbComplexChannel.Builder builder = new UwbComplexChannel.Builder();
        builder.setChannel(zzscVar.zza());
        builder.setPreambleIndex(zzscVar.zzb());
        this.f45685zzb.f45705zzd = builder.build();
        this.f45684zza.setResult(this.f45685zzb.f45705zzd);
    }
}

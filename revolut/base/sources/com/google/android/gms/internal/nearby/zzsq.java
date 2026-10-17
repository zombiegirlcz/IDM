package com.google.android.gms.internal.nearby;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzsq extends zzph {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45680zza;

    public zzsq(zztc zztcVar, TaskCompletionSource taskCompletionSource) {
        this.f45680zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzpi
    public final void zzd(boolean z) {
        this.f45680zza.setResult(Boolean.valueOf(z));
    }
}

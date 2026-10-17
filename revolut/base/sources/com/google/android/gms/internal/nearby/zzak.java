package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzak extends zzdl {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45081zza;

    public zzak(zzax zzaxVar, TaskCompletionSource taskCompletionSource) {
        this.f45081zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzdm
    public final void zzb(Status status, int i) {
        TaskUtil.trySetResultOrApiException(status, Integer.valueOf(i), this.f45081zza);
    }
}

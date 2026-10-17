package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzv extends zzy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45813zza;

    public zzv(zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        this.f45813zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzt(Status status) {
        TaskUtil.trySetResultOrApiException(status, null, this.f45813zza);
    }
}

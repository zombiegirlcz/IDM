package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzw extends zzy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45814zza;

    public zzw(TaskCompletionSource taskCompletionSource) {
        this.f45814zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzi(Status status, int i) {
        if (status.isSuccess() && i == 3) {
            TaskUtil.trySetResultOrApiException(Status.RESULT_INTERNAL_ERROR, null, this.f45814zza);
        } else if (i == 1) {
            TaskUtil.trySetResultOrApiException(status, 2, this.f45814zza);
        } else {
            TaskUtil.trySetResultOrApiException(status, Integer.valueOf(i), this.f45814zza);
        }
    }
}

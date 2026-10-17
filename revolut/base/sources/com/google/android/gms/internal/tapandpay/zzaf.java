package com.google.android.gms.internal.tapandpay;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzaf extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f46302zza;

    public zzaf(zzag zzagVar, TaskCompletionSource taskCompletionSource) {
        this.f46302zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzt(Status status, Bundle bundle) {
        TaskUtil.trySetResultOrApiException(status.hasResolution() ? Status.RESULT_SUCCESS : status, status.getResolution(), this.f46302zza);
    }
}

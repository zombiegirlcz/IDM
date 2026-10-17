package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzae extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f46301zza;

    public zzae(zzag zzagVar, TaskCompletionSource taskCompletionSource) {
        this.f46301zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzw(Status status, boolean z) {
        TaskUtil.trySetResultOrApiException(status, Boolean.valueOf(z), this.f46301zza);
    }
}

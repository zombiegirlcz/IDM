package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tapandpay.issuer.PushProvisionSessionContext;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzz extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f46372zza;

    public zzz(zzag zzagVar, TaskCompletionSource taskCompletionSource) {
        this.f46372zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzF(Status status, PushProvisionSessionContext pushProvisionSessionContext) {
        TaskUtil.trySetResultOrApiException(status, pushProvisionSessionContext, this.f46372zza);
    }
}

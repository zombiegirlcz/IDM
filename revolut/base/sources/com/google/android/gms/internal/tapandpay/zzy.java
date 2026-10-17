package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzy extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f46371zza;

    public zzy(zzag zzagVar, TaskCompletionSource taskCompletionSource) {
        this.f46371zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzg(Status status, String str) {
        TaskUtil.trySetResultOrApiException(status, str, this.f46371zza);
    }
}

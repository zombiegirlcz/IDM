package com.google.android.gms.internal.tapandpay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tapandpay.issuer.TokenInfo;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzad extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f46300zza;

    public zzad(zzag zzagVar, TaskCompletionSource taskCompletionSource) {
        this.f46300zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzz(Status status, TokenInfo[] tokenInfoArr) {
        TaskUtil.trySetResultOrApiException(status, zzat.zzh(tokenInfoArr), this.f46300zza);
    }
}

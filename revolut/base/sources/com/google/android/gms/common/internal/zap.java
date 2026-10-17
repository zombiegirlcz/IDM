package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.PendingResultUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes16.dex */
final class zap implements PendingResult.StatusListener {
    final /* synthetic */ PendingResult zaa;

    /* JADX INFO: renamed from: zab, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38121zab;

    /* JADX INFO: renamed from: zac, reason: collision with root package name */
    final /* synthetic */ PendingResultUtil.ResultConverter f38122zac;

    /* JADX INFO: renamed from: zad, reason: collision with root package name */
    final /* synthetic */ zas f38123zad;

    public zap(PendingResult pendingResult, TaskCompletionSource taskCompletionSource, PendingResultUtil.ResultConverter resultConverter, zas zasVar) {
        this.zaa = pendingResult;
        this.f38121zab = taskCompletionSource;
        this.f38122zac = resultConverter;
        this.f38123zad = zasVar;
    }

    @Override // com.google.android.gms.common.api.PendingResult.StatusListener
    public final void onComplete(Status status) {
        if (!status.isSuccess()) {
            this.f38121zab.setException(ApiExceptionUtil.fromStatus(status));
        } else {
            this.f38121zab.setResult(this.f38122zac.convert(this.zaa.await(0L, TimeUnit.MILLISECONDS)));
        }
    }
}

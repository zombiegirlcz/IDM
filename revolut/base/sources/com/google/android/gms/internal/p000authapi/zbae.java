package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zbae extends zbs {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38825zba;

    public zbae(zbag zbagVar, TaskCompletionSource taskCompletionSource) {
        this.f38825zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbt
    public final void zbb(Status status, SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) throws RemoteException {
        if (status.isSuccess()) {
            this.f38825zba.setResult(saveAccountLinkingTokenResult);
        } else {
            this.f38825zba.setException(ApiExceptionUtil.fromStatus(status));
        }
    }
}

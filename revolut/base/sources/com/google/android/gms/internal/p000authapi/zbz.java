package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ApiExceptionUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zbz extends zbi {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38860zba;

    public zbz(zbaa zbaaVar, TaskCompletionSource taskCompletionSource) {
        this.f38860zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbj
    public final void zbb(Status status, AuthorizationResult authorizationResult) throws RemoteException {
        if (status.isSuccess()) {
            this.f38860zba.setResult(authorizationResult);
        } else {
            this.f38860zba.setException(ApiExceptionUtil.fromStatus(status));
        }
    }
}

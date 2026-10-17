package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zbam extends zbl {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38837zba;

    public zbam(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.f38837zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbm
    public final void zbb(Status status, BeginSignInResult beginSignInResult) throws RemoteException {
        TaskUtil.setResultOrApiException(status, beginSignInResult, this.f38837zba);
    }
}

package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zban extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38838zba;

    public zban(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.f38838zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) throws RemoteException {
        TaskUtil.setResultOrApiException(status, this.f38838zba);
    }
}

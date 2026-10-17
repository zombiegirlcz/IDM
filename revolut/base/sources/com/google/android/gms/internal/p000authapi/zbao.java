package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zbao extends zbq {

    /* JADX INFO: renamed from: zba, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38839zba;

    public zbao(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.f38839zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbr
    public final void zbb(Status status, PendingIntent pendingIntent) throws RemoteException {
        TaskUtil.setResultOrApiException(status, pendingIntent, this.f38839zba);
    }
}

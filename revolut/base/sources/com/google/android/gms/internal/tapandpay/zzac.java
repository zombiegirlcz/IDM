package com.google.android.gms.internal.tapandpay;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzac extends zzah {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f46299zza;

    public zzac(zzag zzagVar, TaskCompletionSource taskCompletionSource) {
        this.f46299zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.tapandpay.zzah, com.google.android.gms.internal.tapandpay.zzf
    public final void zzy(Status status, String str) throws RemoteException {
        TaskUtil.trySetResultOrApiException(status, str, this.f46299zza);
    }
}

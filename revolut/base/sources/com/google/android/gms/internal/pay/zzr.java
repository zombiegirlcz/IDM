package com.google.android.gms.internal.pay;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzr extends zzy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45808zza;

    public zzr(zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        this.f45808zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzp(Status status, PendingIntent pendingIntent) {
        TaskUtil.trySetResultOrApiException(status, pendingIntent, this.f45808zza);
    }
}

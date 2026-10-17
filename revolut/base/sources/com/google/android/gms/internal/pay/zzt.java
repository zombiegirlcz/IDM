package com.google.android.gms.internal.pay;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.pay.EmoneyReadiness;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzt extends zzy {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45810zza;

    public zzt(zzx zzxVar, TaskCompletionSource taskCompletionSource) {
        this.f45810zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.pay.zzy, com.google.android.gms.internal.pay.zzf
    public final void zzf(Status status, EmoneyReadiness emoneyReadiness) {
        TaskUtil.trySetResultOrApiException(status, emoneyReadiness, this.f45810zza);
    }
}

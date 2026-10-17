package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzdj extends IStatusCallback.Stub {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Object f39693zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f39694zzb;

    public zzdj(Object obj2, TaskCompletionSource taskCompletionSource) {
        this.f39693zza = obj2;
        this.f39694zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        TaskUtil.setResultOrApiException(status, this.f39693zza, this.f39694zzb);
    }
}

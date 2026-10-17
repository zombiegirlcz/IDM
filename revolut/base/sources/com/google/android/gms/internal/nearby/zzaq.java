package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzaq extends zzcn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45086zza;

    public zzaq(zzax zzaxVar, TaskCompletionSource taskCompletionSource) {
        this.f45086zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzco
    public final void zzb(Status status, boolean z) {
        TaskUtil.trySetResultOrApiException(status, Boolean.valueOf(z), this.f45086zza);
    }
}

package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzar extends zzdx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45087zza;

    public zzar(zzax zzaxVar, TaskCompletionSource taskCompletionSource) {
        this.f45087zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzdy
    public final void zzb(Status status, List list) {
        TaskUtil.trySetResultOrApiException(status, list, this.f45087zza);
    }
}

package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.ExposureSummary;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzav extends zzde {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45092zza;

    public zzav(zzax zzaxVar, TaskCompletionSource taskCompletionSource) {
        this.f45092zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzdf
    public final void zzb(Status status, ExposureSummary exposureSummary) {
        TaskUtil.trySetResultOrApiException(status, exposureSummary, this.f45092zza);
    }
}

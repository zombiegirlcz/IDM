package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.DiagnosisKeysDataMapping;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzal extends zzcx {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45082zza;

    public zzal(zzax zzaxVar, TaskCompletionSource taskCompletionSource) {
        this.f45082zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzcy
    public final void zzb(Status status, DiagnosisKeysDataMapping diagnosisKeysDataMapping) {
        TaskUtil.trySetResultOrApiException(status, diagnosisKeysDataMapping, this.f45082zza);
    }
}

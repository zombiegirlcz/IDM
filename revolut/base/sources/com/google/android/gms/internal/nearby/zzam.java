package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.ExposureNotificationStatus;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzam extends zzdo {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45083zza;

    public zzam(zzax zzaxVar, TaskCompletionSource taskCompletionSource) {
        this.f45083zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzdp
    public final void zzb(Status status, long j2) {
        TaskUtil.trySetResultOrApiException(status, ExposureNotificationStatus.zza(j2), this.f45083zza);
    }
}

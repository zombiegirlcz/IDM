package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
final class zzaj extends zzcr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45080zza;

    public zzaj(zzax zzaxVar, TaskCompletionSource taskCompletionSource) {
        this.f45080zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzcs
    public final void zzb(Status status, List list) {
        TaskUtil.trySetResultOrApiException(status, list, this.f45080zza);
    }
}

package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzq extends zzf {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f38804zza;

    public zzq(zzr zzrVar, TaskCompletionSource taskCompletionSource) {
        this.f38804zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzg
    public final void zzb(Status status, boolean z) {
        TaskUtil.setResultOrApiException(status, Boolean.valueOf(z), this.f38804zza);
    }
}

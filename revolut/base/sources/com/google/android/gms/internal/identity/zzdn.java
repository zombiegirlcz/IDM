package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzdn extends zzq {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ Object f39698zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f39699zzb;

    public zzdn(Object obj2, TaskCompletionSource taskCompletionSource) {
        this.f39698zza = obj2;
        this.f39699zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zzd(zzl zzlVar) {
        TaskUtil.setResultOrApiException(zzlVar.getStatus(), this.f39698zza, this.f39699zzb);
    }

    @Override // com.google.android.gms.internal.identity.zzr
    public final void zze() {
    }
}

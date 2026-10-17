package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.nearby.exposurenotification.PackageConfiguration;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzan extends zzdt {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45084zza;

    public zzan(zzax zzaxVar, TaskCompletionSource taskCompletionSource) {
        this.f45084zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzdu
    public final void zzb(Status status, PackageConfiguration packageConfiguration) {
        TaskUtil.trySetResultOrApiException(status, packageConfiguration, this.f45084zza);
    }
}

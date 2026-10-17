package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzy extends zzj {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f39200zza;

    public zzy(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.f39200zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzk
    public final void zzb(Status status, Bundle bundle) {
        zzab.zzf(status, bundle, this.f39200zza);
    }
}

package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzw extends zzn {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f39198zza;

    public zzw(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.f39198zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.auth.zzo
    public final void zzb(Status status, Bundle bundle) {
        zzab.zzf(status, bundle, this.f39198zza);
    }
}

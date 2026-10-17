package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.nearby.uwb.UwbStatusCodes;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzsu extends zzpr {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f45686zza;

    public zzsu(zztc zztcVar, TaskCompletionSource taskCompletionSource) {
        this.f45686zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.nearby.zzps
    public final void zzd(int i) {
        if (i == 42004) {
            this.f45686zza.setException(new SecurityException("Missing UWB_RANGING permission"));
        } else if (i != 0) {
            this.f45686zza.setException(new ApiException(new Status(i, UwbStatusCodes.zza(i))));
        } else {
            this.f45686zza.setResult(null);
        }
    }
}

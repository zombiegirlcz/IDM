package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes16.dex */
final class zzig implements BaseImplementation.ResultHolder {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final TaskCompletionSource f45295zza;

    public zzig(zzii zziiVar, TaskCompletionSource taskCompletionSource) {
        this.f45295zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setFailedResult(Status status) {
        this.f45295zza.setException(new ApiException(status));
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final void setResult(Object obj2) {
        this.f45295zza.setResult(null);
    }
}

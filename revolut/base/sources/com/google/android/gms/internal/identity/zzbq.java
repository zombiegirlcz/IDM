package com.google.android.gms.internal.identity;

import android.location.Location;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Objects;

/* JADX INFO: loaded from: classes16.dex */
final /* synthetic */ class zzbq implements Continuation {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final /* synthetic */ TaskCompletionSource f39641zza;

    @Override // com.google.android.gms.tasks.Continuation
    public final /* synthetic */ Object then(Task task) {
        Api api2 = zzbi.f39629zzb;
        TaskCompletionSource taskCompletionSource = this.f39641zza;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult((Location) task.getResult());
            return null;
        }
        Exception exception = task.getException();
        Objects.requireNonNull(exception);
        taskCompletionSource.trySetException(exception);
        return null;
    }
}

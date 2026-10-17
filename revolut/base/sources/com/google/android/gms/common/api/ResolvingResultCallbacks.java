package com.google.android.gms.common.api;

import android.app.Activity;
import android.content.IntentSender;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
public abstract class ResolvingResultCallbacks<R extends Result> extends ResultCallbacks<R> {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Activity f37739zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final int f37740zzb;

    public ResolvingResultCallbacks(@NonNull Activity activity, int i) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.f37739zza = activity;
        this.f37740zzb = i;
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    @KeepForSdk
    public final void onFailure(@NonNull Status status) {
        if (!status.hasResolution()) {
            onUnresolvableFailure(status);
            return;
        }
        try {
            status.startResolutionForResult(this.f37739zza, this.f37740zzb);
        } catch (IntentSender.SendIntentException e) {
            onUnresolvableFailure(new Status(8));
        }
    }

    @Override // com.google.android.gms.common.api.ResultCallbacks
    public abstract void onSuccess(@NonNull R r2);

    public abstract void onUnresolvableFailure(@NonNull Status status);
}

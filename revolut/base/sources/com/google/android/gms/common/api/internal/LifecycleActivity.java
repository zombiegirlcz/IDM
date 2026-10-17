package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: loaded from: classes16.dex */
@KeepForSdk
public class LifecycleActivity {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Object f37786zza;

    public LifecycleActivity(@NonNull Activity activity) {
        Preconditions.checkNotNull(activity, "Activity must not be null");
        this.f37786zza = activity;
    }

    public final boolean zza() {
        return this.f37786zza instanceof FragmentActivity;
    }

    public final boolean zzb() {
        return this.f37786zza instanceof Activity;
    }

    @NonNull
    public final Activity zzc() {
        return (Activity) this.f37786zza;
    }

    @NonNull
    public final FragmentActivity zzd() {
        return (FragmentActivity) this.f37786zza;
    }

    @KeepForSdk
    @Deprecated
    public LifecycleActivity(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}

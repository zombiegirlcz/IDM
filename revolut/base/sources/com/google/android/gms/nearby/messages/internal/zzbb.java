package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes16.dex */
final class zzbb implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Activity f48126zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzbh f48127zzb;

    public /* synthetic */ zzbb(Activity activity, zzbh zzbhVar, zzba zzbaVar) {
        this.f48126zza = activity;
        this.f48127zzb = zzbhVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f48126zza) {
            String str = "Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for " + activity.getPackageName();
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == this.f48126zza) {
            zzbh.zza(this.f48127zzb, 1);
        }
    }
}

package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: loaded from: classes16.dex */
final class zzah implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private final Activity f48092zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final zzai f48093zzb;

    public /* synthetic */ zzah(Activity activity, zzai zzaiVar, zzag zzagVar) {
        this.f48092zza = activity;
        this.f48093zzb = zzaiVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.f48092zza) {
            if (Log.isLoggable("NearbyMessagesClient", 2)) {
                String str = "Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for " + activity.getPackageName();
            }
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
        if (activity == this.f48092zza) {
            try {
                this.f48093zzb.zzr(1);
            } catch (RemoteException e) {
                if (Log.isLoggable("NearbyMessagesClient", 2)) {
                    String.format("Failed to emit ACTIVITY_STOPPED from ClientLifecycleSafetyNet for Activity %s: %s", activity.getPackageName(), e);
                }
            }
        }
    }
}

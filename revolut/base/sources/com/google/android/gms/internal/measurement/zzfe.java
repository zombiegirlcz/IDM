package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
final class zzfe implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzff f40034zza;

    public zzfe(zzff zzffVar) {
        this.f40034zza = zzffVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.f40034zza.zzW(new zzex(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.f40034zza.zzW(new zzfd(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f40034zza.zzW(new zzfa(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.f40034zza.zzW(new zzez(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        zzcs zzcsVar = new zzcs();
        this.f40034zza.zzW(new zzfc(this, activity, zzcsVar));
        Bundle bundleZzb = zzcsVar.zzb(50L);
        if (bundleZzb != null) {
            bundle.putAll(bundleZzb);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.f40034zza.zzW(new zzey(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f40034zza.zzW(new zzfb(this, activity));
    }
}

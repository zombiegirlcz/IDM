package com.google.android.gms.internal.nearby;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes16.dex */
final class zzkp implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    final /* synthetic */ zzkq f45349zza;

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final WeakReference f45350zzb;

    public zzkp(zzkq zzkqVar, WeakReference weakReference) {
        this.f45349zza = zzkqVar;
        this.f45350zzb = weakReference;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
        if (activity == this.f45350zzb.get()) {
            this.f45349zza.f45355zze = true;
            this.f45349zza.zzg();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == this.f45350zzb.get()) {
            this.f45349zza.f45355zze = false;
            this.f45349zza.zzg();
        }
    }
}

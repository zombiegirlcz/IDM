package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.util.ProcessUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
@KeepForSdk
public final class BackgroundDetector implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* JADX INFO: renamed from: zza, reason: collision with root package name */
    private static final BackgroundDetector f37752zza = new BackgroundDetector();

    /* JADX INFO: renamed from: zzb, reason: collision with root package name */
    private final AtomicBoolean f37753zzb = new AtomicBoolean();

    /* JADX INFO: renamed from: zzc, reason: collision with root package name */
    private final AtomicBoolean f37754zzc = new AtomicBoolean();

    /* JADX INFO: renamed from: zzd, reason: collision with root package name */
    private final ArrayList f37755zzd = new ArrayList();

    /* JADX INFO: renamed from: zze, reason: collision with root package name */
    private boolean f37756zze = false;

    @KeepForSdk
    public interface BackgroundStateChangeListener {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    @KeepForSdk
    private BackgroundDetector() {
    }

    @NonNull
    @KeepForSdk
    public static BackgroundDetector getInstance() {
        return f37752zza;
    }

    @KeepForSdk
    public static void initialize(@NonNull Application application) {
        BackgroundDetector backgroundDetector = f37752zza;
        synchronized (backgroundDetector) {
            try {
                if (!backgroundDetector.f37756zze) {
                    application.registerActivityLifecycleCallbacks(backgroundDetector);
                    application.registerComponentCallbacks(backgroundDetector);
                    backgroundDetector.f37756zze = true;
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    private final void zza(boolean z) {
        synchronized (f37752zza) {
            try {
                Iterator it8 = this.f37755zzd.iterator();
                while (it8.hasNext()) {
                    ((BackgroundStateChangeListener) it8.next()).onBackgroundStateChanged(z);
                }
            } catch (Throwable th10) {
                throw th10;
            }
        }
    }

    @KeepForSdk
    public void addListener(@NonNull BackgroundStateChangeListener backgroundStateChangeListener) {
        synchronized (f37752zza) {
            this.f37755zzd.add(backgroundStateChangeListener);
        }
    }

    @KeepForSdk
    public boolean isInBackground() {
        return this.f37753zzb.get();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NonNull Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.f37754zzc;
        boolean zCompareAndSet = this.f37753zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NonNull Activity activity) {
        AtomicBoolean atomicBoolean = this.f37754zzc;
        boolean zCompareAndSet = this.f37753zzb.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            zza(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NonNull Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@NonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.f37753zzb.compareAndSet(false, true)) {
            this.f37754zzc.set(true);
            zza(true);
        }
    }

    @KeepForSdk
    public boolean readCurrentStateIfPossible(boolean z) {
        AtomicBoolean atomicBoolean = this.f37754zzc;
        if (!atomicBoolean.get()) {
            if (ProcessUtils.zza()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!atomicBoolean.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f37753zzb.set(true);
            }
        }
        return isInBackground();
    }
}

package bri;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yri.a f18015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18017c;
    public Handler d;
    public Runnable e;
    public Runnable f;

    public b(yri.a screensInteractor) {
        Intrinsics.checkNotNullParameter(screensInteractor, "screensInteractor");
        this.f18015a = screensInteractor;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        od0.a.i();
        this.f18015a.g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        od0.a.i();
        if (!activity.isChangingConfigurations()) {
            this.f18015a.f();
            return;
        }
        this.f18017c++;
        Handler handler = this.d;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.d = handler;
        }
        Runnable aVar = this.e;
        if (aVar != null) {
            handler.removeCallbacks(aVar);
        } else {
            aVar = new a(this, 0);
        }
        this.e = aVar;
        handler.postDelayed(aVar, 2000L);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        od0.a.i();
        this.f18015a.b(false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        od0.a.i();
        this.f18015a.c();
        Runnable runnable = this.f;
        if (runnable != null) {
            runnable.run();
            Handler handler = this.d;
            if (handler != null) {
                handler.removeCallbacks(runnable);
            }
        }
        Runnable runnable2 = this.e;
        if (runnable2 != null) {
            runnable2.run();
            Handler handler2 = this.d;
            if (handler2 != null) {
                handler2.removeCallbacks(runnable2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        od0.a.i();
        if (!activity.isChangingConfigurations()) {
            this.f18015a.e();
            return;
        }
        this.f18016b++;
        Handler handler = this.d;
        if (handler == null) {
            handler = new Handler(Looper.getMainLooper());
            this.d = handler;
        }
        Runnable aVar = this.f;
        if (aVar != null) {
            handler.removeCallbacks(aVar);
        } else {
            aVar = new a(this, 1);
        }
        this.f = aVar;
        handler.postDelayed(aVar, 2000L);
    }
}

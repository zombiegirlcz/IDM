package no;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class x2 extends FragmentManager.FragmentLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final voi.g f217869a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final voi.g f217870c;

    public x2(voi.g eventController, voi.g diagnosticEventsTracker) {
        Intrinsics.checkNotNullParameter(eventController, "eventController");
        Intrinsics.checkNotNullParameter(diagnosticEventsTracker, "diagnosticEventsTracker");
        this.f217869a = eventController;
        this.f217870c = diagnosticEventsTracker;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.revolut.analytics.tracking.v3.d dVar = (com.revolut.analytics.tracking.v3.d) this.f217870c.get();
        String activityName = activity.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(activityName, "getName(...)");
        com.revolut.analytics.tracking.v3.f fVar = (com.revolut.analytics.tracking.v3.f) dVar;
        fVar.getClass();
        Intrinsics.checkNotNullParameter(activityName, "activityName");
        LinkedHashSet linkedHashSet = fVar.f50325r;
        if (!linkedHashSet.contains(activityName)) {
            com.revolut.analytics.tracking.v3.f.g(fVar, AnalyticsProduct.Shared.MobilePlatform.f, null, null, new g0(activityName, 2), 14);
            linkedHashSet.add(activityName);
        }
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.registerFragmentLifecycleCallbacks(this, true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(activity, "activity");
        FragmentActivity fragmentActivity = activity instanceof FragmentActivity ? (FragmentActivity) activity : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        supportFragmentManager.unregisterFragmentLifecycleCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ((y1) ((t1) this.f217869a.get())).a(activity, v2.TRACK_ATTACHMENT_ONCE);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(outState, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ((y1) ((t1) this.f217869a.get())).b(activity);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentResumed(FragmentManager fm3, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fm3, "fm");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        super.onFragmentResumed(fm3, fragment);
        ((y1) ((t1) this.f217869a.get())).a(fragment, v2.TRACK_REPEATED_ATTACHMENT);
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public final void onFragmentStopped(FragmentManager fm3, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fm3, "fm");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        super.onFragmentStopped(fm3, fragment);
        ((y1) ((t1) this.f217869a.get())).b(fragment);
    }
}

package jri;

import ami.g;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import com.revolut.retail.core.ui.activity.BaseDelegatesActivity;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import yhm.m;
import yhm.o;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f178020a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Activity f178021b;

    private d() {
    }

    public final void a(String flowName) throws Throwable {
        Object objA;
        BaseDelegatesActivity baseDelegatesActivity;
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        try {
            m.Companion companion = m.INSTANCE;
            Activity activity = f178021b;
            baseDelegatesActivity = activity instanceof BaseDelegatesActivity ? (BaseDelegatesActivity) activity : null;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (baseDelegatesActivity != null && !Intrinsics.f(flowName, "KOMPOT_LAUNCHER_FLOW")) {
            if (!Intrinsics.f(flowName, baseDelegatesActivity.getF85901s0())) {
                g gVar = new g("Activity.flowName=[" + baseDelegatesActivity.getF85901s0() + " doesn't match with requested=" + flowName, 2);
                h0 h0Var = h0.f322473a;
                CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
                rd0.d.a(rd0.c.ERROR, null, null, gVar, h0Var);
            }
            objA = Unit.f186387a;
            Throwable thA = m.a(objA);
            if (thA != null) {
                hx7.e.n(thA);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostCreated(Activity activity, Bundle bundle) throws Throwable {
        Object objA;
        BaseDelegatesActivity baseDelegatesActivity;
        Intrinsics.checkNotNullParameter(activity, "activity");
        f178021b = null;
        try {
            m.Companion companion = m.INSTANCE;
            baseDelegatesActivity = activity instanceof BaseDelegatesActivity ? (BaseDelegatesActivity) activity : null;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (baseDelegatesActivity == null) {
            return;
        }
        if (baseDelegatesActivity.getF85901s0() != null && baseDelegatesActivity.b(iri.g.class) == null) {
            g gVar = new g("FlowActivityDelegate is missing. Activity=[" + baseDelegatesActivity.getClass().getSimpleName() + "], flowName=[" + baseDelegatesActivity.getF85901s0(), 2);
            h0 h0Var = h0.f322473a;
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.a(rd0.c.ERROR, null, null, gVar, h0Var);
        }
        objA = Unit.f186387a;
        Throwable thA = m.a(objA);
        if (thA != null) {
            hx7.e.n(thA);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f178021b = activity;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
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
    }
}

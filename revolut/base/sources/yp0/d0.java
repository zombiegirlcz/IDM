package yp0;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class d0 implements Application.ActivityLifecycleCallbacks {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f315719b = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f315718a = new d0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ArrayList f315720c = new ArrayList();

    private d0() {
    }

    public static c0 a(Activity activity) {
        Object obj2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (activity.isDestroyed()) {
            return new c0(activity);
        }
        ArrayList arrayList = f315720c;
        int iJ = zhm.v.j(arrayList);
        while (true) {
            if (-1 >= iJ) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(iJ);
            if (((c0) obj2).f315716a == activity) {
                break;
            }
            iJ--;
        }
        c0 c0Var = (c0) obj2;
        if (c0Var == null) {
            c0Var = new c0(activity);
            arrayList.add(c0Var);
        }
        if (f315719b) {
            f315719b = false;
            activity.getApplication().registerActivityLifecycleCallbacks(f315718a);
        }
        return c0Var;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        ArrayList arrayList = f315720c;
        for (int iJ = zhm.v.j(arrayList); -1 < iJ; iJ--) {
            Object obj2 = arrayList.get(iJ);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            if (((c0) obj2).f315716a == activity) {
                arrayList.remove(iJ);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
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

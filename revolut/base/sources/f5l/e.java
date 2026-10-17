package f5l;

import android.app.Activity;
import android.os.Bundle;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.internal.Intrinsics;
import zhm.h0;

/* JADX INFO: loaded from: classes13.dex */
public final class e extends h80.a implements xji.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f132364a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f132365b = new WeakHashMap();

    private e() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(Activity activity) {
        in0.g gVar = activity instanceof in0.g ? (in0.g) activity : null;
        return gVar != null && gVar.p0();
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        f132365b.remove(activity);
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!a(activity)) {
            Collection collection = (Set) f132365b.get(activity);
            if (collection == null) {
                collection = h0.f322473a;
            }
            if (collection.isEmpty()) {
                d.a(activity);
                return;
            }
        }
        d.b(activity);
    }

    @Override // h80.a, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (a(activity)) {
            d.a(activity);
        }
    }

    @Override // xji.a
    public final void q(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Activity activityM2 = controller.m2();
        WeakHashMap weakHashMap = f132365b;
        Set set = (Set) weakHashMap.get(activityM2);
        if (set != null) {
            set.remove(controller.u2());
            weakHashMap.put(controller.m2(), set);
        }
        if (a(controller.m2())) {
            return;
        }
        Set set2 = (Set) weakHashMap.get(controller.m2());
        if (set2 == null) {
            set2 = h0.f322473a;
        }
        if (set2.isEmpty()) {
            d.a(controller.m2());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xji.a
    public final void z2(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        in0.g gVar = controller instanceof in0.g ? (in0.g) controller : null;
        WeakHashMap weakHashMap = f132365b;
        if (gVar != null && gVar.p0()) {
            Set linkedHashSet = (Set) weakHashMap.get(controller.m2());
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet();
            }
            linkedHashSet.add(controller.u2());
            weakHashMap.put(controller.m2(), linkedHashSet);
        }
        Activity activityM2 = controller.m2();
        if (!a(activityM2)) {
            Collection collection = (Set) weakHashMap.get(activityM2);
            if (collection == null) {
                collection = h0.f322473a;
            }
            if (collection.isEmpty()) {
                d.a(activityM2);
                return;
            }
        }
        d.b(activityM2);
    }
}

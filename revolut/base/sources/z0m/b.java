package z0m;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
public final class b implements Application.ActivityLifecycleCallbacks {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static b f318642b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Integer f318643a;

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
    public final void onActivityResumed(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Integer num = this.f318643a;
        if (num == null || num.intValue() != activity.hashCode()) {
            this.f318643a = Integer.valueOf(activity.hashCode());
            Intrinsics.checkNotNullExpressionValue("b", "TAG");
            j.a("b", "Auto screenview occurred - activity has resumed", new Object[0]);
            try {
                f1m.h.Companion.getClass();
                f1m.h hVarA = f1m.g.a(activity);
                HashMap map = new HashMap();
                map.put("event", hVarA);
                a1m.d.b("SnowplowScreenView", map);
            } catch (Exception e) {
                Intrinsics.checkNotNullExpressionValue("b", "TAG");
                j.b("b", "Method onActivityResumed raised an exception: %s", e);
            }
        }
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

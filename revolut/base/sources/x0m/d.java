package x0m;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import z0m.j;

/* JADX INFO: loaded from: classes23.dex */
public final class d implements DefaultLifecycleObserver {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f301662a = c.NONE;

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        Intrinsics.checkNotNullExpressionValue("d", "TAG");
        j.a("d", "App enter foreground", new Object[0]);
        try {
            HashMap map = new HashMap();
            map.put("isForeground", Boolean.TRUE);
            a1m.d.b("SnowplowLifecycleTracking", map);
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("d", "TAG");
            j.b("d", "Method onEnterForeground raised an exception: %s", e);
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public final void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        Intrinsics.checkNotNullExpressionValue("d", "TAG");
        j.a("d", "App enter background", new Object[0]);
        try {
            HashMap map = new HashMap();
            map.put("isForeground", Boolean.FALSE);
            a1m.d.b("SnowplowLifecycleTracking", map);
        } catch (Exception e) {
            Intrinsics.checkNotNullExpressionValue("d", "TAG");
            j.b("d", "Method onEnterBackground raised an exception: %s", e);
        }
    }
}

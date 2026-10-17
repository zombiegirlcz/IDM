package mn;

import android.os.SystemClock;
import com.revolut.kompot.navigable.ControllerKey;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import no.c2;
import no.d2;

/* JADX INFO: loaded from: classes17.dex */
public final class e implements xji.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jo0.f f207322a;

    public e(jo0.f screenPerformanceTracker) {
        Intrinsics.checkNotNullParameter(screenPerformanceTracker, "screenPerformanceTracker");
        this.f207322a = screenPerformanceTracker;
    }

    @Override // xji.b
    public final void f2(ControllerKey key, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        if (z) {
            return;
        }
        d2 d2Var = (d2) this.f207322a.get();
        d2Var.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        LinkedHashMap linkedHashMap = d2Var.f217758c;
        if (linkedHashMap.containsKey(key)) {
            return;
        }
        linkedHashMap.put(key, new c2(SystemClock.elapsedRealtime()));
    }

    @Override // xji.a
    public final void q(com.revolut.kompot.navigable.a screen) {
        Intrinsics.checkNotNullParameter(screen, "controller");
        d2 d2Var = (d2) this.f207322a.get();
        d2Var.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        d2Var.f217758c.remove(screen.u2());
        d2Var.f217757b.add(screen.getClass());
    }

    @Override // xji.a
    public final void q1(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        d2 d2Var = (d2) this.f207322a.get();
        d2Var.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        c2 c2Var = (c2) d2Var.f217758c.get(controller.u2());
        if (c2Var == null || c2Var.f217749b != null) {
            return;
        }
        c2Var.f217749b = Long.valueOf(SystemClock.elapsedRealtime());
    }

    @Override // xji.a
    public final void z2(com.revolut.kompot.navigable.a controller) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        d2 d2Var = (d2) this.f207322a.get();
        d2Var.getClass();
        Intrinsics.checkNotNullParameter(controller, "controller");
        c2 c2Var = (c2) d2Var.f217758c.get(controller.u2());
        if (c2Var == null || c2Var.f217750c != null) {
            return;
        }
        c2Var.f217750c = Long.valueOf(SystemClock.elapsedRealtime());
    }
}

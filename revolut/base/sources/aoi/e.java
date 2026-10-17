package aoi;

import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.gauges.GaugeManager;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zjh.f f7993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f7994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f7995c;
    public volatile String d;

    public e(zjh.f performanceTracker) {
        Intrinsics.checkNotNullParameter(performanceTracker, "performanceTracker");
        this.f7993a = performanceTracker;
        this.f7994b = new ConcurrentHashMap();
        this.f7995c = new ConcurrentHashMap();
    }

    @Override // aoi.c
    public final void a(String str) {
        this.d = str;
    }

    @Override // aoi.c
    public final h b(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return (h) this.f7994b.get(name);
    }

    @Override // aoi.c
    public final h c(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        h hVarE = e(name);
        ((d) hVarE).start();
        this.f7994b.put(name, hVarE);
        return hVarE;
    }

    @Override // aoi.c
    public final void d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f7994b.remove(name);
    }

    @Override // aoi.c
    public final h e(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(name, "name");
        ((lf.b) this.f7993a.f322835b).getClass();
        Trace trace = new Trace(name, wf.e.f296850s, new ah.a(3), mf.c.a(), GaugeManager.getInstance());
        Intrinsics.checkNotNullExpressionValue(trace, "newTrace(...)");
        return new d(this, new b(trace));
    }

    @Override // aoi.c
    public final boolean enabled() {
        return true;
    }

    @Override // aoi.c
    public final h f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        h hVar = (h) this.f7994b.remove(name);
        if (hVar != null) {
            hVar.stop();
            ConcurrentHashMap concurrentHashMap = this.f7995c;
            if (!concurrentHashMap.containsKey(name)) {
                concurrentHashMap.put(name, name);
            }
        }
        return hVar;
    }

    @Override // aoi.c
    public final h g(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (this.f7995c.containsKey(name)) {
            return null;
        }
        return c(name);
    }
}

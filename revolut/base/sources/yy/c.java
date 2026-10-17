package yy;

import java.util.concurrent.atomic.AtomicLong;
import jv.r;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import sy.d0;
import vkm.q;
import vkm.y;
import xv.h;
import yji.n;
import z92.f;

/* JADX INFO: loaded from: classes16.dex */
public final class c extends n {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h f317735l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final pv.a f317736m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final sx.a f317737n;
    public final py.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dv.a f317738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ww.b f317739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d0 f317740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pw.c f317741s;

    public c(h detector, pv.a cameraKitEventsDelegate, sx.a cameraKitAnalyticsContextHolder, py.d cameraKitFlowStateHandler, dv.a cameraKitClient, ww.b cameraPerformanceObserver, d0 cameraScreenState, pw.c currentTimeProvider) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        Intrinsics.checkNotNullParameter(cameraKitEventsDelegate, "cameraKitEventsDelegate");
        Intrinsics.checkNotNullParameter(cameraKitAnalyticsContextHolder, "cameraKitAnalyticsContextHolder");
        Intrinsics.checkNotNullParameter(cameraKitFlowStateHandler, "cameraKitFlowStateHandler");
        Intrinsics.checkNotNullParameter(cameraKitClient, "cameraKitClient");
        Intrinsics.checkNotNullParameter(cameraPerformanceObserver, "cameraPerformanceObserver");
        Intrinsics.checkNotNullParameter(cameraScreenState, "cameraScreenState");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        this.f317735l = detector;
        this.f317736m = cameraKitEventsDelegate;
        this.f317737n = cameraKitAnalyticsContextHolder;
        this.o = cameraKitFlowStateHandler;
        this.f317738p = cameraKitClient;
        this.f317739q = cameraPerformanceObserver;
        this.f317740r = cameraScreenState;
        this.f317741s = currentTimeProvider;
    }

    @Override // yji.n
    public final void H2() {
        AtomicLong atomicLong = this.f317740r.f266542a;
        getClass();
        atomicLong.set(System.currentTimeMillis());
        Continuation continuation = null;
        n.l2(this, this.f317736m.f239967a, null, new a(this, continuation, 0), 3);
        n.l2(this, f.s(new yl6.b(this, continuation, 20), new y5j.e(this.f317735l.a(), 23)), null, null, 7);
        n.l2(this, q.g(this.o.f240639a), null, new a(this, continuation, 1), 3);
        n.l2(this, new y(new g2d.c(2, 20, continuation), ((r) this.f317738p).f178729s), null, new a(this, continuation, 4), 3);
        ww.b bVar = this.f317739q;
        n.l2(this, bVar.f, null, new jz.h(this, continuation, 1), 3);
        n.l2(this, bVar.f300564g, null, new a(this, continuation, 2), 3);
        n.l2(this, bVar.f300565h, null, new a(this, continuation, 3), 3);
    }
}

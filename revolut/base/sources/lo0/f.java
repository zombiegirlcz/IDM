package lo0;

import ho.e0;
import ho.t;
import kotlin.jvm.internal.Intrinsics;
import uo.q0;

/* JADX INFO: loaded from: classes19.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gpk.c f197334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f197335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final mo.c f197336c;
    public final uo.l d;
    public final q0 e;
    public final t f;

    public f(uo.b activeScreenHolder, gpk.c coroutineScopeProvider, e0 disabledTrackingChecker, mo.c ownerProvider, uo.l productMapper, q0 screenNameFinder, t tracker) {
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        Intrinsics.checkNotNullParameter(disabledTrackingChecker, "disabledTrackingChecker");
        Intrinsics.checkNotNullParameter(ownerProvider, "ownerProvider");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        this.f197334a = coroutineScopeProvider;
        this.f197335b = disabledTrackingChecker;
        this.f197336c = ownerProvider;
        this.d = productMapper;
        this.e = screenNameFinder;
        this.f = tracker;
        d listener = new d();
        activeScreenHolder.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        activeScreenHolder.d.add(listener);
    }
}

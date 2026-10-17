package no;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes.dex */
public final class i2 implements e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d4m.a f217792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uo.b f217793b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uo.q0 f217794c;
    public final uo.l d;
    public final wsc.a e;
    public final gpk.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Job f217795g;

    public i2(d4m.a tracker, uo.b activeScreenHolder, uo.q0 screenNameFinder, uo.l productMapper, wsc.a screenshotEventSource, gpk.c coroutineScopeProvider) {
        Intrinsics.checkNotNullParameter(tracker, "tracker");
        Intrinsics.checkNotNullParameter(activeScreenHolder, "activeScreenHolder");
        Intrinsics.checkNotNullParameter(screenNameFinder, "screenNameFinder");
        Intrinsics.checkNotNullParameter(productMapper, "productMapper");
        Intrinsics.checkNotNullParameter(screenshotEventSource, "screenshotEventSource");
        Intrinsics.checkNotNullParameter(coroutineScopeProvider, "coroutineScopeProvider");
        this.f217792a = tracker;
        this.f217793b = activeScreenHolder;
        this.f217794c = screenNameFinder;
        this.d = productMapper;
        this.e = screenshotEventSource;
        this.f = coroutineScopeProvider;
    }

    @Override // e0m.d
    public final void init() {
        Job jobC = this.f217795g;
        if (jobC == null) {
            jobC = skm.e0.C(this.f.c(), null, null, new az0.r1(this, null, 11), 3);
            jobC.k(new f2(this, 0));
        }
        this.f217795g = jobC;
    }
}

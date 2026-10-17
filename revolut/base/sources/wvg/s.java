package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.s f300469c;
    public final x4l.c d;

    public s(ComplexWealthAnalyticsService service, ne0.j memoryCache, nvg.s combinedRealisedPnlDao) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(combinedRealisedPnlDao, "combinedRealisedPnlDao");
        this.f300467a = service;
        this.f300468b = memoryCache;
        this.f300469c = combinedRealisedPnlDao;
        Continuation continuation = null;
        this.d = new x4l.c(new wqj.g(this, continuation, 3), new wpj.b(this, 27), new wtj.c(this, 11), new wuh.q(this, continuation, 6), new i(this, continuation, 4));
    }
}

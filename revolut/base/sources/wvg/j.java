package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.e f300399c;
    public final x4l.c d;

    public j(ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.e complexAnalyticsCombinedAllocationsDao) {
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(complexAnalyticsCombinedAllocationsDao, "complexAnalyticsCombinedAllocationsDao");
        this.f300397a = complexWealthAnalyticsService;
        this.f300398b = memoryCache;
        this.f300399c = complexAnalyticsCombinedAllocationsDao;
        Continuation continuation = null;
        this.d = new x4l.c(new wqj.g(this, continuation, 1), new wpj.b(this, 23), new wtj.c(this, 7), new wuh.q(this, continuation, 2), new i(this, continuation, 0));
    }
}

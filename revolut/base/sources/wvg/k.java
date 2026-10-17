package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.i f300406c;
    public final x4l.c d;

    public k(ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.i complexAnalyticsCombinedContributorsDao) {
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(complexAnalyticsCombinedContributorsDao, "complexAnalyticsCombinedContributorsDao");
        this.f300404a = complexWealthAnalyticsService;
        this.f300405b = memoryCache;
        this.f300406c = complexAnalyticsCombinedContributorsDao;
        Continuation continuation = null;
        this.d = new x4l.c(new wqj.g(this, continuation, 2), new wpj.b(this, 24), new wtj.c(this, 8), new wuh.q(this, continuation, 3), new i(this, continuation, 1));
    }
}

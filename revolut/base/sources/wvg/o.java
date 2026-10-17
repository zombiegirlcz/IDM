package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.n f300432c;
    public final CoroutineScope d;
    public final y0 e;

    public o(ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.n performanceChartDao, ue0.c storage, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(performanceChartDao, "performanceChartDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f300430a = complexWealthAnalyticsService;
        this.f300431b = memoryCache;
        this.f300432c = performanceChartDao;
        this.d = appCoroutineScope;
        Continuation continuation = null;
        this.e = new y0(storage, appCoroutineScope, new n(this, continuation, 0), new wug.k(10), new wpj.b(this, 25), new wtj.c(this, 9), new wuh.q(this, (Continuation) null, 4), new i(this, continuation, 2));
    }
}

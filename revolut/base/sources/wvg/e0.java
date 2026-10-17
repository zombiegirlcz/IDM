package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.e0 f300364c;
    public final CoroutineScope d;
    public final l80.e e;
    public final y0 f;

    public e0(ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.e0 complexAnalyticsPerformanceChartDao, ue0.c storage, CoroutineScope appCoroutineScope, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(complexAnalyticsPerformanceChartDao, "complexAnalyticsPerformanceChartDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f300362a = complexWealthAnalyticsService;
        this.f300363b = memoryCache;
        this.f300364c = complexAnalyticsPerformanceChartDao;
        this.d = appCoroutineScope;
        this.e = dateProvider;
        Continuation continuation = null;
        this.f = new y0(storage, appCoroutineScope, new n(this, continuation, 3), new wug.k(13), new d0(this, 0), new wtj.c(this, 13), new wuh.q(this, (Continuation) null, 8), new i(this, continuation, 6));
    }
}

package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f300481c;
    public final nvg.u d;
    public final y0 e;

    public v(ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, ue0.c storage, CoroutineScope appCoroutineScope, nvg.u complexAnalyticsCombinedTotalValueDao) {
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(complexAnalyticsCombinedTotalValueDao, "complexAnalyticsCombinedTotalValueDao");
        this.f300479a = complexWealthAnalyticsService;
        this.f300480b = memoryCache;
        this.f300481c = appCoroutineScope;
        this.d = complexAnalyticsCombinedTotalValueDao;
        this.e = new y0(storage, appCoroutineScope, new n(this, null, 2), new wug.k(12), new wpj.b(this, 28), new wtj.c(this, 12), new wuh.q(this, (Continuation) null, 7), new i(this, null, 5));
    }
}

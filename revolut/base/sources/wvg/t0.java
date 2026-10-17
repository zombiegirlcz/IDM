package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.t0 f300475c;
    public final CoroutineScope d;
    public final l80.e e;
    public final y0 f;

    public t0(ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.t0 complexAnalyticsTotalValueDao, ue0.c storage, CoroutineScope appCoroutineScope, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(complexAnalyticsTotalValueDao, "complexAnalyticsTotalValueDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f300473a = complexWealthAnalyticsService;
        this.f300474b = memoryCache;
        this.f300475c = complexAnalyticsTotalValueDao;
        this.d = appCoroutineScope;
        this.e = dateProvider;
        this.f = new y0(storage, appCoroutineScope, new n(this, null, 5), new wug.k(15), new d0(this, 5), new wtj.c(this, 15), new wuh.q(this, (Continuation) null, 10), new i(this, null, 8));
    }
}

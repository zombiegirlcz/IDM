package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.h0 f300377c;
    public final CoroutineScope d;
    public final y0 e;

    public g0(ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.h0 pnlDao, ue0.c storage, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(pnlDao, "pnlDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f300375a = complexWealthAnalyticsService;
        this.f300376b = memoryCache;
        this.f300377c = pnlDao;
        this.d = appCoroutineScope;
        Continuation continuation = null;
        this.e = new y0(storage, appCoroutineScope, new n(this, continuation, 4), new wug.k(14), new d0(this, 1), new wtj.c(this, 14), new wuh.q(this, continuation, 9), new i(this, continuation, 7));
    }
}

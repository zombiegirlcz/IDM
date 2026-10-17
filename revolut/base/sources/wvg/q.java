package wvg;

import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes9.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.q f300453c;
    public final CoroutineScope d;
    public final y0 e;

    public q(ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.q combinedPnlDao, ue0.c storage, CoroutineScope appCoroutineScope) {
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(combinedPnlDao, "combinedPnlDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        this.f300451a = complexWealthAnalyticsService;
        this.f300452b = memoryCache;
        this.f300453c = combinedPnlDao;
        this.d = appCoroutineScope;
        Continuation continuation = null;
        this.e = new y0(storage, appCoroutineScope, new n(this, continuation, 1), new wug.k(11), new wpj.b(this, 26), new wtj.c(this, 10), new wuh.q(this, continuation, 5), new i(this, continuation, 3));
    }
}

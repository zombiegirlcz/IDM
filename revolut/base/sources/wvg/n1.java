package wvg;

import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.PerformanceChart;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes9.dex */
public final class n1 implements e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.e0 f300427c;
    public final nvg.n d;
    public final CoroutineScope e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f300428g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0 f300429h;

    public n1(ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.e0 performanceChartDao, nvg.n combinedPerformanceChartDao, ue0.c storage, CoroutineScope appCoroutineScope, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(performanceChartDao, "performanceChartDao");
        Intrinsics.checkNotNullParameter(combinedPerformanceChartDao, "combinedPerformanceChartDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f300425a = complexWealthAnalyticsService;
        this.f300426b = memoryCache;
        this.f300427c = performanceChartDao;
        this.d = combinedPerformanceChartDao;
        this.e = appCoroutineScope;
        this.f = featureToggleInteractor;
        n nVar = new n(this, null, 7);
        final int i = 1;
        Function2 function2 = new Function2(this) { // from class: wvg.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n1 f300411b;

            {
                this.f300411b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                PerformanceChart performanceChartD;
                PerformanceChart performanceChartC;
                switch (i) {
                    case 0:
                        h1 params = (h1) obj2;
                        xvg.a domain = (xvg.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300411b.f300426b.f(params.f300388g, domain);
                        return Unit.f186387a;
                    case 1:
                        o1 params2 = (o1) obj2;
                        uvg.w dto = (uvg.w) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        n1 n1Var = this.f300411b;
                        xvg.a aVar = (xvg.a) n1Var.f300426b.get(params2.f300440h);
                        if (aVar == null || (performanceChartD = aVar.f309263b) == null) {
                            performanceChartD = n1Var.d(params2);
                        }
                        return l9.l.C(dto, performanceChartD, params2.f300439g);
                    case 2:
                        o1 params3 = (o1) obj2;
                        xvg.a domain2 = (xvg.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f300411b.f300426b.f(params3.f300440h, domain2);
                        return Unit.f186387a;
                    default:
                        h1 params4 = (h1) obj2;
                        uvg.w dto2 = (uvg.w) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(dto2, "dto");
                        n1 n1Var2 = this.f300411b;
                        xvg.a aVar2 = (xvg.a) n1Var2.f300426b.get(params4.f300388g);
                        if (aVar2 == null || (performanceChartC = aVar2.f309263b) == null) {
                            performanceChartC = n1Var2.c(params4);
                        }
                        return l9.l.C(dto2, performanceChartC, params4.f);
                }
            }
        };
        Function1 function1 = new Function1(this) { // from class: wvg.j1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n1 f300403b;

            {
                this.f300403b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i) {
                    case 0:
                        h1 params = (h1) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (xvg.a) this.f300403b.f300426b.get(params.f300388g);
                    default:
                        o1 params2 = (o1) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (xvg.a) this.f300403b.f300426b.get(params2.f300440h);
                }
            }
        };
        final int i2 = 2;
        this.f300428g = new y0(storage, appCoroutineScope, nVar, function2, function1, new Function2(this) { // from class: wvg.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n1 f300411b;

            {
                this.f300411b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                PerformanceChart performanceChartD;
                PerformanceChart performanceChartC;
                switch (i2) {
                    case 0:
                        h1 params = (h1) obj2;
                        xvg.a domain = (xvg.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300411b.f300426b.f(params.f300388g, domain);
                        return Unit.f186387a;
                    case 1:
                        o1 params2 = (o1) obj2;
                        uvg.w dto = (uvg.w) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        n1 n1Var = this.f300411b;
                        xvg.a aVar = (xvg.a) n1Var.f300426b.get(params2.f300440h);
                        if (aVar == null || (performanceChartD = aVar.f309263b) == null) {
                            performanceChartD = n1Var.d(params2);
                        }
                        return l9.l.C(dto, performanceChartD, params2.f300439g);
                    case 2:
                        o1 params3 = (o1) obj2;
                        xvg.a domain2 = (xvg.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f300411b.f300426b.f(params3.f300440h, domain2);
                        return Unit.f186387a;
                    default:
                        h1 params4 = (h1) obj2;
                        uvg.w dto2 = (uvg.w) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(dto2, "dto");
                        n1 n1Var2 = this.f300411b;
                        xvg.a aVar2 = (xvg.a) n1Var2.f300426b.get(params4.f300388g);
                        if (aVar2 == null || (performanceChartC = aVar2.f309263b) == null) {
                            performanceChartC = n1Var2.c(params4);
                        }
                        return l9.l.C(dto2, performanceChartC, params4.f);
                }
            }
        }, new m1(this, null, 1), new i(this, null, 10));
        n nVar2 = new n(this, null, 6);
        final int i3 = 3;
        Function2 function22 = new Function2(this) { // from class: wvg.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n1 f300411b;

            {
                this.f300411b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                PerformanceChart performanceChartD;
                PerformanceChart performanceChartC;
                switch (i3) {
                    case 0:
                        h1 params = (h1) obj2;
                        xvg.a domain = (xvg.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300411b.f300426b.f(params.f300388g, domain);
                        return Unit.f186387a;
                    case 1:
                        o1 params2 = (o1) obj2;
                        uvg.w dto = (uvg.w) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        n1 n1Var = this.f300411b;
                        xvg.a aVar = (xvg.a) n1Var.f300426b.get(params2.f300440h);
                        if (aVar == null || (performanceChartD = aVar.f309263b) == null) {
                            performanceChartD = n1Var.d(params2);
                        }
                        return l9.l.C(dto, performanceChartD, params2.f300439g);
                    case 2:
                        o1 params3 = (o1) obj2;
                        xvg.a domain2 = (xvg.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f300411b.f300426b.f(params3.f300440h, domain2);
                        return Unit.f186387a;
                    default:
                        h1 params4 = (h1) obj2;
                        uvg.w dto2 = (uvg.w) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(dto2, "dto");
                        n1 n1Var2 = this.f300411b;
                        xvg.a aVar2 = (xvg.a) n1Var2.f300426b.get(params4.f300388g);
                        if (aVar2 == null || (performanceChartC = aVar2.f309263b) == null) {
                            performanceChartC = n1Var2.c(params4);
                        }
                        return l9.l.C(dto2, performanceChartC, params4.f);
                }
            }
        };
        final int i5 = 0;
        this.f300429h = new y0(storage, appCoroutineScope, nVar2, function22, new Function1(this) { // from class: wvg.j1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n1 f300403b;

            {
                this.f300403b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                switch (i5) {
                    case 0:
                        h1 params = (h1) obj2;
                        Intrinsics.checkNotNullParameter(params, "params");
                        return (xvg.a) this.f300403b.f300426b.get(params.f300388g);
                    default:
                        o1 params2 = (o1) obj2;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        return (xvg.a) this.f300403b.f300426b.get(params2.f300440h);
                }
            }
        }, new Function2(this) { // from class: wvg.k1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ n1 f300411b;

            {
                this.f300411b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) {
                PerformanceChart performanceChartD;
                PerformanceChart performanceChartC;
                switch (i5) {
                    case 0:
                        h1 params = (h1) obj2;
                        xvg.a domain = (xvg.a) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        this.f300411b.f300426b.f(params.f300388g, domain);
                        return Unit.f186387a;
                    case 1:
                        o1 params2 = (o1) obj2;
                        uvg.w dto = (uvg.w) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        n1 n1Var = this.f300411b;
                        xvg.a aVar = (xvg.a) n1Var.f300426b.get(params2.f300440h);
                        if (aVar == null || (performanceChartD = aVar.f309263b) == null) {
                            performanceChartD = n1Var.d(params2);
                        }
                        return l9.l.C(dto, performanceChartD, params2.f300439g);
                    case 2:
                        o1 params3 = (o1) obj2;
                        xvg.a domain2 = (xvg.a) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        this.f300411b.f300426b.f(params3.f300440h, domain2);
                        return Unit.f186387a;
                    default:
                        h1 params4 = (h1) obj2;
                        uvg.w dto2 = (uvg.w) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(dto2, "dto");
                        n1 n1Var2 = this.f300411b;
                        xvg.a aVar2 = (xvg.a) n1Var2.f300426b.get(params4.f300388g);
                        if (aVar2 == null || (performanceChartC = aVar2.f309263b) == null) {
                            performanceChartC = n1Var2.c(params4);
                        }
                        return l9.l.C(dto2, performanceChartC, params4.f);
                }
            }
        }, new m1(this, null, 0), new i(this, null, 9));
    }

    @Override // wvg.e1
    public final Flow a(String userId, iwg.a analyticsProductType, String str, eel.c chartPeriod, xi0.b currency, iwg.c method, String str2) {
        akg.n nVarA;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        o1 o1Var = new o1(userId, analyticsProductType, str, chartPeriod, currency, method, str2);
        boolean zC = ((jte.d) this.f).c(WealthAnalyticsApi$Toggles.AnalyticsRealtimeChartsPolling.f94963c);
        y0 y0Var = this.f300428g;
        if (zC) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            nVarA = y0.b(y0Var, o1Var, kotlin.time.c.h(3L, pkm.e.SECONDS), loadingStrategy);
        } else {
            nVarA = y0Var.a(o1Var, loadingStrategy);
        }
        return nim.a.v(nVarA, new wuk.c(28));
    }

    @Override // wvg.e1
    public final Flow b(String userId, List analyticsProductTypes, eel.c chartPeriod, xi0.b currency, iwg.c method, String str, w4l.k loadingStrategy) {
        akg.n nVarA;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        h1 h1Var = new h1(chartPeriod, method, userId, str, zhm.d0.P0(analyticsProductTypes, new l1()), currency);
        boolean zC = ((jte.d) this.f).c(WealthAnalyticsApi$Toggles.AnalyticsRealtimeChartsPolling.f94963c);
        y0 y0Var = this.f300429h;
        if (zC) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            nVarA = y0.b(y0Var, h1Var, kotlin.time.c.h(3L, pkm.e.SECONDS), loadingStrategy);
        } else {
            nVarA = y0Var.a(h1Var, loadingStrategy);
        }
        return nim.a.v(nVarA, new wuk.c(26));
    }

    public final PerformanceChart c(h1 h1Var) {
        String strK0 = zhm.d0.k0(h1Var.f300386b, "_", null, null, 0, null, 62);
        eel.c cVar = h1Var.f300387c;
        String str = h1Var.d.f306286a;
        iwg.c cVar2 = h1Var.e;
        String str2 = h1Var.f;
        if (str2 == null) {
            str2 = "";
        }
        return jb3.l.A(this.d.d(strK0, cVar, str, cVar2, str2));
    }

    public final PerformanceChart d(o1 o1Var) {
        iwg.a aVar = o1Var.f300437b;
        eel.c cVar = o1Var.d;
        String str = o1Var.e.f306286a;
        iwg.c cVar2 = o1Var.f;
        String str2 = o1Var.f300439g;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = str2;
        String str4 = o1Var.f300438c;
        if (str4 == null) {
            str4 = "LOCAL_PORTFOLIO_ID";
        }
        return kp0.w0.v(this.f300427c.d(aVar, cVar, str, cVar2, str3, str4));
    }
}

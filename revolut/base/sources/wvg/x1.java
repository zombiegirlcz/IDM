package wvg;

import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import com.revolut.feature.wealth.analytics.data.network.ComplexWealthAnalyticsService;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartFacade;
import com.revolut.feature.wealth.analytics.data.repositories.complex_analytics.model.TotalValueChartPointFacade;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.SimpleTotalValueChartPoint;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChartPoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes9.dex */
public final class x1 implements a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComplexWealthAnalyticsService f300494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ne0.j f300495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nvg.t0 f300496c;
    public final nvg.u d;
    public final CoroutineScope e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final y0 f300497g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y0 f300498h;

    public x1(ComplexWealthAnalyticsService complexWealthAnalyticsService, ne0.j memoryCache, nvg.t0 totalValueDao, nvg.u combinedTotalValueDao, ue0.c storage, CoroutineScope appCoroutineScope, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(complexWealthAnalyticsService, "complexWealthAnalyticsService");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(totalValueDao, "totalValueDao");
        Intrinsics.checkNotNullParameter(combinedTotalValueDao, "combinedTotalValueDao");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(appCoroutineScope, "appCoroutineScope");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f300494a = complexWealthAnalyticsService;
        this.f300495b = memoryCache;
        this.f300496c = totalValueDao;
        this.d = combinedTotalValueDao;
        this.e = appCoroutineScope;
        this.f = featureToggleInteractor;
        Continuation continuation = null;
        n nVar = new n(this, continuation, 9);
        final int i = 0;
        Function2 function2 = new Function2(this) { // from class: wvg.s1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x1 f300472b;

            {
                this.f300472b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                TotalValueChartFacade totalValueChartFacadeR;
                TotalValueChartFacade totalValueChartFacadeF;
                switch (i) {
                    case 0:
                        p1 params = (p1) obj2;
                        uvg.z dto = (uvg.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        x1 x1Var = this.f300472b;
                        xvg.b bVar = (xvg.b) x1Var.f300495b.get(params.f300449g);
                        if (bVar == null || (totalValueChartFacadeR = bVar.f309265b) == null) {
                            nvg.t0 t0Var = x1Var.f300496c;
                            iwg.a aVar = params.f300447b;
                            eel.c cVar = params.d;
                            String str = params.e.f306286a;
                            String str2 = params.f300448c;
                            if (str2 == null) {
                                str2 = "LOCAL_PORTFOLIO_ID";
                            }
                            totalValueChartFacadeR = md6.s.r(t0Var.d(aVar, cVar, str, str2, params.f));
                        }
                        return ngm.n.B(dto, totalValueChartFacadeR);
                    case 1:
                        p1 params2 = (p1) obj2;
                        xvg.b domain = (xvg.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        String str3 = params2.f300449g;
                        String str4 = params2.f300450h;
                        ne0.j jVar = this.f300472b.f300495b;
                        jVar.f(str3, domain);
                        TotalValueChartPointFacade totalValueChartPointFacade = domain.f309266c;
                        if (totalValueChartPointFacade != null) {
                            jVar.f(str4, totalValueChartPointFacade);
                        } else {
                            jVar.remove(str4);
                        }
                        return Unit.f186387a;
                    case 2:
                        i1 params3 = (i1) obj2;
                        uvg.z dto2 = (uvg.z) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(dto2, "dto");
                        x1 x1Var2 = this.f300472b;
                        xvg.b bVar2 = (xvg.b) x1Var2.f300495b.get(params3.f);
                        if (bVar2 == null || (totalValueChartFacadeF = bVar2.f309265b) == null) {
                            totalValueChartFacadeF = x1Var2.f(params3);
                        }
                        return ngm.n.B(dto2, totalValueChartFacadeF);
                    default:
                        i1 params4 = (i1) obj2;
                        xvg.b domain2 = (xvg.b) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        String str5 = params4.f;
                        String str6 = params4.f300396g;
                        ne0.j jVar2 = this.f300472b.f300495b;
                        jVar2.f(str5, domain2);
                        TotalValueChartPointFacade totalValueChartPointFacade2 = domain2.f309266c;
                        if (totalValueChartPointFacade2 != null) {
                            jVar2.f(str6, totalValueChartPointFacade2);
                        } else {
                            jVar2.remove(str6);
                        }
                        return Unit.f186387a;
                }
            }
        };
        final int i2 = 1;
        this.f300497g = new y0(storage, appCoroutineScope, nVar, function2, new q1(this, i2), new Function2(this) { // from class: wvg.s1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x1 f300472b;

            {
                this.f300472b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                TotalValueChartFacade totalValueChartFacadeR;
                TotalValueChartFacade totalValueChartFacadeF;
                switch (i2) {
                    case 0:
                        p1 params = (p1) obj2;
                        uvg.z dto = (uvg.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        x1 x1Var = this.f300472b;
                        xvg.b bVar = (xvg.b) x1Var.f300495b.get(params.f300449g);
                        if (bVar == null || (totalValueChartFacadeR = bVar.f309265b) == null) {
                            nvg.t0 t0Var = x1Var.f300496c;
                            iwg.a aVar = params.f300447b;
                            eel.c cVar = params.d;
                            String str = params.e.f306286a;
                            String str2 = params.f300448c;
                            if (str2 == null) {
                                str2 = "LOCAL_PORTFOLIO_ID";
                            }
                            totalValueChartFacadeR = md6.s.r(t0Var.d(aVar, cVar, str, str2, params.f));
                        }
                        return ngm.n.B(dto, totalValueChartFacadeR);
                    case 1:
                        p1 params2 = (p1) obj2;
                        xvg.b domain = (xvg.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        String str3 = params2.f300449g;
                        String str4 = params2.f300450h;
                        ne0.j jVar = this.f300472b.f300495b;
                        jVar.f(str3, domain);
                        TotalValueChartPointFacade totalValueChartPointFacade = domain.f309266c;
                        if (totalValueChartPointFacade != null) {
                            jVar.f(str4, totalValueChartPointFacade);
                        } else {
                            jVar.remove(str4);
                        }
                        return Unit.f186387a;
                    case 2:
                        i1 params3 = (i1) obj2;
                        uvg.z dto2 = (uvg.z) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(dto2, "dto");
                        x1 x1Var2 = this.f300472b;
                        xvg.b bVar2 = (xvg.b) x1Var2.f300495b.get(params3.f);
                        if (bVar2 == null || (totalValueChartFacadeF = bVar2.f309265b) == null) {
                            totalValueChartFacadeF = x1Var2.f(params3);
                        }
                        return ngm.n.B(dto2, totalValueChartFacadeF);
                    default:
                        i1 params4 = (i1) obj2;
                        xvg.b domain2 = (xvg.b) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        String str5 = params4.f;
                        String str6 = params4.f300396g;
                        ne0.j jVar2 = this.f300472b.f300495b;
                        jVar2.f(str5, domain2);
                        TotalValueChartPointFacade totalValueChartPointFacade2 = domain2.f309266c;
                        if (totalValueChartPointFacade2 != null) {
                            jVar2.f(str6, totalValueChartPointFacade2);
                        } else {
                            jVar2.remove(str6);
                        }
                        return Unit.f186387a;
                }
            }
        }, new w1(this, continuation, i2), new i(this, continuation, 12));
        n nVar2 = new n(this, continuation, 8);
        final int i3 = 2;
        Function2 function22 = new Function2(this) { // from class: wvg.s1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x1 f300472b;

            {
                this.f300472b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                TotalValueChartFacade totalValueChartFacadeR;
                TotalValueChartFacade totalValueChartFacadeF;
                switch (i3) {
                    case 0:
                        p1 params = (p1) obj2;
                        uvg.z dto = (uvg.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        x1 x1Var = this.f300472b;
                        xvg.b bVar = (xvg.b) x1Var.f300495b.get(params.f300449g);
                        if (bVar == null || (totalValueChartFacadeR = bVar.f309265b) == null) {
                            nvg.t0 t0Var = x1Var.f300496c;
                            iwg.a aVar = params.f300447b;
                            eel.c cVar = params.d;
                            String str = params.e.f306286a;
                            String str2 = params.f300448c;
                            if (str2 == null) {
                                str2 = "LOCAL_PORTFOLIO_ID";
                            }
                            totalValueChartFacadeR = md6.s.r(t0Var.d(aVar, cVar, str, str2, params.f));
                        }
                        return ngm.n.B(dto, totalValueChartFacadeR);
                    case 1:
                        p1 params2 = (p1) obj2;
                        xvg.b domain = (xvg.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        String str3 = params2.f300449g;
                        String str4 = params2.f300450h;
                        ne0.j jVar = this.f300472b.f300495b;
                        jVar.f(str3, domain);
                        TotalValueChartPointFacade totalValueChartPointFacade = domain.f309266c;
                        if (totalValueChartPointFacade != null) {
                            jVar.f(str4, totalValueChartPointFacade);
                        } else {
                            jVar.remove(str4);
                        }
                        return Unit.f186387a;
                    case 2:
                        i1 params3 = (i1) obj2;
                        uvg.z dto2 = (uvg.z) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(dto2, "dto");
                        x1 x1Var2 = this.f300472b;
                        xvg.b bVar2 = (xvg.b) x1Var2.f300495b.get(params3.f);
                        if (bVar2 == null || (totalValueChartFacadeF = bVar2.f309265b) == null) {
                            totalValueChartFacadeF = x1Var2.f(params3);
                        }
                        return ngm.n.B(dto2, totalValueChartFacadeF);
                    default:
                        i1 params4 = (i1) obj2;
                        xvg.b domain2 = (xvg.b) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        String str5 = params4.f;
                        String str6 = params4.f300396g;
                        ne0.j jVar2 = this.f300472b.f300495b;
                        jVar2.f(str5, domain2);
                        TotalValueChartPointFacade totalValueChartPointFacade2 = domain2.f309266c;
                        if (totalValueChartPointFacade2 != null) {
                            jVar2.f(str6, totalValueChartPointFacade2);
                        } else {
                            jVar2.remove(str6);
                        }
                        return Unit.f186387a;
                }
            }
        };
        q1 q1Var = new q1(this, i3);
        final int i5 = 3;
        this.f300498h = new y0(storage, appCoroutineScope, nVar2, function22, q1Var, new Function2(this) { // from class: wvg.s1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x1 f300472b;

            {
                this.f300472b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj2, Object obj3) throws IOException {
                TotalValueChartFacade totalValueChartFacadeR;
                TotalValueChartFacade totalValueChartFacadeF;
                switch (i5) {
                    case 0:
                        p1 params = (p1) obj2;
                        uvg.z dto = (uvg.z) obj3;
                        Intrinsics.checkNotNullParameter(params, "params");
                        Intrinsics.checkNotNullParameter(dto, "dto");
                        x1 x1Var = this.f300472b;
                        xvg.b bVar = (xvg.b) x1Var.f300495b.get(params.f300449g);
                        if (bVar == null || (totalValueChartFacadeR = bVar.f309265b) == null) {
                            nvg.t0 t0Var = x1Var.f300496c;
                            iwg.a aVar = params.f300447b;
                            eel.c cVar = params.d;
                            String str = params.e.f306286a;
                            String str2 = params.f300448c;
                            if (str2 == null) {
                                str2 = "LOCAL_PORTFOLIO_ID";
                            }
                            totalValueChartFacadeR = md6.s.r(t0Var.d(aVar, cVar, str, str2, params.f));
                        }
                        return ngm.n.B(dto, totalValueChartFacadeR);
                    case 1:
                        p1 params2 = (p1) obj2;
                        xvg.b domain = (xvg.b) obj3;
                        Intrinsics.checkNotNullParameter(params2, "params");
                        Intrinsics.checkNotNullParameter(domain, "domain");
                        String str3 = params2.f300449g;
                        String str4 = params2.f300450h;
                        ne0.j jVar = this.f300472b.f300495b;
                        jVar.f(str3, domain);
                        TotalValueChartPointFacade totalValueChartPointFacade = domain.f309266c;
                        if (totalValueChartPointFacade != null) {
                            jVar.f(str4, totalValueChartPointFacade);
                        } else {
                            jVar.remove(str4);
                        }
                        return Unit.f186387a;
                    case 2:
                        i1 params3 = (i1) obj2;
                        uvg.z dto2 = (uvg.z) obj3;
                        Intrinsics.checkNotNullParameter(params3, "params");
                        Intrinsics.checkNotNullParameter(dto2, "dto");
                        x1 x1Var2 = this.f300472b;
                        xvg.b bVar2 = (xvg.b) x1Var2.f300495b.get(params3.f);
                        if (bVar2 == null || (totalValueChartFacadeF = bVar2.f309265b) == null) {
                            totalValueChartFacadeF = x1Var2.f(params3);
                        }
                        return ngm.n.B(dto2, totalValueChartFacadeF);
                    default:
                        i1 params4 = (i1) obj2;
                        xvg.b domain2 = (xvg.b) obj3;
                        Intrinsics.checkNotNullParameter(params4, "params");
                        Intrinsics.checkNotNullParameter(domain2, "domain");
                        String str5 = params4.f;
                        String str6 = params4.f300396g;
                        ne0.j jVar2 = this.f300472b.f300495b;
                        jVar2.f(str5, domain2);
                        TotalValueChartPointFacade totalValueChartPointFacade2 = domain2.f309266c;
                        if (totalValueChartPointFacade2 != null) {
                            jVar2.f(str6, totalValueChartPointFacade2);
                        } else {
                            jVar2.remove(str6);
                        }
                        return Unit.f186387a;
                }
            }
        }, new w1(this, continuation, 0), new i(this, continuation, 11));
    }

    public static SimpleTotalValueChart g(TotalValueChartFacade totalValueChartFacade) {
        DateTime dateTime = totalValueChartFacade.f94985a;
        DateTime dateTime2 = totalValueChartFacade.f94986b;
        List<TotalValueChartPointFacade> list = totalValueChartFacade.f94987c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (TotalValueChartPointFacade totalValueChartPointFacade : list) {
            arrayList.add(new SimpleTotalValueChartPoint(totalValueChartPointFacade.f94989b, totalValueChartPointFacade.f94988a));
        }
        return new SimpleTotalValueChart(dateTime, dateTime2, arrayList);
    }

    public static TotalValueChart h(TotalValueChartFacade totalValueChartFacade) {
        DateTime dateTime = totalValueChartFacade.f94985a;
        DateTime dateTime2 = totalValueChartFacade.f94986b;
        List<TotalValueChartPointFacade> list = totalValueChartFacade.f94987c;
        ArrayList arrayList = new ArrayList(zhm.w.t(list, 10));
        for (TotalValueChartPointFacade totalValueChartPointFacade : list) {
            DateTime dateTime3 = totalValueChartPointFacade.f94988a;
            dj0.d dVar = totalValueChartPointFacade.f94989b;
            dj0.d dVar2 = totalValueChartPointFacade.f94990c;
            if (dVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            arrayList.add(new TotalValueChartPoint(dVar, dVar2, dateTime3));
        }
        dj0.d dVar3 = totalValueChartFacade.d;
        if (dVar3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        dj0.d dVar4 = totalValueChartFacade.e;
        if (dVar4 != null) {
            return new TotalValueChart(dVar3, dVar4, arrayList, dateTime, dateTime2);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    @Override // wvg.a2
    public final Flow a(String userId, List analyticsProductTypes, eel.c chartPeriod, xi0.b currency, w4l.k loadingStrategy) {
        akg.n nVarA;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        i1 i1Var = new i1(userId, zhm.d0.P0(analyticsProductTypes, new v1()), chartPeriod, currency, le.u1.g(iwg.d.VALUE_ONLY_CHART, rvg.a.f257779a));
        boolean zC = ((jte.d) this.f).c(WealthAnalyticsApi$Toggles.AnalyticsRealtimeChartsPolling.f94963c);
        y0 y0Var = this.f300498h;
        if (zC) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            nVarA = y0.b(y0Var, i1Var, kotlin.time.c.h(3L, pkm.e.SECONDS), loadingStrategy);
        } else {
            nVarA = y0Var.a(i1Var, loadingStrategy);
        }
        return nim.a.v(nVarA, new q1(this, 4));
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.Map] */
    @Override // wvg.a2
    public final Flow b(String userId, iwg.a analyticsProductType, String str, eel.c chartPeriod, xi0.b currency) {
        akg.n nVarA;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        w4l.i loadingStrategy = w4l.i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        p1 p1Var = new p1(userId, analyticsProductType, str, chartPeriod, currency, le.u1.g(iwg.d.FULL_CHART, rvg.a.f257779a));
        boolean zC = ((jte.d) this.f).c(WealthAnalyticsApi$Toggles.AnalyticsRealtimeChartsPolling.f94963c);
        y0 y0Var = this.f300497g;
        if (zC) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            nVarA = y0.b(y0Var, p1Var, kotlin.time.c.h(3L, pkm.e.SECONDS), loadingStrategy);
        } else {
            nVarA = y0Var.a(p1Var, loadingStrategy);
        }
        return nim.a.v(nVarA, new q1(this, 3));
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Map] */
    @Override // wvg.a2
    public final Flow c(String userId, iwg.a analyticsProductType, String str, eel.c chartPeriod, xi0.b currency, w4l.k loadingStrategy) {
        akg.n nVarA;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        p1 p1Var = new p1(userId, analyticsProductType, str, chartPeriod, currency, le.u1.g(iwg.d.VALUE_ONLY_CHART, rvg.a.f257779a));
        boolean zC = ((jte.d) this.f).c(WealthAnalyticsApi$Toggles.AnalyticsRealtimeChartsPolling.f94963c);
        y0 y0Var = this.f300497g;
        if (zC) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            nVarA = y0.b(y0Var, p1Var, kotlin.time.c.h(3L, pkm.e.SECONDS), loadingStrategy);
        } else {
            nVarA = y0Var.a(p1Var, loadingStrategy);
        }
        return nim.a.v(nVarA, new q1(this, 5));
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Map] */
    @Override // wvg.a2
    public final Flow d(String userId, List analyticsProductTypes, eel.c chartPeriod, xi0.b currency, w4l.k loadingStrategy) {
        akg.n nVarA;
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(analyticsProductTypes, "analyticsProductTypes");
        Intrinsics.checkNotNullParameter(chartPeriod, "chartPeriod");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        i1 i1Var = new i1(userId, zhm.d0.P0(analyticsProductTypes, new u1()), chartPeriod, currency, le.u1.g(iwg.d.FULL_CHART, rvg.a.f257779a));
        boolean zC = ((jte.d) this.f).c(WealthAnalyticsApi$Toggles.AnalyticsRealtimeChartsPolling.f94963c);
        y0 y0Var = this.f300498h;
        if (zC) {
            b.Companion companion = kotlin.time.b.INSTANCE;
            nVarA = y0.b(y0Var, i1Var, kotlin.time.c.h(3L, pkm.e.SECONDS), loadingStrategy);
        } else {
            nVarA = y0Var.a(i1Var, loadingStrategy);
        }
        return nim.a.v(nVarA, new q1(this, 0));
    }

    public final xvg.b e(String str, String str2) {
        ne0.j jVar = this.f300495b;
        Object obj2 = jVar.get(str);
        xvg.b bVar = obj2 instanceof xvg.b ? (xvg.b) obj2 : null;
        if (bVar == null) {
            return null;
        }
        TotalValueChartPointFacade totalValueChartPointFacade = (TotalValueChartPointFacade) jVar.get(str2);
        TotalValueChartFacade totalValueChartFacade = bVar.f309265b;
        return totalValueChartFacade != null ? ngm.n.H(totalValueChartFacade, totalValueChartPointFacade) : bVar;
    }

    public final TotalValueChartFacade f(i1 i1Var) throws IOException {
        return knm.b.E(this.d.d(i1Var.f300393a, zhm.d0.k0(i1Var.f300394b, "_", null, null, 0, null, 62), i1Var.f300395c, i1Var.d.f306286a, i1Var.e));
    }
}

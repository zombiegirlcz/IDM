package kwg;

import com.revolut.feature.wealth.analytics.domain.models.complex_analytics.TotalValueChart;
import com.revolut.feature.wealth.analytics.widgetised.navigation.WidgetisedAnalyticsType;
import efm.r;
import k7c.n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import wvg.a2;
import wvg.e1;
import wvg.g0;
import wvg.k0;
import wvg.o0;
import wvg.q;
import wvg.r0;
import wvg.s;
import wvg.z;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements b {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final DateTime f190352t = new DateTime(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f190353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.k f190354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f190355c;
    public final wvg.h d;
    public final wvg.j e;
    public final k0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f190356g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f190357h;
    public final o0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r0 f190358j;
    public final uvl.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final tzg.m f190359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l80.e f190360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kbb.c f190361n;
    public final q o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final wvg.k f190362p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final tyg.j f190363q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e1 f190364r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a2 f190365s;

    public l(ang.f userInteractor, ybl.k tradingAccountsInteractor, z complexAnalyticsContributorsRepository, wvg.h complexAnalyticsAllocationsRepository, wvg.j complexAnalyticsCombinedAllocationsRepository, k0 complexAnalyticsRealisedPnlRepository, s complexAnalyticsCombinedRealisedPnlRepository, g0 complexAnalyticsPnlRepository, o0 complexAnalyticsSectorAllocationsRepository, r0 complexAnalyticsSectorContributorsRepository, uvl.c complexAnalyticsDividendsRepository, tzg.m wealthAccountsInteractor, l80.e dateProvider, kbb.c complexAnalyticsCurrencyInteractor, q complexAnalyticsCombinedPnlChartRepository, wvg.k complexAnalyticsCombinedContributorsRepository, tyg.j configInteractor, e1 performanceChartRepository, a2 totalValueChartRepository) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsContributorsRepository, "complexAnalyticsContributorsRepository");
        Intrinsics.checkNotNullParameter(complexAnalyticsAllocationsRepository, "complexAnalyticsAllocationsRepository");
        Intrinsics.checkNotNullParameter(complexAnalyticsCombinedAllocationsRepository, "complexAnalyticsCombinedAllocationsRepository");
        Intrinsics.checkNotNullParameter(complexAnalyticsRealisedPnlRepository, "complexAnalyticsRealisedPnlRepository");
        Intrinsics.checkNotNullParameter(complexAnalyticsCombinedRealisedPnlRepository, "complexAnalyticsCombinedRealisedPnlRepository");
        Intrinsics.checkNotNullParameter(complexAnalyticsPnlRepository, "complexAnalyticsPnlRepository");
        Intrinsics.checkNotNullParameter(complexAnalyticsSectorAllocationsRepository, "complexAnalyticsSectorAllocationsRepository");
        Intrinsics.checkNotNullParameter(complexAnalyticsSectorContributorsRepository, "complexAnalyticsSectorContributorsRepository");
        Intrinsics.checkNotNullParameter(complexAnalyticsDividendsRepository, "complexAnalyticsDividendsRepository");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(complexAnalyticsCurrencyInteractor, "complexAnalyticsCurrencyInteractor");
        Intrinsics.checkNotNullParameter(complexAnalyticsCombinedPnlChartRepository, "complexAnalyticsCombinedPnlChartRepository");
        Intrinsics.checkNotNullParameter(complexAnalyticsCombinedContributorsRepository, "complexAnalyticsCombinedContributorsRepository");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(performanceChartRepository, "performanceChartRepository");
        Intrinsics.checkNotNullParameter(totalValueChartRepository, "totalValueChartRepository");
        this.f190353a = userInteractor;
        this.f190354b = tradingAccountsInteractor;
        this.f190355c = complexAnalyticsContributorsRepository;
        this.d = complexAnalyticsAllocationsRepository;
        this.e = complexAnalyticsCombinedAllocationsRepository;
        this.f = complexAnalyticsRealisedPnlRepository;
        this.f190356g = complexAnalyticsCombinedRealisedPnlRepository;
        this.f190357h = complexAnalyticsPnlRepository;
        this.i = complexAnalyticsSectorAllocationsRepository;
        this.f190358j = complexAnalyticsSectorContributorsRepository;
        this.k = complexAnalyticsDividendsRepository;
        this.f190359l = wealthAccountsInteractor;
        this.f190360m = dateProvider;
        this.f190361n = complexAnalyticsCurrencyInteractor;
        this.o = complexAnalyticsCombinedPnlChartRepository;
        this.f190362p = complexAnalyticsCombinedContributorsRepository;
        this.f190363q = configInteractor;
        this.f190364r = performanceChartRepository;
        this.f190365s = totalValueChartRepository;
    }

    public static iwg.a a(iwg.a aVar) {
        switch (k.f190351a[aVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 6:
                return iwg.a.SECURITY;
            case 5:
            case 7:
            case 8:
                return aVar;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static String b(WidgetisedAnalyticsType widgetisedAnalyticsType) {
        kzg.a aVar = widgetisedAnalyticsType instanceof kzg.a ? (kzg.a) widgetisedAnalyticsType : null;
        if (aVar != null) {
            return aVar.getF95154a();
        }
        return null;
    }

    public static TotalValueChart d(TotalValueChart totalValueChart, xi0.b bVar) {
        if (totalValueChart != null) {
            return totalValueChart;
        }
        f0 f0Var = f0.f322471a;
        dj0.d dVar = new dj0.d(0L, bVar);
        dj0.d dVar2 = new dj0.d(0L, bVar);
        DateTime dateTime = f190352t;
        return new TotalValueChart(dVar, dVar2, f0Var, dateTime, dateTime);
    }

    public final r c(String portfolioId, iwg.a analyticsProductType, eel.c timeSpan, xi0.b currency) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(analyticsProductType, "analyticsProductType");
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        return pd.b.r(this.f190353a.k(false), new js7.c(4, new e(this, analyticsProductType, portfolioId, timeSpan, currency, 0)));
    }

    public final r e(WidgetisedAnalyticsType widgetisedAnalyticsType, Function3 function3) {
        WidgetisedAnalyticsType.Jisa jisa = widgetisedAnalyticsType instanceof WidgetisedAnalyticsType.Jisa ? (WidgetisedAnalyticsType.Jisa) widgetisedAnalyticsType : null;
        String str = jisa != null ? jisa.f95151c : null;
        kbb.c cVar = this.f190361n;
        return pd.b.r(str != null ? nim.a.w(rd0.e.c(cVar.J(), kotlin.coroutines.g.f186406a), new n(str, 21)) : nim.a.w(kli.a.h(this.f190353a.k(false), rd0.e.c(cVar.J(), kotlin.coroutines.g.f186406a)), new kvg.j(25)), new khg.s(function3, 12, this, widgetisedAnalyticsType));
    }

    public final r f(Function2 function2) {
        return pd.b.r(kli.a.h(this.f190353a.k(false), rd0.e.c(this.f190361n.J(), kotlin.coroutines.g.f186406a)), new cd0.a(5, function2));
    }

    public final Flow g(Function2 function2) {
        return boh.f.e(u0.m(rd0.e.b(this.f190353a.k(false)), this.f190361n.J()), new cd0.a(4, function2));
    }
}

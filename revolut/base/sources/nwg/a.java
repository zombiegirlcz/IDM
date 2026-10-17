package nwg;

import ang.f;
import com.revolut.feature.wealth.analytics.WealthAnalyticsApi$Toggles;
import jte.d;
import kotlin.jvm.internal.Intrinsics;
import kwg.l;
import l80.e;
import tzg.m;
import uvl.c;
import wvg.b;
import wvg.g0;
import wvg.h;
import wvg.j;
import wvg.k0;
import wvg.o0;
import wvg.q;
import wvg.r0;
import wvg.s;
import wvg.z;
import ybl.k;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f219875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f219876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f219877c;
    public final h d;
    public final j e;
    public final k0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final s f219878g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final g0 f219879h;
    public final o0 i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final r0 f219880j;
    public final c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q f219881l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final wvg.k f219882m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e f219883n;
    public final x8h.k o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final xv5.c f219884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f219885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tyg.j f219886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final b f219887s;

    public a(f userInteractor, k tradingAccountsInteractor, z complexAnalyticsContributorsRepository, h complexAnalyticsAllocationsRepository, j complexAnalyticsCombinedAllocationsRepository, k0 complexAnalyticsRealisedPnlRepository, s complexAnalyticsCombinedRealisedPnlRepository, g0 complexAnalyticsPnlRepository, o0 complexAnalyticsSectorAllocationsRepository, r0 complexAnalyticsSectorContributorsRepository, c complexAnalyticsDividendsRepository, q complexAnalyticsCombinedPnlChartRepository, wvg.k complexAnalyticsCombinedContributorsRepository, e dateProvider, x8h.k tradingCurrencyInteractor, xv5.c cryptoCommodityCurrencyInteractor, m wealthAccountsInteractor, tyg.j configInteractor, b chartRepositoriesProvider) {
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
        Intrinsics.checkNotNullParameter(complexAnalyticsCombinedPnlChartRepository, "complexAnalyticsCombinedPnlChartRepository");
        Intrinsics.checkNotNullParameter(complexAnalyticsCombinedContributorsRepository, "complexAnalyticsCombinedContributorsRepository");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(tradingCurrencyInteractor, "tradingCurrencyInteractor");
        Intrinsics.checkNotNullParameter(cryptoCommodityCurrencyInteractor, "cryptoCommodityCurrencyInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(chartRepositoriesProvider, "chartRepositoriesProvider");
        this.f219875a = userInteractor;
        this.f219876b = tradingAccountsInteractor;
        this.f219877c = complexAnalyticsContributorsRepository;
        this.d = complexAnalyticsAllocationsRepository;
        this.e = complexAnalyticsCombinedAllocationsRepository;
        this.f = complexAnalyticsRealisedPnlRepository;
        this.f219878g = complexAnalyticsCombinedRealisedPnlRepository;
        this.f219879h = complexAnalyticsPnlRepository;
        this.i = complexAnalyticsSectorAllocationsRepository;
        this.f219880j = complexAnalyticsSectorContributorsRepository;
        this.k = complexAnalyticsDividendsRepository;
        this.f219881l = complexAnalyticsCombinedPnlChartRepository;
        this.f219882m = complexAnalyticsCombinedContributorsRepository;
        this.f219883n = dateProvider;
        this.o = tradingCurrencyInteractor;
        this.f219884p = cryptoCommodityCurrencyInteractor;
        this.f219885q = wealthAccountsInteractor;
        this.f219886r = configInteractor;
        this.f219887s = chartRepositoriesProvider;
    }

    public final l a(gwg.a displayCurrencyMode) {
        Intrinsics.checkNotNullParameter(displayCurrencyMode, "displayCurrencyMode");
        kbb.c cVar = new kbb.c(this.o, this.f219884p, displayCurrencyMode);
        b bVar = this.f219887s;
        gte.a aVar = bVar.f300324a;
        WealthAnalyticsApi$Toggles.AnalyticsRealtimeCharts analyticsRealtimeCharts = WealthAnalyticsApi$Toggles.AnalyticsRealtimeCharts.f94962c;
        return new l(this.f219875a, this.f219876b, this.f219877c, this.d, this.e, this.f, this.f219878g, this.f219879h, this.i, this.f219880j, this.k, this.f219885q, this.f219883n, cVar, this.f219881l, this.f219882m, this.f219886r, ((d) aVar).c(analyticsRealtimeCharts) ? bVar.f300326c : bVar.f300325b, ((d) aVar).c(analyticsRealtimeCharts) ? bVar.e : bVar.d);
    }
}

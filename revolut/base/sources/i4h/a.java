package i4h;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f158435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b4h.e f158436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ryc.a f158437c;
    public final zhl.k d;
    public final ybl.b e;
    public final zhl.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ael.d0 f158438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ybl.k f158439h;
    public final kpj.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ybl.l f158440j;
    public final yhl.h k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final fxk.a f158441l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f158442m;

    public a(d mapper, b4h.e chartSettingsInteractor, ryc.a instrumentCandlestickChartInteractor, zhl.k instrumentHistoricalPricesInteractor, ybl.b instrumentTickerInteractor, zhl.n instrumentPreListingChartInteractor, ael.d0 stocksInteractor, ybl.k tradingAccountsInteractor, kpj.f tradingLiveCandleInteractor, ybl.l tradingConfigInteractor, yhl.h tradingEventsInteractor, fxk.a tradingHoursInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(chartSettingsInteractor, "chartSettingsInteractor");
        Intrinsics.checkNotNullParameter(instrumentCandlestickChartInteractor, "instrumentCandlestickChartInteractor");
        Intrinsics.checkNotNullParameter(instrumentHistoricalPricesInteractor, "instrumentHistoricalPricesInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(instrumentPreListingChartInteractor, "instrumentPreListingChartInteractor");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingLiveCandleInteractor, "tradingLiveCandleInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(tradingEventsInteractor, "tradingEventsInteractor");
        Intrinsics.checkNotNullParameter(tradingHoursInteractor, "tradingHoursInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f158435a = mapper;
        this.f158436b = chartSettingsInteractor;
        this.f158437c = instrumentCandlestickChartInteractor;
        this.d = instrumentHistoricalPricesInteractor;
        this.e = instrumentTickerInteractor;
        this.f = instrumentPreListingChartInteractor;
        this.f158438g = stocksInteractor;
        this.f158439h = tradingAccountsInteractor;
        this.i = tradingLiveCandleInteractor;
        this.f158440j = tradingConfigInteractor;
        this.k = tradingEventsInteractor;
        this.f158441l = tradingHoursInteractor;
        this.f158442m = featureToggleInteractor;
    }
}

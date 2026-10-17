package yh7;

import ard.c0;
import com.revolut.feature.instruments.trend.collections.api.InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import uh7.o;
import y5b.s;
import ybl.k;
import ye1.m;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends uh7.c {
    public final k f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gte.a f313879g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f313880h;
    public final ph7.c i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k tradingAccountsInteractor, gte.a featureToggleInteractor, b widgetContentMapper, twg.c instrumentsTrendCollectionsInteractor, o widgetFiltersProvider, e38.f widgetAvailabilityProvider) {
        super(nh7.d.RECOMMENDED_BUYS, widgetAvailabilityProvider, widgetContentMapper, instrumentsTrendCollectionsInteractor, widgetFiltersProvider);
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(widgetContentMapper, "widgetContentMapper");
        Intrinsics.checkNotNullParameter(instrumentsTrendCollectionsInteractor, "instrumentsTrendCollectionsInteractor");
        Intrinsics.checkNotNullParameter(widgetFiltersProvider, "widgetFiltersProvider");
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        this.f = tradingAccountsInteractor;
        this.f313879g = featureToggleInteractor;
        this.f313880h = widgetContentMapper;
        this.i = ph7.c.RECOMMENDED_BUY;
    }

    @Override // uh7.c
    public final Flow k(String id10, dsh.e config) {
        Flow flowV;
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(config, "config");
        if (((jte.d) this.f313879g).c(InstrumentsTrendCollectionsApi$Toggles$InvestRecommendedBuysLocked.f74892c)) {
            TradingAccountType[] elements = {TradingAccountType.Gia.f105270a, TradingAccountType.Taa.f105275a};
            Intrinsics.checkNotNullParameter(elements, "elements");
            flowV = xam.a.h(new s(this, config, null), k.f(this.f, kotlin.collections.d.y0(elements), 4));
        } else {
            flowV = nim.a.v(j(this.i, config), new m(28));
        }
        return new c0(zi0.c.w(flowV), this, id10, config, 29);
    }
}

package b4h;

import a15.l;
import ael.k;
import b4g.f0;
import com.revolut.feature.trading.api.FeatureTradingApi$Toggles$InvestmentPlanHub;
import com.revolut.retail.feature.commodity.order_flow.api.CommodityOrderFlowApi$Toggles$CommodityRecurringBuys;
import e7l.g;
import java.time.Instant;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l80.f;
import nkm.y;
import vrl.g;
import w4l.h;
import w4l.i;
import x8h.n0;
import zhm.d0;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f12374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.b f12375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f12376c;
    public final kdh.b d;
    public final l80.e e;
    public final n0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fk3.a f12377g;

    public c(g investOrdersInteractor, ybl.b instrumentTickerInteractor, gte.a featureToggleInteractor, kdh.b instrumentActionsInteractor, l80.e dateProvider, n0 stockLendingInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(investOrdersInteractor, "investOrdersInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(instrumentActionsInteractor, "instrumentActionsInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(stockLendingInteractor, "stockLendingInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f12374a = investOrdersInteractor;
        this.f12375b = instrumentTickerInteractor;
        this.f12376c = featureToggleInteractor;
        this.d = instrumentActionsInteractor;
        this.e = dateProvider;
        this.f = stockLendingInteractor;
        this.f12377g = configurationInteractor;
    }

    public final Instant a(List orders) {
        Intrinsics.checkNotNullParameter(orders, "orders");
        return (Instant) y.B(y.n(y.z(d0.Q(orders), new f0(1)), new l(1, ((f) this.e).e())));
    }

    public final Flow b(y2h.c params) {
        Intrinsics.checkNotNullParameter(params, "params");
        i loadingStrategy = i.f294643c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        FeatureTradingApi$Toggles$InvestmentPlanHub featureTradingApi$Toggles$InvestmentPlanHub = FeatureTradingApi$Toggles$InvestmentPlanHub.f91205c;
        jte.d dVar = (jte.d) this.f12376c;
        boolean zC = dVar.c(featureTradingApi$Toggles$InvestmentPlanHub);
        z2h.e eVar = z2h.e.f319085a;
        if (!zC) {
            return zi0.c.i(eVar);
        }
        Continuation continuation = null;
        if (params instanceof y2h.b) {
            return xam.a.h(new avk.i(this, continuation, 24), rd0.e.b(((k) this.f12375b).f(((y2h.b) params).f310663a)));
        }
        if (!(params instanceof y2h.a)) {
            throw new NoWhenBranchMatchedException();
        }
        xi0.b bVar = ((y2h.a) params).f310662a;
        if (!dVar.c(CommodityOrderFlowApi$Toggles$CommodityRecurringBuys.f99801c)) {
            return zi0.c.i(eVar);
        }
        return xam.a.h(new b(bVar, this, null), rd0.e.b(((ik3.c) this.f12377g).l(g.b.f123407a, h.f294642c)));
    }
}

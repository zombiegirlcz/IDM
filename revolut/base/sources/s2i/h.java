package s2i;

import com.revolut.feature.exchange.models.ExchangeOrder;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$TransparentPricing;
import efm.d0;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import rsl.p;
import rtl.y;
import te0.s;
import te0.w;
import u2i.r;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements a, r, k1i.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k1i.d f259355a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f259356b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0i.b f259357c;
    public final t d;
    public final ang.f e;
    public final w0i.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final o7.b f259358g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final kgm.c f259359h;
    public final ppk.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final tm.g f259360j;

    public h(c state, nd.k orderSummaryMapper, p0i.b fxOrderInteractor, t pricingPlanInteractor, com.google.firebase.messaging.t actionDelegateFactory, k1i.d exchangeFeePresentationModel, ang.f userInteractor, w0i.b transparentPricingFeatureStateChecker, o7.b orderQuoteInteractor, kgm.c orderQuoteFeeAndLimitsInteractor, ppk.f ratesInteractor, l4i.a amountConverter) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(orderSummaryMapper, "orderSummaryMapper");
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(actionDelegateFactory, "actionDelegateFactory");
        Intrinsics.checkNotNullParameter(exchangeFeePresentationModel, "exchangeFeePresentationModel");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(transparentPricingFeatureStateChecker, "transparentPricingFeatureStateChecker");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteFeeAndLimitsInteractor, "orderQuoteFeeAndLimitsInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        this.f259355a = exchangeFeePresentationModel;
        this.f259356b = state;
        this.f259357c = fxOrderInteractor;
        this.d = pricingPlanInteractor;
        this.e = userInteractor;
        this.f = transparentPricingFeatureStateChecker;
        this.f259358g = orderQuoteInteractor;
        this.f259359h = orderQuoteFeeAndLimitsInteractor;
        this.i = ratesInteractor;
        this.f259360j = actionDelegateFactory.e(new y(this, 19));
    }

    @Override // k1i.b
    public final ufm.i C() {
        return this.f259355a.C();
    }

    @Override // u2i.r
    public final efm.r H1() {
        return zi0.c.j(new u2i.i(null, null, null));
    }

    @Override // u2i.r
    public final efm.r K0() {
        throw new IllegalStateException("Unreachable");
    }

    @Override // u2i.r
    public final efm.r R2() {
        efm.r rVarSwitchMap = ((k) this.f259356b).w0().c(s.f270018a).switchMap(new s08.g(23, new d(this, 3)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // u2i.r
    public final efm.r S0() {
        w0i.b bVar = this.f;
        return nim.a.w(bVar.f293764b.q(), new vsl.f(1, bVar, w0i.b.class, "hasCryptoFeeFreeLimitProduct", "hasCryptoFeeFreeLimitProduct(Lcom/revolut/feature/pricingplans/models/PricingPlan;)Z", 0, 9));
    }

    @Override // u2i.r
    public final efm.r T1() {
        efm.r rVarJust = efm.r.just(Boolean.FALSE);
        Intrinsics.checkNotNullExpressionValue(rVarJust, "just(...)");
        return rVarJust;
    }

    @Override // u2i.r
    public final ufm.b V0() {
        ufm.b bVarM = d0.m(Boolean.valueOf(((jte.d) this.f.f293763a).c(ExchangeApi$Toggles$TransparentPricing.f96821c)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    public final ExchangeOrder a() {
        return (ExchangeOrder) w.O(((k) this.f259356b).w0());
    }

    @Override // t2i.b, u2i.r
    public final efm.r c() {
        efm.r rVarSwitchMap = ((k) this.f259356b).w0().c(s.f270018a).switchMap(new s08.g(21, new d(this, 0)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // t2i.b, u2i.r
    public final efm.r d() {
        k kVar = (k) this.f259356b;
        te0.e eVarW0 = kVar.w0();
        s sVar = s.f270018a;
        efm.r rVarC = eVarW0.c(sVar);
        efm.r rVarT = this.d.t(true);
        efm.r map = kVar.w0().c(sVar).map(new s08.g(19, new s1c.a(17)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r map2 = w.m(rVarC, rVarT, pd.b.r(nim.a.w(pd.b.r(map, new s1c.a(18)), new s1c.a(19)), new d(this, 1))).map(new s08.g(22, new s1c.a(this, 20)));
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        return map2;
    }

    @Override // t2i.b, u2i.r
    public final ufm.i k() {
        d0 d0VarF = this.e.f(false);
        g gVar = g.f;
        ufm.i iVar = new ufm.i(d0VarF, new s1c.d(1), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    @Override // u2i.r
    public final efm.r o2() {
        efm.r rVarSwitchMap = ((k) this.f259356b).w0().c(s.f270018a).switchMap(new s08.g(20, new d(this, 2)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    @Override // u2i.r
    public final efm.r x2(wd6.e exchangeMode) {
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        efm.r rVarFlatMap = ((k) this.f259356b).w0().c(s.f270018a).flatMap(new s08.g(18, new p(this, exchangeMode, 29)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }
}

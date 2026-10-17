package g1i;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature_exchange.api.ExchangeApi$Toggles$TransparentPricing;
import com.revolut.feature_exchange.api.navigation.ExchangeFeatureConfig;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.ExchangeOrderDraft;
import com.revolut.feature_exchange.impl.ui.exchange.market_order.model.MoneyDetails;
import e7l.g;
import ip0.v7;
import java.util.AbstractSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.joda.time.LocalDate;
import zhm.a1;
import zhm.y0;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 extends ori.a implements a, u2i.r, k1i.b {

    @NotNull
    private static final j Companion = new j();
    public final w0i.a A;
    public final irh.a B;
    public final tzg.m C;
    public final ybl.d D;
    public final wj0.a E;
    public final x0i.f F;
    public final n8b.a G;
    public final r10.r H;
    public final c I;
    public final rga.c J;
    public final ihm.b K;
    public final Object L;
    public final v60.g M;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k1i.d f139598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f139599c;
    public final fk3.b d;
    public final b e;
    public final ifm.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ffk.t f139600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xv5.a f139601h;
    public final ang.f i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final p0i.b f139602j;
    public final i90.b k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c1i.b f139603l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nd.k f139604m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final o0 f139605n;
    public final rea.m o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w0i.b f139606p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final o7.b f139607q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final l4i.a f139608r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final jva.a f139609s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final mm.d f139610t;
    public final e2i.m u;
    public final m1i.i v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final yud.g f139611w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final zud.a f139612x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AccountId f139613y;
    public final ppk.f z;

    public d0(wsg.n walletInteractor, fk3.b configurationRepository, b state, ifm.b flowDisposable, ffk.t pricingPlanInteractor, xv5.a commodityInteractor, ang.f userInteractor, p0i.b fxOrderInteractor, i90.b uuidGenerator, c1i.b exchangeSecondaryCurrencyRepository, nd.k orderSummaryMapper, o0 draftMutator, rea.m pocketDetailsInteractor, w0i.b transparentPricingFeatureStateChecker, k1i.d exchangeFeePresentationModel, o7.b orderQuoteInteractor, l4i.a amountConverter, jva.a recurringBuysEnabledStateChecker, mm.d actionsDispatcher, e2i.m recurringOrderSubmitActionHandler, m1i.i exchangeActionHandler, yud.g stakingInteractor, zud.a autoStakingConsentInteractor, AccountId accountId, ppk.f ratesInteractor, w0i.a exchangeProhibitedCurrenciesChecker, irh.a wealthProtectionSsoRetryRepository, tzg.m wealthAccountsInteractor, ybl.d tradingPortfolioInteractor, wj0.a idempotencyKeyHolder, x0i.f exchangeCurrenciesInteractor, n8b.a countryInteractor, r10.r exchangeBaseCurrencyProvider, c dealableQuoteEligibilityChecker, rga.c priceQuoteTraceIdHolder) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(flowDisposable, "flowDisposable");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(commodityInteractor, "commodityInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(fxOrderInteractor, "fxOrderInteractor");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(exchangeSecondaryCurrencyRepository, "exchangeSecondaryCurrencyRepository");
        Intrinsics.checkNotNullParameter(orderSummaryMapper, "orderSummaryMapper");
        Intrinsics.checkNotNullParameter(draftMutator, "draftMutator");
        Intrinsics.checkNotNullParameter(pocketDetailsInteractor, "pocketDetailsInteractor");
        Intrinsics.checkNotNullParameter(transparentPricingFeatureStateChecker, "transparentPricingFeatureStateChecker");
        Intrinsics.checkNotNullParameter(exchangeFeePresentationModel, "exchangeFeePresentationModel");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(recurringBuysEnabledStateChecker, "recurringBuysEnabledStateChecker");
        Intrinsics.checkNotNullParameter(actionsDispatcher, "actionsDispatcher");
        Intrinsics.checkNotNullParameter(recurringOrderSubmitActionHandler, "recurringOrderSubmitActionHandler");
        Intrinsics.checkNotNullParameter(exchangeActionHandler, "exchangeActionHandler");
        Intrinsics.checkNotNullParameter(stakingInteractor, "stakingInteractor");
        Intrinsics.checkNotNullParameter(autoStakingConsentInteractor, "autoStakingConsentInteractor");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(exchangeProhibitedCurrenciesChecker, "exchangeProhibitedCurrenciesChecker");
        Intrinsics.checkNotNullParameter(wealthProtectionSsoRetryRepository, "wealthProtectionSsoRetryRepository");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingPortfolioInteractor, "tradingPortfolioInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(exchangeCurrenciesInteractor, "exchangeCurrenciesInteractor");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(exchangeBaseCurrencyProvider, "exchangeBaseCurrencyProvider");
        Intrinsics.checkNotNullParameter(dealableQuoteEligibilityChecker, "dealableQuoteEligibilityChecker");
        Intrinsics.checkNotNullParameter(priceQuoteTraceIdHolder, "priceQuoteTraceIdHolder");
        this.f139598b = exchangeFeePresentationModel;
        this.f139599c = walletInteractor;
        this.d = configurationRepository;
        this.e = state;
        this.f = flowDisposable;
        this.f139600g = pricingPlanInteractor;
        this.f139601h = commodityInteractor;
        this.i = userInteractor;
        this.f139602j = fxOrderInteractor;
        this.k = uuidGenerator;
        this.f139603l = exchangeSecondaryCurrencyRepository;
        this.f139604m = orderSummaryMapper;
        this.f139605n = draftMutator;
        this.o = pocketDetailsInteractor;
        this.f139606p = transparentPricingFeatureStateChecker;
        this.f139607q = orderQuoteInteractor;
        this.f139608r = amountConverter;
        this.f139609s = recurringBuysEnabledStateChecker;
        this.f139610t = actionsDispatcher;
        this.u = recurringOrderSubmitActionHandler;
        this.v = exchangeActionHandler;
        this.f139611w = stakingInteractor;
        this.f139612x = autoStakingConsentInteractor;
        this.f139613y = accountId;
        this.z = ratesInteractor;
        this.A = exchangeProhibitedCurrenciesChecker;
        this.B = wealthProtectionSsoRetryRepository;
        this.C = wealthAccountsInteractor;
        this.D = tradingPortfolioInteractor;
        this.E = idempotencyKeyHolder;
        this.F = exchangeCurrenciesInteractor;
        this.G = countryInteractor;
        this.H = exchangeBaseCurrencyProvider;
        this.I = dealableQuoteEligibilityChecker;
        this.J = priceQuoteTraceIdHolder;
        this.K = j6.a.h("create(...)");
        this.L = new Object();
        this.M = new v60.g(flowDisposable, new d(this, 10));
    }

    public static pfm.a D3(d0 d0Var, xi0.b bVar, String str, xi0.b bVar2, String str2, wd6.e eVar, wd6.h hVar, wd6.c cVar, wd6.i iVar, Set set, f8l.f fVar, Long l2, int i) {
        Pair pair;
        Pair pair2;
        r1i.h hVar2;
        String str3 = (i & 2) != 0 ? null : str;
        String str4 = (i & 8) != 0 ? null : str2;
        Set set2 = (i & 256) != 0 ? null : set;
        f8l.f fVar2 = (i & 512) != 0 ? null : fVar;
        Long l3 = (i & 1024) != 0 ? null : l2;
        d0Var.getClass();
        int[] iArr = k.f139643a;
        int i2 = iArr[eVar.ordinal()];
        if (i2 == 1) {
            pair = new Pair(bVar2, bVar);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(bVar, bVar2);
        }
        Pair pair3 = pair;
        int i3 = iArr[eVar.ordinal()];
        if (i3 == 1) {
            pair2 = new Pair(str4, str3);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair2 = new Pair(str3, str4);
        }
        Pair pair4 = pair2;
        te0.e eVarY0 = ((m0) d0Var.e).y0();
        MoneyDetails moneyDetails = new MoneyDetails((xi0.b) pair3.f186385a, l3, l3 != null, (String) pair4.f186385a, 12);
        MoneyDetails moneyDetails2 = new MoneyDetails((xi0.b) pair3.f186386b, null, false, (String) pair4.f186386b, 30);
        int i5 = iArr[eVar.ordinal()];
        if (i5 == 1) {
            hVar2 = (cp5.d.A(bVar) && (cp5.d.z(bVar2) || cp5.d.y(bVar2))) ? r1i.h.BOTTOM : r1i.h.TOP;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hVar2 = r1i.h.TOP;
        }
        r1i.h hVar3 = hVar2;
        String strU = wp5.y.u(d0Var.k, "toString(...)");
        String strB = d0Var.J.b("exchange_price_quote");
        pfm.a aVarE = te0.w.z0(eVarY0, new ExchangeOrderDraft(moneyDetails, moneyDetails2, eVar, iVar, hVar, hVar3, null, cVar, set2, strU, fVar2, strB != null ? strB : null, 1630144)).e(d0Var.l3(hVar));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final efm.d0 A3(xi0.b bVar) {
        efm.r rVarG = m70.a.g(pd.b.r(zi0.c.J(rd0.e.c(tzg.m.c(this.C, null, null, 3), kotlin.coroutines.g.f186406a)), new f(this, bVar, 2)), null, null, 3);
        od0.i.Companion.getClass();
        efm.d0 d0VarFirst = rVarG.first(new Pair(bVar, od0.i.f224256b));
        Intrinsics.checkNotNullExpressionValue(d0VarFirst, "first(...)");
        return d0VarFirst;
    }

    public final rfm.m B3(AbstractSet abstractSet, io3.l lVar) {
        efm.d0 d0VarFirstOrError = m70.a.g(osg.b.e(this.f139599c, false, lVar, null, io3.i.INTERNAL, null, qsg.a.RECENT_FIRST, this.f139613y, 20), null, new g0c.h(8), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        rfm.j jVar = new rfm.j(te0.w.H0(d0VarFirstOrError, q3()), new h(12, new g0f.f(lVar, abstractSet, 18)), 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return ue0.e.B(jVar, new g1.c(25));
    }

    @Override // k1i.b
    public final ufm.i C() {
        return this.f139598b.C();
    }

    public final boolean C3() {
        ExchangeFeatureConfig exchangeFeatureConfig = (ExchangeFeatureConfig) te0.w.O(((m0) this.e).w0());
        if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Buy) {
            return ((ExchangeFeatureConfig.Buy) exchangeFeatureConfig).i;
        }
        if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Sell) {
            return ((ExchangeFeatureConfig.Sell) exchangeFeatureConfig).f96855j;
        }
        if (Intrinsics.f(exchangeFeatureConfig, ExchangeFeatureConfig.CryptoCommodityOnboarded.f96840a) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Default) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.FreelancerSell) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.RecurringBuy) || Intrinsics.f(exchangeFeatureConfig, ExchangeFeatureConfig.Refresh.f96849a) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.BuyInvest) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.SellInvest) || exchangeFeatureConfig == null) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final efm.r E3() {
        m0 m0Var = (m0) this.e;
        te0.e eVarY0 = m0Var.y0();
        te0.s sVar = te0.s.f270018a;
        efm.r map = te0.w.l(eVarY0.c(sVar), m0Var.E0().c(sVar)).map(new h(7, new g1.c(23)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final efm.r F3() {
        return ((m0) this.e).y0().c(te0.s.f270018a);
    }

    public final efm.r G3() {
        return ((m0) this.e).F0().c(te0.s.f270018a);
    }

    @Override // u2i.r
    public final efm.r H1() {
        efm.r rVarSwitchMap = ((m0) this.e).y0().c(te0.s.f270018a).switchMap(new h(2, new d(this, 18)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final efm.r H3() {
        return ((m0) this.e).G0().c(te0.s.f270018a);
    }

    public final efm.r I3() {
        m0 m0Var = (m0) this.e;
        te0.e eVarY0 = m0Var.y0();
        te0.s sVar = te0.s.f270018a;
        efm.r rVarC = eVarY0.c(sVar);
        efm.r rVarC2 = m0Var.z0().c(sVar);
        efm.r rVarC3 = m0Var.B0().c(sVar);
        efm.r rVarFlatMap = m0Var.y0().c(sVar).flatMap(new e(3, new d(this, 1)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return te0.w.a0(te0.w.n(rVarC, rVarC2, rVarC3, rVarFlatMap), new g1.c(this));
    }

    public final efm.r J3(xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        return pd.b.r(nim.a.w(this.f139599c.N(false, io3.l.CURRENT, null, io3.i.INTERNAL, io3.j.PERSONAL, qsg.a.DEFAULT, this.f139613y), new dv5.p(21, currency)), new f(this, currency, 0));
    }

    @Override // u2i.r
    public final efm.r K0() {
        efm.r rVarSwitchMap = te0.w.a0(((m0) this.e).A0().c(te0.s.f270018a), new d(this, 26)).distinctUntilChanged().switchMap(new h(17, new d(this, 27)));
        Intrinsics.checkNotNullExpressionValue(rVarSwitchMap, "switchMap(...)");
        return rVarSwitchMap;
    }

    public final efm.r K3() {
        Double d;
        ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) ((m0) this.e).y0().get();
        TakeProfitStopLoss takeProfitStopLoss = exchangeOrderDraft.f;
        if (takeProfitStopLoss != null && (d = takeProfitStopLoss.f72161c) != null) {
            return z3(exchangeOrderDraft, wd6.h.STOP, d.doubleValue());
        }
        od0.i.Companion.getClass();
        return te0.w.h(od0.i.f224256b);
    }

    public final efm.r L3() {
        Double d;
        ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) ((m0) this.e).y0().get();
        TakeProfitStopLoss takeProfitStopLoss = exchangeOrderDraft.f;
        if (takeProfitStopLoss != null && (d = takeProfitStopLoss.f72160b) != null) {
            return z3(exchangeOrderDraft, wd6.h.LIMIT, d.doubleValue());
        }
        od0.i.Companion.getClass();
        return te0.w.h(od0.i.f224256b);
    }

    public final pfm.a M3() {
        m0 m0Var = (m0) this.e;
        pfm.a aVarE = te0.w.z0(m0Var.G0(), m0Var.D0().get()).e(te0.w.z0(m0Var.F0(), m0Var.C0().get()));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.t N3(wd6.h orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        te0.e eVarB0 = ((m0) this.e).B0();
        od0.i.Companion.getClass();
        return te0.w.z0(eVarB0, od0.h.a(orderType));
    }

    public final pfm.a O3() {
        m0 m0Var = (m0) this.e;
        pfm.a aVarE = te0.w.z0(m0Var.D0(), m0Var.G0().get()).e(te0.w.z0(m0Var.C0(), m0Var.F0().get()));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.t P3() {
        return te0.w.z0(((m0) this.e).E0(), Boolean.TRUE);
    }

    public final pfm.a Q3() {
        m0 m0Var = (m0) this.e;
        ExchangeOrderDraft exchangeOrderDraft = (ExchangeOrderDraft) m0Var.y0().get();
        f2i.g gVar = (f2i.g) m0Var.C0().get();
        LocalDate localDate = (LocalDate) m0Var.D0().get();
        MoneyDetails moneyDetails = exchangeOrderDraft.f96879a;
        MoneyDetails moneyDetails2 = exchangeOrderDraft.f96880b;
        return j3((pfm.h) this.f139610t.c0(new e2i.b(gVar, localDate, moneyDetails.f96897a, ((Boolean) m0Var.H0().get()).booleanValue() ? yh5.b.T(((ExchangeOrderDraft) m0Var.A0().get()).f96880b) : yh5.b.T(moneyDetails2), moneyDetails2.f)));
    }

    @Override // u2i.r
    public final efm.r R2() {
        efm.r map = F3().map(new h(3, new d(this, 19)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    public final pfm.n R3(Function1 mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        pfm.n nVar = new pfm.n(new fag.g(this, mutator, 4), 1);
        Intrinsics.checkNotNullExpressionValue(nVar, "fromCallable(...)");
        return nVar;
    }

    @Override // u2i.r
    public final efm.r S0() {
        w0i.b bVar = this.f139606p;
        return nim.a.w(bVar.f293764b.q(), new vsl.f(1, bVar, w0i.b.class, "hasCryptoFeeFreeLimitProduct", "hasCryptoFeeFreeLimitProduct(Lcom/revolut/feature/pricingplans/models/PricingPlan;)Z", 0, 9));
    }

    @Override // u2i.r
    public final efm.r T1() {
        m0 m0Var = (m0) this.e;
        return m0Var.f139666r.getValue(m0Var, m0.f139655t[16]).c(te0.s.f270018a);
    }

    @Override // u2i.r
    public final ufm.b V0() {
        ufm.b bVarM = efm.d0.m(Boolean.valueOf(((jte.d) this.f139606p.f293763a).c(ExchangeApi$Toggles$TransparentPricing.f96821c)));
        Intrinsics.checkNotNullExpressionValue(bVarM, "just(...)");
        return bVarM;
    }

    @Override // t2i.b, u2i.r
    public final efm.r c() {
        return d();
    }

    @Override // t2i.b, u2i.r
    public final efm.r d() {
        m0 m0Var = (m0) this.e;
        wd6.h hVar = ((ExchangeOrderDraft) m0Var.y0().get()).e;
        wd6.h hVar2 = wd6.h.RECURRING;
        te0.s sVar = te0.s.f270018a;
        efm.r map = te0.w.o((hVar == hVar2 && ((Boolean) m0Var.H0().get()).booleanValue()) ? m0Var.A0().c(sVar) : m0Var.y0().c(sVar), this.f139600g.t(true), m0Var.D0().c(sVar), m0Var.C0().c(sVar), m0Var.f139664p.getValue(m0Var, m0.f139655t[14]).c(sVar)).map(new e(15, new d(this, 9)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }

    @Override // ori.a, nri.a
    public final void i3() {
        this.J.a("exchange_price_quote");
        m0 m0Var = (m0) this.e;
        Object objO = te0.w.O(m0Var.y0());
        int i = 4;
        int i2 = 2;
        int i3 = 15;
        int i5 = 13;
        int i6 = 11;
        ifm.b bVar = this.f;
        if (objO == null) {
            efm.d0 d0VarQ3 = q3();
            e eVar = new e(18, new d(this, 12));
            d0VarQ3.getClass();
            pfm.a aVar = new pfm.a(d0VarQ3, eVar, i);
            Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
            pfm.a aVar2 = new pfm.a(aVar, new a08.f0(15, new g0d.m(new BreadcrumbException(), 7)), i2);
            Intrinsics.checkNotNullExpressionValue(aVar2, "onErrorResumeNext(...)");
            ofm.h hVarW = aVar2.w(new a08.s(13, w.f139680a), v.f139679a);
            Intrinsics.checkNotNullExpressionValue(hVarW, "subscribe(...)");
            te0.w.j0(bVar, hVarW);
            x0i.f fVar = this.F;
            efm.d0 d0VarC = ((ji5.e) fVar.d).c();
            x0i.d dVar = x0i.d.f;
            vf0.q qVar = new vf0.q(27);
            d0VarC.getClass();
            ufm.i iVar = new ufm.i(d0VarC, qVar, 1);
            Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
            te0.j jVar = m0Var.f139662m;
            KProperty[] kPropertyArr = m0.f139655t;
            pfm.a aVar3 = new pfm.a(v7.x(new ufm.f(iVar, new h(i5, new f2i.x(1, jVar.getValue(m0Var, kPropertyArr[11]), te0.v.class, "set", "set(Ljava/lang/Object;)V", 0, 23)), 3), "ignoreElement(...)"), new a08.f0(15, new g0d.m(new BreadcrumbException(), 9)), i2);
            Intrinsics.checkNotNullExpressionValue(aVar3, "onErrorResumeNext(...)");
            ofm.h hVarW2 = aVar3.w(new a08.s(13, y.f139682a), x.f139681a);
            Intrinsics.checkNotNullExpressionValue(hVarW2, "subscribe(...)");
            te0.w.j0(bVar, hVarW2);
            efm.d0 d0VarA = ((zj3.a) fVar.e).a();
            x0i.c cVar = x0i.c.f;
            vf0.q qVar2 = new vf0.q(28);
            d0VarA.getClass();
            ufm.i iVar2 = new ufm.i(d0VarA, qVar2, 1);
            Intrinsics.checkNotNullExpressionValue(iVar2, "map(...)");
            pfm.a aVar4 = new pfm.a(v7.x(new ufm.f(iVar2, new e(17, new f2i.x(1, m0Var.f139663n.getValue(m0Var, kPropertyArr[12]), te0.v.class, "set", "set(Ljava/lang/Object;)V", 0, 22)), 3), "ignoreElement(...)"), new a08.f0(15, new g0d.m(new BreadcrumbException(), 10)), i2);
            Intrinsics.checkNotNullExpressionValue(aVar4, "onErrorResumeNext(...)");
            ofm.h hVarW3 = aVar4.w(new a08.s(13, a0.f139594a), z.f139683a);
            Intrinsics.checkNotNullExpressionValue(hVarW3, "subscribe(...)");
            te0.w.j0(bVar, hVarW3);
        }
        te0.e eVarY0 = m0Var.y0();
        te0.s sVar = te0.s.f270018a;
        efm.d0 d0VarFirstOrError = eVarY0.c(sVar).firstOrError();
        e eVar2 = new e(1, new d(this, 28));
        d0VarFirstOrError.getClass();
        pfm.a aVar5 = new pfm.a(d0VarFirstOrError, eVar2, 4);
        Intrinsics.checkNotNullExpressionValue(aVar5, "flatMapCompletable(...)");
        pfm.a aVar6 = new pfm.a(aVar5, new a08.f0(15, new g0d.m(new BreadcrumbException(), 3)), i2);
        Intrinsics.checkNotNullExpressionValue(aVar6, "onErrorResumeNext(...)");
        ofm.h hVarW4 = aVar6.w(new a08.s(13, m.f139654a), l.f139648a);
        Intrinsics.checkNotNullExpressionValue(hVarW4, "subscribe(...)");
        te0.w.j0(bVar, hVarW4);
        efm.r map = te0.w.a0(m0Var.y0().c(sVar), new d(this, i3)).distinctUntilChanged().switchMap(new h(4, new d(this, 17))).map(new h(8, new d(this, 22)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        efm.r rVarOnErrorResumeNext = map.onErrorResumeNext(new a08.f0(15, new g0d.m(new BreadcrumbException(), 4)));
        Intrinsics.checkNotNullExpressionValue(rVarOnErrorResumeNext, "onErrorResumeNext(...)");
        ifm.c cVarSubscribe = rVarOnErrorResumeNext.subscribe(new a08.s(13, n.f139668a), new a08.s(13, o.f139671a));
        Intrinsics.checkNotNullExpressionValue(cVarSubscribe, "subscribe(...)");
        te0.w.j0(bVar, cVarSubscribe);
        efm.b bVarSwitchMapCompletable = m70.a.g(ue0.e.q(this.K, zhm.h0.f322473a), null, new g0c.h(3), 1).switchMapCompletable(new e(19, new f2i.x(1, this, d0.class, "applyQuote", "applyQuote(Lcom/revolut/shared/feature/market_data/models/domain/models/OrderQuote;)Lio/reactivex/Completable;", 0, 24)));
        Intrinsics.checkNotNullExpressionValue(bVarSwitchMapCompletable, "switchMapCompletable(...)");
        a08.f0 f0Var = new a08.f0(15, new g0d.m(new BreadcrumbException(), 5));
        bVarSwitchMapCompletable.getClass();
        pfm.a aVar7 = new pfm.a(bVarSwitchMapCompletable, f0Var, i2);
        Intrinsics.checkNotNullExpressionValue(aVar7, "onErrorResumeNext(...)");
        ofm.h hVarW5 = aVar7.w(new a08.s(13, q.f139674a), p.f139673a);
        Intrinsics.checkNotNullExpressionValue(hVarW5, "subscribe(...)");
        te0.w.j0(bVar, hVarW5);
        pfm.h hVar = new pfm.h(this.f139598b.C(), 4);
        Intrinsics.checkNotNullExpressionValue(hVar, "ignoreElement(...)");
        pfm.a aVar8 = new pfm.a(ue0.e.v(hVar), new a08.f0(15, new g0d.m(new BreadcrumbException(), 6)), i2);
        Intrinsics.checkNotNullExpressionValue(aVar8, "onErrorResumeNext(...)");
        ofm.h hVarW6 = aVar8.w(new a08.s(13, s.f139676a), r.f139675a);
        Intrinsics.checkNotNullExpressionValue(hVarW6, "subscribe(...)");
        te0.w.j0(bVar, hVarW6);
        efm.b bVarFlatMapCompletable = rd0.e.c(this.B.f168048a, kotlin.coroutines.g.f186406a).flatMapCompletable(new e(16, new d(this, i6)));
        Intrinsics.checkNotNullExpressionValue(bVarFlatMapCompletable, "flatMapCompletable(...)");
        a08.f0 f0Var2 = new a08.f0(15, new g0d.m(new BreadcrumbException(), 8));
        bVarFlatMapCompletable.getClass();
        pfm.a aVar9 = new pfm.a(bVarFlatMapCompletable, f0Var2, i2);
        Intrinsics.checkNotNullExpressionValue(aVar9, "onErrorResumeNext(...)");
        ofm.h hVarW7 = aVar9.w(new a08.s(13, u.f139678a), t.f139677a);
        Intrinsics.checkNotNullExpressionValue(hVarW7, "subscribe(...)");
        te0.w.j0(bVar, hVarW7);
        wj0.a aVar10 = this.E;
        aVar10.a("payments_exchange");
        aVar10.a("payments_recurring_transfer");
    }

    public final pfm.a j3(pfm.h hVar) {
        efm.d0 d0VarFirstOrError = ((m0) this.e).y0().c(te0.s.f270018a).firstOrError();
        e eVar = new e(20, new d(this, 13));
        d0VarFirstOrError.getClass();
        pfm.a aVarE = hVar.e(new pfm.a(d0VarFirstOrError, eVar, 4));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    @Override // t2i.b, u2i.r
    public final ufm.i k() {
        efm.d0 d0VarF = this.i.f(false);
        b0 b0Var = b0.f;
        ufm.i iVar = new ufm.i(d0VarF, new dug.e(23), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final pfm.a k3() {
        pfm.n nVarR3 = R3(new d(this, 23));
        te0.e eVarB0 = ((m0) this.e).B0();
        od0.i.Companion.getClass();
        pfm.a aVarE = nVarR3.e(te0.w.z0(eVarB0, od0.i.f224256b));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final pfm.n l3(wd6.h orderType) {
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        return R3(new g0f.f(this, orderType, 14));
    }

    public final pfm.a m3() {
        te0.e eVarB0 = ((m0) this.e).B0();
        od0.i.Companion.getClass();
        pfm.a aVarE = te0.w.z0(eVarB0, od0.i.f224256b).e(l3(wd6.h.RECURRING));
        Intrinsics.checkNotNullExpressionValue(aVarE, "andThen(...)");
        return aVarE;
    }

    public final boolean n3() {
        ExchangeFeatureConfig exchangeFeatureConfig = (ExchangeFeatureConfig) te0.w.O(((m0) this.e).w0());
        if (exchangeFeatureConfig == null) {
            return false;
        }
        if ((exchangeFeatureConfig instanceof ExchangeFeatureConfig.BuyInvest) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.SellInvest)) {
            return true;
        }
        if ((exchangeFeatureConfig instanceof ExchangeFeatureConfig.Buy) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Sell) || exchangeFeatureConfig.equals(ExchangeFeatureConfig.Refresh.f96849a) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Default) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.FreelancerSell) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.RecurringBuy) || exchangeFeatureConfig.equals(ExchangeFeatureConfig.CryptoCommodityOnboarded.f96840a)) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // u2i.r
    public final efm.r o2() {
        return this.K;
    }

    public final pfm.a o3() {
        return j3((pfm.h) this.f139610t.c0(new m1i.j((ExchangeOrderDraft) ((m0) this.e).y0().get())));
    }

    public final AccountId p3() {
        ExchangeFeatureConfig exchangeFeatureConfig = (ExchangeFeatureConfig) te0.w.O(((m0) this.e).w0());
        if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Buy) {
            return ((ExchangeFeatureConfig.Buy) exchangeFeatureConfig).f;
        }
        if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Sell) {
            return ((ExchangeFeatureConfig.Sell) exchangeFeatureConfig).f96853g;
        }
        return null;
    }

    public final efm.d0 q3() {
        efm.d0 d0VarFirstOrError = m70.a.g(((ik3.g) this.d).a(g.b.f123407a, false), null, new g0c.h(7), 1).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final rfm.m r3(AbstractSet abstractSet) {
        efm.d0 d0VarQ3 = q3();
        h hVar = new h(20, new g0f.f(abstractSet, this, 21));
        d0VarQ3.getClass();
        rfm.j jVar = new rfm.j(d0VarQ3, hVar, 2);
        Intrinsics.checkNotNullExpressionValue(jVar, "flatMapMaybe(...)");
        return ue0.e.B(jVar, new g1.c(28));
    }

    public final rfm.f0 s3(xi0.b otherCurrency, Set prohibitedCurrencies, wd6.e exchangeMode, wd6.h orderType, boolean z) {
        efm.k jVar;
        Intrinsics.checkNotNullParameter(otherCurrency, "otherCurrency");
        Intrinsics.checkNotNullParameter(prohibitedCurrencies, "prohibitedCurrencies");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        aim.o oVar = new aim.o();
        oVar.addAll(a1.m(prohibitedCurrencies, otherCurrency));
        if (((o8b.c) this.G).g()) {
            xi0.b.Companion.getClass();
            oVar.add(xi0.b.E);
        }
        aim.o oVarA = y0.a(oVar);
        c1i.b bVar = this.f139603l;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        AccountId accountId = this.f139613y;
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        rfm.o oVar2 = new rfm.o(new a9j.k(bVar, 2, exchangeMode, accountId));
        Intrinsics.checkNotNullExpressionValue(oVar2, "fromCallable(...)");
        rfm.m mVar = new rfm.m(te0.w.h0(oVar2), new h(14, new g0f.f(oVarA, orderType, 20)), 0);
        Intrinsics.checkNotNullExpressionValue(mVar, "flatMap(...)");
        zhm.h0 h0Var = zhm.h0.f322473a;
        rfm.m mVarB = ue0.e.B(ue0.e.s(mVar, h0Var), new g1.c(26));
        if (((Boolean) ((m0) this.e).H0().get()).booleanValue() && exchangeMode == wd6.e.BUY) {
            jVar = new rfm.j(new ufm.i(this.F.a(otherCurrency), new fwj.h(new czh.c(this, orderType, z, otherCurrency), 29), 1), new e(0, new d(this, 0)), 2);
        } else {
            jVar = rfm.h.f253943a;
        }
        rfm.z zVarM = mVarB.m(jVar);
        rfm.j jVar2 = new rfm.j(this.f139599c.x(accountId), new fwj.h(new a83.d0(22, oVarA), 27), 2);
        Intrinsics.checkNotNullExpressionValue(jVar2, "flatMapMaybe(...)");
        rfm.f0 f0VarO = zVarM.m(ue0.e.B(ue0.e.s(jVar2, h0Var), new g1.c(6))).m(B3(oVarA, io3.l.CURRENT)).m(r3(oVarA)).o();
        Intrinsics.checkNotNullExpressionValue(f0VarO, "toSingle(...)");
        return f0VarO;
    }

    public final wd6.c t3(MoneyDetails moneyDetails, wd6.c cVar) {
        if (this.f139613y instanceof AccountId.Joint) {
            return wd6.c.FIAT_ONLY;
        }
        int i = k.f139645c[cVar.ordinal()];
        if (i == 1) {
            return wd6.c.ALL;
        }
        b bVar = this.e;
        if (i == 2) {
            if (cp5.d.z(moneyDetails.f96897a)) {
                m0 m0Var = (m0) bVar;
                if (Intrinsics.f(te0.w.O(m0Var.f139662m.getValue(m0Var, m0.f139655t[11])), Boolean.TRUE)) {
                    return wd6.c.CRYPTO_ONLY;
                }
            }
            return wd6.c.ALL;
        }
        if (i != 3) {
            if (i == 4) {
                return wd6.c.FREELANCER_ONLY;
            }
            if (i == 5) {
                return wd6.c.FIAT_ONLY;
            }
            throw new NoWhenBranchMatchedException();
        }
        if (cp5.d.y(moneyDetails.f96897a)) {
            m0 m0Var2 = (m0) bVar;
            if (Intrinsics.f(te0.w.O(m0Var2.f139663n.getValue(m0Var2, m0.f139655t[12])), Boolean.TRUE)) {
                return wd6.c.COMMODITY_ONLY;
            }
        }
        return wd6.c.ALL;
    }

    public final ufm.i u3(efm.d0 d0Var) {
        ufm.i iVar = new ufm.i(d0Var, new h(16, new d(this, 25)), 0);
        Intrinsics.checkNotNullExpressionValue(iVar, "flatMap(...)");
        return iVar;
    }

    public final ufm.i v3(m1i.g inputSide) {
        Intrinsics.checkNotNullParameter(inputSide, "inputSide");
        efm.d0 d0VarC = te0.w.C(((m0) this.e).y0());
        h hVar = new h(10, new g0f.f(inputSide, this, 17));
        d0VarC.getClass();
        ufm.i iVar = new ufm.i(new ufm.i(d0VarC, hVar, 0), new h(11, new g1.c(24)), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final wd6.d w3() {
        ExchangeFeatureConfig exchangeFeatureConfig = (ExchangeFeatureConfig) ((m0) this.e).w0().get();
        if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.BuyInvest) {
            return ((ExchangeFeatureConfig.BuyInvest) exchangeFeatureConfig).d;
        }
        if (exchangeFeatureConfig instanceof ExchangeFeatureConfig.SellInvest) {
            return ((ExchangeFeatureConfig.SellInvest) exchangeFeatureConfig).d;
        }
        if ((exchangeFeatureConfig instanceof ExchangeFeatureConfig.Buy) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Sell) || exchangeFeatureConfig.equals(ExchangeFeatureConfig.Refresh.f96849a) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.Default) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.FreelancerSell) || (exchangeFeatureConfig instanceof ExchangeFeatureConfig.RecurringBuy) || exchangeFeatureConfig.equals(ExchangeFeatureConfig.CryptoCommodityOnboarded.f96840a)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // u2i.r
    public final efm.r x2(wd6.e exchangeMode) {
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        efm.r rVarFlatMap = ((m0) this.e).y0().c(te0.s.f270018a).flatMap(new e(2, new g0f.f(this, exchangeMode, 5)));
        Intrinsics.checkNotNullExpressionValue(rVarFlatMap, "flatMap(...)");
        return rVarFlatMap;
    }

    public final ufm.i x3() {
        efm.d0 d0VarFirstOrError = ((m0) this.e).w0().c(te0.s.f270018a).firstOrError();
        fwj.h hVar = new fwj.h(new g1.c(7), 28);
        d0VarFirstOrError.getClass();
        ufm.i iVar = new ufm.i(d0VarFirstOrError, hVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public final efm.d0 y3() {
        m0 m0Var = (m0) this.e;
        te0.e eVarY0 = m0Var.y0();
        te0.s sVar = te0.s.f270018a;
        efm.d0 d0VarFirstOrError = te0.w.l(eVarY0.c(sVar), m0Var.B0().c(sVar)).map(new h(6, new g1.c(22))).firstOrError();
        Intrinsics.checkNotNullExpressionValue(d0VarFirstOrError, "firstOrError(...)");
        return d0VarFirstOrError;
    }

    public final efm.r z3(ExchangeOrderDraft exchangeOrderDraft, wd6.h hVar, double d) {
        efm.r map = m70.a.g(rd0.e.c(o7.b.s(this.f139607q, r1i.g.a(ExchangeOrderDraft.a(exchangeOrderDraft, null, null, null, null, hVar, null, null, null, null, null, null, d, false, null, null, null, null, false, 33552367), this.f139608r, p3(), null)), kotlin.coroutines.g.f186406a), null, new g0c.h(5), 1).map(new e(13, new g1.c(19)));
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        return map;
    }
}

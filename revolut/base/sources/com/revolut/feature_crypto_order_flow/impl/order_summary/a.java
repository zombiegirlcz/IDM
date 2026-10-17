package com.revolut.feature_crypto_order_flow.impl.order_summary;

import ang.f;
import bzh.l;
import bzh.m;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.PricingPlanUpgradeEntryPointApi$Toggles;
import com.revolut.feature_crypto_order_flow.api.CryptoExchangeFeatureApi$Toggles$CryptoSellAccountBalanceLimitUAE;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import go.g;
import hx7.e;
import java.util.List;
import jyk.d0;
import jzh.e0;
import jzh.f0;
import jzh.g0;
import jzh.h0;
import jzh.j0;
import jzh.k;
import jzh.k0;
import jzh.l0;
import jzh.n0;
import jzh.p0;
import jzh.q0;
import jzh.r;
import jzh.r0;
import jzh.s;
import jzh.s0;
import jzh.u;
import jzh.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import myh.j;
import o7.b;
import oki.h;
import org.jetbrains.annotations.NotNull;
import rga.c;
import sh5.d;
import uyh.a1;
import vkm.j2;
import vkm.q;
import vkm.v1;
import vkm.z1;

/* JADX INFO: loaded from: classes10.dex */
public final class a extends h implements f0 {

    @NotNull
    public static final j0 Companion = new j0();
    public final pzh.a A;
    public final c B;
    public final z1 C;
    public final z1 D;
    public final y E;
    public final com.revolut.kompot.navigable.vc.modal.a F;
    public final OrderSummaryScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d f96778p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f96779q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f96780r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a1 f96781s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final l4i.a f96782t;
    public final f u;
    public final tzh.k v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final mzh.a f96783w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final i4b.f f96784x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final aoa.k f96785y;
    public final gte.a z;

    public a(w0 stateMapper, OrderSummaryScreenContract$InputData inputData, d cryptoFcaDisclaimerWidget, k orderSubmissionDispatcher, b orderQuoteInteractor, a1 cryptoOrderDraftMutator, l4i.a amountConverter, f userInteractor, tzh.k autoStakingDataProvider, mzh.a bannerManager, i4b.f transactionAmountCalculator, aoa.k dealableQuoteEligibilityChecker, gte.a featureToggleInteractor, pzh.a cryptoConvertFooterDisclaimerExtension, c priceQuoteTraceIdHolder) {
        s g0Var;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cryptoFcaDisclaimerWidget, "cryptoFcaDisclaimerWidget");
        Intrinsics.checkNotNullParameter(orderSubmissionDispatcher, "orderSubmissionDispatcher");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(cryptoOrderDraftMutator, "cryptoOrderDraftMutator");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(autoStakingDataProvider, "autoStakingDataProvider");
        Intrinsics.checkNotNullParameter(bannerManager, "bannerManager");
        Intrinsics.checkNotNullParameter(transactionAmountCalculator, "transactionAmountCalculator");
        Intrinsics.checkNotNullParameter(dealableQuoteEligibilityChecker, "dealableQuoteEligibilityChecker");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cryptoConvertFooterDisclaimerExtension, "cryptoConvertFooterDisclaimerExtension");
        Intrinsics.checkNotNullParameter(priceQuoteTraceIdHolder, "priceQuoteTraceIdHolder");
        this.o = inputData;
        this.f96778p = cryptoFcaDisclaimerWidget;
        this.f96779q = orderSubmissionDispatcher;
        this.f96780r = orderQuoteInteractor;
        this.f96781s = cryptoOrderDraftMutator;
        this.f96782t = amountConverter;
        this.u = userInteractor;
        this.v = autoStakingDataProvider;
        this.f96783w = bannerManager;
        this.f96784x = transactionAmountCalculator;
        this.f96785y = dealableQuoteEligibilityChecker;
        this.z = featureToggleInteractor;
        this.A = cryptoConvertFooterDisclaimerExtension;
        this.B = priceQuoteTraceIdHolder;
        ukm.f fVar = ukm.f.DROP_OLDEST;
        z1 z1VarB = q.b(0, 2, fVar);
        Unit unit = Unit.f186387a;
        z1VarB.k(unit);
        this.C = z1VarB;
        z1 z1VarB2 = q.b(0, 2, fVar);
        z1VarB2.k(unit);
        this.D = z1VarB2;
        CryptoOrderDraft cryptoOrderDraft = inputData.f96775a;
        int i = k0.f179835a[cryptoOrderDraft.f.ordinal()];
        if (i == 1 || i == 2) {
            g0Var = new g0(null);
        } else if (i == 3) {
            g0Var = e0.f179819a;
        } else if (i == 4) {
            TakeProfitStopLoss takeProfitStopLoss = inputData.f96775a.f96697n;
            g0Var = new h0((takeProfitStopLoss != null ? takeProfitStopLoss.f72160b : null) == null ? j.STOP_LOSS : j.TAKE_PROFIT, null, null, null);
        } else {
            if (i != 5) {
                throw new IllegalStateException(("Invalid order type " + cryptoOrderDraft.f).toString());
            }
            g0Var = new u(0);
        }
        CryptoOrderDraft cryptoOrderDraft2 = inputData.f96775a;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        zhm.f0 f0Var = zhm.f0.f322471a;
        this.E = mra.d.b(this, new r(cryptoOrderDraft2, g0Var, null, data, data2, f0Var, f0Var), stateMapper, null, false, 12);
        this.F = e.a(this, new jnf.d(this, 24));
    }

    public static final v1 I2(a aVar, wd6.h exchangeOrderType, double d) {
        CryptoOrderDraft draft = ((r) ((j2) aVar.E.f22677a).getValue()).f179847a;
        String strB = aVar.B.b("order_summary_price_quote");
        if (strB == null) {
            strB = null;
        }
        Intrinsics.checkNotNullParameter(draft, "draft");
        Intrinsics.checkNotNullParameter(exchangeOrderType, "exchangeOrderType");
        return c8g.a.D(new a6e.b(rd0.e.n(b.u(aVar.f96780r, l.a(new m(draft.d, draft.f96689a, draft.f96690b, draft.e, exchangeOrderType, d, false, strB), AccountId.Personal.f51414a)), zhm.h0.f322473a), 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature_crypto_order_flow.impl.order_summary.a r6, gim.c r7) {
        /*
            cli.y r0 = r6.E
            boolean r1 = r7 instanceof jzh.t0
            if (r1 == 0) goto L15
            r1 = r7
            jzh.t0 r1 = (jzh.t0) r1
            int r2 = r1.f179857x
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f179857x = r2
            goto L1a
        L15:
            jzh.t0 r1 = new jzh.t0
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.v
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f179857x
            r4 = 1
            if (r3 == 0) goto L33
            if (r3 != r4) goto L2b
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r0 = r1.u
            yhm.o.b(r7)
            goto L70
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            java.lang.Object r7 = r0.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            jzh.r r7 = (jzh.r) r7
            jzh.s r7 = r7.f179848b
            boolean r3 = r7 instanceof jzh.u
            r5 = 0
            if (r3 == 0) goto L4a
            jzh.u r7 = (jzh.u) r7
            goto L4b
        L4a:
            r7 = r5
        L4b:
            if (r7 == 0) goto L53
            boolean r7 = r7.f179858a
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r7)
        L53:
            boolean r7 = pd.b.j(r5)
            java.lang.Object r0 = r0.f22677a
            vkm.j2 r0 = (vkm.j2) r0
            java.lang.Object r0 = r0.getValue()
            jzh.r r0 = (jzh.r) r0
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r0 = r0.f179847a
            jzh.k r3 = r6.f96779q
            r1.u = r0
            r1.f179857x = r4
            java.lang.Object r7 = r3.e(r0, r7, r1)
            if (r7 != r2) goto L70
            return r2
        L70:
            jzh.c r7 = (jzh.c) r7
            boolean r1 = r7 instanceof jzh.a
            if (r1 == 0) goto Lae
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuote r7 = r0.f96699q
            if (r7 == 0) goto La6
            bzh.m r1 = new bzh.m
            aoa.k r2 = r6.f96785y
            boolean r2 = r2.b(r0)
            r3 = 4
            r1.<init>(r0, r2, r3)
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails r0 = kyh.k.d(r0)
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier r0 = r0.e
            com.revolut.core.model.account.AccountId r0 = oyh.b.b(r0)
            com.revolut.shared.feature.market_data.models.domain.models.OrderQuoteParams r0 = bzh.l.a(r1, r0)
            com.revolut.kompot.navigable.vc.modal.a r6 = r6.F
            com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$ModalStep$FirmPriceDeviance r1 = new com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$ModalStep$FirmPriceDeviance
            com.revolut.feature_crypto_order_flow.api.navigation.FirmPriceDevianceBottomSheetControllerProvider$InputData r2 = new com.revolut.feature_crypto_order_flow.api.navigation.FirmPriceDevianceBottomSheetControllerProvider$InputData
            r2.<init>(r7, r0)
            r1.<init>(r2)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r7 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            oki.h.v2(r6, r1, r7)
            goto Lbb
        La6:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Firm price deviance received but orderQuote is null"
            r6.<init>(r7)
            throw r6
        Lae:
            boolean r0 = r7 instanceof jzh.b
            if (r0 == 0) goto Lbe
            jzh.b r7 = (jzh.b) r7
            jzh.d0 r7 = r7.f179814a
            if (r7 == 0) goto Lbb
            r6.C2(r7)
        Lbb:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        Lbe:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_crypto_order_flow.impl.order_summary.a.J2(com.revolut.feature_crypto_order_flow.impl.order_summary.a, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        if (((jte.d) this.z).c(PricingPlanUpgradeEntryPointApi$Toggles.RevampedPremiumContextualBannersPt2Crypto.f80976c)) {
            this.B.a("order_summary_price_quote");
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.F;
    }

    @Override // yji.l
    public final void T1(long j2) {
        a aVar;
        List list;
        Flow gVar;
        Double d;
        Double d5;
        Continuation continuation = null;
        n2(new s0(0, this, continuation), new whi.b(6));
        yji.l.b1(this, this.A.Z2(), null, new r0(1, this, continuation), 3);
        y yVar = this.E;
        s sVar = ((r) ((j2) yVar.f22677a).getValue()).f179848b;
        if (sVar instanceof h0) {
            CryptoOrderDraft cryptoOrderDraft = ((r) ((j2) yVar.f22677a).getValue()).f179847a;
            TakeProfitStopLoss takeProfitStopLoss = cryptoOrderDraft.f96697n;
            if (takeProfitStopLoss == null || !takeProfitStopLoss.f72159a || (d5 = takeProfitStopLoss.f72161c) == null) {
                aVar = this;
                gVar = new g(null, 2);
            } else {
                aVar = this;
                gVar = q.Q(aVar.C, new p0(null, aVar, d5.doubleValue(), 0));
            }
            Flow flow = gVar;
            TakeProfitStopLoss takeProfitStopLoss2 = cryptoOrderDraft.f96697n;
            yji.l.b1(this, yh5.b.d(flow, (takeProfitStopLoss2 == null || !takeProfitStopLoss2.f72159a || (d = takeProfitStopLoss2.f72160b) == null) ? new g(null, 2) : q.Q(aVar.D, new p0(null, aVar, d.doubleValue(), 1))), null, new q0(this, null), 3);
        } else {
            aVar = this;
            if (sVar instanceof u) {
                yji.l.b1(this, q.Q(q.q(new ie7.h(yVar.B(new d0(18)), this, 22)), new l0(0, this, continuation)), null, new n0(this, null), 3);
            } else if (!Intrinsics.f(sVar, e0.f179819a)) {
                if (!(sVar instanceof g0)) {
                    throw new NoWhenBranchMatchedException();
                }
                OrderQuote orderQuote = aVar.o.f96775a.f96699q;
                if (orderQuote == null || (list = orderQuote.f104756h) == null) {
                    list = zhm.f0.f322471a;
                }
                H2(yVar, new jud.d(((jte.d) aVar.z).c(CryptoExchangeFeatureApi$Toggles$CryptoSellAccountBalanceLimitUAE.f96677c) ? kyh.k.a(list) : null, 27));
            }
        }
        yji.l.b1(this, nim.a.v(aVar.u.j(w4l.h.f294642c), new d0(17)), null, new r0(2, this, continuation), 3);
        yji.l.b1(this, q.Q(q.r(new jul.c(23), yVar.B(new d0(15))), new l0(1, this, continuation)), null, new r0(3, this, continuation), 3);
        yji.l.b1(this, q.Q(yVar.B(new d0(16)), new l0(2, this, continuation)), null, new r0(0, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.E;
    }
}

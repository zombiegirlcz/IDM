package com.revolut.trading.orders.ui.invest.placement.screens.review;

import ael.d0;
import bul.u;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.pricing_plans.upgrade_prompt.api.entry_point.UpgradeEntryPointItemContract$ItemType;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.shared.feature.market_data.models.domain.models.OrderQuote;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import com.revolut.trading.orders.ui.invest.placement.models.OrderQuoteResult;
import com.revolut.trading.orders.ui.invest.placement.screens.review.provider.NoteOrderPlacementDialogProvider;
import hu1.h0;
import hul.a0;
import hul.p;
import hul.p0;
import hul.s;
import hul.t;
import hul.w;
import hul.z;
import java.util.UUID;
import k4l.r0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import vkm.q;
import vkm.t0;
import vrl.r;
import vrl.u0;
import vrl.y0;
import wli.x;

/* JADX INFO: loaded from: classes12.dex */
public final class o extends oki.h implements p {

    @NotNull
    public static final w Companion = new w();
    public final j60.a A;
    public final lul.n B;
    public final bul.g C;
    public final bul.l D;
    public final bul.e E;
    public final bul.j F;
    public final lul.m G;
    public final jul.i H;
    public final lul.f I;
    public final zjh.j J;
    public final wj0.a K;
    public final lul.e L;
    public final kvl.b M;
    public final qr0.i N;
    public final pfh.b O;
    public final wul.a P;
    public final lul.g Q;
    public final u R;
    public final bul.k S;
    public final kbb.c T;
    public final d1h.e U;
    public final gte.a V;
    public final lul.a W;
    public final x X;
    public final tvl.a Y;
    public final d0 Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final NoteOrderPlacementDialogProvider f106979a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final lul.c f106980b0;
    public final zjh.f c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final ydf.b f106981d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final lul.i f106982e0;
    public final Object f0;
    public final y g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f106983h0;
    public final String i0;
    public final UUID j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Object f106984k0;
    public final Object l0;
    public final Object m0;
    public final InvestOrderReviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final csl.k f106985p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.l f106986q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vrl.c f106987r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.b f106988s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y0 f106989t;
    public final u0 u;
    public final vrl.p v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final wtl.e f106990w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final tga.k f106991x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final isl.b f106992y;
    public final lul.h z;

    public o(InvestOrderReviewScreenContract$InputData inputData, hul.h initialState, p0 stateMapper, hul.o saveStateDelegate, csl.k tradingOrderReviewDialogMapper, ybl.l configInteractor, vrl.c investOrderInteractor, ybl.b instrumentTickerInteractor, y0 tradingPlaceOrderInteractor, u0 tradingOrdersInteractor, vrl.p nbboInteractor, wtl.e investOrderFlowSharedApi, tga.k upgradeEntryPointItemProvider, isl.b orderPriceDetailsControllerModelApi, lul.h orderPlacementWarningProvider, j60.a bottomExpandableDialogControllerExtension, lul.n tradingDisclosuresNaviCommandBuilder, bul.g exchangePriceDescriptionNaviCommandBuilder, bul.l helpCentreNaviCommandBuilder, bul.e exchangeBreakdownNaviCommandBuilder, bul.j feeBreakdownNaviCommandBuilder, lul.m placeOrderRequestBuilder, jul.i statusDialogConfigurationMapper, lul.f investOrderPlacedActionBuilder, zjh.j setExtendedHoursIncludedByDefaultUseCase, wj0.a idempotencyKeyHolder, lul.e investFrequencySettingsModalStepProvider, kvl.b autoTopUpControllerModelApi, qr0.i freeTradesInfoProvider, pfh.b fundOrderInfoControllerProvider, wul.a commissionFreeTradesInfoControllerProvider, lul.g orderPlacementWarningDialogProvider, u orderQuoteParamsBuilder, bul.k fiatExchangeOrderQuoteParamsBuilder, kbb.c displayTotalMoneyProvider, d1h.e disclaimersModelExtension, gte.a featureToggleInteractor, lul.a cbpDisclosureDialogProvider, x deeplinkHandler, tvl.a httpsWebUrlValidator, d0 stocksInteractor, NoteOrderPlacementDialogProvider noteOrderPlacementDialogProvider, lul.c cbpDisclosureProvider, zjh.f ipoInstrumentInteractor, ydf.b executionTimingInteractor, lul.i orderReviewSlippageBottomSheetProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(tradingOrderReviewDialogMapper, "tradingOrderReviewDialogMapper");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(investOrderInteractor, "investOrderInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingPlaceOrderInteractor, "tradingPlaceOrderInteractor");
        Intrinsics.checkNotNullParameter(tradingOrdersInteractor, "tradingOrdersInteractor");
        Intrinsics.checkNotNullParameter(nbboInteractor, "nbboInteractor");
        Intrinsics.checkNotNullParameter(investOrderFlowSharedApi, "investOrderFlowSharedApi");
        Intrinsics.checkNotNullParameter(upgradeEntryPointItemProvider, "upgradeEntryPointItemProvider");
        Intrinsics.checkNotNullParameter(orderPriceDetailsControllerModelApi, "orderPriceDetailsControllerModelApi");
        Intrinsics.checkNotNullParameter(orderPlacementWarningProvider, "orderPlacementWarningProvider");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(tradingDisclosuresNaviCommandBuilder, "tradingDisclosuresNaviCommandBuilder");
        Intrinsics.checkNotNullParameter(exchangePriceDescriptionNaviCommandBuilder, "exchangePriceDescriptionNaviCommandBuilder");
        Intrinsics.checkNotNullParameter(helpCentreNaviCommandBuilder, "helpCentreNaviCommandBuilder");
        Intrinsics.checkNotNullParameter(exchangeBreakdownNaviCommandBuilder, "exchangeBreakdownNaviCommandBuilder");
        Intrinsics.checkNotNullParameter(feeBreakdownNaviCommandBuilder, "feeBreakdownNaviCommandBuilder");
        Intrinsics.checkNotNullParameter(placeOrderRequestBuilder, "placeOrderRequestBuilder");
        Intrinsics.checkNotNullParameter(statusDialogConfigurationMapper, "statusDialogConfigurationMapper");
        Intrinsics.checkNotNullParameter(investOrderPlacedActionBuilder, "investOrderPlacedActionBuilder");
        Intrinsics.checkNotNullParameter(setExtendedHoursIncludedByDefaultUseCase, "setExtendedHoursIncludedByDefaultUseCase");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(investFrequencySettingsModalStepProvider, "investFrequencySettingsModalStepProvider");
        Intrinsics.checkNotNullParameter(autoTopUpControllerModelApi, "autoTopUpControllerModelApi");
        Intrinsics.checkNotNullParameter(freeTradesInfoProvider, "freeTradesInfoProvider");
        Intrinsics.checkNotNullParameter(fundOrderInfoControllerProvider, "fundOrderInfoControllerProvider");
        Intrinsics.checkNotNullParameter(commissionFreeTradesInfoControllerProvider, "commissionFreeTradesInfoControllerProvider");
        Intrinsics.checkNotNullParameter(orderPlacementWarningDialogProvider, "orderPlacementWarningDialogProvider");
        Intrinsics.checkNotNullParameter(orderQuoteParamsBuilder, "orderQuoteParamsBuilder");
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteParamsBuilder, "fiatExchangeOrderQuoteParamsBuilder");
        Intrinsics.checkNotNullParameter(displayTotalMoneyProvider, "displayTotalMoneyProvider");
        Intrinsics.checkNotNullParameter(disclaimersModelExtension, "disclaimersModelExtension");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(cbpDisclosureDialogProvider, "cbpDisclosureDialogProvider");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        Intrinsics.checkNotNullParameter(httpsWebUrlValidator, "httpsWebUrlValidator");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(noteOrderPlacementDialogProvider, "noteOrderPlacementDialogProvider");
        Intrinsics.checkNotNullParameter(cbpDisclosureProvider, "cbpDisclosureProvider");
        Intrinsics.checkNotNullParameter(ipoInstrumentInteractor, "ipoInstrumentInteractor");
        Intrinsics.checkNotNullParameter(executionTimingInteractor, "executionTimingInteractor");
        Intrinsics.checkNotNullParameter(orderReviewSlippageBottomSheetProvider, "orderReviewSlippageBottomSheetProvider");
        this.o = inputData;
        this.f106985p = tradingOrderReviewDialogMapper;
        this.f106986q = configInteractor;
        this.f106987r = investOrderInteractor;
        this.f106988s = instrumentTickerInteractor;
        this.f106989t = tradingPlaceOrderInteractor;
        this.u = tradingOrdersInteractor;
        this.v = nbboInteractor;
        this.f106990w = investOrderFlowSharedApi;
        this.f106991x = upgradeEntryPointItemProvider;
        this.f106992y = orderPriceDetailsControllerModelApi;
        this.z = orderPlacementWarningProvider;
        this.A = bottomExpandableDialogControllerExtension;
        this.B = tradingDisclosuresNaviCommandBuilder;
        this.C = exchangePriceDescriptionNaviCommandBuilder;
        this.D = helpCentreNaviCommandBuilder;
        this.E = exchangeBreakdownNaviCommandBuilder;
        this.F = feeBreakdownNaviCommandBuilder;
        this.G = placeOrderRequestBuilder;
        this.H = statusDialogConfigurationMapper;
        this.I = investOrderPlacedActionBuilder;
        this.J = setExtendedHoursIncludedByDefaultUseCase;
        this.K = idempotencyKeyHolder;
        this.L = investFrequencySettingsModalStepProvider;
        this.M = autoTopUpControllerModelApi;
        this.N = freeTradesInfoProvider;
        this.O = fundOrderInfoControllerProvider;
        this.P = commissionFreeTradesInfoControllerProvider;
        this.Q = orderPlacementWarningDialogProvider;
        this.R = orderQuoteParamsBuilder;
        this.S = fiatExchangeOrderQuoteParamsBuilder;
        this.T = displayTotalMoneyProvider;
        this.U = disclaimersModelExtension;
        this.V = featureToggleInteractor;
        this.W = cbpDisclosureDialogProvider;
        this.X = deeplinkHandler;
        this.Y = httpsWebUrlValidator;
        this.Z = stocksInteractor;
        this.f106979a0 = noteOrderPlacementDialogProvider;
        this.f106980b0 = cbpDisclosureProvider;
        this.c0 = ipoInstrumentInteractor;
        this.f106981d0 = executionTimingInteractor;
        this.f106982e0 = orderReviewSlippageBottomSheetProvider;
        this.f0 = te0.w.y0(new t(this, 0));
        this.g0 = mra.d.b(this, initialState, stateMapper, saveStateDelegate, false, 8);
        this.f106983h0 = hx7.e.a(this, new hul.u(this, 0));
        this.i0 = inputData.f106941a.f214596b;
        this.j0 = inputData.f106942b;
        this.f106984k0 = te0.w.y0(new t(this, 1));
        this.l0 = te0.w.y0(new t(this, 2));
        this.m0 = te0.w.y0(new t(this, 3));
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, kotlin.Lazy] */
    public static final Object I2(o oVar, gim.i iVar) {
        return q.x(mo3.a.g((Flow) oVar.f106984k0.getValue(), null, new ht1.l(13), 1), iVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.trading.orders.ui.invest.placement.screens.review.o r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof hul.d0
            if (r0 == 0) goto L13
            r0 = r6
            hul.d0 r0 = (hul.d0) r0
            int r1 = r0.f155713w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f155713w = r1
            goto L18
        L13:
            hul.d0 r0 = new hul.d0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f155713w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r6)
            goto L4f
        L28:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            yhm.o.b(r6)
            java.lang.Object r5 = r5.m0
            java.lang.Object r5 = r5.getValue()
            kotlinx.coroutines.flow.Flow r5 = (kotlinx.coroutines.flow.Flow) r5
            ht1.l r6 = new ht1.l
            r2 = 12
            r6.<init>(r2)
            jhi.b r5 = mo3.a.g(r5, r4, r6, r3)
            r0.f155713w = r3
            java.lang.Object r6 = vkm.q.z(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            java.util.Optional r6 = (java.util.Optional) r6
            if (r6 == 0) goto L5f
            java.lang.String r5 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r5)
            java.lang.Object r5 = r6.orElse(r4)
            jel.c r5 = (jel.c) r5
            return r5
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.review.o.J2(com.revolut.trading.orders.ui.invest.placement.screens.review.o, gim.c):java.lang.Object");
    }

    public static final OrderQuote.Slippage.Available K2(o oVar) {
        OrderQuoteResult orderQuoteResult;
        OrderQuote orderQuote;
        Data data = ((hul.h) ((j2) oVar.g0.f22677a).getValue()).d;
        OrderQuote.Slippage slippage = (data == null || (orderQuoteResult = (OrderQuoteResult) data.getContent()) == null || (orderQuote = orderQuoteResult.f106859b) == null) ? null : orderQuote.f104767x;
        if (slippage instanceof OrderQuote.Slippage.Available) {
            return (OrderQuote.Slippage.Available) slippage;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.trading.orders.ui.invest.placement.screens.review.o r12, nel.n r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.review.o.L2(com.revolut.trading.orders.ui.invest.placement.screens.review.o, nel.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00dd, code lost:
    
        if (r0.c(r9, r14, r1, r2) == r3) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M2(com.revolut.trading.orders.ui.invest.placement.screens.review.o r13, nel.n r14, gim.c r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.review.o.M2(com.revolut.trading.orders.ui.invest.placement.screens.review.o, nel.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void I1() {
        this.K.a("IDEMPOTENCY_TAG_PLACE_TRADING_ORDER");
        y yVar = this.g0;
        Continuation continuation = null;
        this.f106990w.e3(zi0.c.P(new wtl.c(((hul.h) ((j2) yVar.f22677a).getValue()).f155719a.d.getF106871a(), this.o.f106941a.i), false, null, 3));
        yji.l.a1(this, (Flow) this.f106984k0.getValue(), null, null, new a0(this, continuation, 11), 3);
        yji.l.a1(this, (Flow) this.l0.getValue(), null, null, new a0(this, continuation, 12), 3);
        ybl.l lVar = this.f106986q;
        yji.l.a1(this, ybl.l.d(lVar), null, null, new a0(this, continuation, 13), 3);
        yji.l.a1(this, rd0.e.b(ybl.l.c(lVar, false, 3)), null, null, new a0(this, continuation, 14), 3);
        yji.l.a1(this, rd0.e.b(this.f106991x.c(UpgradeEntryPointItemContract$ItemType.ReviewOrder.Stocks.f80993a)), null, null, new a0(this, continuation, 15), 3);
        r rVar = (r) this.v;
        rVar.getClass();
        String securityRef = this.i0;
        Intrinsics.checkNotNullParameter(securityRef, "securityRef");
        yji.l.a1(this, nim.a.v(rd0.e.b(((ael.k) rVar.f291670b).f(securityRef)), new vq5.x(rVar, 4)), null, null, new a0(this, continuation, 16), 3);
        yji.l.a1(this, ((vrl.e) this.f106987r).e(this.j0, w4l.h.f294642c), null, null, new a0(this, continuation, 17), 3);
        j2 j2Var = (j2) yVar.f22677a;
        AutoTopUpStatus autoTopUpStatus = ((hul.h) j2Var.getValue()).f155721c;
        kvl.a0 a0Var = (kvl.a0) this.M;
        a0Var.h3(autoTopUpStatus);
        yji.l.a1(this, mo3.a.g(a0Var.g3(((hul.h) j2Var.getValue()).f155719a.f106848b), null, new ht1.l(11), 1), null, null, new a0(this, continuation, 10), 3);
        aim.e eVarB = zhm.u.b();
        if (((Boolean) this.f0.getValue()).booleanValue() && ((hul.h) j2Var.getValue()).f155719a.f.f91795b.f104718b.f104719a == f8l.c.CRYPTO) {
            eVarB.add(rdh.b.ORDER_REVIEW_CRYPTO_RISK_WARNING);
        }
        if (((jte.d) this.V).c(TradingOrdersApi$Toggles.OrderFlowBankMigration.f106792c)) {
            eVarB.add(rdh.b.ORDER_REVIEW_RECURRING_BUY_AUTO_TOP_UP_BANK);
        }
        yji.l.a1(this, ((gah.e) this.U).Z2(zhm.u.a(eVarB)), null, null, new a0(this, continuation, 8), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f106983h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00dc A[PHI: r9 r15
      0x00dc: PHI (r9v5 com.revolut.trading.orders.ui.invest.placement.screens.review.o) = 
      (r9v4 com.revolut.trading.orders.ui.invest.placement.screens.review.o)
      (r9v6 com.revolut.trading.orders.ui.invest.placement.screens.review.o)
     binds: [B:28:0x00d8, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]
      0x00dc: PHI (r15v17 java.lang.Object) = (r15v16 java.lang.Object), (r15v1 java.lang.Object) binds: [B:28:0x00d8, B:17:0x003f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object N2(gim.c r15) {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.review.o.N2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r9v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void T1(long j2) {
        long jA = n9l.b.SEC_3.a();
        ael.k kVar = (ael.k) this.f106988s;
        String str = this.i0;
        Continuation continuation = null;
        yji.l.b1(this, kVar.p(str, w4l.i.f294643c, jA), null, new a0(this, continuation, 3), 3);
        wtl.e eVar = this.f106990w;
        yji.l.b1(this, nim.a.v(eVar.c3(), new s(this, 6)), null, new a0(this, continuation, 7), 3);
        yji.l.b1(this, new z(eVar.b3(), this, 2), null, new a0(this, continuation, 6), 3);
        kbb.c cVar = this.T;
        cVar.getClass();
        y stateHolder = this.g0;
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        j2 j2Var = (j2) stateHolder.f22677a;
        j2 j2Var2 = (j2) stateHolder.f22677a;
        Amount amountE0 = ((hul.h) j2Var.getValue()).f155719a.d.getF106871a();
        Intrinsics.checkNotNullParameter(amountE0, "<this>");
        cVar.e().getClass();
        int i = 0;
        yji.l.b1(this, new z(l4i.a.d(amountE0) ? zi0.c.i(cVar.g(amountE0)) : boh.f.e(nim.a.v(new t0(stateHolder.B(new lsl.b(22)), 1), new lsl.b(23)), new lul.d(cVar, stateHolder, 0)), this, i), null, new a0(this, continuation, i), 3);
        yji.l.b1(this, boh.f.e(nim.a.v(zi0.c.i(((hul.h) j2Var2.getValue()).f155719a.f), new h0(18)), new s(this, 0)), null, new a0(this, continuation, 1), 3);
        yji.l.b1(this, new z(eVar.Z2(), this, 1), null, new a0(this, continuation, 2), 3);
        InvestOrderReviewScreenContract$InputData investOrderReviewScreenContract$InputData = this.o;
        nel.n nVar = investOrderReviewScreenContract$InputData.f106941a;
        nel.n nVar2 = investOrderReviewScreenContract$InputData.f106941a;
        if (nVar.b()) {
            yji.l.b1(this, nim.a.v(this.c0.z(zhm.y0.b(str), w4l.h.f294642c), new s(this, 5)), null, new a0(this, continuation, 4), 3);
        } else {
            H2(stateHolder, new h0(17));
        }
        if (((hul.h) j2Var2.getValue()).f155729q && ((hul.h) j2Var2.getValue()).f155719a.f106848b != r0.RECURRING && pu7.a.D(nVar2.f214597c)) {
            yji.l.b1(this, rd0.e.n(this.f106981d0.a(nVar2.f214596b, nVar2.k.a(), ((hul.h) j2Var2.getValue()).f155719a.f106848b, com.revolut.trading.orders.ui.trade.model.a.a(((hul.h) j2Var2.getValue()).f155719a.f106852j)), zhm.h0.f322473a), null, new a0(this, continuation, 5), 3);
        } else {
            H2(stateHolder, new h0(11));
        }
        yji.l.b1(this, (Flow) this.m0.getValue(), null, new a0(this, continuation, 18), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.g0;
    }
}

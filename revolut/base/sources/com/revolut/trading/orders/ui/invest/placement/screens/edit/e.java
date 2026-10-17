package com.revolut.trading.orders.ui.invest.placement.screens.edit;

import akg.n;
import bul.i;
import bul.k;
import bul.l;
import bul.m;
import bul.r;
import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import com.revolut.feature.trading_orders.common.models.AutoTopUpStatus;
import com.revolut.kompot.common.ModalDestination;
import com.revolut.shared.feature.market_data.models.domain.models.Amount;
import com.revolut.trading.orders.TradingOrdersApi$Toggles;
import com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$ModalStep;
import cui.s;
import cul.a0;
import cul.j0;
import cul.j1;
import cul.k0;
import cul.l0;
import cul.p2;
import cul.t0;
import cul.u;
import cul.y0;
import eul.v;
import f7j.p;
import g2e.t;
import gul.b0;
import gul.d0;
import gul.e0;
import gul.g;
import gul.g0;
import gul.h0;
import gul.j;
import gul.o;
import gul.q;
import gul.w;
import gul.x;
import gul.z;
import ip0.v7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import k4l.q0;
import k4l.r0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import oki.h;
import skm.a2;
import vkm.j2;
import vkm.v1;
import vrl.s0;
import vrl.u0;
import zhm.f0;
import zjh.f;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends h implements a0 {
    public final t A;
    public final bul.e B;
    public final e0 C;
    public final k D;
    public final m E;
    public final r F;
    public final i G;
    public final n60.a H;
    public final q I;
    public final by5.a J;
    public final z K;
    public final b0 L;
    public final g0 M;
    public final vrl.a N;
    public final gul.h O;
    public final fkg.a P;
    public final r10.a Q;
    public final j R;
    public final gul.c S;
    public final o T;
    public final h0 U;
    public final l V;
    public final kvl.b W;
    public final qr0.i X;
    public final wul.a Y;
    public final ddf.a Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final d0 f106916a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final zrc.e f106917b0;
    public final gul.e c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final x f106918d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public final g f106919e0;
    public final gul.k f0;
    public final r10.d g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final fk3.a f106920h0;
    public final gte.a i0;
    public final p j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final f f106921k0;
    public final s0 l0;
    public final y m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final com.revolut.kompot.navigable.vc.modal.a f106922n0;
    public final u o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final String f106923o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v f106924p;
    public final UUID p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final vrl.c f106925q;
    public final BigDecimal q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ybl.l f106926r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final sel.a f106927r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ybl.b f106928s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public a2 f106929s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u0 f106930t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final AtomicReference f106931t0;
    public final wtl.e u;
    public final isl.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j60.a f106932w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w f106933x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final bul.g f106934y;
    public final gul.d z;

    public e(InvestOrderEditScreenContract$InputData inputData, cul.v initialState, p2 stateMapper, cul.z saveStateDelegate, u investOrderEditScreenDialogMapper, v orderTypeSelectorDialogMapper, vrl.c investOrderInteractor, ybl.l configInteractor, ybl.b instrumentTickerInteractor, u0 tradingOrdersInteractor, wtl.e investOrderFlowSharedApi, isl.b orderPriceDetailsControllerModelApi, j60.a bottomExpandableDialogControllerExtension, w orderQuoteParamsProvider, bul.g exchangePriceDescriptionNaviCommandBuilder, gul.d availableOrderTypesBuilder, t investInputValueBuilder, bul.e exchangeBreakdownNaviCommandBuilder, e0 sourcePocketWrapperBuilder, k fiatExchangeOrderQuoteParamsBuilder, m investAccountSelectorScreenBuilder, r marketHolidayEventsProvider, i expiryDateSelectorScreenBuilder, n60.a keyboardControllerExtension, q investOrderValidationBuilder, by5.a assetConfigBuilder, z securityBalanceBuilder, b0 securityBalanceDisplayProvider, g0 stocksFieldAttributeBuilder, vrl.a extendedHoursInteractor, gul.h extendedHoursStatusBuilder, fkg.a investOrderExpiryBuilder, r10.a frequencySettingsBuilder, j inputModeBuilder, gul.c assetsSufficiencyOptionBuilder, o investOrderEditScreenOutputBuilder, h0 tradingOrderTimeInForceBuilder, l helpCentreNaviCommandBuilder, kvl.b autoTopUpControllerModelApi, qr0.i freeTradesInfoProvider, wul.a commissionFreeTradesInfoControllerProvider, ddf.a sourcePocketInteractor, d0 sourcePocketTopUpDestinationProvider, zrc.e tradingScaInteractor, gul.e checkScaRequiredRequestBuilder, x outputActionBuilder, g displayCurrencyProvider, gul.k inputValueProcessor, r10.d outputValueProcessor, fk3.a configurationInteractor, gte.a featureToggleInteractor, p assetProvider, f ipoInstrumentInteractor, s0 tradingOrderKeyboardSuggestionsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(investOrderEditScreenDialogMapper, "investOrderEditScreenDialogMapper");
        Intrinsics.checkNotNullParameter(orderTypeSelectorDialogMapper, "orderTypeSelectorDialogMapper");
        Intrinsics.checkNotNullParameter(investOrderInteractor, "investOrderInteractor");
        Intrinsics.checkNotNullParameter(configInteractor, "configInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingOrdersInteractor, "tradingOrdersInteractor");
        Intrinsics.checkNotNullParameter(investOrderFlowSharedApi, "investOrderFlowSharedApi");
        Intrinsics.checkNotNullParameter(orderPriceDetailsControllerModelApi, "orderPriceDetailsControllerModelApi");
        Intrinsics.checkNotNullParameter(bottomExpandableDialogControllerExtension, "bottomExpandableDialogControllerExtension");
        Intrinsics.checkNotNullParameter(orderQuoteParamsProvider, "orderQuoteParamsProvider");
        Intrinsics.checkNotNullParameter(exchangePriceDescriptionNaviCommandBuilder, "exchangePriceDescriptionNaviCommandBuilder");
        Intrinsics.checkNotNullParameter(availableOrderTypesBuilder, "availableOrderTypesBuilder");
        Intrinsics.checkNotNullParameter(investInputValueBuilder, "investInputValueBuilder");
        Intrinsics.checkNotNullParameter(exchangeBreakdownNaviCommandBuilder, "exchangeBreakdownNaviCommandBuilder");
        Intrinsics.checkNotNullParameter(sourcePocketWrapperBuilder, "sourcePocketWrapperBuilder");
        Intrinsics.checkNotNullParameter(fiatExchangeOrderQuoteParamsBuilder, "fiatExchangeOrderQuoteParamsBuilder");
        Intrinsics.checkNotNullParameter(investAccountSelectorScreenBuilder, "investAccountSelectorScreenBuilder");
        Intrinsics.checkNotNullParameter(marketHolidayEventsProvider, "marketHolidayEventsProvider");
        Intrinsics.checkNotNullParameter(expiryDateSelectorScreenBuilder, "expiryDateSelectorScreenBuilder");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(investOrderValidationBuilder, "investOrderValidationBuilder");
        Intrinsics.checkNotNullParameter(assetConfigBuilder, "assetConfigBuilder");
        Intrinsics.checkNotNullParameter(securityBalanceBuilder, "securityBalanceBuilder");
        Intrinsics.checkNotNullParameter(securityBalanceDisplayProvider, "securityBalanceDisplayProvider");
        Intrinsics.checkNotNullParameter(stocksFieldAttributeBuilder, "stocksFieldAttributeBuilder");
        Intrinsics.checkNotNullParameter(extendedHoursInteractor, "extendedHoursInteractor");
        Intrinsics.checkNotNullParameter(extendedHoursStatusBuilder, "extendedHoursStatusBuilder");
        Intrinsics.checkNotNullParameter(investOrderExpiryBuilder, "investOrderExpiryBuilder");
        Intrinsics.checkNotNullParameter(frequencySettingsBuilder, "frequencySettingsBuilder");
        Intrinsics.checkNotNullParameter(inputModeBuilder, "inputModeBuilder");
        Intrinsics.checkNotNullParameter(assetsSufficiencyOptionBuilder, "assetsSufficiencyOptionBuilder");
        Intrinsics.checkNotNullParameter(investOrderEditScreenOutputBuilder, "investOrderEditScreenOutputBuilder");
        Intrinsics.checkNotNullParameter(tradingOrderTimeInForceBuilder, "tradingOrderTimeInForceBuilder");
        Intrinsics.checkNotNullParameter(helpCentreNaviCommandBuilder, "helpCentreNaviCommandBuilder");
        Intrinsics.checkNotNullParameter(autoTopUpControllerModelApi, "autoTopUpControllerModelApi");
        Intrinsics.checkNotNullParameter(freeTradesInfoProvider, "freeTradesInfoProvider");
        Intrinsics.checkNotNullParameter(commissionFreeTradesInfoControllerProvider, "commissionFreeTradesInfoControllerProvider");
        Intrinsics.checkNotNullParameter(sourcePocketInteractor, "sourcePocketInteractor");
        Intrinsics.checkNotNullParameter(sourcePocketTopUpDestinationProvider, "sourcePocketTopUpDestinationProvider");
        Intrinsics.checkNotNullParameter(tradingScaInteractor, "tradingScaInteractor");
        Intrinsics.checkNotNullParameter(checkScaRequiredRequestBuilder, "checkScaRequiredRequestBuilder");
        Intrinsics.checkNotNullParameter(outputActionBuilder, "outputActionBuilder");
        Intrinsics.checkNotNullParameter(displayCurrencyProvider, "displayCurrencyProvider");
        Intrinsics.checkNotNullParameter(inputValueProcessor, "inputValueProcessor");
        Intrinsics.checkNotNullParameter(outputValueProcessor, "outputValueProcessor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(assetProvider, "assetProvider");
        Intrinsics.checkNotNullParameter(ipoInstrumentInteractor, "ipoInstrumentInteractor");
        Intrinsics.checkNotNullParameter(tradingOrderKeyboardSuggestionsInteractor, "tradingOrderKeyboardSuggestionsInteractor");
        this.o = investOrderEditScreenDialogMapper;
        this.f106924p = orderTypeSelectorDialogMapper;
        this.f106925q = investOrderInteractor;
        this.f106926r = configInteractor;
        this.f106928s = instrumentTickerInteractor;
        this.f106930t = tradingOrdersInteractor;
        this.u = investOrderFlowSharedApi;
        this.v = orderPriceDetailsControllerModelApi;
        this.f106932w = bottomExpandableDialogControllerExtension;
        this.f106933x = orderQuoteParamsProvider;
        this.f106934y = exchangePriceDescriptionNaviCommandBuilder;
        this.z = availableOrderTypesBuilder;
        this.A = investInputValueBuilder;
        this.B = exchangeBreakdownNaviCommandBuilder;
        this.C = sourcePocketWrapperBuilder;
        this.D = fiatExchangeOrderQuoteParamsBuilder;
        this.E = investAccountSelectorScreenBuilder;
        this.F = marketHolidayEventsProvider;
        this.G = expiryDateSelectorScreenBuilder;
        this.H = keyboardControllerExtension;
        this.I = investOrderValidationBuilder;
        this.J = assetConfigBuilder;
        this.K = securityBalanceBuilder;
        this.L = securityBalanceDisplayProvider;
        this.M = stocksFieldAttributeBuilder;
        this.N = extendedHoursInteractor;
        this.O = extendedHoursStatusBuilder;
        this.P = investOrderExpiryBuilder;
        this.Q = frequencySettingsBuilder;
        this.R = inputModeBuilder;
        this.S = assetsSufficiencyOptionBuilder;
        this.T = investOrderEditScreenOutputBuilder;
        this.U = tradingOrderTimeInForceBuilder;
        this.V = helpCentreNaviCommandBuilder;
        this.W = autoTopUpControllerModelApi;
        this.X = freeTradesInfoProvider;
        this.Y = commissionFreeTradesInfoControllerProvider;
        this.Z = sourcePocketInteractor;
        this.f106916a0 = sourcePocketTopUpDestinationProvider;
        this.f106917b0 = tradingScaInteractor;
        this.c0 = checkScaRequiredRequestBuilder;
        this.f106918d0 = outputActionBuilder;
        this.f106919e0 = displayCurrencyProvider;
        this.f0 = inputValueProcessor;
        this.g0 = outputValueProcessor;
        this.f106920h0 = configurationInteractor;
        this.i0 = featureToggleInteractor;
        this.j0 = assetProvider;
        this.f106921k0 = ipoInstrumentInteractor;
        this.l0 = tradingOrderKeyboardSuggestionsInteractor;
        this.m0 = mra.d.b(this, initialState, stateMapper, saveStateDelegate, false, 8);
        this.f106922n0 = hx7.e.a(this, new cnc.t(this, 22));
        this.f106923o0 = inputData.f106880a.f214596b;
        this.p0 = inputData.f106881b;
        this.q0 = inputData.e;
        this.f106927r0 = inputData.f106883g;
        this.f106931t0 = new AtomicReference();
    }

    public static final Flow I2(e eVar) {
        cxe.u uVarA = eVar.F.a();
        Flow flowC = ((vrl.e) eVar.f106925q).c(eVar.f106923o0);
        eVar.U.getClass();
        return vkm.q.q(nim.a.v(zh9.u0.i(uVarA, flowC, xam.a.h(new t0(eVar, null, 0), zi0.c.i(q0.DAY))), new k0(eVar, 0)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e r6, com.revolut.shared.feature.market_data.models.domain.models.Amount r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof cul.x1
            if (r0 == 0) goto L13
            r0 = r8
            cul.x1 r0 = (cul.x1) r0
            int r1 = r0.f109205x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109205x = r1
            goto L18
        L13:
            cul.x1 r0 = new cul.x1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109205x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.trading.orders.ui.invest.placement.screens.edit.e r6 = r0.u
            yhm.o.b(r8)
            goto L68
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r8)
            cli.y r8 = r6.m0
            cul.l0 r2 = new cul.l0
            r4 = 23
            r2.<init>(r4)
            kotlinx.coroutines.flow.Flow r8 = r8.B(r2)
            vkm.t0 r2 = new vkm.t0
            r4 = 1
            r2.<init>(r8, r4)
            chf.a r8 = new chf.a
            r4 = 4
            r5 = 0
            r8.<init>(r6, r7, r5, r4)
            kotlinx.coroutines.flow.Flow r7 = xam.a.h(r8, r2)
            ct6.o r8 = new ct6.o
            r2 = 15
            r8.<init>(r2)
            jhi.b r7 = mo3.a.g(r7, r5, r8, r3)
            r0.u = r6
            r0.f109205x = r3
            java.lang.Object r8 = vkm.q.x(r7, r0)
            if (r8 != r1) goto L68
            return r1
        L68:
            aii.u r8 = (aii.u) r8
            r6.C1(r8)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.J2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e, com.revolut.shared.feature.market_data.models.domain.models.Amount, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e r7, gim.c r8) {
        /*
            boolean r0 = r8 instanceof cul.b2
            if (r0 == 0) goto L13
            r0 = r8
            cul.b2 r0 = (cul.b2) r0
            int r1 = r0.f109076w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109076w = r1
            goto L18
        L13:
            cul.b2 r0 = new cul.b2
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109076w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L77
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            cli.y r8 = r7.m0
            cul.l0 r2 = new cul.l0
            r4 = 18
            r2.<init>(r4)
            kotlinx.coroutines.flow.Flow r8 = r8.B(r2)
            cul.u0 r2 = new cul.u0
            r4 = 3
            r5 = 0
            r2.<init>(r5, r7, r4)
            wkm.l r8 = vkm.q.Q(r8, r2)
            kotlinx.coroutines.flow.Flow r8 = vkm.q.q(r8)
            bul.r r2 = r7.F
            cxe.u r2 = r2.a()
            bt9.t r4 = new bt9.t
            r6 = 9
            r4.<init>(r6)
            akg.n r2 = nim.a.v(r2, r4)
            t38.e r8 = zh9.u0.m(r8, r2)
            ct6.o r2 = new ct6.o
            r4 = 16
            r2.<init>(r4)
            jhi.b r8 = mo3.a.g(r8, r5, r2, r3)
            r0.f109076w = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L77
            return r1
        L77:
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r0 = r8.f186385a
            com.revolut.retail.trading.core.domain.orders.OrderExpiry r0 = (com.revolut.retail.trading.core.domain.orders.OrderExpiry) r0
            java.lang.Object r8 = r8.f186386b
            java.util.List r8 = (java.util.List) r8
            com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$ModalStep$ExpiryDate r1 = new com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$ModalStep$ExpiryDate
            java.time.ZonedDateTime r2 = r0.f104647a
            java.time.LocalDate r2 = r2.toLocalDate()
            java.lang.String r3 = "toLocalDate(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            k4l.k r0 = r0.f104648b
            r1.<init>(r2, r0, r8)
            com.revolut.kompot.navigable.vc.modal.a r7 = r7.f106922n0
            com.revolut.kompot.common.ModalDestination$Style$POPUP r8 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.v2(r7, r1, r8)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.K2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof cul.c2
            if (r0 == 0) goto L13
            r0 = r10
            cul.c2 r0 = (cul.c2) r0
            int r1 = r0.f109083w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109083w = r1
            goto L18
        L13:
            cul.c2 r0 = new cul.c2
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109083w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L9a
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            cli.y r10 = r9.m0
            cul.l0 r2 = new cul.l0
            r4 = 26
            r2.<init>(r4)
            kotlinx.coroutines.flow.Flow r10 = r10.B(r2)
            cul.u0 r2 = new cul.u0
            r4 = 2
            r5 = 0
            r2.<init>(r5, r9, r4)
            wkm.l r10 = vkm.q.Q(r10, r2)
            kotlinx.coroutines.flow.Flow r10 = vkm.q.q(r10)
            bul.r r2 = r9.F
            cxe.u r2 = r2.a()
            vrl.c r4 = r9.f106925q
            java.lang.String r6 = r9.f106923o0
            vrl.e r4 = (vrl.e) r4
            kotlinx.coroutines.flow.Flow r4 = r4.c(r6)
            gul.h0 r6 = r9.U
            r6.getClass()
            k4l.q0 r6 = k4l.q0.DAY
            go.g r6 = zi0.c.i(r6)
            cul.t0 r7 = new cul.t0
            r8 = 0
            r7.<init>(r9, r5, r8)
            kotlinx.coroutines.flow.Flow r6 = xam.a.h(r7, r6)
            akg.n r10 = zh9.u0.i(r10, r2, r4)
            t38.e r10 = zh9.u0.m(r10, r6)
            cul.y0 r2 = new cul.y0
            r4 = 19
            r2.<init>(r5, r9, r4)
            jhi.k r10 = nim.a.u(r2, r10)
            ct6.o r2 = new ct6.o
            r4 = 8
            r2.<init>(r4)
            jhi.b r10 = mo3.a.g(r10, r5, r2, r3)
            r0.f109083w = r3
            java.lang.Object r10 = vkm.q.x(r10, r0)
            if (r10 != r1) goto L9a
            return r1
        L9a:
            com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$ModalStep$ScheduleSettings r10 = (com.revolut.trading.orders.ui.invest.placement.screens.edit.InvestOrderEditScreenContract$ModalStep.ScheduleSettings) r10
            com.revolut.kompot.navigable.vc.modal.a r9 = r9.f106922n0
            com.revolut.kompot.common.ModalDestination$Style$POPUP r0 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.v2(r9, r10, r0)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.L2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 251
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.M2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00f7, code lost:
    
        if (r6.invoke(r4) == r5) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0150, code lost:
    
        if (r2 != r5) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e r16, k4l.r0 r17, kotlin.jvm.functions.Function1 r18, gim.c r19) {
        /*
            Method dump skipped, instruction units count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.N2(com.revolut.trading.orders.ui.invest.placement.screens.edit.e, k4l.r0, kotlin.jvm.functions.Function1, gim.c):java.lang.Object");
    }

    public static n U2(e eVar) {
        return ((ael.k) eVar.f106928s).o(eVar.f106923o0, w4l.h.f294642c);
    }

    public static Flow Z2(e eVar) {
        eVar.getClass();
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return xam.a.h(new y0(eVar, (Continuation) null, 17), eVar.i3());
    }

    public static wkm.l a3(e eVar, q0 q0Var) {
        return vkm.q.Q(eVar.m0.B(new s(22)), new a32.b((Continuation) null, eVar, q0Var, 22));
    }

    @Override // yji.l
    public final void I1() {
        Flow flowI;
        final p pVar = this.j0;
        pVar.getClass();
        y stateHolder = this.m0;
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Flow flowB = stateHolder.B(new gs2.t(19));
        j2 j2Var = (j2) stateHolder.f22677a;
        final int i = 1;
        Continuation continuation = null;
        yji.l.a1(this, nim.a.v(zh9.u0.i(new vkm.t0(flowB, 1), stateHolder.B(new gs2.t(21)), new vkm.t0(stateHolder.B(new gs2.t(22)), 1)), new Function1() { // from class: gul.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                yhm.r rVar = (yhm.r) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        List list = (List) rVar.f314201a;
                        nel.n nVar = (nel.n) rVar.f314202b;
                        xi0.b bVar = (xi0.b) rVar.f314203c;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(pVar.b((aul.b) it8.next(), nVar, bVar));
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        return pVar.b((aul.b) rVar.f314201a, (nel.n) rVar.f314202b, (xi0.b) rVar.f314203c);
                    default:
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        aul.b bVar2 = (aul.b) rVar.f314201a;
                        nel.n nVar2 = (nel.n) rVar.f314202b;
                        xi0.b bVar3 = (xi0.b) rVar.f314203c;
                        return pVar.b(bVar2.a(), nVar2, bVar3);
                }
            }
        }), null, null, new t0(this, continuation, 15), 3);
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        final int i2 = 0;
        yji.l.a1(this, nim.a.v(zh9.u0.i(new vkm.t0(stateHolder.B(new gs2.t(26)), 1), stateHolder.B(new gs2.t(27)), new vkm.t0(stateHolder.B(new gs2.t(20)), 1)), new Function1() { // from class: gul.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                yhm.r rVar = (yhm.r) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        List list = (List) rVar.f314201a;
                        nel.n nVar = (nel.n) rVar.f314202b;
                        xi0.b bVar = (xi0.b) rVar.f314203c;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(pVar.b((aul.b) it8.next(), nVar, bVar));
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        return pVar.b((aul.b) rVar.f314201a, (nel.n) rVar.f314202b, (xi0.b) rVar.f314203c);
                    default:
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        aul.b bVar2 = (aul.b) rVar.f314201a;
                        nel.n nVar2 = (nel.n) rVar.f314202b;
                        xi0.b bVar3 = (xi0.b) rVar.f314203c;
                        return pVar.b(bVar2.a(), nVar2, bVar3);
                }
            }
        }), null, null, new t0(this, continuation, 3), 3);
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        final int i3 = 2;
        yji.l.a1(this, nim.a.v(zh9.u0.i(new vkm.t0(stateHolder.B(new gs2.t(23)), 1), stateHolder.B(new gs2.t(24)), new vkm.t0(stateHolder.B(new gs2.t(25)), 1)), new Function1() { // from class: gul.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                yhm.r rVar = (yhm.r) obj2;
                switch (i3) {
                    case 0:
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        List list = (List) rVar.f314201a;
                        nel.n nVar = (nel.n) rVar.f314202b;
                        xi0.b bVar = (xi0.b) rVar.f314203c;
                        List list2 = list;
                        ArrayList arrayList = new ArrayList(zhm.w.t(list2, 10));
                        Iterator it8 = list2.iterator();
                        while (it8.hasNext()) {
                            arrayList.add(pVar.b((aul.b) it8.next(), nVar, bVar));
                        }
                        return arrayList;
                    case 1:
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        return pVar.b((aul.b) rVar.f314201a, (nel.n) rVar.f314202b, (xi0.b) rVar.f314203c);
                    default:
                        Intrinsics.checkNotNullParameter(rVar, "<destruct>");
                        aul.b bVar2 = (aul.b) rVar.f314201a;
                        nel.n nVar2 = (nel.n) rVar.f314202b;
                        xi0.b bVar3 = (xi0.b) rVar.f314203c;
                        return pVar.b(bVar2.a(), nVar2, bVar3);
                }
            }
        }), null, null, new t0(this, continuation, 29), 3);
        yji.l.a1(this, com.revolut.data.database.models.openbanking.d.y("InvestOrderEditScreenModel", "collectInstrumentFlow", T2()), null, null, new t0(this, continuation, 18), 3);
        yji.l.a1(this, com.revolut.data.database.models.openbanking.d.x("InvestOrderEditScreenModel", "collectInstrumentTickerFlow", U2(this)), null, null, new t0(this, continuation, 16), 3);
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectTimeInForceFlow", i3()), null, null, new y0(this, continuation, 7), 3);
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectOrderLimitsFlow", xam.a.h(new t0(this, continuation, 25), i3())), null, null, new t0(this, continuation, 26), 3);
        k0 onEachInputValue = new k0(this, 2);
        k0 shouldBypassInputDebounce = new k0(this, 3);
        this.f0.getClass();
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Intrinsics.checkNotNullParameter(onEachInputValue, "onEachInputValue");
        Intrinsics.checkNotNullParameter(shouldBypassInputDebounce, "shouldBypassInputDebounce");
        yji.l.a1(this, boh.f.e(vkm.q.q(new cbh.f(t1.e(new vkm.q0(vkm.q.q(new g4b.a0(stateHolder.B(new gul.f(1)), 12)), new gul.n(onEachInputValue, continuation, 0), 1), new gmk.j(shouldBypassInputDebounce, 21)), 1)), new gmk.j(stateHolder, 22)), null, null, new t0(this, continuation, 14), 3);
        g gVar = this.f106919e0;
        gVar.getClass();
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        Flow flowB2 = stateHolder.B(new gs2.t(28));
        Flow flowB3 = stateHolder.B(new gs2.t(29));
        Flow flowB4 = stateHolder.B(new gul.f(0));
        if (((jte.d) gVar.f146987b).c(TradingOrdersApi$Toggles.TradingFlexibleCurrency.f106796c)) {
            flowI = new v1(new gsh.w(gVar, continuation, 6));
        } else {
            Optional optionalEmpty = Optional.empty();
            Intrinsics.checkNotNullExpressionValue(optionalEmpty, "empty(...)");
            flowI = zi0.c.i(optionalEmpty);
        }
        yji.l.a1(this, nim.a.u(new d4f.m(2, 23, continuation), zh9.u0.m(zh9.u0.i(flowB2, flowB3, flowB4), flowI)), null, null, new t0(this, continuation, 9), 3);
        yji.l.a1(this, vkm.q.q(nim.a.v(zh9.u0.i(stateHolder.B(new s(24)), new vkm.t0(stateHolder.B(new s(25)), 1), new vkm.t0(stateHolder.B(new s(26)), 1)), new s(27))), null, null, new y0(this, continuation, 4), 3);
        w wVar = this.f106933x;
        wVar.getClass();
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectOrderQuoteParamsFlow", xam.a.h(new f23.y(stateHolder, wVar, continuation, 15), vkm.q.q(nim.a.v(stateHolder.B(new gul.f(4)), new gul.f(5))))), null, null, new t0(this, continuation, 27), 3);
        w4l.i loadingStrategy = w4l.i.f294643c;
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectSecurityBalanceFlow", b3(loadingStrategy)), null, null, new y0(this, continuation, 3), 3);
        b0 b0Var = this.L;
        b0Var.getClass();
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectSecurityBalanceDisplayFlow", (((jte.d) b0Var.f146979c).c(TradingOrdersApi$Toggles.StocksSellFlowImprovements.f106795c) && ((cul.v) j2Var.getValue()).f109175a == bfl.g.SELL) ? vkm.q.q(boh.f.e(new vkm.t0(stateHolder.B(new gul.f(15)), 1), new gqd.s(b0Var, stateHolder, 22))) : b0Var.a(stateHolder)), null, null, new y0(this, continuation, 2), 3);
        ybl.l lVar = this.f106926r;
        yji.l.a1(this, com.revolut.data.database.models.openbanking.d.x("InvestOrderEditScreenModel", "collectTradingLegalEntityInformationFlow", ybl.l.d(lVar)), null, null, new y0(this, continuation, 8), 3);
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectSourcePocketWrapperTillFinish", xam.a.h(new y0(this, continuation, 21), v7.y("InvestOrderEditScreenModel", "sourcePocketFlow", vkm.q.q(vkm.q.Q(stateHolder.B(new l0(1)), new bw4.s(continuation, te0.w.y0(new j0(this, 4)), 28)))))), null, null, new y0(this, continuation, 5), 3);
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectIsBalanceSwitchAllowedTillFinish", vkm.q.q(nim.a.v(Z2(this), new s(21)))), null, null, new t0(this, continuation, 21), 3);
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectAvailableInputModesFlow", O2()), null, null, new t0(this, continuation, 2), 3);
        yji.l.a1(this, mo3.a.g(v7.y("InvestOrderEditScreenModel", "collectDefaultInputModeFlow", vkm.q.q(vkm.q.Q(stateHolder.B(new s(23)), new cul.u0(continuation, this, 1)))), null, new ct6.o(9), 1), null, null, new t0(this, continuation, 7), 3);
        int i5 = 4;
        yji.l.a1(this, com.revolut.data.database.models.openbanking.d.x("InvestOrderEditScreenModel", "collectAvailableOrderTypesFlow", nim.a.v(xam.a.h(new t0(this, continuation, i5), X2()), new k0(this, i5))), null, null, new t0(this, continuation, 5), 3);
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectExtendedHoursStatusFlow", Q2()), null, null, new t0(this, continuation, 10), 3);
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectDefaultOrderExpiryFlow", P2()), null, null, new t0(this, continuation, 8), 3);
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectDefaultFrequencySettings", xam.a.h(new a2g.q(this, continuation, 8), xam.a.h(new y0(this, continuation, 16), X2()))), null, null, new t0(this, continuation, 6), 3);
        yji.l.a1(this, v7.y("InvestOrderEditScreenModel", "collectIsRecurringBuysFeatureEnabledFlow", xam.a.h(new y0(this, continuation, 16), X2())), null, null, new t0(this, continuation, 23), 3);
        yji.l.a1(this, com.revolut.data.database.models.openbanking.d.y("InvestOrderEditScreenModel", "collectStocksConfigFlow", rd0.e.b(ybl.l.c(lVar, false, 3))), null, null, new y0(this, continuation, 6), 3);
        Data autoTopUpStatus = ((cul.v) j2Var.getValue()).z;
        kvl.a0 a0Var = (kvl.a0) this.W;
        a0Var.getClass();
        Intrinsics.checkNotNullParameter(autoTopUpStatus, "autoTopUpStatus");
        a0Var.h3((AutoTopUpStatus) autoTopUpStatus.getContent());
        yji.l.a1(this, prk.o.w("InvestOrderEditScreenModel", "autoTopUpStatusFlow", vkm.q.Q(stateHolder.B(new s(13)), new cul.u0(continuation, this, 0))), null, null, new t0(this, continuation, 1), 3);
        yji.l.a1(this, xam.a.h(new t0(this, continuation, 19), T2()), null, null, new t0(this, continuation, 20), 3);
        yji.l.a1(this, xam.a.h(new aee.g(2, this.l0, s0.class, "keyboardSuggestionsFlow", "keyboardSuggestionsFlow(Lcom/revolut/trading/orders/domain/model/TradingOrderKeyboardSuggestionsRequest;)Lkotlinx/coroutines/flow/Flow;", 4, 29), W2()), null, null, new t0(this, continuation, 24), 3);
        l2(new j1(this, continuation, 0), new yi5.b(26));
        l2(new j1(this, continuation, 16), new k0(this, 7));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.f106922n0;
    }

    public final Flow O2() {
        return vkm.q.q(nim.a.v(zh9.u0.m(Z2(this), this.m0.B(new s(18))), new k0(this, 5)));
    }

    public final Flow P2() {
        return vkm.q.q(nim.a.v(zh9.u0.i(U2(this), this.m0.B(new s(20)), this.F.a()), new k0(this, 1)));
    }

    public final Flow Q2() {
        Continuation continuation = null;
        Flow flowH = xam.a.h(new y0(this, continuation, 15), X2());
        w4l.h loadingStrategy = w4l.h.f294642c;
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        vrl.e eVar = (vrl.e) this.f106925q;
        eVar.getClass();
        UUID tradingAccountId = this.p0;
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Intrinsics.checkNotNullParameter(tradingAccountId, "tradingAccountId");
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        Flow flowQ = vkm.q.q(nim.a.v(xam.a.h(new u29.c(eVar, loadingStrategy, continuation, 21), vkm.q.q(nim.a.v(eVar.e(tradingAccountId, loadingStrategy), new vq0.g(14)))), new l0(12)));
        s sVar = new s(15);
        y yVar = this.m0;
        Flow flowB = yVar.B(sVar);
        return vkm.q.q(nim.a.u(new y0(continuation, this, 11), zh9.u0.m(zh9.u0.i(flowH, flowQ, flowB), yVar.B(new s(16)))));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R2(gim.c r11) {
        /*
            Method dump skipped, instruction units count: 279
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.R2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object S2(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof cul.g1
            if (r0 == 0) goto L13
            r0 = r9
            cul.g1 r0 = (cul.g1) r0
            int r1 = r0.f109111y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109111y = r1
            goto L18
        L13:
            cul.g1 r0 = new cul.g1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f109109w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109111y
            cli.y r3 = r8.m0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 != r4) goto L2d
            kotlin.jvm.internal.Ref$ObjectRef r1 = r0.v
            kotlin.jvm.internal.Ref$ObjectRef r0 = r0.u
            yhm.o.b(r9)
            goto L70
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            kotlin.jvm.internal.Ref$ObjectRef r9 = p.a.w(r9)
            java.lang.Object r2 = r3.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            cul.v r2 = (cul.v) r2
            java.lang.Boolean r2 = r2.E
            r9.f186409a = r2
            if (r2 != 0) goto L7b
            akg.n r2 = U2(r8)
            cie.l1 r5 = new cie.l1
            r6 = 13
            r5.<init>(r6)
            ct6.o r6 = new ct6.o
            r7 = 12
            r6.<init>(r7)
            r7 = 2
            jhi.b r2 = mo3.a.h(r2, r5, r6, r7)
            r0.u = r9
            r0.v = r9
            r0.f109111y = r4
            java.lang.Object r0 = vkm.q.x(r2, r0)
            if (r0 != r1) goto L6d
            return r1
        L6d:
            r1 = r9
            r9 = r0
            r0 = r1
        L70:
            r1.f186409a = r9
            b79.i r9 = new b79.i
            r1 = 2
            r9.<init>(r0, r1)
            r8.H2(r3, r9)
        L7b:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.S2(gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, ((ael.k) this.f106928s).p(this.f106923o0, w4l.i.f294643c, n9l.b.SEC_3.a()), null, new t0(this, continuation, 17), 3);
        wtl.e eVar = this.u;
        yji.l.b1(this, rd0.e.n(eVar.c3(), zhm.y0.b(new Pair("InvestOrderEditScreenModel", "collectProcessedInputAmountTillHide"))), null, new y0(this, continuation, 1), 3);
        yji.l.b1(this, rd0.e.n(eVar.b3(), zhm.y0.b(new Pair("InvestOrderEditScreenModel", "collectOrderQuoteResultTillHide"))), null, new t0(this, continuation, 28), 3);
        r10.d dVar = this.g0;
        dVar.getClass();
        y stateHolder = this.m0;
        Intrinsics.checkNotNullParameter(stateHolder, "stateHolder");
        yji.l.b1(this, mo3.a.e(boh.f.e(zh9.u0.i(stateHolder.B(new gul.f(11)), stateHolder.B(new gul.f(12)), nim.a.v(stateHolder.B(new gul.f(13)), new gul.f(14))), new gmk.j(dVar, 23)), new fb.c(dVar, stateHolder, 9), new gug.c(4)), null, new y0(this, continuation, 0), 3);
        yji.l.b1(this, xam.a.h(new y0(this, continuation, 12), vkm.q.q(nim.a.v(new vkm.t0(stateHolder.B(new s(28)), 1), new s(29)))), null, new t0(this, continuation, 11), 3);
        yji.l.b1(this, rd0.e.n(eVar.Z2(), zhm.h0.f322473a), null, new t0(this, continuation, 12), 3);
        yji.l.b1(this, v7.y("InvestOrderEditScreenModel", "collectValidationErrorsFlow", l3()), null, new y0(this, continuation, 9), 3);
        int i = 13;
        yji.l.b1(this, v7.y("InvestOrderEditScreenModel", "collectFieldAttributeFlow", xam.a.h(new y0(this, continuation, i), zh9.u0.m(new vkm.t0(stateHolder.B(new l0(19)), 1), stateHolder.B(new l0(24))))), null, new t0(this, continuation, i), 3);
        yji.l.b1(this, rd0.e.n(zi0.c.w(V2()), zhm.y0.b(new Pair("InvestOrderEditScreenModel", "collectIsOrderValidFlow"))), null, new t0(this, continuation, 22), 3);
    }

    public final vkm.d T2() {
        return rd0.e.b(((ael.k) this.f106928s).f(this.f106923o0));
    }

    public final Flow V2() {
        return vkm.q.q(vkm.q.Q(vkm.q.s(this.m0.B(new s(17)), new s(19), vkm.q.f290100b), new cul.u0(null, this, 5)));
    }

    public final jhi.k W2() {
        Flow flowE = ((vrl.e) this.f106925q).e(this.p0, w4l.h.f294642c);
        l0 l0Var = new l0(2);
        y yVar = this.m0;
        return nim.a.u(new a2c.c(2, 27, null), zh9.u0.i(zh9.u0.i(flowE, yVar.B(l0Var), yVar.B(new l0(3))), zh9.u0.i(yVar.B(new l0(4)), yVar.B(new l0(5)), new vkm.t0(yVar.B(new l0(6)), 1)), zh9.u0.m(new vkm.t0(yVar.B(new l0(7)), 1), Z2(this))));
    }

    public final Flow X2() {
        int i = 1;
        return vkm.q.q(new cqh.m(new vkm.t0(this.m0.B(new l0(0)), i), this, i));
    }

    public final void Y2() {
        y yVar = this.m0;
        nel.n nVar = (nel.n) ((cul.v) ((j2) yVar.f22677a).getValue()).H.getContent();
        if (nVar != null) {
            Data data = ((cul.v) ((j2) yVar.f22677a).getValue()).K;
            h.v2(this.f106922n0, new InvestOrderEditScreenContract$ModalStep.BalanceBreakdown(nVar, data != null ? (k4l.e0) data.getContent() : null), ModalDestination.Style.BOTTOM_DIALOG.f98301a);
        }
    }

    public final Flow b3(w4l.k loadingStrategy) {
        Intrinsics.checkNotNullParameter(loadingStrategy, "loadingStrategy");
        return vkm.q.q(xam.a.h(new y0(this, (Continuation) null, 18), ((vrl.e) this.f106925q).d(this.p0, this.f106923o0, loadingStrategy)));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof cul.v1
            if (r0 == 0) goto L13
            r0 = r6
            cul.v1 r0 = (cul.v1) r0
            int r1 = r0.f109193w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109193w = r1
            goto L18
        L13:
            cul.v1 r0 = new cul.v1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109193w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L58
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            vrl.a r6 = r5.N
            prl.b r6 = r6.f291614a
            r6.getClass()
            nc0.a r2 = new nc0.a
            r4 = 12
            r2.<init>(r6, r4)
            ufm.c r6 = new ufm.c
            r4 = 2
            r6.<init>(r2, r4)
            java.lang.String r2 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            ufm.n r6 = te0.w.i0(r6)
            r0.f109193w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            aqd.n1 r0 = new aqd.n1
            r1 = 3
            r0.<init>(r1, r6)
            cli.y r6 = r5.m0
            r5.H2(r6, r0)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.c3(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(k4l.r0 r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof cul.w1
            if (r0 == 0) goto L13
            r0 = r7
            cul.w1 r0 = (cul.w1) r0
            int r1 = r0.f109198x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109198x = r1
            goto L18
        L13:
            cul.w1 r0 = new cul.w1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109198x
            cli.y r3 = r5.m0
            r4 = 1
            if (r2 == 0) goto L33
            if (r2 != r4) goto L2b
            k4l.r0 r6 = r0.u
            yhm.o.b(r7)
            goto L52
        L2b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L33:
            yhm.o.b(r7)
            java.lang.Object r7 = r3.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            cul.v r7 = (cul.v) r7
            k4l.r0 r7 = r7.f109176b
            if (r7 != r6) goto L47
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L47:
            r0.u = r6
            r0.f109198x = r4
            java.lang.Object r7 = r5.c3(r0)
            if (r7 != r1) goto L52
            return r1
        L52:
            kvl.b r7 = r5.W
            kvl.a0 r7 = (kvl.a0) r7
            vkm.j2 r7 = r7.f190161s
            r0 = 0
            r7.setValue(r0)
            cul.n0 r7 = new cul.n0
            r1 = 0
            r7.<init>(r6, r1)
            r5.H2(r3, r7)
            cn0.d r6 = new cn0.d
            r7 = 17
            r6.<init>(r5, r0, r0, r7)
            whi.b r7 = new whi.b
            r0 = 6
            r7.<init>(r0)
            r5.n2(r6, r7)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.d3(k4l.r0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00be, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00d5, code lost:
    
        if (r12 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(qvl.a r11, gim.c r12) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.e3(qvl.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x009f, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d9, code lost:
    
        if (r8 == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(gim.c r8) {
        /*
            Method dump skipped, instruction units count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.f3(gim.c):java.lang.Object");
    }

    public final Object g3(gim.i iVar) {
        Object objB0 = zh9.u0.b0(X(), "NEXT_BUTTON_LOADING_TAG", new a5k.n(this, null), iVar);
        return objB0 == fim.a.COROUTINE_SUSPENDED ? objB0 : Unit.f186387a;
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.m0;
    }

    public final void h3(r0 r0Var, boolean z) {
        y yVar = this.m0;
        bfl.g gVar = ((cul.v) ((j2) yVar.f22677a).getValue()).f109175a;
        j2 j2Var = (j2) yVar.f22677a;
        r0 r0Var2 = ((cul.v) j2Var.getValue()).f109176b;
        Amount amount = ((cul.v) j2Var.getValue()).f109181l;
        if (r0Var2 != r0Var) {
            amount = null;
        }
        h.v2(this.f106922n0, new InvestOrderEditScreenContract$ModalStep.TargetPrice(gVar, r0Var, amount, z), ModalDestination.Style.POPUP.f98311a);
    }

    public final Flow i3() {
        return vkm.q.q(vkm.q.Q(this.m0.B(new s(14)), new cul.u0(null, this, 6)));
    }

    public final void j3(Amount amount) {
        aul.b bVar;
        int i = cul.q0.f109159b[amount.f104718b.f104719a.ordinal()];
        if (i == 1) {
            bVar = aul.b.SECURITY;
        } else {
            if (i != 2 && i != 3 && i != 4) {
                if (i == 5) {
                    throw new IllegalArgumentException();
                }
                throw new NoWhenBranchMatchedException();
            }
            bVar = aul.b.FIAT;
        }
        y yVar = this.m0;
        Data data = ((cul.v) ((j2) yVar.f22677a).getValue()).f109184p;
        List list = data != null ? (List) data.getContent() : null;
        if (list == null) {
            list = f0.f322471a;
        }
        if (list.contains(bVar)) {
            H2(yVar, new cui.v(bVar, amount, 1));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k3(int r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof cul.m2
            if (r0 == 0) goto L13
            r0 = r8
            cul.m2 r0 = (cul.m2) r0
            int r1 = r0.f109139x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f109139x = r1
            goto L18
        L13:
            cul.m2 r0 = new cul.m2
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f109139x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            int r7 = r0.u
            yhm.o.b(r8)
            goto L63
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            yhm.o.b(r8)
            w4l.h r8 = w4l.h.f294642c
            kotlinx.coroutines.flow.Flow r8 = r6.b3(r8)
            kotlinx.coroutines.flow.Flow r2 = Z2(r6)
            cul.k0 r4 = new cul.k0
            r5 = 6
            r4.<init>(r6, r5)
            kotlinx.coroutines.flow.Flow r2 = c6d.b.i(r2, r4)
            t38.e r8 = zh9.u0.m(r8, r2)
            ct6.o r2 = new ct6.o
            r4 = 10
            r2.<init>(r4)
            r4 = 0
            jhi.b r8 = mo3.a.g(r8, r4, r2, r3)
            r0.u = r7
            r0.f109139x = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L63
            return r1
        L63:
            kotlin.Pair r8 = (kotlin.Pair) r8
            java.lang.Object r0 = r8.f186385a
            com.revolut.shared.feature.market_data.models.domain.models.Amount r0 = (com.revolut.shared.feature.market_data.models.domain.models.Amount) r0
            java.lang.Object r8 = r8.f186386b
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r1 = 100
            if (r7 != r1) goto L78
            java.math.BigDecimal r7 = r0.f104717a
            goto L96
        L78:
            java.math.BigDecimal r2 = r0.f104717a
            long r3 = (long) r7
            java.math.BigDecimal r7 = java.math.BigDecimal.valueOf(r3)
            java.lang.String r3 = "valueOf(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r3)
            java.math.BigDecimal r7 = r2.multiply(r7)
            long r1 = (long) r1
            java.math.BigDecimal r1 = java.math.BigDecimal.valueOf(r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            java.math.RoundingMode r2 = java.math.RoundingMode.DOWN
            java.math.BigDecimal r7 = r7.divide(r1, r8, r2)
        L96:
            kotlin.jvm.internal.Intrinsics.h(r7)
            com.revolut.shared.feature.market_data.models.domain.models.Amount r7 = com.revolut.shared.feature.market_data.models.domain.models.Amount.a(r0, r7)
            r6.j3(r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.trading.orders.ui.invest.placement.screens.edit.e.k3(int, gim.c):java.lang.Object");
    }

    public final Flow l3() {
        return xam.a.h(new y0(this, (Continuation) null, 22), new vkm.t0(this.m0.B(new s(12)), 1));
    }
}

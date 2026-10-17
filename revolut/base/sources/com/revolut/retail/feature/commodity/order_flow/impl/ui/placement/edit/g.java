package com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit;

import b7j.j;
import cie.l1;
import cli.y;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.commodity.order_flow.api.CommodityOrderFlowApi$Toggles$CommodityOrderKeyboardSuggestions;
import com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig;
import cu8.r0;
import cvi.i;
import czc.d0;
import d7j.a2;
import d7j.b2;
import d7j.c1;
import d7j.g0;
import d7j.h0;
import d7j.o0;
import d7j.p0;
import d7j.q0;
import d7j.w0;
import d7j.x;
import d7j.x0;
import d7j.y0;
import efm.r;
import fmc.z;
import ip0.v7;
import java.util.Set;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import oki.h;
import te0.w;
import tzg.m;
import vkm.q;
import vkm.t0;
import wsg.n;
import yji.l;
import zh9.u0;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final class g extends h implements h0 {
    public final o7.b A;
    public final vo9.a B;
    public final a2 C;
    public final ybl.d D;
    public final ppk.f E;
    public final l6j.b F;
    public final ang.f G;
    public final n H;
    public final m I;
    public final u6j.c J;
    public final fuk.a K;
    public final g7j.g L;
    public final z M;
    public final CommodityOrderEditScreenContract$InputData N;
    public final boolean O;
    public final hlm.c P;
    public final vii.c Q;
    public final Object R;
    public final com.revolut.kompot.navigable.vc.modal.a S;
    public final y T;
    public final l4i.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final w80.b f99860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final g7j.b f99861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final dkf.a f99862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f99863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final g7j.e f99864t;
    public final com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits.a u;
    public final l2j.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final b7j.b f99865w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final n60.a f99866x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r0 f99867y;
    public final b2 z;

    public g(l4i.a amountConverter, w80.b amountFormatter, g7j.b allowedAssetsProvider, dkf.a orderTypesProvider, j counterCurrencyProvider, g7j.e counterCurrencyPickerStepProvider, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.limits.a cryptoHintDialogMapper, l2j.a currencyChooserFlowFactory, b7j.b draftMutator, gte.a featureToggleInteractor, n60.a keyboardControllerExtension, r0 kycRequiredActionTransformer, b2 orderDraftInitializer, o7.b orderQuoteInteractor, vo9.a pocketMapper, a2 popUpKeyResolver, ybl.d portfolioInteractor, ppk.f ratesInteractor, l6j.b flowSettingsInteractor, ang.f userInteractor, n walletInteractor, m wealthAccountsInteractor, u6j.c commodityOrderKeyboardSuggestionsInteractor, fuk.a recurringBuySettingsProvider, g7j.g scheduleSettingsStepProvider, z scaPromptLegalEntityIdProvider, CommodityOrderEditScreenContract$InputData inputData, x saveStateDelegate, cli.n stateMapper) {
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(amountFormatter, "amountFormatter");
        Intrinsics.checkNotNullParameter(allowedAssetsProvider, "allowedAssetsProvider");
        Intrinsics.checkNotNullParameter(orderTypesProvider, "orderTypesProvider");
        Intrinsics.checkNotNullParameter(counterCurrencyProvider, "counterCurrencyProvider");
        Intrinsics.checkNotNullParameter(counterCurrencyPickerStepProvider, "counterCurrencyPickerStepProvider");
        Intrinsics.checkNotNullParameter(cryptoHintDialogMapper, "cryptoHintDialogMapper");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(draftMutator, "draftMutator");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(orderDraftInitializer, "orderDraftInitializer");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(pocketMapper, "pocketMapper");
        Intrinsics.checkNotNullParameter(popUpKeyResolver, "popUpKeyResolver");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(ratesInteractor, "ratesInteractor");
        Intrinsics.checkNotNullParameter(flowSettingsInteractor, "flowSettingsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(commodityOrderKeyboardSuggestionsInteractor, "commodityOrderKeyboardSuggestionsInteractor");
        Intrinsics.checkNotNullParameter(recurringBuySettingsProvider, "recurringBuySettingsProvider");
        Intrinsics.checkNotNullParameter(scheduleSettingsStepProvider, "scheduleSettingsStepProvider");
        Intrinsics.checkNotNullParameter(scaPromptLegalEntityIdProvider, "scaPromptLegalEntityIdProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(saveStateDelegate, "saveStateDelegate");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = amountConverter;
        this.f99860p = amountFormatter;
        this.f99861q = allowedAssetsProvider;
        this.f99862r = orderTypesProvider;
        this.f99863s = counterCurrencyProvider;
        this.f99864t = counterCurrencyPickerStepProvider;
        this.u = cryptoHintDialogMapper;
        this.v = currencyChooserFlowFactory;
        this.f99865w = draftMutator;
        this.f99866x = keyboardControllerExtension;
        this.f99867y = kycRequiredActionTransformer;
        this.z = orderDraftInitializer;
        this.A = orderQuoteInteractor;
        this.B = pocketMapper;
        this.C = popUpKeyResolver;
        this.D = portfolioInteractor;
        this.E = ratesInteractor;
        this.F = flowSettingsInteractor;
        this.G = userInteractor;
        this.H = walletInteractor;
        this.I = wealthAccountsInteractor;
        this.J = commodityOrderKeyboardSuggestionsInteractor;
        this.K = recurringBuySettingsProvider;
        this.L = scheduleSettingsStepProvider;
        this.M = scaPromptLegalEntityIdProvider;
        this.N = inputData;
        this.O = ((jte.d) featureToggleInteractor).c(CommodityOrderFlowApi$Toggles$CommodityOrderKeyboardSuggestions.f99800c);
        this.P = hlm.d.a();
        this.Q = new vii.c();
        this.R = w.y0(new d0(25));
        this.S = hx7.e.a(this, new cwj.h(this, 13));
        this.T = mra.d.b(this, new d7j.w(0), stateMapper, saveStateDelegate, false, 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0064, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof d7j.e1
            if (r0 == 0) goto L13
            r0 = r6
            d7j.e1 r0 = (d7j.e1) r0
            int r1 = r0.f111992w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111992w = r1
            goto L18
        L13:
            d7j.e1 r0 = new d7j.e1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111992w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L67
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            yhm.o.b(r6)
            goto L49
        L36:
            yhm.o.b(r6)
            ang.f r6 = r5.G
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.f111992w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L49
            goto L66
        L49:
            do3.n r6 = (do3.n) r6
            kotlin.jvm.internal.Intrinsics.h(r6)
            wi0.a r2 = wi0.b.Companion
            r2.getClass()
            wi0.b r2 = wi0.b.f297756l
            boolean r6 = te0.w.S(r6, r2)
            if (r6 != 0) goto L5c
            goto L7a
        L5c:
            cu8.r0 r5 = r5.f99867y
            r0.f111992w = r3
            java.lang.Object r6 = ks8.m.b(r5, r0)
            if (r6 != r1) goto L67
        L66:
            return r1
        L67:
            ks8.j r6 = (ks8.j) r6
            boolean r5 = r6 instanceof ks8.i
            if (r5 == 0) goto L76
            ks8.i r6 = (ks8.i) r6
            com.revolut.retail.core.navigation.FeatureCommand r5 = r6.f189312a
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r5)
            return r5
        L76:
            boolean r5 = r6 instanceof ks8.j.a
            if (r5 == 0) goto L7c
        L7a:
            r5 = 0
            return r5
        L7c:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.I2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g r7, gim.c r8) {
        /*
            cli.y r0 = r7.T
            boolean r1 = r8 instanceof d7j.l1
            if (r1 == 0) goto L15
            r1 = r8
            d7j.l1 r1 = (d7j.l1) r1
            int r2 = r1.f112022w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f112022w = r2
            goto L1a
        L15:
            d7j.l1 r1 = new d7j.l1
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f112022w
            r4 = 1
            if (r3 == 0) goto L32
            if (r3 != r4) goto L2a
            yhm.o.b(r8)
            goto L91
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            java.lang.Object r8 = r0.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            d7j.w r8 = (d7j.w) r8
            java.util.Set r8 = r8.f112069c
            if (r8 != 0) goto L9d
            dkf.a r8 = r7.f99862r
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$InputData r3 = r7.N
            com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig r3 = r3.f99825a
            r1.f112022w = r4
            r8.getClass()
            m6j.a r1 = r3.f99805a
            m6j.a r5 = m6j.a.BUY
            r6 = 0
            if (r1 != r5) goto L57
            r1 = r4
            goto L58
        L57:
            r1 = r6
        L58:
            java.util.Set r3 = r3.e
            l6j.c r5 = l6j.c.TRADING_HOLDING
            boolean r3 = r3.contains(r5)
            gte.a r8 = r8.f115504a
            com.revolut.retail.feature.commodity.order_flow.api.CommodityOrderFlowApi$Toggles$CommodityRecurringBuys r5 = com.revolut.retail.feature.commodity.order_flow.api.CommodityOrderFlowApi$Toggles$CommodityRecurringBuys.f99801c
            jte.d r8 = (jte.d) r8
            boolean r8 = r8.c(r5)
            if (r8 == 0) goto L71
            if (r1 == 0) goto L71
            if (r3 != 0) goto L71
            goto L72
        L71:
            r4 = r6
        L72:
            wd6.h r8 = wd6.h.MARKET
            wd6.h r1 = wd6.h.RECURRING
            r5 = 0
            if (r4 == 0) goto L7a
            goto L7b
        L7a:
            r1 = r5
        L7b:
            wd6.h r4 = wd6.h.STOP
            if (r3 != 0) goto L80
            goto L81
        L80:
            r4 = r5
        L81:
            wd6.h r6 = wd6.h.LIMIT
            if (r3 != 0) goto L86
            r5 = r6
        L86:
            wd6.h[] r8 = new wd6.h[]{r8, r1, r4, r5}
            java.util.Set r8 = zhm.z0.i(r8)
            if (r8 != r2) goto L91
            return r2
        L91:
            java.util.Set r8 = (java.util.Set) r8
            a83.d0 r1 = new a83.d0
            r2 = 12
            r1.<init>(r2, r8)
            r7.H2(r0, r1)
        L9d:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.J2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0075, code lost:
    
        if (r8 == r2) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g r7, gim.c r8) {
        /*
            cli.y r0 = r7.T
            boolean r1 = r8 instanceof d7j.m1
            if (r1 == 0) goto L15
            r1 = r8
            d7j.m1 r1 = (d7j.m1) r1
            int r2 = r1.f112028w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f112028w = r2
            goto L1a
        L15:
            d7j.m1 r1 = new d7j.m1
            r1.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f112028w
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L38
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r8)
            goto L78
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            yhm.o.b(r8)
            goto L65
        L38:
            yhm.o.b(r8)
            java.lang.Object r8 = r0.f22677a
            vkm.j2 r8 = (vkm.j2) r8
            java.lang.Object r8 = r8.getValue()
            d7j.w r8 = (d7j.w) r8
            d7j.d0 r8 = r8.f112070g
            boolean r8 = r8 instanceof d7j.e0
            if (r8 != 0) goto L83
            d6j.b r8 = new d6j.b
            r3 = 25
            r8.<init>(r3)
            kotlinx.coroutines.flow.Flow r8 = r0.B(r8)
            vkm.t0 r3 = new vkm.t0
            r6 = 1
            r3.<init>(r8, r6)
            r1.f112028w = r5
            java.lang.Object r8 = vkm.q.x(r3, r1)
            if (r8 != r2) goto L65
            goto L77
        L65:
            java.util.Set r8 = (java.util.Set) r8
            d7j.b2 r3 = r7.z
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$InputData r5 = r7.N
            com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig r5 = r5.f99825a
            r1.f112028w = r4
            d7j.f r3 = (d7j.f) r3
            java.lang.Object r8 = r3.d(r5, r8, r1)
            if (r8 != r2) goto L78
        L77:
            return r2
        L78:
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r8 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft) r8
            d7j.n0 r1 = new d7j.n0
            r2 = 0
            r1.<init>(r8, r2)
            r7.H2(r0, r1)
        L83:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.K2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g r5, java.lang.String r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof d7j.q1
            if (r0 == 0) goto L13
            r0 = r7
            d7j.q1 r0 = (d7j.q1) r0
            int r1 = r0.f112044w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112044w = r1
            goto L18
        L13:
            d7j.q1 r0 = new d7j.q1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112044w
            com.revolut.core.model.account.AccountId$Personal r3 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r4 = 1
            if (r2 == 0) goto L31
            if (r2 != r4) goto L29
            yhm.o.b(r7)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            wsg.n r7 = r5.H
            efm.d0 r6 = r7.z(r3, r6)
            r0.f112044w = r4
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            io3.d r7 = (io3.d) r7
            vo9.a r5 = r5.B
            kotlin.jvm.internal.Intrinsics.h(r7)
            r6 = 4
            kotlinx.coroutines.flow.Flow r5 = vo9.a.a(r5, r7, r3, r6)
            d7j.p1 r6 = new d7j.p1
            r0 = 0
            r6.<init>(r5, r7, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.L2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object M2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g r9, gim.c r10) {
        /*
            boolean r0 = r10 instanceof d7j.x1
            if (r0 == 0) goto L13
            r0 = r10
            d7j.x1 r0 = (d7j.x1) r0
            int r1 = r0.f112077w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112077w = r1
            goto L18
        L13:
            d7j.x1 r0 = new d7j.x1
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112077w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L4e
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            cli.y r10 = r9.T
            d6j.b r2 = new d6j.b
            r4 = 23
            r2.<init>(r4)
            kotlinx.coroutines.flow.Flow r10 = r10.B(r2)
            vkm.t0 r2 = new vkm.t0
            r4 = 1
            r2.<init>(r10, r4)
            r0.f112077w = r3
            java.lang.Object r10 = vkm.q.x(r2, r0)
            if (r10 != r1) goto L4e
            return r1
        L4e:
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.RecurringBuySettings r10 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.RecurringBuySettings) r10
            com.revolut.kompot.navigable.vc.modal.a r0 = r9.S
            g7j.g r9 = r9.L
            java.time.LocalDate r2 = r10.f99906a
            sel.a r7 = r10.f99907b
            r9.getClass()
            java.lang.String r10 = "startDate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r10)
            java.lang.String r10 = "period"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r10)
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep$ScheduleSettings r1 = new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep$ScheduleSettings
            l80.e r9 = r9.f141210a
            l80.f r9 = (l80.f) r9
            java.time.LocalDate r3 = r9.e()
            zhm.f0 r6 = zhm.f0.f322471a
            kotlin.enums.EnumEntries r9 = sel.a.a()
            java.util.List r8 = zhm.d0.d1(r9)
            r4 = 0
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r9 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            oki.h.v2(r0, r1, r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.M2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0115, code lost:
    
        if (r9 == r1) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0127, code lost:
    
        if (r9.O2(r11, r0) == r1) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object N2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g r9, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep.SelectOrderType r10, wd6.h r11, gim.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.N2(com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g, com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep$SelectOrderType, wd6.h, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        l.a1(this, q.P(q.Q(this.Q.a(g0.START_DRAFT_INITIALIZATION, w4l.h.f294642c), new y0(3, this, continuation)), 1), null, null, null, 7);
        d6j.b bVar = new d6j.b(21);
        y yVar = this.T;
        l.a1(this, q.Q(q.q(yh5.b.d(new t0(yVar.B(bVar), 1), new t0(yVar.B(new d6j.b(22)), 1))), new y0(0, this, continuation)), null, null, new x0(1, this, continuation), 3);
        l.a1(this, new w0(new t0(yVar.B(new d6j.b(28)), 1), this, 0), null, null, new x0(0, this, continuation), 3);
        int i = 1;
        l.a1(this, q.q(new w0(new t0(yVar.B(new d6j.b(29)), i), this, i)), null, null, new x0(4, this, continuation), 3);
        if (this.O) {
            l.a1(this, q.Q(v7.w(yVar.B(new d6j.b(26))), new i(continuation, this.J, 13)), null, null, new x0(5, this, continuation), 3);
        }
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.S;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object O2(wd6.h r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof d7j.y1
            if (r0 == 0) goto L13
            r0 = r10
            d7j.y1 r0 = (d7j.y1) r0
            int r1 = r0.f112083x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112083x = r1
            goto L18
        L13:
            d7j.y1 r0 = new d7j.y1
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f112083x
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            wd6.h r9 = r0.u
            yhm.o.b(r10)
        L28:
            r4 = r9
            goto L52
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L32:
            yhm.o.b(r10)
            d7j.p0 r10 = new d7j.p0
            r2 = 1
            r10.<init>(r2)
            cli.y r2 = r8.T
            kotlinx.coroutines.flow.Flow r10 = r2.B(r10)
            vkm.t0 r2 = new vkm.t0
            r4 = 1
            r2.<init>(r10, r4)
            r0.u = r9
            r0.f112083x = r3
            java.lang.Object r10 = vkm.q.x(r2, r0)
            if (r10 != r1) goto L28
            return r1
        L52:
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r10 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft) r10
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep$TargetPrice r2 = new com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.CommodityOrderEditScreenContract$ModalStep$TargetPrice
            java.math.BigDecimal r3 = r10.f99891l
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails r9 = r10.f99885a
            xi0.b r5 = r9.f99903a
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.MoneyDetails r9 = r10.f99886b
            xi0.b r6 = r9.f99903a
            wd6.e r7 = r10.f99887c
            r2.<init>(r3, r4, r5, r6, r7)
            com.revolut.kompot.common.ModalDestination$Style$POPUP r9 = com.revolut.kompot.common.ModalDestination.Style.POPUP.f98311a
            com.revolut.kompot.navigable.vc.modal.a r10 = r8.S
            oki.h.v2(r10, r2, r9)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.O2(wd6.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P2(kotlin.coroutines.Continuation r11, kotlin.jvm.functions.Function1 r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof d7j.z1
            if (r0 == 0) goto L13
            r0 = r11
            d7j.z1 r0 = (d7j.z1) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            d7j.z1 r0 = new d7j.z1
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.f112087x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            cli.y r3 = r10.T
            r4 = 0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L4e
            if (r2 == r6) goto L3f
            if (r2 != r5) goto L37
            hlm.a r12 = r0.v
            kotlin.jvm.functions.Function1 r0 = r0.u
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0
            yhm.o.b(r11)     // Catch: java.lang.Throwable -> L34
            goto L8a
        L34:
            r11 = move-exception
            goto La6
        L37:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3f:
            int r12 = r0.f112086w
            hlm.a r2 = r0.v
            kotlin.jvm.functions.Function1 r8 = r0.u
            kotlin.jvm.functions.Function1 r8 = (kotlin.jvm.functions.Function1) r8
            yhm.o.b(r11)
            r11 = r2
            r2 = r12
            r12 = r8
            goto L66
        L4e:
            yhm.o.b(r11)
            r11 = r12
            kotlin.jvm.functions.Function1 r11 = (kotlin.jvm.functions.Function1) r11
            r0.u = r11
            hlm.c r11 = r10.P
            r0.v = r11
            r0.f112086w = r4
            r0.z = r6
            java.lang.Object r2 = r11.lock(r7, r0)
            if (r2 != r1) goto L65
            goto L85
        L65:
            r2 = r4
        L66:
            d7j.p0 r8 = new d7j.p0     // Catch: java.lang.Throwable -> La2
            r8.<init>(r4)     // Catch: java.lang.Throwable -> La2
            kotlinx.coroutines.flow.Flow r4 = r3.B(r8)     // Catch: java.lang.Throwable -> La2
            vkm.t0 r8 = new vkm.t0     // Catch: java.lang.Throwable -> La2
            r8.<init>(r4, r6)     // Catch: java.lang.Throwable -> La2
            r4 = r12
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4     // Catch: java.lang.Throwable -> La2
            r0.u = r4     // Catch: java.lang.Throwable -> La2
            r0.v = r11     // Catch: java.lang.Throwable -> La2
            r0.f112086w = r2     // Catch: java.lang.Throwable -> La2
            r0.z = r5     // Catch: java.lang.Throwable -> La2
            java.lang.Object r0 = vkm.q.x(r8, r0)     // Catch: java.lang.Throwable -> La2
            if (r0 != r1) goto L86
        L85:
            return r1
        L86:
            r9 = r12
            r12 = r11
            r11 = r0
            r0 = r9
        L8a:
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r11 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft) r11     // Catch: java.lang.Throwable -> L34
            java.lang.Object r11 = r0.invoke(r11)     // Catch: java.lang.Throwable -> L34
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft r11 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangeOrderDraft) r11     // Catch: java.lang.Throwable -> L34
            d7j.n0 r0 = new d7j.n0     // Catch: java.lang.Throwable -> L34
            r0.<init>(r11, r6)     // Catch: java.lang.Throwable -> L34
            r10.H2(r3, r0)     // Catch: java.lang.Throwable -> L34
            kotlin.Unit r11 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L34
            r12.unlock(r7)
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        La2:
            r12 = move-exception
            r9 = r12
            r12 = r11
            r11 = r9
        La6:
            r12.unlock(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.edit.g.P2(kotlin.coroutines.Continuation, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    /* JADX WARN: Type inference failed for: r13v30, types: [java.lang.Object, kotlin.Lazy] */
    @Override // yji.l
    public final void T1(long j2) {
        CommodityOrderFlowConfig commodityOrderFlowConfig = this.N.f99825a;
        Set set = commodityOrderFlowConfig.e;
        l6j.c cVar = l6j.c.TRADING_HOLDING;
        Continuation continuation = null;
        Flow flowV = (set.contains(cVar) || commodityOrderFlowConfig.f99807c.f99803b == cVar) ? nim.a.v(boh.f.e(m.c(this.I, null, null, 3), new q0(this, 1)), new p0(3)) : new go.g(new Data(f0.f322471a, null, false, 6, null), 2);
        r rVarDistinctUntilChanged = osg.b.g(this.H, w4l.i.f294643c, null, null, null, null, null, AccountId.Personal.f51414a, 62).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(rVarDistinctUntilChanged, "distinctUntilChanged(...)");
        l.b1(this, mo3.a.h(u0.m(flowV, rd0.e.b(nim.a.w(rVarDistinctUntilChanged, new p0(4)))), new l1(21), new o0(0), 2), null, new c1(0, this, continuation), 3);
        p0 p0Var = new p0(2);
        y yVar = this.T;
        l.b1(this, nim.a.v(q.Q(q.q(new aa7.c(new t0(yVar.B(p0Var), 1), 3)), new y0(1, this, continuation)), new p0(6)), null, new x0(3, this, continuation), 3);
        l.b1(this, q.Q(q.q(new aa7.c(new t0(yVar.B(new d6j.b(24)), 1), 2)), new a32.b(continuation, this, 25)), null, new x0(2, this, continuation), 3);
        int i = 27;
        vkm.q0 q0VarN = rd0.e.n(new vkm.q0(q.Q(q.q(new bbk.z(v7.w(yVar.B(new d6j.b(i))), i)), new y0(2, this, continuation)), new x0(6, this, continuation), 1), zhm.y0.b(new Pair("CommodityOrderEditScreenModel", "collectQuoteTillHide")));
        int i2 = 1;
        l.b1(this, mo3.a.g(q0VarN, null, new o0(i2), 1), null, new c1(i2, this, continuation), 3);
        l.b1(this, new t0((MutableStateFlow) this.R.getValue(), i2), null, new c1(2, this, continuation), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.T;
    }
}

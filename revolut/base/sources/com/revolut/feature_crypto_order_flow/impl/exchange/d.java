package com.revolut.feature_crypto_order_flow.impl.exchange;

import cli.y;
import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.feature.crypto.onboarding.api.CryptoOnboardingApi$Toggles;
import com.revolut.feature.exchange.models.TakeProfitStopLoss;
import com.revolut.feature.recurring_buys.schedule.api.models.RecurringBuySettings;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails;
import com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft;
import czh.k;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kyh.g;
import oh5.e;
import oki.h;
import org.jetbrains.annotations.NotNull;
import q97.g3;
import uyh.a1;
import uyh.b1;
import uyh.c0;
import uyh.d0;
import uyh.h0;
import uyh.j;
import uyh.o;
import uyh.r;
import uyh.s;
import uyh.t;
import uyh.u;
import uyh.v;
import uyh.x0;
import vkm.j2;
import vkm.q;
import vkm.t0;
import wsg.n;
import x0i.l;

/* JADX INFO: loaded from: classes10.dex */
public final class d extends h implements o, xyh.a {

    @NotNull
    private static final u Companion = new u();
    public static final Set M;
    public final gzh.a A;
    public final czh.b B;
    public final o7.b C;
    public final e D;
    public final l E;
    public final zrc.d F;
    public final eub.a G;
    public final b1 H;
    public final ae5.a I;
    public final hlm.c J;
    public final y K;
    public final com.revolut.kompot.navigable.vc.modal.a L;
    public final CryptoExchangeScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fk3.a f96745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final n f96746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final k f96747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final a1 f96748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final o7.b f96749t;
    public final l4i.a u;
    public final fzh.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final gte.a f96750w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final l2j.a f96751x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final jx0.a f96752y;
    public final b1i.a z;

    static {
        io3.l[] elements = {io3.l.CURRENT, io3.l.UNKNOWN, io3.l.REVX_FIAT};
        Intrinsics.checkNotNullParameter(elements, "elements");
        M = kotlin.collections.d.y0(elements);
    }

    public d(x0 stateMapper, CryptoExchangeScreenContract$InputData inputData, fk3.a configurationInteractor, n walletInteractor, k fallbackCurrencyProvider, a1 cryptoOrderDraftMutator, o7.b orderQuoteInteractor, l4i.a amountConverter, fzh.a revPointsAmountFormatter, gte.a featureToggleInteractor, l2j.a currencyChooserFlowFactory, jx0.a takeProfitStopLossChartInteractor, b1i.a takeProfitStopLossFlowProvider, gzh.a cryptoOrderPocketInfoProvider, czh.b balancesProvider, o7.b stakingPocketProvider, e cryptoLockedGiftBalanceInteractor, l takeProfitStopLossStorageInteractor, zrc.d cryptoScaInteractor, eub.a revPointsAvailabilityInteractor, b1 loyaltyBalanceFallbackHandler, ae5.a cryptoConvertDialogDisclaimerExtension) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(fallbackCurrencyProvider, "fallbackCurrencyProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderDraftMutator, "cryptoOrderDraftMutator");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(amountConverter, "amountConverter");
        Intrinsics.checkNotNullParameter(revPointsAmountFormatter, "revPointsAmountFormatter");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(takeProfitStopLossChartInteractor, "takeProfitStopLossChartInteractor");
        Intrinsics.checkNotNullParameter(takeProfitStopLossFlowProvider, "takeProfitStopLossFlowProvider");
        Intrinsics.checkNotNullParameter(cryptoOrderPocketInfoProvider, "cryptoOrderPocketInfoProvider");
        Intrinsics.checkNotNullParameter(balancesProvider, "balancesProvider");
        Intrinsics.checkNotNullParameter(stakingPocketProvider, "stakingPocketProvider");
        Intrinsics.checkNotNullParameter(cryptoLockedGiftBalanceInteractor, "cryptoLockedGiftBalanceInteractor");
        Intrinsics.checkNotNullParameter(takeProfitStopLossStorageInteractor, "takeProfitStopLossStorageInteractor");
        Intrinsics.checkNotNullParameter(cryptoScaInteractor, "cryptoScaInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(loyaltyBalanceFallbackHandler, "loyaltyBalanceFallbackHandler");
        Intrinsics.checkNotNullParameter(cryptoConvertDialogDisclaimerExtension, "cryptoConvertDialogDisclaimerExtension");
        this.o = inputData;
        this.f96745p = configurationInteractor;
        this.f96746q = walletInteractor;
        this.f96747r = fallbackCurrencyProvider;
        this.f96748s = cryptoOrderDraftMutator;
        this.f96749t = orderQuoteInteractor;
        this.u = amountConverter;
        this.v = revPointsAmountFormatter;
        this.f96750w = featureToggleInteractor;
        this.f96751x = currencyChooserFlowFactory;
        this.f96752y = takeProfitStopLossChartInteractor;
        this.z = takeProfitStopLossFlowProvider;
        this.A = cryptoOrderPocketInfoProvider;
        this.B = balancesProvider;
        this.C = stakingPocketProvider;
        this.D = cryptoLockedGiftBalanceInteractor;
        this.E = takeProfitStopLossStorageInteractor;
        this.F = cryptoScaInteractor;
        this.G = revPointsAvailabilityInteractor;
        this.H = loyaltyBalanceFallbackHandler;
        this.I = cryptoConvertDialogDisclaimerExtension;
        this.J = hlm.d.a();
        this.K = mra.d.b(this, new j(null, new kyh.h(inputData.f96723c, inputData.f96721a), null, false, new RecurringBuySettings(0)), stateMapper, null, false, 12);
        this.L = hx7.e.a(this, new umd.n(this, 23));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature_crypto_order_flow.impl.exchange.d r7, com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 201
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_crypto_order_flow.impl.exchange.d.I2(com.revolut.feature_crypto_order_flow.impl.exchange.d, com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object J2(com.revolut.feature_crypto_order_flow.impl.exchange.d r9, gim.c r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof uyh.z
            if (r0 == 0) goto L13
            r0 = r10
            uyh.z r0 = (uyh.z) r0
            int r1 = r0.f284425w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284425w = r1
            goto L18
        L13:
            uyh.z r0 = new uyh.z
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284425w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L3b
        L27:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L2f:
            yhm.o.b(r10)
            r0.f284425w = r3
            java.lang.Object r10 = r9.P2(r0)
            if (r10 != r1) goto L3b
            return r1
        L3b:
            czh.e r10 = (czh.e) r10
            xi0.b r1 = r10.f110239a
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier r2 = r10.f110240b
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier$Pocket r4 = new com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier$Pocket
            r10 = 0
            com.revolut.core.model.account.AccountId$Personal r0 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r4.<init>(r0, r10)
            com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$InputData r10 = r9.o
            xi0.b r3 = r10.f96721a
            wd6.e r6 = wd6.e.BUY
            wd6.h r7 = r10.e
            java.lang.Long r8 = r10.f
            boolean r5 = r10.d
            r0 = r9
            M2(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_crypto_order_flow.impl.exchange.d.J2(com.revolut.feature_crypto_order_flow.impl.exchange.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object K2(com.revolut.feature_crypto_order_flow.impl.exchange.d r10, gim.c r11) throws java.lang.Throwable {
        /*
            com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$InputData r0 = r10.o
            boolean r1 = r11 instanceof uyh.a0
            if (r1 == 0) goto L15
            r1 = r11
            uyh.a0 r1 = (uyh.a0) r1
            int r2 = r1.f284350w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f284350w = r2
            goto L1a
        L15:
            uyh.a0 r1 = new uyh.a0
            r1.<init>(r10, r11)
        L1a:
            java.lang.Object r11 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f284350w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r11)
            goto L3d
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            yhm.o.b(r11)
            r1.f284350w = r4
            java.lang.Object r11 = r10.Q2(r1)
            if (r11 != r2) goto L3d
            return r2
        L3d:
            czh.e r11 = (czh.e) r11
            xi0.b r2 = r0.f96721a
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier$Pocket r3 = new com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier$Pocket
            r1 = 0
            com.revolut.core.model.account.AccountId$Personal r4 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r3.<init>(r4, r1)
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails$BalanceIdentifier r5 = r11.f110240b
            xi0.b r4 = r11.f110239a
            wd6.e r7 = wd6.e.SELL
            wd6.h r8 = r0.e
            java.lang.Long r9 = r0.f
            r6 = 0
            r1 = r10
            M2(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            kotlin.Unit r10 = kotlin.Unit.f186387a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_crypto_order_flow.impl.exchange.d.K2(com.revolut.feature_crypto_order_flow.impl.exchange.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object L2(com.revolut.feature_crypto_order_flow.impl.exchange.d r9, uyh.q r10, gim.c r11) {
        /*
            boolean r0 = r11 instanceof uyh.r0
            if (r0 == 0) goto L13
            r0 = r11
            uyh.r0 r0 = (uyh.r0) r0
            int r1 = r0.f284402y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284402y = r1
            goto L18
        L13:
            uyh.r0 r0 = new uyh.r0
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.f284400w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284402y
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r10 = r0.v
            uyh.q r0 = r0.u
            yhm.o.b(r11)
            r8 = r11
            r11 = r10
            r10 = r0
            r0 = r8
            goto L6a
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            yhm.o.b(r11)
            cli.y r11 = r9.K
            java.lang.Object r11 = r11.f22677a
            vkm.j2 r11 = (vkm.j2) r11
            java.lang.Object r11 = r11.getValue()
            uyh.j r11 = (uyh.j) r11
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r11 = r11.f284369a
            if (r11 == 0) goto L94
            zrc.d r2 = r9.F
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails r4 = r11.f96689a
            xi0.b r4 = r4.f96683a
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoExchangeContract$MoneyDetails r5 = r11.f96690b
            xi0.b r5 = r5.f96683a
            wd6.e r6 = r11.e
            wd6.e r7 = wd6.e.BUY
            if (r6 != r7) goto L5c
            r6 = r3
            goto L5d
        L5c:
            r6 = 0
        L5d:
            r0.u = r10
            r0.v = r11
            r0.f284402y = r3
            java.lang.Object r0 = r2.a(r4, r5, r6, r0)
            if (r0 != r1) goto L6a
            return r1
        L6a:
            vrc.g r0 = (vrc.g) r0
            boolean r1 = r0 instanceof vrc.e
            if (r1 == 0) goto L74
            r10.invoke(r11)
            goto L94
        L74:
            boolean r10 = r0 instanceof vrc.f
            if (r10 == 0) goto L8e
            uyh.l r10 = new uyh.l
            vrc.f r0 = (vrc.f) r0
            java.lang.String r0 = r0.f291575a
            com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$InputData r1 = new com.revolut.feature_crypto_order_flow.impl.order_summary.OrderSummaryScreenContract$InputData
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r11 = S2(r11)
            r1.<init>(r11)
            r10.<init>(r0, r1)
            r9.C2(r10)
            goto L94
        L8e:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L94:
            kotlin.Unit r9 = kotlin.Unit.f186387a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_crypto_order_flow.impl.exchange.d.L2(com.revolut.feature_crypto_order_flow.impl.exchange.d, uyh.q, gim.c):java.lang.Object");
    }

    public static void M2(d dVar, xi0.b currencyFrom, CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifierFrom, xi0.b currencyTo, CryptoExchangeContract$MoneyDetails.BalanceIdentifier balanceIdentifierTo, boolean z, wd6.e exchangeMode, wd6.h orderType, Long l2) {
        g inputPosition;
        Pair pair;
        Pair pair2;
        y yVar = dVar.K;
        int[] iArr = v.f284412a;
        int i = iArr[exchangeMode.ordinal()];
        if (i == 1) {
            inputPosition = (cp5.d.A(currencyFrom) || Intrinsics.f(currencyFrom.f306286a, "PTS")) ? g.BOTTOM : g.TOP;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            inputPosition = g.TOP;
        }
        RecurringBuySettings recurringBuySettings = ((j) ((j2) yVar.f22677a).getValue()).e;
        Intrinsics.checkNotNullParameter(currencyFrom, "currencyFrom");
        Intrinsics.checkNotNullParameter(balanceIdentifierFrom, "balanceIdentifierFrom");
        Intrinsics.checkNotNullParameter(currencyTo, "currencyTo");
        Intrinsics.checkNotNullParameter(balanceIdentifierTo, "balanceIdentifierTo");
        Intrinsics.checkNotNullParameter(exchangeMode, "exchangeMode");
        Intrinsics.checkNotNullParameter(orderType, "orderType");
        Intrinsics.checkNotNullParameter(inputPosition, "inputPosition");
        Intrinsics.checkNotNullParameter(recurringBuySettings, "recurringBuySettings");
        int i2 = iArr[exchangeMode.ordinal()];
        if (i2 == 1) {
            pair = new Pair(currencyTo, currencyFrom);
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair = new Pair(currencyFrom, currencyTo);
        }
        Pair pair3 = pair;
        int i3 = iArr[exchangeMode.ordinal()];
        if (i3 == 1) {
            pair2 = new Pair(balanceIdentifierTo, balanceIdentifierFrom);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            pair2 = new Pair(balanceIdentifierFrom, balanceIdentifierTo);
        }
        dVar.H2(yVar, new r(pair3, pair2, l2, recurringBuySettings, inputPosition, exchangeMode, orderType, (orderType == wd6.h.MARKET && z) ? new TakeProfitStopLoss() : null, dVar, 0));
    }

    public static CryptoOrderDraft S2(CryptoOrderDraft cryptoOrderDraft) {
        if (cryptoOrderDraft.f == wd6.h.TAKE_PROFIT_STOP_LOSS) {
            return CryptoOrderDraft.a(cryptoOrderDraft, null, null, null, cp5.d.z(cryptoOrderDraft.f96689a.f96683a) ? g.TOP : g.BOTTOM, null, null, null, null, 0L, false, 0L, null, null, null, null, null, 0.0d, null, false, null, 4194295);
        }
        return cryptoOrderDraft;
    }

    @Override // yji.l
    public final void I1() {
        t tVar = new t(2);
        y yVar = this.K;
        Continuation continuation = null;
        yji.l.a1(this, q.r(new s(1), yVar.B(tVar)), null, null, new d0(this, continuation, 0), 3);
        l2(new c0(this, continuation, 0), new yi5.b(26));
        j2 j2Var = (j2) yVar.f22677a;
        wd6.e eVar = ((j) j2Var.getValue()).f284370b.f190906a;
        wd6.e eVar2 = wd6.e.SELL;
        if (eVar == eVar2) {
            xi0.b currency = ((j) j2Var.getValue()).f284370b.f190907b;
            o7.b bVar = this.C;
            bVar.getClass();
            Intrinsics.checkNotNullParameter(currency, "currency");
            yji.l.a1(this, new t0(mo3.a.g(nim.a.v(a.a.k(((yud.g) bVar.f222639b).b(currency, w4l.h.f294642c), new cw7.j(24)), new cw7.j(25)), null, null, 3), 1), null, null, new up2.q(this, continuation, 18), 3);
        }
        CryptoExchangeScreenContract$InputData cryptoExchangeScreenContract$InputData = this.o;
        if (cryptoExchangeScreenContract$InputData.f96723c != eVar2) {
            return;
        }
        yji.l.a1(this, q.q(new g3(mo3.a.g(e.a(this.D, cryptoExchangeScreenContract$InputData.f96721a), null, new s(0), 1), 26)), null, null, new rf9.h(this, continuation, 13), 3);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.L;
    }

    public final boolean N2() {
        wd6.h hVar;
        CryptoExchangeScreenContract$InputData cryptoExchangeScreenContract$InputData = this.o;
        if (cryptoExchangeScreenContract$InputData.f96723c != wd6.e.BUY) {
            return false;
        }
        CryptoOrderDraft cryptoOrderDraft = ((j) ((j2) this.K.f22677a).getValue()).f284369a;
        if (cryptoOrderDraft == null || (hVar = cryptoOrderDraft.f) == null) {
            hVar = cryptoExchangeScreenContract$InputData.e;
        }
        if (hVar == wd6.h.MARKET) {
            return ((jte.d) this.f96750w).c(CryptoOnboardingApi$Toggles.RevPointsCrypto.f70885c) && ((nyb.b) this.G).f();
        }
        return false;
    }

    public final t0 O2() {
        return new t0(this.K.B(new uwi.v(29)), 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0068, code lost:
    
        if (r11 == r0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c1, code lost:
    
        if (r11 == r0) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object P2(gim.c r11) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_crypto_order_flow.impl.exchange.d.P2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Q2(gim.c r9) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r9 instanceof uyh.q0
            if (r0 == 0) goto L14
            r0 = r9
            uyh.q0 r0 = (uyh.q0) r0
            int r1 = r0.f284393w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f284393w = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            uyh.q0 r0 = new uyh.q0
            r0.<init>(r8, r9)
            goto L12
        L1a:
            java.lang.Object r9 = r7.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r7.f284393w
            r2 = 2
            r3 = 1
            com.revolut.feature_crypto_order_flow.impl.exchange.CryptoExchangeScreenContract$InputData r4 = r8.o
            if (r1 == 0) goto L3a
            if (r1 == r3) goto L36
            if (r1 != r2) goto L2e
            yhm.o.b(r9)
            return r9
        L2e:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L36:
            yhm.o.b(r9)
            goto L4a
        L3a:
            yhm.o.b(r9)
            xi0.b r9 = r4.f96722b
            r7.f284393w = r3
            com.revolut.core.model.account.AccountId$Personal r1 = com.revolut.core.model.account.AccountId.Personal.f51414a
            java.lang.Object r9 = r8.R2(r1, r7, r9)
            if (r9 != r0) goto L4a
            goto L65
        L4a:
            czh.e r9 = (czh.e) r9
            if (r9 != 0) goto L66
            r1 = r2
            xi0.b r2 = r4.f96721a
            java.util.List r3 = zhm.u.c(r2)
            r9 = r4
            wd6.e r4 = wd6.e.SELL
            wd6.h r5 = r9.e
            r7.f284393w = r1
            r6 = 0
            czh.k r1 = r8.f96747r
            java.lang.Object r9 = r1.b(r2, r3, r4, r5, r6, r7)
            if (r9 != r0) goto L66
        L65:
            return r0
        L66:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_crypto_order_flow.impl.exchange.d.Q2(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object R2(com.revolut.core.model.account.AccountId r11, gim.c r12, xi0.b r13) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof uyh.s0
            if (r0 == 0) goto L13
            r0 = r12
            uyh.s0 r0 = (uyh.s0) r0
            int r1 = r0.f284405x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284405x = r1
            goto L18
        L13:
            uyh.s0 r0 = new uyh.s0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284405x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.core.model.account.AccountId r11 = r0.u
            yhm.o.b(r12)
            goto L77
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            yhm.o.b(r12)
            if (r13 != 0) goto L37
            goto L89
        L37:
            io3.i r7 = io3.i.INTERNAL
            r9 = 22
            wsg.n r4 = r10.f96746q
            r6 = 0
            r8 = r11
            r5 = r13
            efm.d0 r11 = osg.b.r(r4, r5, r6, r7, r8, r9)
            uyh.t r12 = new uyh.t
            r13 = 0
            r12.<init>(r13)
            uyd.z r13 = new uyd.z
            r2 = 15
            r13.<init>(r2, r12)
            r11.getClass()
            ufm.i r12 = new ufm.i
            r2 = 1
            r12.<init>(r11, r13, r2)
            java.lang.String r11 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            uyh.t r11 = new uyh.t
            r13 = 1
            r11.<init>(r13)
            zhm.h0 r13 = zhm.h0.f322473a
            pfm.z r11 = ue0.e.I(r12, r13, r11)
            r0.u = r8
            r0.f284405x = r3
            java.lang.Object r12 = nim.a.b(r11, r0)
            if (r12 != r1) goto L76
            return r1
        L76:
            r11 = r8
        L77:
            od0.i r12 = (od0.i) r12
            java.lang.Object r12 = r12.f224257a
            io3.d r12 = (io3.d) r12
            if (r12 == 0) goto L89
            czh.d r13 = czh.k.Companion
            r13.getClass()
            czh.e r11 = czh.d.a(r11, r12)
            return r11
        L89:
            r11 = 0
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_crypto_order_flow.impl.exchange.d.R2(com.revolut.core.model.account.AccountId, gim.c, xi0.b):java.lang.Object");
    }

    @Override // yji.l
    public final void T1(long j2) {
        Continuation continuation = null;
        yji.l.b1(this, q.Q(t1.g(q.q(new aa7.c(O2(), 5)), 300L), new uec.d(continuation, this, 13)), null, new h0(this, null), 3);
        yji.l.b1(this, new tse.c(q.r(new s(2), O2()), this, 28), null, new d0(this, continuation, 1), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object T2(kotlin.coroutines.Continuation r7, kotlin.jvm.functions.Function1 r8) {
        /*
            r6 = this;
            cli.y r0 = r6.K
            boolean r1 = r7 instanceof uyh.u0
            if (r1 == 0) goto L15
            r1 = r7
            uyh.u0 r1 = (uyh.u0) r1
            int r2 = r1.f284411y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f284411y = r2
            goto L1a
        L15:
            uyh.u0 r1 = new uyh.u0
            r1.<init>(r6, r7)
        L1a:
            java.lang.Object r7 = r1.f284409w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f284411y
            r4 = 1
            r5 = 0
            if (r3 == 0) goto L3a
            if (r3 != r4) goto L32
            hlm.c r8 = r1.v
            kotlin.jvm.functions.Function1 r1 = r1.u
            kotlin.jvm.functions.Function1 r1 = (kotlin.jvm.functions.Function1) r1
            yhm.o.b(r7)
            r7 = r8
            r8 = r1
            goto L4f
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            yhm.o.b(r7)
            r7 = r8
            kotlin.jvm.functions.Function1 r7 = (kotlin.jvm.functions.Function1) r7
            r1.u = r7
            hlm.c r7 = r6.J
            r1.v = r7
            r1.f284411y = r4
            java.lang.Object r1 = r7.lock(r5, r1)
            if (r1 != r2) goto L4f
            return r2
        L4f:
            java.lang.Object r1 = r0.f22677a     // Catch: java.lang.Throwable -> L76
            vkm.j2 r1 = (vkm.j2) r1     // Catch: java.lang.Throwable -> L76
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L76
            uyh.j r1 = (uyh.j) r1     // Catch: java.lang.Throwable -> L76
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r1 = r1.f284369a     // Catch: java.lang.Throwable -> L76
            if (r1 != 0) goto L5e
            goto L6e
        L5e:
            java.lang.Object r8 = r8.invoke(r1)     // Catch: java.lang.Throwable -> L76
            com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft r8 = (com.revolut.feature_crypto_order_flow.api.exchange.CryptoOrderDraft) r8     // Catch: java.lang.Throwable -> L76
            uu9.b r1 = new uu9.b     // Catch: java.lang.Throwable -> L76
            r2 = 13
            r1.<init>(r8, r2)     // Catch: java.lang.Throwable -> L76
            r6.H2(r0, r1)     // Catch: java.lang.Throwable -> L76
        L6e:
            kotlin.Unit r8 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L76
            r7.unlock(r5)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L76:
            r8 = move-exception
            r7.unlock(r5)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature_crypto_order_flow.impl.exchange.d.T2(kotlin.coroutines.Continuation, kotlin.jvm.functions.Function1):java.lang.Object");
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.K;
    }
}

package com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details;

import ael.d0;
import c1l.e;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.wealth.resources.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import com.revolut.shared.feature.wealth.domain.api.interactors.InstrumentTickerInteractor$Companion;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import nk4.o;
import ntk.b;
import ntk.c;
import ntk.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import ybl.q;
import yji.l;
import yki.i;
import zhm.h0;

/* JADX INFO: loaded from: classes12.dex */
public final class a extends h implements b {

    @NotNull
    public static final d Companion = new d();
    public final c o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final a2b.b f103832p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ybl.b f103833q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f103834r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d0 f103835s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final q f103836t;
    public final wxk.c u;
    public final i v;

    public a(c inputData, a2b.b cfdOnboardingConfigProvider, ybl.b instrumentTickerInteractor, e tradingOnboardingStartCommandProvider, d0 stocksInteractor, q wealthInstrumentStateDetailsInteractor, wxk.c privateMarketsProductCommsCommandProvider) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(cfdOnboardingConfigProvider, "cfdOnboardingConfigProvider");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(stocksInteractor, "stocksInteractor");
        Intrinsics.checkNotNullParameter(wealthInstrumentStateDetailsInteractor, "wealthInstrumentStateDetailsInteractor");
        Intrinsics.checkNotNullParameter(privateMarketsProductCommsCommandProvider, "privateMarketsProductCommsCommandProvider");
        this.o = inputData;
        this.f103832p = cfdOnboardingConfigProvider;
        this.f103833q = instrumentTickerInteractor;
        this.f103834r = tradingOnboardingStartCommandProvider;
        this.f103835s = stocksInteractor;
        this.f103836t = wealthInstrumentStateDetailsInteractor;
        this.u = privateMarketsProductCommsCommandProvider;
        this.v = d8l.d.a(this, new o(this, 19));
    }

    @Override // yji.l
    public final void I1() {
        l2(new ntk.i(this, null, 1), new yi5.b(26));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a8, code lost:
    
        if (r15 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I2(nel.n r13, java.util.ArrayList r14, gim.c r15) {
        /*
            r12 = this;
            boolean r0 = r15 instanceof ntk.f
            if (r0 == 0) goto L13
            r0 = r15
            ntk.f r0 = (ntk.f) r0
            int r1 = r0.f219149x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219149x = r1
            goto L18
        L13:
            ntk.f r0 = new ntk.f
            r0.<init>(r12, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f219149x
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r15)
            goto Lab
        L2c:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L34:
            nel.n r13 = r0.u
            yhm.o.b(r15)
            goto L99
        L3a:
            yhm.o.b(r15)
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig r6 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig
            com.revolut.retail.core.navigation.FeatureCommand r15 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r2 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r7 = s49.a.SINGLE_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r8 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId r9 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r10 = ibb.c.f160141b
            java.lang.String r10 = r10.f83420a
            r9.<init>(r10, r5)
            r10 = 6
            r8.<init>(r9, r5, r5, r10)
            r2.<init>(r7, r8)
            r15.<init>(r2)
            com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination r2 = new com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination
            sih.c r7 = sih.c.PRIVATE_MARKETS
            r2.<init>(r7)
            com.revolut.retail.core.navigation.FeatureCommand r2 = zh9.u0.f(r2)
            com.revolut.retail.core.navigation.CompositeCommand r7 = com.revolut.retail.core.navigation.a.c(r15, r2)
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountTypeAndProducts r8 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountTypeAndProducts
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia r15 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a
            r8.<init>(r15, r14)
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams r10 = new com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType r14 = com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType.TRADING
            r15 = 0
            r10.<init>(r15, r14)
            grl.k9 r14 = grl.k9.Trading
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r15 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r15 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r11 = com.google.android.gms.internal.mlkit_vision_face.a.h(r14, r15, r14)
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            c1l.e r14 = r12.f103834r
            com.revolut.retail.core.navigation.DummyCommand r15 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            ufm.b r14 = r14.b(r15, r6, r5)
            r0.u = r13
            r0.f219149x = r3
            java.lang.Object r15 = nim.a.b(r14, r0)
            if (r15 != r1) goto L99
            goto Laa
        L99:
            com.revolut.retail.core.navigation.NaviCommand r15 = (com.revolut.retail.core.navigation.NaviCommand) r15
            kotlin.jvm.internal.Intrinsics.h(r15)
            r0.u = r5
            r0.f219149x = r4
            wxk.c r14 = r12.u
            java.lang.Object r15 = r14.a(r15, r13, r0)
            if (r15 != r1) goto Lab
        Laa:
            return r1
        Lab:
            com.revolut.kompot.common.StackDestination r15 = (com.revolut.kompot.common.StackDestination) r15
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r13 = zh9.u0.d(r15)
            com.revolut.kompot.bridge.navigation.BridgeDestination r13 = zh9.u0.c(r13)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a.I2(nel.n, java.util.ArrayList, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (r1 == r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0112, code lost:
    
        if (M2(r1, r2, r3) == r4) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0158, code lost:
    
        if (r1 == r4) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object J2(com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination r18, gim.c r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a.J2(com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0098, code lost:
    
        if (J2(r4, r15) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object K2(com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination r12, java.lang.String r13, kotlin.jvm.functions.Function0 r14, gim.c r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof ntk.h
            if (r0 == 0) goto L14
            r0 = r15
            ntk.h r0 = (ntk.h) r0
            int r1 = r0.f219154y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f219154y = r1
        L12:
            r15 = r0
            goto L1a
        L14:
            ntk.h r0 = new ntk.h
            r0.<init>(r11, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r15.f219152w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r15.f219154y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L47
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            kotlin.jvm.functions.Function0 r12 = r15.v
            kotlin.jvm.functions.Function0 r12 = (kotlin.jvm.functions.Function0) r12
            yhm.o.b(r0)
            goto La1
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L39:
            kotlin.jvm.functions.Function0 r12 = r15.v
            r14 = r12
            kotlin.jvm.functions.Function0 r14 = (kotlin.jvm.functions.Function0) r14
            com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination r12 = r15.u
            yhm.o.b(r0)     // Catch: java.lang.Throwable -> L44
            goto L64
        L44:
            r0 = move-exception
            r13 = r0
            goto L69
        L47:
            yhm.o.b(r0)
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L44
            ybl.b r0 = r11.f103833q     // Catch: java.lang.Throwable -> L44
            ael.k r0 = (ael.k) r0     // Catch: java.lang.Throwable -> L44
            ufm.i r13 = r0.e(r13)     // Catch: java.lang.Throwable -> L44
            r15.u = r12     // Catch: java.lang.Throwable -> L44
            r0 = r14
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0     // Catch: java.lang.Throwable -> L44
            r15.v = r0     // Catch: java.lang.Throwable -> L44
            r15.f219154y = r4     // Catch: java.lang.Throwable -> L44
            java.lang.Object r0 = nim.a.b(r13, r15)     // Catch: java.lang.Throwable -> L44
            if (r0 != r1) goto L64
            goto L9a
        L64:
            nel.n r0 = (nel.n) r0     // Catch: java.lang.Throwable -> L44
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L44
            goto L6f
        L69:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r0 = yhm.o.a(r13)
        L6f:
            java.lang.Throwable r13 = yhm.m.a(r0)
            if (r13 != 0) goto L9b
            nel.n r0 = (nel.n) r0
            java.lang.String r5 = r0.f214596b
            vqk.c r6 = r12.f103737b
            boolean r7 = r12.f103738c
            java.lang.String r8 = r12.d
            com.revolut.retail.feature.stockdetails.api.navigation.StartNavigation r9 = r12.e
            eel.c r10 = r12.f
            java.lang.String r12 = "ref"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r12)
            com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination r4 = new com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r12 = 0
            r15.u = r12
            r15.v = r12
            r15.f219154y = r3
            java.lang.Object r12 = r11.J2(r4, r15)
            if (r12 != r1) goto La1
        L9a:
            return r1
        L9b:
            hx7.e.n(r13)
            r14.invoke()
        La1:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a.K2(com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination, java.lang.String, kotlin.jvm.functions.Function0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a7, code lost:
    
        if (K2(r7, r9, r8, r0) == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object L2(com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination r7, nel.n r8, java.lang.String r9, gim.c r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof ntk.j
            if (r0 == 0) goto L13
            r0 = r10
            ntk.j r0 = (ntk.j) r0
            int r1 = r0.f219158y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f219158y = r1
            goto L18
        L13:
            ntk.j r0 = new ntk.j
            r0.<init>(r6, r10)
        L18:
            java.lang.Object r10 = r0.f219156w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f219158y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r10)
            goto Laa
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            java.lang.String r9 = r0.v
            com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination r7 = r0.u
            yhm.o.b(r10)
            goto L5d
        L3c:
            yhm.o.b(r10)
            ybl.q r10 = r6.f103836t
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Margin r2 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Margin.f105271a
            akg.n r8 = ybl.q.a(r10, r8, r2)
            zfd.e r8 = zi0.c.w(r8)
            r10 = 3
            jhi.b r8 = mo3.a.g(r8, r5, r5, r10)
            r0.u = r7
            r0.v = r9
            r0.f219158y = r4
            java.lang.Object r10 = vkm.q.x(r8, r0)
            if (r10 != r1) goto L5d
            goto La9
        L5d:
            nel.w0 r10 = (nel.w0) r10
            boolean r8 = r10 instanceof nel.s0
            if (r8 != 0) goto L97
            boolean r8 = r10 instanceof nel.u0
            if (r8 != 0) goto L97
            boolean r8 = r10 instanceof nel.t0
            if (r8 == 0) goto L6c
            goto L97
        L6c:
            boolean r7 = r10 instanceof nel.q0
            if (r7 == 0) goto L85
            a2b.b r7 = r6.f103832p
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig r7 = a2b.b.a(r7)
            com.revolut.kompot.bridge.navigation.BridgeDestination r7 = zh9.u0.c(r7)
            r6.C1(r7)
            yki.i r7 = r6.v
            oki.h.D2(r7)
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        L85:
            boolean r7 = r10 instanceof nel.r0
            if (r7 == 0) goto L91
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "User is not eligible and shouldn't see CFDs"
            r7.<init>(r8)
            throw r7
        L91:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L97:
            nsh.e r8 = new nsh.e
            r10 = 2
            r8.<init>(r6, r7, r10)
            r0.u = r5
            r0.v = r5
            r0.f219158y = r3
            java.lang.Object r7 = r6.K2(r7, r9, r8, r0)
            if (r7 != r1) goto Laa
        La9:
            return r1
        Laa:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a.L2(com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination, nel.n, java.lang.String, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new ntk.i(this, null, 0), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object M2(com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination r10, nel.n r11, gim.c r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.stockdetails.impl.ui.flows.asset_details.a.M2(com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination, nel.n, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        Continuation continuation = null;
        rd0.d.a(rd0.c.ERROR, null, null, throwable, h0Var);
        if (throwable instanceof InstrumentTickerInteractor$Companion.NoTradeInstrumentException) {
            l.a1(this, X1(new y0("ASSET_DETAILS_FLOW_MODEL_ERROR_DIALOG_ID", new z(new TextLocalisedClause(R$string.wealth_details_error_unable_load_instrument, null, null, 14), null, new TextLocalisedClause(R.string.common_action_got_it, null, null, 14), null, null, null, true, null, null, null, null, null, null, 32502), false, 4)), null, null, new nn7.d(this, continuation, 21), 3);
            return true;
        }
        super.o1(throwable);
        return false;
    }

    @Override // yki.g
    public final yki.b s() {
        return this.v;
    }
}

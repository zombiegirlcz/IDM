package j6h;

import c1l.e;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f171769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k6h.a f171770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f171771c;

    public c(e tradingOnboardingStartCommandProvider, k6h.a giaMarginProductCommsCommandProvider, Map productsProviders, nlh.b wealthTradeCommandProvider) {
        Intrinsics.checkNotNullParameter(tradingOnboardingStartCommandProvider, "tradingOnboardingStartCommandProvider");
        Intrinsics.checkNotNullParameter(giaMarginProductCommsCommandProvider, "giaMarginProductCommsCommandProvider");
        Intrinsics.checkNotNullParameter(productsProviders, "productsProviders");
        Intrinsics.checkNotNullParameter(wealthTradeCommandProvider, "wealthTradeCommandProvider");
        this.f171769a = tradingOnboardingStartCommandProvider;
        this.f171770b = giaMarginProductCommsCommandProvider;
        this.f171771c = productsProviders;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof j6h.a
            if (r0 == 0) goto L13
            r0 = r10
            j6h.a r0 = (j6h.a) r0
            int r1 = r0.f171765w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171765w = r1
            goto L18
        L13:
            j6h.a r0 = new j6h.a
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171765w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r10)
            goto L5d
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L2f:
            yhm.o.b(r10)
            java.util.Map r10 = r9.f171771c
            cfl.p r2 = cfl.p.MARGIN_TRADING
            java.lang.Object r10 = r10.get(r2)
            ybl.a r10 = (ybl.a) r10
            if (r10 == 0) goto L51
            java.util.Set r10 = r10.b()
            if (r10 == 0) goto L51
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = zhm.d0.d1(r10)
            if (r10 == 0) goto L51
            java.util.List r10 = c6d.b.N(r10)
            goto L52
        L51:
            r10 = 0
        L52:
            if (r10 == 0) goto L97
            r0.f171765w = r3
            java.lang.Object r10 = r9.b(r10, r0)
            if (r10 != r1) goto L5d
            return r1
        L5d:
            r1 = r10
            com.revolut.retail.core.navigation.NaviCommand r1 = (com.revolut.retail.core.navigation.NaviCommand) r1
            kotlin.jvm.internal.Intrinsics.h(r1)
            java.lang.String r10 = "targetCommand"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r10)
            k6h.a r10 = r9.f171770b
            qka.c r10 = r10.f181719a
            com.revolut.feature.product_article.api.models.ProductArticleParams r6 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r0 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            com.revolut.feature.wealth.gia.margin_trading.impl.navigation.comms.StocksMarginProductWelcomeArticleKey r2 = new com.revolut.feature.wealth.gia.margin_trading.impl.navigation.comms.StocksMarginProductWelcomeArticleKey
            r3 = 0
            r2.<init>(r3)
            r0.<init>(r2)
            r6.<init>(r0)
            com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r0 = new com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor
            r3 = 0
            r5 = 2
            r2 = 0
            r4 = r1
            r0.<init>(r1, r2, r3, r4, r5)
            r7 = 0
            r8 = 120(0x78, float:1.68E-43)
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r4 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            r3 = r6
            r6 = 0
            r2 = r10
            r5 = r0
            com.revolut.kompot.bridge.navigation.KompotFeatureConfig r10 = cka.b.a(r2, r3, r4, r5, r6, r7, r8)
            com.revolut.kompot.bridge.navigation.BridgeDestination r10 = zh9.u0.c(r10)
            return r10
        L97:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Product codes for margin are empty but GiaMarginOnboardingCommandProvider#getOnboardingCommand called."
            r0.<init>(r1)
            java.lang.String r0 = r0.toString()
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: j6h.c.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.util.List r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof j6h.b
            if (r0 == 0) goto L13
            r0 = r15
            j6h.b r0 = (j6h.b) r0
            int r1 = r0.f171768y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f171768y = r1
            goto L18
        L13:
            j6h.b r0 = new j6h.b
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.f171766w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f171768y
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L40
            if (r2 == r3) goto L36
            if (r2 != r4) goto L2e
            java.util.List r14 = r0.u
            java.util.List r14 = (java.util.List) r14
            yhm.o.b(r15)
            return r15
        L2e:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L36:
            c1l.e r14 = r0.v
            java.util.List r2 = r0.u
            java.util.List r2 = (java.util.List) r2
            yhm.o.b(r15)
            goto L5a
        L40:
            yhm.o.b(r15)
            sih.b r15 = sih.b.STOCKS
            r2 = r14
            java.util.List r2 = (java.util.List) r2
            r0.u = r2
            c1l.e r2 = r13.f171769a
            r0.v = r2
            r0.f171768y = r3
            com.revolut.feature.wealth.ui.api.navigation.trade.WealthTradeRedesignDestination r15 = nlh.b.a(r15)
            if (r15 != r1) goto L57
            goto Lab
        L57:
            r12 = r2
            r2 = r14
            r14 = r12
        L5a:
            com.revolut.kompot.common.StackDestination r15 = (com.revolut.kompot.common.StackDestination) r15
            com.revolut.retail.core.navigation.FeatureCommand r15 = zh9.u0.f(r15)
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig r5 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r3 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r7 = s49.a.AS_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r8 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId r9 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$NewMainScreenContainerTabId
            com.revolut.feature.rev10_main_screen.api.MainScreenTab r10 = ibb.c.f160141b
            java.lang.String r10 = r10.f83420a
            r11 = 0
            r9.<init>(r10, r11)
            r10 = 6
            r8.<init>(r9, r11, r11, r10)
            r3.<init>(r7, r8)
            r6.<init>(r3)
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountTypeAndProducts r7 = new com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountTypeAndProducts
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType$Gia r3 = com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType.Gia.f105270a
            r7.<init>(r3, r2)
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams r9 = new com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptParams
            r2 = 0
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType r3 = com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType.TRADING
            r9.<init>(r2, r3)
            grl.k9 r2 = grl.k9.Trading
            android.os.Parcelable$Creator<com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail> r3 = com.revolut.analytics.tracking.v3.AnalyticsProduct.Retail.CREATOR
            java.lang.String r3 = "value"
            com.revolut.analytics.tracking.v3.AnalyticsProduct$Retail r10 = com.google.android.gms.internal.mlkit_vision_face.a.h(r2, r3, r2)
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            ufm.b r14 = r14.b(r15, r5, r11)
            r0.u = r11
            r0.v = r11
            r0.f171768y = r4
            java.lang.Object r14 = nim.a.b(r14, r0)
            if (r14 != r1) goto Lac
        Lab:
            return r1
        Lac:
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: j6h.c.b(java.util.List, gim.c):java.lang.Object");
    }
}

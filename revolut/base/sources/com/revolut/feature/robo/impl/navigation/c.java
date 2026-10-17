package com.revolut.feature.robo.impl.navigation;

import kotlin.jvm.internal.Intrinsics;
import qmc.h;
import ybl.k;
import ybl.l;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements clc.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f85098a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f85099b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f85100c;
    public final h d;

    public c(k tradingAccountsInteractor, l tradingConfigInteractor, gte.a featureToggleInteractor, h portfolioInfoProvider) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        this.f85098a = tradingAccountsInteractor;
        this.f85099b = tradingConfigInteractor;
        this.f85100c = featureToggleInteractor;
        this.d = portfolioInfoProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(com.revolut.feature.robo.impl.navigation.c r8, gim.c r9) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.robo.impl.navigation.c.b(com.revolut.feature.robo.impl.navigation.c, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.revolut.feature.robo.impl.navigation.c r10, com.revolut.retail.core.navigation.FeatureCommand r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof fmc.g
            if (r0 == 0) goto L13
            r0 = r12
            fmc.g r0 = (fmc.g) r0
            int r1 = r0.f136340x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136340x = r1
            goto L18
        L13:
            fmc.g r0 = new fmc.g
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136340x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.retail.core.navigation.FeatureCommand r11 = r0.u
            yhm.o.b(r12)
            goto L57
        L29:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L31:
            yhm.o.b(r12)
            ybl.l r10 = r10.f85099b
            akg.n r10 = ybl.l.d(r10)
            fk4.r r12 = new fk4.r
            r2 = 10
            r12.<init>(r2)
            fk4.r r2 = new fk4.r
            r4 = 11
            r2.<init>(r4)
            jhi.b r10 = mo3.a.e(r10, r12, r2)
            r0.u = r11
            r0.f136340x = r3
            java.lang.Object r12 = vkm.q.z(r10, r0)
            if (r12 != r1) goto L57
            return r1
        L57:
            com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation r12 = (com.revolut.shared.feature.wealth.models.config.TradingLegalEntityInformation) r12
            r10 = 0
            if (r12 == 0) goto L73
            hel.b r12 = r12.f105106a
            if (r12 == 0) goto L73
            int[] r0 = fmc.h.f136341a
            int r12 = r12.ordinal()
            r12 = r0[r12]
            switch(r12) {
                case 1: goto L71;
                case 2: goto L73;
                case 3: goto L73;
                case 4: goto L73;
                case 5: goto L73;
                case 6: goto L73;
                case 7: goto L73;
                default: goto L6b;
            }
        L6b:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L71:
            com.revolut.feature.robo.impl.comms.RoboProductWelcomeArticleKey r10 = com.revolut.feature.robo.impl.comms.RoboProductWelcomeArticleKey.GB
        L73:
            if (r10 == 0) goto La3
            com.revolut.retail.core.navigation.FeatureCommand r12 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r0 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.product_article.api.navigation.ProductArticleDestination r1 = new com.revolut.feature.product_article.api.navigation.ProductArticleDestination
            com.revolut.feature.product_article.api.models.ProductArticleParams r2 = new com.revolut.feature.product_article.api.models.ProductArticleParams
            com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key r3 = new com.revolut.feature.product_article.api.models.ProductArticleParams$ArticleReference$Key
            r3.<init>(r10)
            r2.<init>(r3)
            com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor r4 = new com.revolut.feature.product_article.api.models.ProductArticleCommandInterceptor
            r4.<init>(r11, r11, r11, r11)
            r8 = 0
            r9 = 248(0xf8, float:3.48E-43)
            com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour$SkipIfWasAlreadyShown r3 = com.revolut.feature.product_article.api.navigation.SkipShownArticleBehaviour.SkipIfWasAlreadyShown.f81286a
            r5 = 0
            r6 = 0
            r7 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = 0
            r6 = 61
            r2 = r1
            r1 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r12.<init>(r0)
            return r12
        La3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.robo.impl.navigation.c.c(com.revolut.feature.robo.impl.navigation.c, com.revolut.retail.core.navigation.FeatureCommand, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof fmc.d
            if (r0 == 0) goto L13
            r0 = r7
            fmc.d r0 = (fmc.d) r0
            int r1 = r0.f136333w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136333w = r1
            goto L18
        L13:
            fmc.d r0 = new fmc.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136333w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L58
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            com.revolut.feature.robo.api.RoboApi$Toggles$RoboPortfolioDetailsScreenRevamp r7 = com.revolut.feature.robo.api.RoboApi$Toggles.RoboPortfolioDetailsScreenRevamp.f85023c
            gte.a r2 = r5.f85100c
            jte.d r2 = (jte.d) r2
            boolean r7 = r2.c(r7)
            if (r7 == 0) goto L70
            qmc.h r7 = r5.d
            kotlinx.coroutines.flow.Flow r6 = glc.a.a(r7, r6)
            fk4.r r7 = new fk4.r
            r2 = 7
            r7.<init>(r2)
            jhi.b r6 = mo3.a.g(r6, r4, r7, r3)
            r0.f136333w = r3
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            com.revolut.feature.wealth.models.robo.RoboPortfolioInfo r7 = (com.revolut.feature.wealth.models.robo.RoboPortfolioInfo) r7
            com.revolut.feature.wealth.models.robo.Template r6 = r7.f95701a
            if (r6 == 0) goto L60
            java.lang.String r4 = r6.f95706a
        L60:
            if (r4 == 0) goto L68
            com.revolut.feature.trading.managed_portfolios.api.navigation.ManagedPortfolioDetailsDestination r6 = new com.revolut.feature.trading.managed_portfolios.api.navigation.ManagedPortfolioDetailsDestination
            r6.<init>(r4)
            return r6
        L68:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Template ID should not be null"
            r6.<init>(r7)
            throw r6
        L70:
            com.revolut.feature.robo.impl.navigation.RoboInternalDestination$PortfolioDetailsDestination r7 = new com.revolut.feature.robo.impl.navigation.RoboInternalDestination$PortfolioDetailsDestination
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.robo.impl.navigation.c.d(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r18, java.lang.String r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.robo.impl.navigation.c.e(gim.c, java.lang.String, boolean):java.lang.Object");
    }
}

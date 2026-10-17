package fmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f136324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f136325b;

    public b(v portfolioProvider, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(portfolioProvider, "portfolioProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f136324a = portfolioProvider;
        this.f136325b = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof fmc.a
            if (r0 == 0) goto L13
            r0 = r9
            fmc.a r0 = (fmc.a) r0
            int r1 = r0.f136322x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136322x = r1
            goto L18
        L13:
            fmc.a r0 = new fmc.a
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136322x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L4a
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r9)
            if (r8 == 0) goto L8a
            boolean r9 = kotlin.text.d0.W(r8)
            if (r9 == 0) goto L3d
            goto L8a
        L3d:
            r0.u = r8
            r0.f136322x = r3
            fmc.v r9 = r7.f136324a
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto L4a
            return r1
        L4a:
            if (r9 != 0) goto L56
            com.revolut.retail.core.navigation.FeatureCommand r8 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r9 = gmc.a.a()
            r8.<init>(r9)
            return r8
        L56:
            gte.a r9 = r7.f136325b
            com.revolut.feature.trading.managed_portfolios.api.ManagedPortfoliosApi$Toggles$InvestorUpdatesFlow r0 = com.revolut.feature.trading.managed_portfolios.api.ManagedPortfoliosApi$Toggles$InvestorUpdatesFlow.f91227c
            boolean r9 = r9.a(r0)
            if (r9 == 0) goto L6a
            com.revolut.retail.core.navigation.FeatureCommand r8 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r9 = gmc.a.a()
            r8.<init>(r9)
            return r8
        L6a:
            com.revolut.retail.core.navigation.FeatureCommand r9 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r0 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.trading.managed_portfolios.api.navigation.ManagedPortfolioInvestorUpdateDestination r2 = new com.revolut.feature.trading.managed_portfolios.api.navigation.ManagedPortfolioInvestorUpdateDestination
            java.lang.String r1 = "investorUpdateId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            com.revolut.feature.trading.managed_portfolios.api.navigation.ManagedPortfolioInvestorUpdateDestination$InputData r1 = new com.revolut.feature.trading.managed_portfolios.api.navigation.ManagedPortfolioInvestorUpdateDestination$InputData
            r1.<init>(r8)
            r2.<init>(r1)
            r5 = 0
            r6 = 61
            r1 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r9.<init>(r0)
            return r9
        L8a:
            com.revolut.retail.core.navigation.FeatureCommand r8 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r9 = gmc.a.a()
            r8.<init>(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.b.a(java.lang.String, gim.c):java.lang.Object");
    }
}

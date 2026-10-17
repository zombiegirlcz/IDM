package fmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f136347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final clc.b f136348b;

    public l(v portfolioProvider, clc.b roboOnboardingEntryCommandFactory) {
        Intrinsics.checkNotNullParameter(portfolioProvider, "portfolioProvider");
        Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
        this.f136347a = portfolioProvider;
        this.f136348b = roboOnboardingEntryCommandFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x005d, code lost:
    
        if (r8 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof fmc.k
            if (r0 == 0) goto L13
            r0 = r8
            fmc.k r0 = (fmc.k) r0
            int r1 = r0.f136346w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136346w = r1
            goto L18
        L13:
            fmc.k r0 = new fmc.k
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136346w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L60
        L2a:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L32:
            yhm.o.b(r8)
            goto L44
        L36:
            yhm.o.b(r8)
            r0.f136346w = r4
            fmc.v r8 = r7.f136347a
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L44
            goto L5f
        L44:
            if (r8 == 0) goto L6f
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r8 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Portfolio) r8
            java.util.UUID r8 = r8.f105210a
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            r0.f136346w = r3
            clc.b r2 = r7.f136348b
            com.revolut.feature.robo.impl.navigation.c r2 = (com.revolut.feature.robo.impl.navigation.c) r2
            java.lang.Object r8 = r2.d(r8, r0)
            if (r8 != r1) goto L60
        L5f:
            return r1
        L60:
            r2 = r8
            com.revolut.kompot.common.ParcelableDestination r2 = (com.revolut.kompot.common.ParcelableDestination) r2
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r0 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            r3 = 0
            r1 = 0
            r4 = 0
            r5 = 0
            r6 = 61
            r0.<init>(r1, r2, r3, r4, r5, r6)
            goto L73
        L6f:
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r0 = gmc.a.a()
        L73:
            com.revolut.retail.core.navigation.FeatureCommand r8 = new com.revolut.retail.core.navigation.FeatureCommand
            r8.<init>(r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.l.a(gim.c):java.lang.Object");
    }
}

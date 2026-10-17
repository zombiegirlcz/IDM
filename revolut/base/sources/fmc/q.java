package fmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f136356a;

    public q(v portfolioProvider) {
        Intrinsics.checkNotNullParameter(portfolioProvider, "portfolioProvider");
        this.f136356a = portfolioProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0043, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof fmc.p
            if (r0 == 0) goto L13
            r0 = r7
            fmc.p r0 = (fmc.p) r0
            int r1 = r0.f136355w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136355w = r1
            goto L18
        L13:
            fmc.p r0 = new fmc.p
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136355w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L52
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            goto L46
        L36:
            yhm.o.b(r7)
            fmc.v r7 = r5.f136356a
            if (r6 == 0) goto L49
            r0.f136355w = r4
            java.lang.Object r7 = r7.c(r6, r0)
            if (r7 != r1) goto L46
            goto L51
        L46:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r7 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Portfolio) r7
            goto L54
        L49:
            r0.f136355w = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L52
        L51:
            return r1
        L52:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r7 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Portfolio) r7
        L54:
            if (r7 == 0) goto L67
            com.revolut.feature.robo.api.navigation.RoboFeatureConfig$EditPortfolio r6 = new com.revolut.feature.robo.api.navigation.RoboFeatureConfig$EditPortfolio
            java.util.UUID r7 = r7.f105210a
            java.lang.String r7 = r7.toString()
            java.lang.String r0 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r0)
            r6.<init>(r7)
            goto L6b
        L67:
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r6 = gmc.a.a()
        L6b:
            com.revolut.retail.core.navigation.FeatureCommand r7 = new com.revolut.retail.core.navigation.FeatureCommand
            r7.<init>(r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.q.a(java.lang.String, gim.c):java.lang.Object");
    }
}

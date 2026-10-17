package fmc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f136344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final clc.b f136345b;

    public j(v portfolioProvider, clc.b roboOnboardingEntryCommandFactory) {
        Intrinsics.checkNotNullParameter(portfolioProvider, "portfolioProvider");
        Intrinsics.checkNotNullParameter(roboOnboardingEntryCommandFactory, "roboOnboardingEntryCommandFactory");
        this.f136344a = portfolioProvider;
        this.f136345b = roboOnboardingEntryCommandFactory;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(boolean r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof fmc.i
            if (r0 == 0) goto L13
            r0 = r7
            fmc.i r0 = (fmc.i) r0
            int r1 = r0.f136343x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f136343x = r1
            goto L18
        L13:
            fmc.i r0 = new fmc.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f136343x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r6 = r0.u
            yhm.o.b(r7)
            goto L48
        L38:
            yhm.o.b(r7)
            r0.u = r6
            r0.f136343x = r4
            fmc.v r7 = r5.f136344a
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L48
            goto L65
        L48:
            if (r7 == 0) goto L69
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r7 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Portfolio) r7
            java.util.UUID r7 = r7.f105210a
            java.lang.String r7 = r7.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            r0.u = r6
            r0.f136343x = r3
            clc.b r2 = r5.f136345b
            com.revolut.feature.robo.impl.navigation.c r2 = (com.revolut.feature.robo.impl.navigation.c) r2
            java.lang.Object r7 = r2.e(r0, r7, r6)
            if (r7 != r1) goto L66
        L65:
            return r1
        L66:
            com.revolut.retail.core.navigation.FeatureCommand r7 = (com.revolut.retail.core.navigation.FeatureCommand) r7
            return r7
        L69:
            com.revolut.retail.core.navigation.FeatureCommand r6 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r7 = gmc.a.a()
            r6.<init>(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: fmc.j.a(boolean, gim.c):java.lang.Object");
    }
}

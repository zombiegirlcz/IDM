package d1l;

import kotlin.jvm.internal.Intrinsics;
import ybl.k;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f110670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f110671b;

    public g(b tradingOnboardingAccountOrTypeProvider, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(tradingOnboardingAccountOrTypeProvider, "tradingOnboardingAccountOrTypeProvider");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f110670a = tradingOnboardingAccountOrTypeProvider;
        this.f110671b = tradingAccountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof d1l.d
            if (r0 == 0) goto L13
            r0 = r8
            d1l.d r0 = (d1l.d) r0
            int r1 = r0.f110666x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110666x = r1
            goto L18
        L13:
            d1l.d r0 = new d1l.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f110666x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L57
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            cfl.k r8 = cfl.k.f23744a
            r2 = 3
            ybl.k r5 = r6.f110671b
            kotlinx.coroutines.flow.Flow r8 = ybl.k.k(r5, r3, r3, r8, r2)
            zfd.e r8 = zi0.c.w(r8)
            czh.a r2 = new czh.a
            r5 = 6
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r3, r2, r4)
            r0.u = r7
            r0.f110666x = r4
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L57
            return r1
        L57:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts r8 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts) r8
            java.util.List r8 = r8.f105279b
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L61:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L77
            java.lang.Object r0 = r8.next()
            r1 = r0
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard r1 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard) r1
            java.lang.String r1 = r1.f105265a
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r7)
            if (r1 == 0) goto L61
            return r0
        L77:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d1l.g.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (r6 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6, java.lang.String r7, java.util.List r8) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof d1l.e
            if (r0 == 0) goto L13
            r0 = r6
            d1l.e r0 = (d1l.e) r0
            int r1 = r0.f110668x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110668x = r1
            goto L18
        L13:
            d1l.e r0 = new d1l.e
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f110668x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType r7 = r0.u
            yhm.o.b(r6)
            goto L54
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            yhm.o.b(r6)
            goto L46
        L38:
            yhm.o.b(r6)
            r0.f110668x = r4
            d1l.b r6 = r5.f110670a
            java.lang.Object r6 = r6.a(r7, r4, r8, r0)
            if (r6 != r1) goto L46
            goto L53
        L46:
            r7 = r6
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType r7 = (com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType) r7
            r0.u = r7
            r0.f110668x = r3
            java.lang.Object r6 = r5.c(r7, r0)
            if (r6 != r1) goto L54
        L53:
            return r1
        L54:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            d1l.c r8 = new d1l.c
            if (r6 == 0) goto L61
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType r6 = com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType.JOINT_TRADING
            goto L63
        L61:
            com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType r6 = com.revolut.retail.feature.trading_onboarding.api.navigation.EndPromptType.TRADING
        L63:
            r8.<init>(r7, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d1l.g.b(gim.c, java.lang.String, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0088, code lost:
    
        if (r9 == r1) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof d1l.f
            if (r0 == 0) goto L13
            r0 = r9
            d1l.f r0 = (d1l.f) r0
            int r1 = r0.f110669w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f110669w = r1
            goto L18
        L13:
            d1l.f r0 = new d1l.f
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f110669w
            r3 = 2
            r4 = 0
            r5 = 0
            r6 = 1
            if (r2 == 0) goto L38
            if (r2 == r6) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r9)
            goto L8b
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            yhm.o.b(r9)
            goto L6f
        L38:
            yhm.o.b(r9)
            boolean r9 = r8 instanceof com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount
            if (r9 == 0) goto L4d
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccount r8 = (com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccount) r8
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r8 = r8.f104113a
            cfl.j r8 = r8.getE()
            cfl.j r9 = cfl.j.PERSONAL_JOINT
            if (r8 != r9) goto L9f
        L4b:
            r5 = r6
            goto L9f
        L4d:
            boolean r9 = r8 instanceof com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts
            if (r9 == 0) goto L5e
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithTradingAccountAndProducts r8 = (com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountAndProducts) r8
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r8 = r8.f104114a
            cfl.j r8 = r8.getE()
            cfl.j r9 = cfl.j.PERSONAL_JOINT
            if (r8 != r9) goto L9f
            goto L4b
        L5e:
            boolean r9 = r8 instanceof com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts
            if (r9 == 0) goto L7a
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithAvailableAccountIdAndProducts r8 = (com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountIdAndProducts) r8
            java.lang.String r8 = r8.f104110a
            r0.f110669w = r6
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L6f
            goto L8a
        L6f:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard r9 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard) r9
            if (r9 == 0) goto L75
            cfl.j r4 = r9.e
        L75:
            cfl.j r8 = cfl.j.PERSONAL_JOINT
            if (r4 != r8) goto L9f
            goto L4b
        L7a:
            boolean r9 = r8 instanceof com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId
            if (r9 == 0) goto L96
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType$WithAvailableAccountId r8 = (com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType.WithAvailableAccountId) r8
            java.lang.String r8 = r8.f104108a
            r0.f110669w = r3
            java.lang.Object r9 = r7.a(r8, r0)
            if (r9 != r1) goto L8b
        L8a:
            return r1
        L8b:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard r9 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard) r9
            if (r9 == 0) goto L91
            cfl.j r4 = r9.e
        L91:
            cfl.j r8 = cfl.j.PERSONAL_JOINT
            if (r4 != r8) goto L9f
            goto L4b
        L96:
            boolean r9 = r8 instanceof com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountType
            if (r9 == 0) goto L9b
            goto L9f
        L9b:
            boolean r8 = r8 instanceof com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOrType.WithTradingAccountTypeAndProducts
            if (r8 == 0) goto La4
        L9f:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r5)
            return r8
        La4:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d1l.g.c(com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOrType, gim.c):java.lang.Object");
    }
}

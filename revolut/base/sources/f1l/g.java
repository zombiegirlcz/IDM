package f1l;

import kl.t1;
import kotlin.jvm.internal.Intrinsics;
import ybl.k;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f131304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f131305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final myk.b f131306c;

    public g(t1 tradingOnboardingInteractor, k tradingAccountsInteractor, myk.b mapper) {
        Intrinsics.checkNotNullParameter(tradingOnboardingInteractor, "tradingOnboardingInteractor");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f131304a = tradingOnboardingInteractor;
        this.f131305b = tradingAccountsInteractor;
        this.f131306c = mapper;
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0172, code lost:
    
        if (r14 == r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0175, code lost:
    
        r2 = r14;
        r14 = r12;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ac, code lost:
    
        if (r14 == r9) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c1, code lost:
    
        if (r0 == r9) goto L84;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001c  */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v26, types: [com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart, com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingAccountOnboardingFeatureConfig r14, com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart r15, boolean r16, gim.c r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1l.g.a(com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingAccountOnboardingFeatureConfig, com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a4 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig.TradingRemediationFeatureConfig r9, com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart r10, boolean r11, gim.c r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof f1l.b
            if (r0 == 0) goto L13
            r0 = r12
            f1l.b r0 = (f1l.b) r0
            int r1 = r0.f131294y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131294y = r1
            goto L18
        L13:
            f1l.b r0 = new f1l.b
            r0.<init>(r8, r12)
        L18:
            java.lang.Object r12 = r0.f131292w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f131294y
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            boolean r9 = r0.v
            yhm.o.b(r12)
            goto L99
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            boolean r11 = r0.v
            com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingRemediationFeatureConfig r9 = r0.u
            yhm.o.b(r12)
            goto L84
        L3d:
            yhm.o.b(r12)
            java.lang.String r12 = r9.f104120b
            com.revolut.retail.feature.trading_onboarding.api.navigation.RemediationType r2 = r9.d
            java.lang.String r6 = "portfolioId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r6)
            kl.t1 r7 = r8.f131304a
            java.lang.Object r7 = r7.f185240b
            hyk.c r7 = (hyk.c) r7
            r7.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r6)
            w4l.f r6 = r7.f156889c
            hyk.b r7 = new hyk.b
            if (r2 == 0) goto L60
            java.lang.String r2 = eyk.a.c(r2)
            goto L61
        L60:
            r2 = r5
        L61:
            r7.<init>(r12, r10, r2)
            efm.r r10 = r6.f(r7, r4)
            efm.r r10 = mo3.a.n(r10)
            ewh.y r12 = new ewh.y
            r2 = 20
            r12.<init>(r2)
            efm.r r10 = m70.a.g(r10, r5, r12, r4)
            r0.u = r9
            r0.v = r11
            r0.f131294y = r4
            java.lang.Object r12 = nim.a.c(r10, r0)
            if (r12 != r1) goto L84
            goto L97
        L84:
            com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart r12 = (com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart) r12
            kotlin.jvm.internal.Intrinsics.h(r12)
            r0.u = r5
            r0.v = r11
            r0.f131294y = r3
            myk.b r10 = r8.f131306c
            com.revolut.retail.core.navigation.NaviCommand r12 = r10.c(r12, r9)
            if (r12 != r1) goto L98
        L97:
            return r1
        L98:
            r9 = r11
        L99:
            com.revolut.retail.core.navigation.NaviCommand r12 = (com.revolut.retail.core.navigation.NaviCommand) r12
            if (r9 == 0) goto La4
            com.revolut.retail.core.navigation.FinishFlowCommand r9 = com.revolut.retail.core.navigation.FinishFlowCommand.f98647a
            com.revolut.retail.core.navigation.CompositeCommand r9 = com.revolut.retail.core.navigation.a.c(r9, r12)
            return r9
        La4:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: f1l.g.b(com.revolut.retail.feature.trading_onboarding.api.navigation.TradingOnboardingFeatureConfig$TradingRemediationFeatureConfig, com.revolut.retail.feature.trading_onboarding.api.domain.model.OnboardingPart, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f1l.g.c(com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007f, code lost:
    
        if (r11 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r9, java.lang.String r10, gim.c r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof f1l.f
            if (r0 == 0) goto L13
            r0 = r11
            f1l.f r0 = (f1l.f) r0
            int r1 = r0.f131303y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f131303y = r1
            goto L18
        L13:
            f1l.f r0 = new f1l.f
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f131301w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f131303y
            ybl.k r3 = r8.f131305b
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L37
            if (r2 != r4) goto L2f
            java.lang.String r9 = r0.u
            yhm.o.b(r11)
            goto L82
        L2f:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L37:
            java.lang.String r10 = r0.v
            java.lang.String r9 = r0.u
            yhm.o.b(r11)
            goto L6b
        L3f:
            yhm.o.b(r11)
            cfl.k r11 = cfl.k.f23744a
            r2 = 3
            kotlinx.coroutines.flow.Flow r11 = ybl.k.k(r3, r6, r6, r11, r2)
            zfd.e r11 = zi0.c.w(r11)
            ewh.y r2 = new ewh.y
            r7 = 19
            r2.<init>(r7)
            jhi.b r11 = mo3.a.g(r11, r6, r2, r5)
            f1l.e r2 = new f1l.e
            r7 = 0
            r2.<init>(r11, r9, r7)
            r0.u = r9
            r0.v = r10
            r0.f131303y = r5
            java.lang.Object r11 = vkm.q.z(r2, r0)
            if (r11 != r1) goto L6b
            goto L81
        L6b:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard r11 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountAvailableToOnboard) r11
            if (r11 == 0) goto L87
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccountType r2 = r11.d
            java.lang.String r11 = r11.f105265a
            r0.u = r9
            r0.v = r6
            r0.f131303y = r4
            ael.q0 r3 = (ael.q0) r3
            java.lang.Object r11 = r3.m(r2, r11, r10, r0)
            if (r11 != r1) goto L82
        L81:
            return r1
        L82:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r11 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r11
            if (r11 == 0) goto L87
            return r11
        L87:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "Trading account with Available Account Id: "
            java.lang.String r0 = " is not available for onboard but onboarding was launched!"
            java.lang.String r9 = a10.b.s(r11, r9, r0)
            r10.<init>(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f1l.g.d(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }
}

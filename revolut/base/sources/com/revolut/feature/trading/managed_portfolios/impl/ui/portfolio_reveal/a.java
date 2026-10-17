package com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal;

import b7d.c;
import com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealFlowContract$Step;
import d8l.d;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import tzg.m;
import yki.i;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends h implements b8f.b {
    public final PortfolioRevealFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final m4f.b f91430p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final m f91431q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i f91432r;

    public a(PortfolioRevealFlowContract$InputData inputData, m4f.b wealthAddMoneyCommandProvider, m wealthAccountsInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthAddMoneyCommandProvider, "wealthAddMoneyCommandProvider");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        this.o = inputData;
        this.f91430p = wealthAddMoneyCommandProvider;
        this.f91431q = wealthAccountsInteractor;
        this.f91432r = d.a(this, new c(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a r12, gim.c r13) {
        /*
            com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.PortfolioRevealFlowContract$InputData r0 = r12.o
            boolean r1 = r13 instanceof b8f.d
            if (r1 == 0) goto L15
            r1 = r13
            b8f.d r1 = (b8f.d) r1
            int r2 = r1.f13228w
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f13228w = r2
            goto L1a
        L15:
            b8f.d r1 = new b8f.d
            r1.<init>(r12, r13)
        L1a:
            java.lang.Object r13 = r1.u
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f13228w
            r4 = 1
            if (r3 == 0) goto L31
            if (r3 != r4) goto L29
            yhm.o.b(r13)
            goto L5d
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L31:
            yhm.o.b(r13)
            tzg.m r13 = r12.f91431q
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r3 = com.revolut.shared.feature.wealth.models.account.WealthAccountType.ROBO
            r5 = 4
            r6 = 0
            akg.n r13 = tzg.m.d(r13, r3, r6, r5)
            b73.h r3 = new b73.h
            r5 = 25
            r3.<init>(r5)
            akg.n r13 = nim.a.v(r13, r3)
            b6d.a r3 = new b6d.a
            r5 = 16
            r3.<init>(r5)
            jhi.b r13 = mo3.a.g(r13, r6, r3, r4)
            r1.f13228w = r4
            java.lang.Object r13 = vkm.q.x(r13, r1)
            if (r13 != r2) goto L5d
            return r2
        L5d:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            m4f.b r5 = r12.f91430p
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId$Portfolio r6 = new com.revolut.feature.wealth.models.addmoney.TransferSubjectId$Portfolio
            java.lang.String r1 = r0.f91418b
            r6.<init>(r1)
            com.revolut.shared.feature.wealth.models.account.WealthAccountType r7 = com.revolut.shared.feature.wealth.models.account.WealthAccountType.ROBO
            r9 = 0
            r10 = 12
            r8 = 0
            com.revolut.retail.core.navigation.FeatureCommand r1 = b3f.b.b(r5, r6, r7, r8, r9, r10)
            if (r13 == 0) goto L9d
            com.revolut.retail.core.navigation.FeatureCommand r13 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r5 = new com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig
            com.revolut.feature.trading.managed_portfolios.api.navigation.ManagedPortfolioDetailsDestination r7 = new com.revolut.feature.trading.managed_portfolios.api.navigation.ManagedPortfolioDetailsDestination
            java.lang.String r0 = r0.f91417a
            r7.<init>(r0)
            r10 = 0
            r11 = 61
            r6 = 0
            r8 = 0
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r13.<init>(r5)
            com.revolut.retail.core.navigation.CompositeCommand r0 = new com.revolut.retail.core.navigation.CompositeCommand
            r2 = 2
            com.revolut.retail.core.navigation.NaviCommand[] r2 = new com.revolut.retail.core.navigation.NaviCommand[r2]
            r3 = 0
            r2[r3] = r13
            r2[r4] = r1
            r0.<init>(r2)
            r1 = r0
        L9d:
            com.revolut.kompot.bridge.navigation.BridgeDestination r13 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            r13.<init>(r1)
            r12.C1(r13)
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a.I2(com.revolut.feature.trading.managed_portfolios.impl.ui.portfolio_reveal.a, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        h.t2(this, this.f91432r, PortfolioRevealFlowContract$Step.Loading.f91422a, true, null, false, 12);
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f91432r;
    }
}

package com.revolut.feature.retail.savings.impl.ui.add_money;

import d8l.d;
import djb.n;
import djb.u;
import kotlin.jvm.internal.Intrinsics;
import mci.e;
import ml3.y;
import oki.h;
import she.g;
import yki.i;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends h implements mob.b {
    public final SavingsAddMoneyFlowContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final n f83355p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final u f83356q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final gob.h f83357r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final g f83358s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f83359t;

    public b(SavingsAddMoneyFlowContract$InputData inputData, n savingsAccountsDetailsInteractor, u tradingOnboardingStatusProvider, gob.h routeResolver, g productAccountDestinationResolver) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(savingsAccountsDetailsInteractor, "savingsAccountsDetailsInteractor");
        Intrinsics.checkNotNullParameter(tradingOnboardingStatusProvider, "tradingOnboardingStatusProvider");
        Intrinsics.checkNotNullParameter(routeResolver, "routeResolver");
        Intrinsics.checkNotNullParameter(productAccountDestinationResolver, "productAccountDestinationResolver");
        this.o = inputData;
        this.f83355p = savingsAccountsDetailsInteractor;
        this.f83356q = tradingOnboardingStatusProvider;
        this.f83357r = routeResolver;
        this.f83358s = productAccountDestinationResolver;
        this.f83359t = d.a(this, new mnl.g(this, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.retail.savings.impl.ui.add_money.b r4, pcd.s r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof mob.d
            if (r0 == 0) goto L13
            r0 = r6
            mob.d r0 = (mob.d) r0
            int r1 = r0.f207602w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f207602w = r1
            goto L18
        L13:
            mob.d r0 = new mob.d
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f207602w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L6b
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            djb.u r4 = r4.f83356q
            java.util.List r5 = zhm.u.c(r5)
            rnb.x r4 = (rnb.x) r4
            w4l.h r6 = w4l.h.f294642c
            efm.r r4 = r4.a(r5, r6)
            mlk.a0 r5 = new mlk.a0
            r6 = 16
            r5.<init>(r6)
            efm.r r4 = nim.a.w(r4, r5)
            mh1.e r5 = new mh1.e
            r6 = 23
            r5.<init>(r6)
            r6 = 0
            efm.r r4 = m70.a.g(r4, r6, r5, r3)
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            efm.d0 r4 = r4.first(r5)
            java.lang.String r5 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r5)
            r0.f207602w = r3
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L6b
            return r1
        L6b:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.retail.savings.impl.ui.add_money.b.I2(com.revolut.feature.retail.savings.impl.ui.add_money.b, pcd.s, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new e(this, null, 15), new y(this, 14));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f83359t;
    }
}

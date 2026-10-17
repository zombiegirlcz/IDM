package vul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vrl.c f292411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vrl.b f292412b;

    public c(vrl.c investOrderInteractor, vrl.b fetchOrderLimitsByPortfolioInteractor) {
        Intrinsics.checkNotNullParameter(investOrderInteractor, "investOrderInteractor");
        Intrinsics.checkNotNullParameter(fetchOrderLimitsByPortfolioInteractor, "fetchOrderLimitsByPortfolioInteractor");
        this.f292411a = investOrderInteractor;
        this.f292412b = fetchOrderLimitsByPortfolioInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof vul.a
            if (r0 == 0) goto L13
            r0 = r7
            vul.a r0 = (vul.a) r0
            int r1 = r0.f292408x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292408x = r1
            goto L18
        L13:
            vul.a r0 = new vul.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292408x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r6 = r0.u
            yhm.o.b(r7)
            goto L5a
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            nel.n r7 = r6.getF91696a()
            nel.z r2 = r7.f214597c
            boolean r2 = io3.h.i(r2)
            if (r2 == 0) goto L8c
            nel.d r7 = ifk.b.f(r7)
            if (r7 == 0) goto L4a
            nel.b r7 = r7.d
            goto L4b
        L4a:
            r7 = r3
        L4b:
            nel.b r2 = nel.b.NON_FRACTIONAL
            if (r7 != r2) goto L8c
            r0.u = r6
            r0.f292408x = r4
            java.lang.Object r7 = r5.b(r6, r0)
            if (r7 != r1) goto L5a
            return r1
        L5a:
            k4l.e0 r7 = (k4l.e0) r7
            k4l.r0 r0 = r6.getF91698c()
            boolean r0 = n14.k.n(r7, r0)
            if (r0 == 0) goto L67
            goto L8c
        L67:
            k4l.r0 r0 = k4l.r0.LIMIT
            boolean r7 = n14.k.n(r7, r0)
            if (r7 == 0) goto L8c
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData$a r7 = com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData.INSTANCE
            nel.n r0 = r6.getF91696a()
            java.util.UUID r1 = r6.getF91697b()
            bfl.g r2 = r6.getD()
            dfl.r r6 = r6.getI()
            if (r6 != 0) goto L85
            dfl.r r6 = dfl.r.STOCK_QUANTITY
        L85:
            r7.getClass()
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r6 = com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData.Companion.a(r0, r1, r2, r3, r6)
        L8c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: vul.c.a(com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vul.b
            if (r0 == 0) goto L13
            r0 = r8
            vul.b r0 = (vul.b) r0
            int r1 = r0.f292410x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292410x = r1
            goto L18
        L13:
            vul.b r0 = new vul.b
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292410x
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            return r8
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r7 = r0.u
            yhm.o.b(r8)
            goto L56
        L39:
            yhm.o.b(r8)
            vrl.c r8 = r6.f292411a
            java.util.UUID r2 = r7.getF91697b()
            kotlinx.coroutines.flow.Flow r8 = vrl.c.a(r8, r2)
            r2 = 3
            jhi.b r8 = mo3.a.g(r8, r5, r5, r2)
            r0.u = r7
            r0.f292410x = r3
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L56
            goto L7f
        L56:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r8 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r8
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r8 = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(r8)
            java.util.UUID r8 = r8.f105210a
            java.lang.String r8 = r8.toString()
            java.lang.String r2 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            nel.n r2 = r7.getF91696a()
            java.lang.String r2 = r2.f214596b
            bfl.g r7 = r7.getD()
            r0.u = r5
            r0.f292410x = r4
            vrl.b r3 = r6.f292412b
            prl.r r3 = r3.f291616a
            java.lang.Object r7 = r3.b(r8, r2, r7, r0)
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vul.c.b(com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData, gim.c):java.lang.Object");
    }
}

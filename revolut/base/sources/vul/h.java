package vul;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vrl.c f292420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vrl.b f292421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ybl.b f292422c;

    public h(vrl.c investOrderInteractor, vrl.b fetchOrderLimitsByPortfolioInteractor, ybl.b instrumentTickerInteractor) {
        Intrinsics.checkNotNullParameter(investOrderInteractor, "investOrderInteractor");
        Intrinsics.checkNotNullParameter(fetchOrderLimitsByPortfolioInteractor, "fetchOrderLimitsByPortfolioInteractor");
        Intrinsics.checkNotNullParameter(instrumentTickerInteractor, "instrumentTickerInteractor");
        this.f292420a = investOrderInteractor;
        this.f292421b = fetchOrderLimitsByPortfolioInteractor;
        this.f292422c = instrumentTickerInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof vul.d
            if (r0 == 0) goto L13
            r0 = r9
            vul.d r0 = (vul.d) r0
            int r1 = r0.C
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.C = r1
            goto L18
        L13:
            vul.d r0 = new vul.d
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.A
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.C
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L49
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            bfl.g r8 = r0.z
            java.util.UUID r1 = r0.f292415y
            nel.n r2 = r0.f292414x
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData$a r3 = r0.f292413w
            nel.n r4 = r0.v
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r0 = r0.u
            yhm.o.b(r9)
            goto L8d
        L36:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3e:
            nel.n r8 = r0.v
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r2 = r0.u
            yhm.o.b(r9)
            r6 = r2
            r2 = r8
            r8 = r6
            goto L60
        L49:
            yhm.o.b(r9)
            nel.n r9 = r8.getF91696a()
            r0.u = r8
            r0.v = r9
            r0.C = r4
            java.lang.Object r2 = r7.c(r8, r0)
            if (r2 != r1) goto L5d
            goto L86
        L5d:
            r6 = r2
            r2 = r9
            r9 = r6
        L60:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto La8
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData$a r9 = com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData.INSTANCE
            java.util.UUID r4 = r8.getF91697b()
            bfl.g r5 = r8.getD()
            r0.u = r8
            r0.v = r2
            r0.f292413w = r9
            r0.f292414x = r2
            r0.f292415y = r4
            r0.z = r5
            r0.C = r3
            java.lang.Object r0 = r7.b(r2, r0)
            if (r0 != r1) goto L87
        L86:
            return r1
        L87:
            r3 = r9
            r9 = r0
            r1 = r4
            r0 = r8
            r4 = r2
            r8 = r5
        L8d:
            java.math.BigDecimal r9 = (java.math.BigDecimal) r9
            com.revolut.shared.feature.market_data.models.domain.models.Asset r4 = yoj.b.a(r4)
            com.revolut.shared.feature.market_data.models.domain.models.Amount r5 = new com.revolut.shared.feature.market_data.models.domain.models.Amount
            r5.<init>(r9, r4)
            dfl.r r9 = r0.getI()
            if (r9 != 0) goto La0
            dfl.r r9 = dfl.r.STOCK_QUANTITY
        La0:
            r3.getClass()
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r8 = com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData.Companion.a(r2, r1, r8, r5, r9)
            return r8
        La8:
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData$a r9 = com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData.INSTANCE
            java.util.UUID r0 = r8.getF91697b()
            bfl.g r8 = r8.getD()
            com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r8 = com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData.Companion.c(r9, r2, r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: vul.h.a(com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(nel.n r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof vul.f
            if (r0 == 0) goto L13
            r0 = r6
            vul.f r0 = (vul.f) r0
            int r1 = r0.f292417w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292417w = r1
            goto L18
        L13:
            vul.f r0 = new vul.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292417w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L54
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r5 = r5.f214596b
            w4l.i r6 = w4l.i.f294643c
            ybl.b r2 = r4.f292422c
            ael.k r2 = (ael.k) r2
            akg.n r5 = r2.o(r5, r6)
            q87.q r6 = new q87.q
            r2 = 12
            r6.<init>(r5, r2)
            r5 = 3
            r2 = 0
            jhi.b r5 = mo3.a.g(r6, r2, r2, r5)
            r0.f292417w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L54
            return r1
        L54:
            com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker r6 = (com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker) r6
            dj0.d r5 = r6.e
            java.math.BigDecimal r5 = pyd.c.Y(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vul.h.b(nel.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x007d, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vul.g
            if (r0 == 0) goto L13
            r0 = r8
            vul.g r0 = (vul.g) r0
            int r1 = r0.f292419x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292419x = r1
            goto L18
        L13:
            vul.g r0 = new vul.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292419x
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L39
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L80
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
            vrl.c r8 = r6.f292420a
            java.util.UUID r2 = r7.getF91697b()
            kotlinx.coroutines.flow.Flow r8 = vrl.c.a(r8, r2)
            r2 = 3
            jhi.b r8 = mo3.a.g(r8, r5, r5, r2)
            r0.u = r7
            r0.f292419x = r3
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
            r0.f292419x = r4
            vrl.b r3 = r6.f292421b
            prl.r r3 = r3.f291616a
            java.lang.Object r8 = r3.b(r8, r2, r7, r0)
            if (r8 != r1) goto L80
        L7f:
            return r1
        L80:
            k4l.e0 r8 = (k4l.e0) r8
            k4l.r0 r7 = k4l.r0.LIMIT
            boolean r7 = n14.k.n(r8, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vul.h.c(com.revolut.feature.trading_orders.api.invest.placement.InvestOrderContract$InputData, gim.c):java.lang.Object");
    }
}

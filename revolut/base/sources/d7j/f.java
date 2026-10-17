package d7j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f implements b2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b7j.j f111993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ybl.d f111994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wsg.n f111995c;
    public final tzg.m d;
    public final i90.b e;
    public final g7j.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final fuk.a f111996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l6j.b f111997h;

    public f(b7j.j counterpartCurrencyProvider, ybl.d tradingPortfolioInteractor, wsg.n walletInteractor, tzg.m wealthAccountsInteractor, i90.b uuidUtils, g7j.b allowedAssetsProvider, fuk.a recurringBuySettingsProvider, l6j.b flowSettingsInteractor) {
        Intrinsics.checkNotNullParameter(counterpartCurrencyProvider, "counterpartCurrencyProvider");
        Intrinsics.checkNotNullParameter(tradingPortfolioInteractor, "tradingPortfolioInteractor");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(wealthAccountsInteractor, "wealthAccountsInteractor");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        Intrinsics.checkNotNullParameter(allowedAssetsProvider, "allowedAssetsProvider");
        Intrinsics.checkNotNullParameter(recurringBuySettingsProvider, "recurringBuySettingsProvider");
        Intrinsics.checkNotNullParameter(flowSettingsInteractor, "flowSettingsInteractor");
        this.f111993a = counterpartCurrencyProvider;
        this.f111994b = tradingPortfolioInteractor;
        this.f111995c = walletInteractor;
        this.d = wealthAccountsInteractor;
        this.e = uuidUtils;
        this.f = allowedAssetsProvider;
        this.f111996g = recurringBuySettingsProvider;
        this.f111997h = flowSettingsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r11 == r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xi0.b r8, l6j.c r9, java.util.Set r10, gim.c r11) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r11 instanceof d7j.b
            if (r0 == 0) goto L13
            r0 = r11
            d7j.b r0 = (d7j.b) r0
            int r1 = r0.f111976y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111976y = r1
            goto L18
        L13:
            d7j.b r0 = new d7j.b
            r0.<init>(r7, r11)
        L18:
            java.lang.Object r11 = r0.f111974w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111976y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L45
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.util.Set r8 = r0.v
            java.util.Set r8 = (java.util.Set) r8
            yhm.o.b(r11)
            goto L9c
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3a:
            java.util.Set r8 = r0.v
            r10 = r8
            java.util.Set r10 = (java.util.Set) r10
            xi0.b r8 = r0.u
            yhm.o.b(r11)
            goto L73
        L45:
            java.util.Set r8 = r0.v
            java.util.Set r8 = (java.util.Set) r8
            yhm.o.b(r11)
            return r11
        L4d:
            yhm.o.b(r11)
            r11 = -1
            if (r9 != 0) goto L55
            r9 = r11
            goto L5d
        L55:
            int[] r2 = d7j.a.f111972c
            int r9 = r9.ordinal()
            r9 = r2[r9]
        L5d:
            if (r9 == r11) goto La7
            if (r9 == r5) goto La7
            if (r9 != r4) goto La1
            r0.u = r8
            r9 = r10
            java.util.Set r9 = (java.util.Set) r9
            r0.v = r9
            r0.f111976y = r4
            java.lang.Object r11 = r7.c(r8, r0)
            if (r11 != r1) goto L73
            goto Lb3
        L73:
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangePocket r11 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangePocket) r11
            if (r11 != 0) goto La0
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r11 = r8.f306286a
            java.lang.String r2 = "No trading pocket for currency="
            java.lang.String r11 = j6.a.q(r2, r11)
            r9.<init>(r11)
            hx7.e.n(r9)
            l6j.c r9 = l6j.c.RETAIL_POCKET
            boolean r9 = r10.contains(r9)
            if (r9 == 0) goto L9f
            r0.u = r6
            r0.v = r6
            r0.f111976y = r3
            java.lang.Object r11 = r7.b(r8, r0)
            if (r11 != r1) goto L9c
            goto Lb3
        L9c:
            com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangePocket r11 = (com.revolut.retail.feature.commodity.order_flow.impl.ui.placement.models.ExchangePocket) r11
            return r11
        L9f:
            return r6
        La0:
            return r11
        La1:
            kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
            r8.<init>()
            throw r8
        La7:
            r0.u = r6
            r0.v = r6
            r0.f111976y = r5
            java.lang.Object r8 = r7.b(r8, r0)
            if (r8 != r1) goto Lb4
        Lb3:
            return r1
        Lb4:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: d7j.f.a(xi0.b, l6j.c, java.util.Set, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(xi0.b r11, gim.c r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof d7j.c
            if (r0 == 0) goto L13
            r0 = r12
            d7j.c r0 = (d7j.c) r0
            int r1 = r0.f111980w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111980w = r1
            goto L18
        L13:
            d7j.c r0 = new d7j.c
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111980w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L7d
        L27:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L2f:
            yhm.o.b(r12)
            io3.i r7 = io3.i.INTERNAL
            com.revolut.core.model.account.AccountId$Personal r8 = com.revolut.core.model.account.AccountId.Personal.f51414a
            r9 = 22
            wsg.n r4 = r10.f111995c
            r6 = 0
            r5 = r11
            efm.d0 r11 = osg.b.r(r4, r5, r6, r7, r8, r9)
            d6j.b r12 = new d6j.b
            r2 = 19
            r12.<init>(r2)
            d73.n r2 = new d73.n
            r4 = 4
            r2.<init>(r12, r4)
            r11.getClass()
            ufm.i r12 = new ufm.i
            r4 = 1
            r12.<init>(r11, r2, r4)
            java.lang.String r11 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r11)
            java.lang.String r11 = r5.f306286a
            java.lang.String r2 = "no_pocket_for_currency_"
            java.lang.String r11 = j6.a.q(r2, r11)
            java.lang.String r2 = "new_commodity_exchange_default_currency_selection_failure"
            java.util.Set r11 = m72.b.w(r2, r11)
            d6j.b r2 = new d6j.b
            r4 = 20
            r2.<init>(r4)
            pfm.z r11 = ue0.e.I(r12, r11, r2)
            r0.f111980w = r3
            java.lang.Object r12 = nim.a.b(r11, r0)
            if (r12 != r1) goto L7d
            return r1
        L7d:
            od0.i r12 = (od0.i) r12
            java.lang.Object r11 = r12.f224257a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: d7j.f.b(xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(xi0.b r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof d7j.d
            if (r0 == 0) goto L13
            r0 = r8
            d7j.d r0 = (d7j.d) r0
            int r1 = r0.f111985w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f111985w = r1
            goto L18
        L13:
            d7j.d r0 = new d7j.d
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f111985w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L78
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            tzg.m r8 = r6.d
            r2 = 3
            r4 = 0
            akg.n r8 = tzg.m.c(r8, r4, r4, r2)
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a
            efm.r r8 = rd0.e.c(r8, r2)
            d34.b r2 = new d34.b
            r5 = 15
            r2.<init>(r6, r5)
            efm.r r8 = pd.b.r(r8, r2)
            a94.q r2 = new a94.q
            r5 = 20
            r2.<init>(r5, r7)
            efm.r r7 = nim.a.w(r8, r2)
            czh.a r8 = new czh.a
            r2 = 29
            r8.<init>(r2)
            efm.r r7 = m70.a.g(r7, r4, r8, r3)
            od0.h r8 = od0.i.Companion
            r8.getClass()
            od0.i r8 = od0.i.f224256b
            efm.d0 r7 = r7.first(r8)
            kotlin.jvm.internal.Intrinsics.h(r7)
            r0.f111985w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L78
            return r1
        L78:
            od0.i r8 = (od0.i) r8
            java.lang.Object r7 = r8.f224257a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d7j.f.c(xi0.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig r38, java.util.Set r39, gim.c r40) {
        /*
            Method dump skipped, instruction units count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d7j.f.d(com.revolut.retail.feature.commodity.order_flow.api.navigation.CommodityOrderFlowConfig, java.util.Set, gim.c):java.lang.Object");
    }
}

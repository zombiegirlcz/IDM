package ldh;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final udf.a f194117a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vrl.b f194118b;

    public i(udf.a createTradingOrderCommandProvider, vrl.b fetchOrderLimitsByPortfolioInteractor) {
        Intrinsics.checkNotNullParameter(createTradingOrderCommandProvider, "createTradingOrderCommandProvider");
        Intrinsics.checkNotNullParameter(fetchOrderLimitsByPortfolioInteractor, "fetchOrderLimitsByPortfolioInteractor");
        this.f194117a = createTradingOrderCommandProvider;
        this.f194118b = fetchOrderLimitsByPortfolioInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(ldh.i r7, nel.n r8, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r9, bfl.g r10, gim.c r11) throws java.lang.Throwable {
        /*
            r7.getClass()
            udf.a r0 = r7.f194117a
            boolean r1 = r11 instanceof ldh.h
            if (r1 == 0) goto L18
            r1 = r11
            ldh.h r1 = (ldh.h) r1
            int r2 = r1.z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.z = r2
            goto L1d
        L18:
            ldh.h r1 = new ldh.h
            r1.<init>(r7, r11)
        L1d:
            java.lang.Object r11 = r1.f194115x
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.z
            r4 = 3
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L48
            if (r3 == r6) goto L3e
            if (r3 == r5) goto L3a
            if (r3 != r4) goto L32
            yhm.o.b(r11)
            return r11
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            yhm.o.b(r11)
            return r11
        L3e:
            bfl.g r10 = r1.f194114w
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r9 = r1.v
            nel.n r8 = r1.u
            yhm.o.b(r11)
            goto L6f
        L48:
            yhm.o.b(r11)
            vrl.b r7 = r7.f194118b
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Portfolio r11 = com.revolut.shared.feature.wealth.models.trading_accounts.d.l(r9)
            java.util.UUID r11 = r11.f105210a
            java.lang.String r11 = r11.toString()
            java.lang.String r3 = "toString(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r3)
            java.lang.String r3 = r8.f214596b
            r1.u = r8
            r1.v = r9
            r1.f194114w = r10
            r1.z = r6
            prl.r r7 = r7.f291616a
            java.lang.Object r11 = r7.b(r11, r3, r10, r1)
            if (r11 != r2) goto L6f
            goto Lb0
        L6f:
            k4l.e0 r11 = (k4l.e0) r11
            k4l.r0 r7 = k4l.r0.MARKET
            boolean r7 = n14.k.n(r11, r7)
            r3 = 0
            if (r7 == 0) goto L92
            java.lang.String r7 = r8.f214596b
            csl.c r0 = (csl.c) r0
            ufm.i r7 = r0.c(r7, r10, r9)
            r1.u = r3
            r1.v = r3
            r1.f194114w = r3
            r1.z = r5
            java.lang.Object r7 = nim.a.b(r7, r1)
            if (r7 != r2) goto L91
            goto Lb0
        L91:
            return r7
        L92:
            k4l.r0 r7 = k4l.r0.LIMIT
            boolean r7 = n14.k.n(r11, r7)
            if (r7 == 0) goto Lb2
            java.lang.String r7 = r8.f214596b
            csl.c r0 = (csl.c) r0
            ufm.i r7 = r0.b(r7, r10, r9, r3)
            r1.u = r3
            r1.v = r3
            r1.f194114w = r3
            r1.z = r4
            java.lang.Object r7 = nim.a.b(r7, r1)
            if (r7 != r2) goto Lb1
        Lb0:
            return r2
        Lb1:
            return r7
        Lb2:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = r8.f214596b
            java.lang.String r9 = "No supported order type available for IPO instrument "
            java.lang.String r8 = j6.a.q(r9, r8)
            r7.<init>(r8)
            hx7.e.n(r7)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ldh.i.a(ldh.i, nel.n, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount, bfl.g, gim.c):java.lang.Object");
    }
}

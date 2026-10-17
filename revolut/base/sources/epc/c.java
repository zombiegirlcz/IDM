package epc;

import kotlin.jvm.internal.Intrinsics;
import ybl.k;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1h.e f128139a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f128140b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f128141c;
    public final zjh.f d;
    public final tul.b e;

    public c(o1h.e flowInfo, k tradingAccountsInteractor, gte.a featureToggleInteractor, zjh.f portfolioInteractor, tul.b portfolioMetricsInteractor) {
        Intrinsics.checkNotNullParameter(flowInfo, "flowInfo");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(portfolioInteractor, "portfolioInteractor");
        Intrinsics.checkNotNullParameter(portfolioMetricsInteractor, "portfolioMetricsInteractor");
        this.f128139a = flowInfo;
        this.f128140b = tradingAccountsInteractor;
        this.f128141c = featureToggleInteractor;
        this.d = portfolioInteractor;
        this.e = portfolioMetricsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.wealth.models.addmoney.TransferSubjectId r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof epc.a
            if (r0 == 0) goto L13
            r0 = r7
            epc.a r0 = (epc.a) r0
            int r1 = r0.f128137x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128137x = r1
            goto L18
        L13:
            epc.a r0 = new epc.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128137x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L62
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.wealth.models.addmoney.TransferSubjectId r6 = r0.u
            yhm.o.b(r7)
            goto L4c
        L38:
            yhm.o.b(r7)
            java.lang.String r7 = r6.getF95657a()
            r0.u = r6
            r0.f128137x = r4
            zjh.f r2 = r5.d
            java.lang.Object r7 = r2.E(r7, r0)
            if (r7 != r1) goto L4c
            goto L61
        L4c:
            tul.b r7 = r5.e
            java.lang.String r6 = r6.getF95657a()
            efm.b r6 = r7.j(r6)
            r7 = 0
            r0.u = r7
            r0.f128137x = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L62
        L61:
            return r1
        L62:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: epc.c.a(com.revolut.feature.wealth.models.addmoney.TransferSubjectId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.wealth.models.addmoney.TransferSubjectId r7, com.revolut.feature.wealth.api.navigation.models.DepositInfo.OneOffDeposit r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof epc.b
            if (r0 == 0) goto L13
            r0 = r9
            epc.b r0 = (epc.b) r0
            int r1 = r0.f128138w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128138w = r1
            goto L18
        L13:
            epc.b r0 = new epc.b
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128138w
            r3 = 1
            o1h.a r4 = o1h.a.f221386a
            r5 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L55
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r9)
            if (r8 != 0) goto L78
            o1h.e r8 = r6.f128139a
            java.lang.Long r8 = r8.f221389a
            if (r8 == 0) goto L77
            ybl.k r8 = r6.f128140b
            java.lang.String r7 = r7.getF95657a()
            akg.n r7 = ybl.k.i(r8, r7)
            r8 = 3
            jhi.b r7 = mo3.a.g(r7, r5, r5, r8)
            r0.f128138w = r3
            java.lang.Object r9 = vkm.q.z(r7, r0)
            if (r9 != r1) goto L55
            return r1
        L55:
            od0.i r9 = (od0.i) r9
            if (r9 == 0) goto L5e
            java.lang.Object r7 = r9.f224257a
            r5 = r7
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r5 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r5
        L5e:
            boolean r7 = r5 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Robo.Regular
            if (r7 == 0) goto L72
            com.revolut.feature.robo.api.RoboApi$Toggles$RoboPortfolioDetailsScreenRevamp r7 = com.revolut.feature.robo.api.RoboApi$Toggles.RoboPortfolioDetailsScreenRevamp.f85023c
            gte.a r8 = r6.f128141c
            jte.d r8 = (jte.d) r8
            boolean r7 = r8.c(r7)
            if (r7 == 0) goto L6f
            goto L77
        L6f:
            o1h.b r7 = o1h.b.f221387a
            return r7
        L72:
            java.lang.String r7 = "Account not found for portfolio id."
            r6.b.D(r7)
        L77:
            return r4
        L78:
            o1h.c r7 = new o1h.c
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: epc.c.b(com.revolut.feature.wealth.models.addmoney.TransferSubjectId, com.revolut.feature.wealth.api.navigation.models.DepositInfo$OneOffDeposit, gim.c):java.lang.Object");
    }
}

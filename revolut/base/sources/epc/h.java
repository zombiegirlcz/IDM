package epc;

import kotlin.jvm.internal.Intrinsics;
import ybl.k;

/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o1h.e f128153a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qmc.h f128154b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nmc.a f128155c;
    public final k d;

    public h(o1h.e flowInfo, qmc.h portfolioInfoProvider, nmc.a addMoneySuccessDialogMapper, k tradingAccountsInteractor) {
        Intrinsics.checkNotNullParameter(flowInfo, "flowInfo");
        Intrinsics.checkNotNullParameter(portfolioInfoProvider, "portfolioInfoProvider");
        Intrinsics.checkNotNullParameter(addMoneySuccessDialogMapper, "addMoneySuccessDialogMapper");
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        this.f128153a = flowInfo;
        this.f128154b = portfolioInfoProvider;
        this.f128155c = addMoneySuccessDialogMapper;
        this.d = tradingAccountsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(epc.h r8, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Robo r9, com.revolut.feature.wealth.models.addmoney.TransferSubjectId r10, dj0.d r11, gim.c r12) throws java.lang.Throwable {
        /*
            r8.getClass()
            boolean r0 = r12 instanceof epc.d
            if (r0 == 0) goto L16
            r0 = r12
            epc.d r0 = (epc.d) r0
            int r1 = r0.f128144y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f128144y = r1
            goto L1b
        L16:
            epc.d r0 = new epc.d
            r0.<init>(r8, r12)
        L1b:
            java.lang.Object r12 = r0.f128142w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128144y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            dj0.d r11 = r0.v
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Robo r9 = r0.u
            yhm.o.b(r12)
            goto L56
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            yhm.o.b(r12)
            java.lang.String r10 = r10.getF95657a()
            r0.u = r9
            r0.v = r11
            r0.f128144y = r3
            qmc.h r12 = r8.f128154b
            kotlinx.coroutines.flow.Flow r10 = glc.a.a(r12, r10)
            r12 = 3
            jhi.b r10 = mo3.a.g(r10, r4, r4, r12)
            java.lang.Object r12 = vkm.q.z(r10, r0)
            if (r12 != r1) goto L56
            return r1
        L56:
            com.revolut.feature.wealth.models.robo.RoboPortfolioInfo r12 = (com.revolut.feature.wealth.models.robo.RoboPortfolioInfo) r12
            if (r12 != 0) goto L73
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "No portfolio info found for portfolio id"
            r8.<init>(r9)
            hx7.e.n(r8)
            com.revolut.core.ui_kit.models.TextClause r0 = new com.revolut.core.ui_kit.models.TextClause
            r6 = 0
            r7 = 126(0x7e, float:1.77E-43)
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        L73:
            if (r9 == 0) goto La1
            nmc.a r8 = r8.f128155c
            java.util.List r9 = r9.c0()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L81:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L95
            java.lang.Object r10 = r9.next()
            r0 = r10
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct r0 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct) r0
            boolean r0 = com.revolut.shared.feature.wealth.models.trading_accounts.e.a(r0)
            if (r0 == 0) goto L81
            goto L96
        L95:
            r10 = r4
        L96:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct r10 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingProduct) r10
            if (r10 == 0) goto L9c
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingProductCode r4 = r10.f105281b
        L9c:
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = r8.a(r12, r11, r4)
            return r8
        La1:
            com.revolut.core.ui_kit.models.TextClause r0 = new com.revolut.core.ui_kit.models.TextClause
            r6 = 0
            r7 = 126(0x7e, float:1.77E-43)
            java.lang.String r1 = ""
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: epc.h.a(epc.h, com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Robo, com.revolut.feature.wealth.models.addmoney.TransferSubjectId, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.wealth.models.addmoney.TransferSubjectId r7, kotlin.jvm.functions.Function2 r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof epc.g
            if (r0 == 0) goto L13
            r0 = r9
            epc.g r0 = (epc.g) r0
            int r1 = r0.f128152x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f128152x = r1
            goto L18
        L13:
            epc.g r0 = new epc.g
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f128152x
            r3 = 1
            r4 = 2
            r5 = 0
            if (r2 == 0) goto L3c
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r9)
            return r9
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            gim.i r7 = r0.u
            r8 = r7
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            yhm.o.b(r9)
            goto L5c
        L3c:
            yhm.o.b(r9)
            ybl.k r9 = r6.d
            java.lang.String r7 = r7.getF95657a()
            akg.n r7 = ybl.k.i(r9, r7)
            r9 = 3
            jhi.b r7 = mo3.a.g(r7, r5, r5, r9)
            r9 = r8
            gim.i r9 = (gim.i) r9
            r0.u = r9
            r0.f128152x = r3
            java.lang.Object r9 = vkm.q.z(r7, r0)
            if (r9 != r1) goto L5c
            goto L7f
        L5c:
            od0.i r9 = (od0.i) r9
            if (r9 == 0) goto L65
            java.lang.Object r7 = r9.f224257a
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r7 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount) r7
            goto L66
        L65:
            r7 = r5
        L66:
            boolean r9 = r7 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Robo
            if (r9 == 0) goto L6d
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount$Robo r7 = (com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Robo) r7
            goto L6e
        L6d:
            r7 = r5
        L6e:
            if (r7 != 0) goto L75
            java.lang.String r9 = "No Robo account found for portfolio ID"
            r6.b.D(r9)
        L75:
            r0.u = r5
            r0.f128152x = r4
            java.lang.Object r7 = r8.invoke(r7, r0)
            if (r7 != r1) goto L80
        L7f:
            return r1
        L80:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: epc.h.b(com.revolut.feature.wealth.models.addmoney.TransferSubjectId, kotlin.jvm.functions.Function2, gim.c):java.lang.Object");
    }
}

package vkh;

import com.revolut.feature.wealth.ui.api.navigation.InvestDocumentsType;
import com.revolut.feature.wealth.ui.impl.documents.details.InvestDocumentsDetailsScreenContract$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class q extends jki.g implements j {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final InvestDocumentsDetailsScreenContract$InputData f289954p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final qmc.h f289955q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vi0.b f289956r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final wsg.n f289957s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final d1h.e f289958t;
    public final ybl.l u;
    public final qmc.b v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f289959w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(jki.p stateMapper, InvestDocumentsDetailsScreenContract$InputData inputData, qmc.h roboPortfolioInfoProvider, vi0.b accountIdProvider, wsg.n walletInteractor, d1h.e disclaimersExtension, ybl.l tradingConfigInteractor, qmc.b roboContextProvider) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(roboPortfolioInfoProvider, "roboPortfolioInfoProvider");
        Intrinsics.checkNotNullParameter(accountIdProvider, "accountIdProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(disclaimersExtension, "disclaimersExtension");
        Intrinsics.checkNotNullParameter(tradingConfigInteractor, "tradingConfigInteractor");
        Intrinsics.checkNotNullParameter(roboContextProvider, "roboContextProvider");
        this.f289954p = inputData;
        this.f289955q = roboPortfolioInfoProvider;
        this.f289956r = accountIdProvider;
        this.f289957s = walletInteractor;
        this.f289958t = disclaimersExtension;
        this.u = tradingConfigInteractor;
        this.v = roboContextProvider;
        this.f289959w = new i(null, null, null, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(vkh.q r12, gim.c r13) {
        /*
            r12.getClass()
            boolean r0 = r13 instanceof vkh.m
            if (r0 == 0) goto L16
            r0 = r13
            vkh.m r0 = (vkh.m) r0
            int r1 = r0.f289952w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f289952w = r1
            goto L1b
        L16:
            vkh.m r0 = new vkh.m
            r0.<init>(r12, r13)
        L1b:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f289952w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r13)
            goto L83
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            yhm.o.b(r13)
            wsg.n r4 = r12.f289957s
            io3.l r5 = io3.l.CURRENT
            vi0.b r12 = r12.f289956r
            com.revolut.core.model.account.AccountId r10 = r12.f289492a
            r11 = 30
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            efm.d0 r12 = osg.b.j(r4, r5, r6, r7, r8, r9, r10, r11)
            vjk.b r13 = new vjk.b
            r2 = 6
            r13.<init>(r2)
            vif.c r2 = new vif.c
            r4 = 7
            r2.<init>(r13, r4)
            r12.getClass()
            ufm.i r13 = new ufm.i
            r4 = 1
            r13.<init>(r12, r2, r4)
            java.lang.String r12 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r12)
            vjk.b r12 = new vjk.b
            r2 = 7
            r12.<init>(r2)
            zhm.h0 r2 = zhm.h0.f322473a
            pfm.z r12 = ue0.e.I(r13, r2, r12)
            efm.r r12 = r12.x()
            java.lang.String r13 = "toObservable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r13)
            vkm.d r12 = rd0.e.b(r12)
            r0.f289952w = r3
            java.lang.Object r13 = vkm.q.z(r12, r0)
            if (r13 != r1) goto L83
            return r1
        L83:
            java.util.List r13 = (java.util.List) r13
            if (r13 != 0) goto L8a
            zhm.f0 r12 = zhm.f0.f322471a
            return r12
        L8a:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: vkh.q.y2(vkh.q, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        rdh.b bVar;
        InvestDocumentsDetailsScreenContract$InputData investDocumentsDetailsScreenContract$InputData = this.f289954p;
        InvestDocumentsType investDocumentsType = investDocumentsDetailsScreenContract$InputData.f95993a;
        InvestDocumentsType.ROBO robo = InvestDocumentsType.ROBO.f95912a;
        Continuation continuation = null;
        if (Intrinsics.f(investDocumentsType, robo)) {
            yji.l.a1(this, nim.a.v(glc.a.c(this.f289955q), new vjk.b(8)), null, null, new p(this, continuation, 2), 3);
            yji.l.a1(this, this.v.a(), null, null, new p(this, continuation, 3), 3);
        }
        InvestDocumentsType investDocumentsType2 = investDocumentsDetailsScreenContract$InputData.f95993a;
        if ((investDocumentsType2 instanceof InvestDocumentsType.Stocks) || (investDocumentsType2 instanceof InvestDocumentsType.TaxAdvantageDocument)) {
            bVar = rdh.b.INVEST_DOCUMENTS_DETAILS_SECURITIES_DISCLAIMER;
        } else if (Intrinsics.f(investDocumentsType2, InvestDocumentsType.COMMODITY.f95910a)) {
            bVar = rdh.b.INVEST_DOCUMENTS_DETAILS_COMMODITY_DISCLAIMER;
        } else if (investDocumentsType2 instanceof InvestDocumentsType.MarginTrading) {
            bVar = rdh.b.INVEST_DOCUMENTS_DETAILS_CFDS_DISCLAIMER;
        } else {
            if (!Intrinsics.f(investDocumentsType2, robo)) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = rdh.b.INVEST_DOCUMENTS_DETAILS_ROBO_DISCLAIMER;
        }
        yji.l.a1(this, ((gah.e) this.f289958t).Z2(zhm.u.c(bVar)), null, null, new p(this, continuation, 0), 3);
        yji.l.a1(this, ybl.l.d(this.u), null, null, new p(this, continuation, 1), 3);
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.f289959w;
    }
}

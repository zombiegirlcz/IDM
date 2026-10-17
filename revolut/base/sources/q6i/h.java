package q6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final usc.a f242625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gah.g f242626b;

    public h(usc.a wealthDisclaimersInteractor, gah.g wealthRemoteDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(wealthDisclaimersInteractor, "wealthDisclaimersInteractor");
        Intrinsics.checkNotNullParameter(wealthRemoteDisclaimersMapper, "wealthRemoteDisclaimersMapper");
        this.f242625a = wealthDisclaimersInteractor;
        this.f242626b = wealthRemoteDisclaimersMapper;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.api.model.AccountWrapper r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof q6i.g
            if (r0 == 0) goto L13
            r0 = r9
            q6i.g r0 = (q6i.g) r0
            int r1 = r0.f242621w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f242621w = r1
            goto L18
        L13:
            q6i.g r0 = new q6i.g
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f242621w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r9)
            goto L77
        L28:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L30:
            yhm.o.b(r9)
            com.revolut.feature_move_money.api.model.AccountSource r8 = r8.d
            boolean r9 = r8 instanceof com.revolut.feature_move_money.api.model.AccountSource.InvestCashHolding
            if (r9 == 0) goto L3c
            com.revolut.feature_move_money.api.model.AccountSource$InvestCashHolding r8 = (com.revolut.feature_move_money.api.model.AccountSource.InvestCashHolding) r8
            goto L3d
        L3c:
            r8 = r4
        L3d:
            if (r8 != 0) goto L40
            goto L8a
        L40:
            com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount r8 = r8.f97198a
            boolean r8 = r8 instanceof com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccount.Margin
            if (r8 != 0) goto L47
            goto L8a
        L47:
            rdh.b r8 = rdh.b.CFD_WITHDRAWAL
            java.util.List r8 = zhm.u.c(r8)
            w4l.h r9 = w4l.h.f294642c
            usc.a r2 = r7.f242625a
            kotlinx.coroutines.flow.Flow r8 = r2.l(r8, r9)
            pv7.t r9 = new pv7.t
            r2 = 11
            r9.<init>(r2)
            q34.a r2 = new q34.a
            r5 = 15
            r2.<init>(r5)
            q34.a r5 = new q34.a
            r6 = 16
            r5.<init>(r6)
            jhi.b r8 = mo3.a.f(r8, r2, r9, r5)
            r0.f242621w = r3
            java.lang.Object r9 = vkm.q.z(r8, r0)
            if (r9 != r1) goto L77
            return r1
        L77:
            od0.i r9 = (od0.i) r9
            if (r9 == 0) goto L8a
            java.lang.Object r8 = r9.f224257a
            rdh.a r8 = (rdh.a) r8
            if (r8 == 0) goto L8a
            gah.g r9 = r7.f242626b
            java.lang.String r8 = r8.f253458b
            com.revolut.core.ui_kit.models.HtmlClause r8 = r9.d(r4, r8)
            return r8
        L8a:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: q6i.h.a(com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }
}

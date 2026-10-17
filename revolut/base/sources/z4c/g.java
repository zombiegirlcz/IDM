package z4c;

import com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$InputData;
import com.revolut.feature.revolut_x_balances.impl.fiat.RevolutXFiatBalancesDetailsScreen;
import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes6.dex */
public final class g extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final RevolutXFiatBalancesDetailsController$InputData f319372l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f319373m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ur5.c f319374n;

    public g(RevolutXFiatBalancesDetailsController$InputData inputData, b view, ur5.c revolutXFiatBalanceInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(revolutXFiatBalanceInteractor, "revolutXFiatBalanceInteractor");
        this.f319372l = inputData;
        this.f319373m = view;
        this.f319374n = revolutXFiatBalanceInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object Z2(z4c.g r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof z4c.d
            if (r0 == 0) goto L13
            r0 = r7
            z4c.d r0 = (z4c.d) r0
            int r1 = r0.f319369w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319369w = r1
            goto L18
        L13:
            z4c.d r0 = new z4c.d
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319369w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L4e
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            ur5.c r7 = r6.f319374n
            com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$InputData r2 = r6.f319372l
            xi0.b r2 = r2.f84249a
            r5 = 2
            efm.r r7 = ur5.a.b(r7, r2, r5)
            r2 = 3
            java.lang.String r5 = "firstOrError(...)"
            efm.d0 r7 = prk.o.l(r7, r4, r4, r2, r5)
            r0.f319369w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.util.List r7 = (java.util.List) r7
            com.revolut.feature_move_money.api.navigation.MoveMoneyDestination r0 = new com.revolut.feature_move_money.api.navigation.MoveMoneyDestination
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r1 = new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData
            com.revolut.shared.feature.move_money.api.navigation.Action$Deposit r2 = new com.revolut.shared.feature.move_money.api.navigation.Action$Deposit
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$RevXFiatAccount r3 = new com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$RevXFiatAccount
            kotlin.jvm.internal.Intrinsics.h(r7)
            java.lang.Object r7 = zhm.d0.b0(r7)
            io3.d r7 = (io3.d) r7
            java.lang.String r7 = r7.f163145a
            r3.<init>(r7)
            r2.<init>(r3)
            r7 = 6
            r1.<init>(r2, r4, r7)
            r0.<init>(r1, r4)
            r6.A2(r0)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z4c.g.Z2(z4c.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b3(z4c.g r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof z4c.f
            if (r0 == 0) goto L13
            r0 = r7
            z4c.f r0 = (z4c.f) r0
            int r1 = r0.f319371w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f319371w = r1
            goto L18
        L13:
            z4c.f r0 = new z4c.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f319371w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L4e
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            ur5.c r7 = r6.f319374n
            com.revolut.feature.revolut_x_balances.api.fiat.navigation.RevolutXFiatBalancesDetailsController$InputData r2 = r6.f319372l
            xi0.b r2 = r2.f84249a
            r5 = 2
            efm.r r7 = ur5.a.b(r7, r2, r5)
            r2 = 3
            java.lang.String r5 = "firstOrError(...)"
            efm.d0 r7 = prk.o.l(r7, r4, r4, r2, r5)
            r0.f319371w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.util.List r7 = (java.util.List) r7
            com.revolut.feature_move_money.api.navigation.MoveMoneyDestination r0 = new com.revolut.feature_move_money.api.navigation.MoveMoneyDestination
            com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData r1 = new com.revolut.shared.feature.move_money.api.navigation.MoveMoneyInputData
            com.revolut.shared.feature.move_money.api.navigation.Action$Withdraw r2 = new com.revolut.shared.feature.move_money.api.navigation.Action$Withdraw
            com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$RevXFiatAccount r3 = new com.revolut.shared.feature.move_money.api.navigation.StartUpPocket$RevXFiatAccount
            kotlin.jvm.internal.Intrinsics.h(r7)
            java.lang.Object r7 = zhm.d0.b0(r7)
            io3.d r7 = (io3.d) r7
            java.lang.String r7 = r7.f163145a
            r3.<init>(r7)
            r2.<init>(r3)
            r7 = 6
            r1.<init>(r2, r4, r7)
            r0.<init>(r1, r4)
            r6.A2(r0)
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: z4c.g.b3(z4c.g, gim.c):java.lang.Object");
    }

    @Override // yji.n
    public final void H2() {
        vkm.d dVarB = rd0.e.b(((RevolutXFiatBalancesDetailsScreen) this.f319373m).d3().f174539b.C0());
        Intrinsics.checkNotNullParameter(dVarB, "<this>");
        Intrinsics.checkNotNullParameter("header_action", "taskId");
        n.l2(this, pu7.a.C(dVarB, this.e, "header_action"), null, new e(this, null), 3);
    }
}

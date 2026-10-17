package r7i;

import kotlin.jvm.internal.Intrinsics;
import n7i.j0;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j0 f252250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c8i.n f252251b;

    public u(j0 eligibilityChecker, c8i.n moveMoneyBalancesIndiaFilterInteractor) {
        Intrinsics.checkNotNullParameter(eligibilityChecker, "eligibilityChecker");
        Intrinsics.checkNotNullParameter(moveMoneyBalancesIndiaFilterInteractor, "moveMoneyBalancesIndiaFilterInteractor");
        this.f252250a = eligibilityChecker;
        this.f252251b = moveMoneyBalancesIndiaFilterInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0089, code lost:
    
        if (r10 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.api.model.AccountWrapper r8, com.revolut.feature_move_money.api.model.AccountWrapper r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof r7i.t
            if (r0 == 0) goto L13
            r0 = r10
            r7i.t r0 = (r7i.t) r0
            int r1 = r0.f252249y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f252249y = r1
            goto L18
        L13:
            r7i.t r0 = new r7i.t
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.f252247w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f252249y
            n7i.j0 r3 = r7.f252250a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r10)
            goto L8c
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            com.revolut.feature_move_money.api.model.AccountWrapper r9 = r0.v
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = r0.u
            yhm.o.b(r10)
            goto L69
        L3c:
            yhm.o.b(r10)
            xi0.b r10 = r8.getCurrency()
            xi0.b r2 = r9.getCurrency()
            c8i.n r6 = r7.f252251b
            boolean r10 = r6.b(r10, r2)
            if (r10 == 0) goto L52
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L52:
            com.revolut.feature_move_money.api.model.AccountSource r10 = r8.d
            j8l.a r2 = r8.f97224a
            x5i.d r6 = x5i.d.SOURCE
            efm.d0 r10 = r3.a(r10, r2, r6, r9)
            r0.u = r8
            r0.v = r9
            r0.f252249y = r5
            java.lang.Object r10 = nim.a.b(r10, r0)
            if (r10 != r1) goto L69
            goto L8b
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L74
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L74:
            com.revolut.feature_move_money.api.model.AccountSource r10 = r9.d
            j8l.a r9 = r9.f97224a
            x5i.d r2 = x5i.d.TARGET
            efm.d0 r8 = r3.a(r10, r9, r2, r8)
            r9 = 0
            r0.u = r9
            r0.v = r9
            r0.f252249y = r4
            java.lang.Object r10 = nim.a.b(r8, r0)
            if (r10 != r1) goto L8c
        L8b:
            return r1
        L8c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            kotlin.jvm.internal.Intrinsics.h(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: r7i.u.a(com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, gim.c):java.lang.Object");
    }
}

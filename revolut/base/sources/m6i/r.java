package m6i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h6i.o f203198a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f203199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f203200c;
    public final l d;
    public final jul.o e;

    public r(h6i.o accountProvider, h0 startupAccountProvider, w previousTransactionInfoProvider, l nonExistingCurrencySelector, jul.o hiddenAccountFilter) {
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(startupAccountProvider, "startupAccountProvider");
        Intrinsics.checkNotNullParameter(previousTransactionInfoProvider, "previousTransactionInfoProvider");
        Intrinsics.checkNotNullParameter(nonExistingCurrencySelector, "nonExistingCurrencySelector");
        Intrinsics.checkNotNullParameter(hiddenAccountFilter, "hiddenAccountFilter");
        this.f203198a = accountProvider;
        this.f203199b = startupAccountProvider;
        this.f203200c = previousTransactionInfoProvider;
        this.d = nonExistingCurrencySelector;
        this.e = hiddenAccountFilter;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.api.model.AccountWrapper r7, com.revolut.shared.feature.move_money.api.navigation.a r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof m6i.o
            if (r0 == 0) goto L13
            r0 = r9
            m6i.o r0 = (m6i.o) r0
            int r1 = r0.f203192y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203192y = r1
            goto L18
        L13:
            m6i.o r0 = new m6i.o
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f203190w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203192y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            com.revolut.shared.feature.move_money.api.navigation.a r7 = r0.v
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = r0.u
            yhm.o.b(r9)
            goto L71
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            com.revolut.shared.feature.move_money.api.navigation.a r8 = r0.v
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = r0.u
            yhm.o.b(r9)
            goto L5f
        L3e:
            yhm.o.b(r9)
            int[] r9 = m6i.n.f203186a
            int r2 = r8.ordinal()
            r9 = r9[r2]
            if (r9 != r4) goto L4e
            x5i.d r9 = x5i.d.SOURCE
            goto L50
        L4e:
            x5i.d r9 = x5i.d.TARGET
        L50:
            r0.u = r7
            r0.v = r8
            r0.f203192y = r4
            m6i.h0 r2 = r6.f203199b
            java.io.Serializable r9 = r2.a(r7, r9, r0)
            if (r9 != r1) goto L5f
            goto L6d
        L5f:
            java.util.List r9 = (java.util.List) r9
            r0.u = r7
            r0.v = r8
            r0.f203192y = r3
            java.lang.Object r9 = r6.c(r7, r9, r0)
            if (r9 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r5 = r8
            r8 = r7
            r7 = r5
        L71:
            com.revolut.feature_move_money.api.model.AccountWrapper r9 = (com.revolut.feature_move_money.api.model.AccountWrapper) r9
            int[] r0 = m6i.n.f203186a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            if (r7 != r4) goto L83
            m6i.i0 r7 = new m6i.i0
            r7.<init>(r9, r8)
            return r7
        L83:
            m6i.i0 r7 = new m6i.i0
            r7.<init>(r8, r9)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.r.a(com.revolut.feature_move_money.api.model.AccountWrapper, com.revolut.shared.feature.move_money.api.navigation.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.shared.feature.move_money.api.navigation.StartUpPocket r7, com.revolut.shared.feature.move_money.api.navigation.a r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof m6i.p
            if (r0 == 0) goto L13
            r0 = r9
            m6i.p r0 = (m6i.p) r0
            int r1 = r0.f203195y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203195y = r1
            goto L18
        L13:
            m6i.p r0 = new m6i.p
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f203193w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203195y
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r9)
            return r9
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = r0.v
            com.revolut.shared.feature.move_money.api.navigation.a r8 = r0.u
            yhm.o.b(r9)
            goto L74
        L3d:
            com.revolut.shared.feature.move_money.api.navigation.a r8 = r0.u
            yhm.o.b(r9)
            goto L62
        L43:
            yhm.o.b(r9)
            int[] r9 = m6i.n.f203186a
            int r2 = r8.ordinal()
            r9 = r9[r2]
            if (r9 != r5) goto L53
            x5i.d r9 = x5i.d.TARGET
            goto L55
        L53:
            x5i.d r9 = x5i.d.SOURCE
        L55:
            r0.u = r8
            r0.f203195y = r5
            m6i.h0 r2 = r6.f203199b
            java.lang.Object r9 = r2.b(r7, r9, r0)
            if (r9 != r1) goto L62
            goto L85
        L62:
            r7 = r9
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = (com.revolut.feature_move_money.api.model.AccountWrapper) r7
            r0.u = r8
            r0.v = r7
            r0.f203195y = r4
            m6i.w r9 = r6.f203200c
            java.lang.Object r9 = r9.d(r7, r8, r0)
            if (r9 != r1) goto L74
            goto L85
        L74:
            m6i.i0 r9 = (m6i.i0) r9
            if (r9 != 0) goto L87
            r9 = 0
            r0.u = r9
            r0.v = r9
            r0.f203195y = r3
            java.lang.Object r7 = r6.a(r7, r8, r0)
            if (r7 != r1) goto L86
        L85:
            return r1
        L86:
            return r7
        L87:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.r.b(com.revolut.shared.feature.move_money.api.navigation.StartUpPocket, com.revolut.shared.feature.move_money.api.navigation.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature_move_money.api.model.AccountWrapper r8, java.util.List r9, gim.c r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof m6i.q
            if (r0 == 0) goto L13
            r0 = r10
            m6i.q r0 = (m6i.q) r0
            int r1 = r0.f203197x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203197x = r1
            goto L18
        L13:
            m6i.q r0 = new m6i.q
            r0.<init>(r7, r10)
        L18:
            java.lang.Object r10 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203197x
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r10)
            return r10
        L2e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L36:
            yhm.o.b(r10)
            return r10
        L3a:
            com.revolut.feature_move_money.api.model.AccountWrapper r8 = r0.u
            yhm.o.b(r10)
            goto L5f
        L40:
            yhm.o.b(r10)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            m6i.m r10 = m6i.m.f203181a
            java.util.List r9 = zhm.d0.P0(r9, r10)
            lhk.a0 r10 = new lhk.a0
            r2 = 10
            r10.<init>(r7, r8, r6, r2)
            r0.u = r8
            r0.f203197x = r5
            jul.o r2 = r7.e
            java.lang.Object r10 = r2.r(r9, r10, r0)
            if (r10 != r1) goto L5f
            goto L83
        L5f:
            com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r10 = (com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper) r10
            if (r10 == 0) goto L77
            java.lang.String r8 = r10.f99404a
            k1j.a r9 = r10.getF99407g()
            r0.u = r6
            r0.f203197x = r4
            h6i.o r10 = r7.f203198a
            java.lang.Object r8 = r10.d(r0, r8, r9)
            if (r8 != r1) goto L76
            goto L83
        L76:
            return r8
        L77:
            r0.u = r6
            r0.f203197x = r3
            m6i.l r9 = r7.d
            java.lang.Object r8 = r9.a(r8, r0)
            if (r8 != r1) goto L84
        L83:
            return r1
        L84:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: m6i.r.c(com.revolut.feature_move_money.api.model.AccountWrapper, java.util.List, gim.c):java.lang.Object");
    }
}

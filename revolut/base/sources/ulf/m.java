package ulf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m2j.j f280980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h6i.o f280981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w5i.d f280982c;

    public m(m2j.j balancesInteractor, h6i.o moveMoneyAccountProvider, w5i.d moveMoneyQuoteInteractor) {
        Intrinsics.checkNotNullParameter(balancesInteractor, "balancesInteractor");
        Intrinsics.checkNotNullParameter(moveMoneyAccountProvider, "moveMoneyAccountProvider");
        Intrinsics.checkNotNullParameter(moveMoneyQuoteInteractor, "moveMoneyQuoteInteractor");
        this.f280980a = balancesInteractor;
        this.f280981b = moveMoneyAccountProvider;
        this.f280982c = moveMoneyQuoteInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6 A[Catch: CancellationException -> 0x0036, Exception -> 0x00c3, TryCatch #2 {CancellationException -> 0x0036, Exception -> 0x00c3, blocks: (B:13:0x0031, B:39:0x00b0, B:41:0x00b6, B:42:0x00b8, B:20:0x0047, B:35:0x008a, B:31:0x006f), top: B:52:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper r20, com.revolut.feature_move_money.api.model.AccountWrapper r21, dj0.d r22, gim.c r23) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ulf.m.a(com.revolut.retail.feature.balance.picker.api.models.BalanceWrapper, com.revolut.feature_move_money.api.model.AccountWrapper, dj0.d, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r5, java.lang.String r6, k1j.a r7) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ulf.k
            if (r0 == 0) goto L13
            r0 = r5
            ulf.k r0 = (ulf.k) r0
            int r1 = r0.f280977w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f280977w = r1
            goto L18
        L13:
            ulf.k r0 = new ulf.k
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f280977w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.util.concurrent.CancellationException -> L27 java.lang.Exception -> L42
            goto L3f
        L27:
            r5 = move-exception
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r5)
            h6i.o r5 = r4.f280981b     // Catch: java.util.concurrent.CancellationException -> L27 java.lang.Exception -> L42
            r0.f280977w = r3     // Catch: java.util.concurrent.CancellationException -> L27 java.lang.Exception -> L42
            java.lang.Object r5 = r5.e(r0, r6, r7)     // Catch: java.util.concurrent.CancellationException -> L27 java.lang.Exception -> L42
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.revolut.feature_move_money.api.model.AccountWrapper r5 = (com.revolut.feature_move_money.api.model.AccountWrapper) r5     // Catch: java.util.concurrent.CancellationException -> L27 java.lang.Exception -> L42
            return r5
        L42:
            r5 = 0
            return r5
        L44:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ulf.m.b(gim.c, java.lang.String, k1j.a):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(java.lang.String r18, xi0.b r19, gim.c r20) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ulf.m.c(java.lang.String, xi0.b, gim.c):java.io.Serializable");
    }
}

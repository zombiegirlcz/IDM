package di3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh3.a f114890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ffk.t f114891b;

    public k(sh3.a checkoutInteractor, ffk.t pricingPlanInteractor, x preorderResultMapper) {
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(preorderResultMapper, "preorderResultMapper");
        this.f114890a = checkoutInteractor;
        this.f114891b = pricingPlanInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.core.model.account.AccountId r6, com.revolut.feature.checkout.models.CheckoutParams r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof di3.d
            if (r0 == 0) goto L13
            r0 = r8
            di3.d r0 = (di3.d) r0
            int r1 = r0.f114876y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114876y = r1
            goto L18
        L13:
            di3.d r0 = new di3.d
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.f114874w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114876y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L89
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.checkout.models.CheckoutParams r7 = r0.v
            com.revolut.core.model.account.AccountId r6 = r0.u
            yhm.o.b(r8)
            goto L4a
        L3a:
            yhm.o.b(r8)
            r0.u = r6
            r0.v = r7
            r0.f114876y = r4
            java.lang.Object r8 = r5.d(r6, r0)
            if (r8 != r1) goto L4a
            goto L88
        L4a:
            java.util.List r8 = (java.util.List) r8
            java.lang.String r7 = r7.a()
            r2 = r8
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L8c
            java.lang.Object r2 = zhm.d0.b0(r8)
            com.revolut.feature.checkout.models.CheckoutOrder r2 = (com.revolut.feature.checkout.models.CheckoutOrder) r2
            pi3.e r2 = r2.e
            r4 = 0
            if (r2 == 0) goto L67
            java.lang.String r2 = r2.f236399a
            goto L68
        L67:
            r2 = r4
        L68:
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r2, r7)
            if (r7 != 0) goto L8c
            java.lang.Object r7 = zhm.d0.b0(r8)
            com.revolut.feature.checkout.models.CheckoutOrder r7 = (com.revolut.feature.checkout.models.CheckoutOrder) r7
            sh3.a r8 = r5.f114890a
            ei3.m r8 = (ei3.m) r8
            pfm.h r6 = r8.h(r7, r6)
            r0.u = r4
            r0.v = r4
            r0.f114876y = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L89
        L88:
            return r1
        L89:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L8c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.k.a(com.revolut.core.model.account.AccountId, com.revolut.feature.checkout.models.CheckoutParams, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.core.model.account.AccountId r8, pi3.h r9, gim.c r10) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.k.b(com.revolut.core.model.account.AccountId, pi3.h, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0078, code lost:
    
        if (r8 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.checkout.models.CheckoutParams r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof di3.f
            if (r0 == 0) goto L13
            r0 = r8
            di3.f r0 = (di3.f) r0
            int r1 = r0.f114881x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114881x = r1
            goto L18
        L13:
            di3.f r0 = new di3.f
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114881x
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3f
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r8)
            goto L7b
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            yhm.o.b(r8)
            return r8
        L39:
            com.revolut.feature.checkout.models.CheckoutParams r7 = r0.u
            yhm.o.b(r8)
            goto L51
        L3f:
            yhm.o.b(r8)
            com.revolut.core.model.account.AccountId r8 = r7.getF65852c()
            r0.u = r7
            r0.f114881x = r5
            java.lang.Object r8 = r6.a(r8, r7, r0)
            if (r8 != r1) goto L51
            goto L7a
        L51:
            boolean r8 = r7 instanceof com.revolut.feature.checkout.models.CheckoutParams.CardOrder
            r2 = 0
            if (r8 == 0) goto L66
            com.revolut.feature.checkout.models.CheckoutParams$CardOrder r7 = (com.revolut.feature.checkout.models.CheckoutParams.CardOrder) r7
            com.revolut.core.model.account.AccountId r8 = r7.f65852c
            r0.u = r2
            r0.f114881x = r4
            java.lang.Object r7 = r6.e(r8, r7, r0)
            if (r7 != r1) goto L65
            goto L7a
        L65:
            return r7
        L66:
            boolean r8 = r7 instanceof com.revolut.feature.checkout.models.CheckoutParams.Plan
            if (r8 == 0) goto L7e
            com.revolut.feature.checkout.models.CheckoutParams$Plan r7 = (com.revolut.feature.checkout.models.CheckoutParams.Plan) r7
            pi3.h r7 = r7.f65853a
            r0.u = r2
            r0.f114881x = r3
            com.revolut.core.model.account.AccountId$Personal r8 = com.revolut.core.model.account.AccountId.Personal.f51414a
            java.lang.Object r8 = r6.g(r8, r7, r0)
            if (r8 != r1) goto L7b
        L7a:
            return r1
        L7b:
            com.revolut.feature.checkout.models.PreorderResult r8 = (com.revolut.feature.checkout.models.PreorderResult) r8
            return r8
        L7e:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.k.c(com.revolut.feature.checkout.models.CheckoutParams, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.revolut.core.model.account.AccountId r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof di3.g
            if (r0 == 0) goto L13
            r0 = r8
            di3.g r0 = (di3.g) r0
            int r1 = r0.f114882w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f114882w = r1
            goto L18
        L13:
            di3.g r0 = new di3.g
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f114882w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L61
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            pi3.s r8 = pi3.s.PLAN
            java.util.List r8 = zhm.u.c(r8)
            r2 = 4
            sh3.a r4 = r6.f114890a
            r5 = 0
            efm.r r7 = sh3.a.c(r4, r8, r7, r5, r2)
            efm.r r7 = mo3.a.n(r7)
            dee.a0 r8 = new dee.a0
            r2 = 13
            r8.<init>(r2)
            efm.r r7 = m70.a.g(r7, r5, r8, r3)
            efm.d0 r7 = r7.firstOrError()
            java.lang.String r8 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r8)
            r0.f114882w = r3
            java.lang.Object r8 = nim.a.b(r7, r0)
            if (r8 != r1) goto L61
            return r1
        L61:
            java.lang.String r7 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.k.d(com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00ab A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(com.revolut.core.model.account.AccountId r10, com.revolut.feature.checkout.models.CheckoutParams.CardOrder r11, gim.c r12) {
        /*
            r9 = this;
            boolean r0 = r12 instanceof di3.h
            if (r0 == 0) goto L13
            r0 = r12
            di3.h r0 = (di3.h) r0
            int r1 = r0.A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.A = r1
            goto L18
        L13:
            di3.h r0 = new di3.h
            r0.<init>(r9, r12)
        L18:
            java.lang.Object r12 = r0.f114885y
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.A
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L4d
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r12)
            return r12
        L2e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L36:
            com.revolut.feature.checkout.models.CheckoutParams$CardOrder r10 = r0.v
            yhm.o.b(r12)
            goto L83
        L3c:
            int r10 = r0.f114884x
            pi3.h r11 = r0.f114883w
            com.revolut.feature.checkout.models.CheckoutParams$CardOrder r2 = r0.v
            com.revolut.core.model.account.AccountId r5 = r0.u
            yhm.o.b(r12)
            r8 = r2
            r2 = r10
            r10 = r5
            r5 = r12
            r12 = r8
            goto L69
        L4d:
            yhm.o.b(r12)
            pi3.h r12 = r11.f65851b
            if (r12 == 0) goto L98
            r0.u = r10
            r0.v = r11
            r0.f114883w = r12
            r2 = 0
            r0.f114884x = r2
            r0.A = r5
            java.lang.Object r5 = r9.b(r10, r12, r0)
            if (r5 != r1) goto L66
            goto Lab
        L66:
            r8 = r12
            r12 = r11
            r11 = r8
        L69:
            di3.c r5 = (di3.c) r5
            boolean r7 = r5 instanceof di3.b
            if (r7 == 0) goto L87
            r0.u = r6
            r0.v = r12
            r0.f114883w = r6
            r0.f114884x = r2
            r0.A = r4
            java.lang.Object r10 = r9.g(r10, r11, r0)
            if (r10 != r1) goto L80
            goto Lab
        L80:
            r8 = r12
            r12 = r10
            r10 = r8
        L83:
            com.revolut.feature.checkout.models.PreorderPlanResult r12 = (com.revolut.feature.checkout.models.PreorderPlanResult) r12
            r11 = r10
            goto L99
        L87:
            boolean r10 = r5 instanceof di3.a
            if (r10 == 0) goto L92
            di3.a r5 = (di3.a) r5
            com.revolut.feature.checkout.models.PreorderPlanResult r10 = r5.f114872a
            r11 = r12
            r12 = r10
            goto L99
        L92:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L98:
            r12 = r6
        L99:
            b93.f r10 = r11.f65850a
            com.revolut.core.model.account.AccountId r11 = r11.f65852c
            r0.u = r6
            r0.v = r6
            r0.f114883w = r6
            r0.A = r3
            java.lang.Object r10 = r9.f(r12, r10, r11, r0)
            if (r10 != r1) goto Lac
        Lab:
            return r1
        Lac:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.k.e(com.revolut.core.model.account.AccountId, com.revolut.feature.checkout.models.CheckoutParams$CardOrder, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.checkout.models.PreorderPlanResult r11, b93.f r12, com.revolut.core.model.account.AccountId r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.k.f(com.revolut.feature.checkout.models.PreorderPlanResult, b93.f, com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c2, code lost:
    
        if (r2 == r4) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.core.model.account.AccountId r19, pi3.h r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: di3.k.g(com.revolut.core.model.account.AccountId, pi3.h, gim.c):java.lang.Object");
    }
}

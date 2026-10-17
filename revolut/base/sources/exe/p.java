package exe;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh3.a f130423a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zjh.c f130424b;

    public p(sh3.a checkoutInteractor, zjh.c cardCustomisationFeeProvider) {
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(cardCustomisationFeeProvider, "cardCustomisationFeeProvider");
        this.f130423a = checkoutInteractor;
        this.f130424b = cardCustomisationFeeProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006c, code lost:
    
        if (r8 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.checkout.models.CheckoutConfig r6, com.revolut.core.model.account.AccountId r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof exe.m
            if (r0 == 0) goto L13
            r0 = r8
            exe.m r0 = (exe.m) r0
            int r1 = r0.f130419w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130419w = r1
            goto L18
        L13:
            exe.m r0 = new exe.m
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f130419w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r8)
            goto L6f
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r8)
            goto L56
        L36:
            yhm.o.b(r8)
            boolean r8 = r6 instanceof com.revolut.feature.checkout.models.ThreeDsCheckout
            if (r8 == 0) goto L45
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order$ThreeDs r7 = new com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order$ThreeDs
            com.revolut.feature.checkout.models.ThreeDsCheckout r6 = (com.revolut.feature.checkout.models.ThreeDsCheckout) r6
            r7.<init>(r6)
            return r7
        L45:
            boolean r8 = r6 instanceof com.revolut.feature.checkout.models.Checkout.Order
            if (r8 == 0) goto L5e
            com.revolut.feature.checkout.models.Checkout$Order r6 = (com.revolut.feature.checkout.models.Checkout.Order) r6
            com.revolut.feature.checkout.models.CheckoutOrder r6 = r6.f65844a
            r0.f130419w = r4
            java.io.Serializable r8 = r5.c(r6, r0)
            if (r8 != r1) goto L56
            goto L6e
        L56:
            com.revolut.feature.checkout.models.CheckoutOrder r8 = (com.revolut.feature.checkout.models.CheckoutOrder) r8
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order$Checkout r6 = new com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order$Checkout
            r6.<init>(r8)
            return r6
        L5e:
            boolean r8 = r6 instanceof com.revolut.feature.checkout.models.Checkout.Id
            if (r8 == 0) goto L77
            com.revolut.feature.checkout.models.Checkout$Id r6 = (com.revolut.feature.checkout.models.Checkout.Id) r6
            java.lang.String r6 = r6.f65843a
            r0.f130419w = r3
            java.lang.Object r8 = r5.b(r7, r0, r6)
            if (r8 != r1) goto L6f
        L6e:
            return r1
        L6f:
            com.revolut.feature.checkout.models.CheckoutOrder r8 = (com.revolut.feature.checkout.models.CheckoutOrder) r8
            com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order$Checkout r6 = new com.revolut.feature.topup_screen.impl.flows.checkout.screen.checkout.CheckoutScreenContract$CheckoutContent$Order$Checkout
            r6.<init>(r8)
            return r6
        L77:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: exe.p.a(com.revolut.feature.checkout.models.CheckoutConfig, com.revolut.core.model.account.AccountId, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.core.model.account.AccountId r5, gim.c r6, java.lang.String r7) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof exe.n
            if (r0 == 0) goto L13
            r0 = r6
            exe.n r0 = (exe.n) r0
            int r1 = r0.f130420w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f130420w = r1
            goto L18
        L13:
            exe.n r0 = new exe.n
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f130420w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            sh3.a r6 = r4.f130423a
            ufm.i r5 = sh3.a.b(r6, r7, r5)
            r0.f130420w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: exe.p.b(com.revolut.core.model.account.AccountId, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(com.revolut.feature.checkout.models.CheckoutOrder r23, gim.c r24) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            boolean r3 = r2 instanceof exe.o
            if (r3 == 0) goto L19
            r3 = r2
            exe.o r3 = (exe.o) r3
            int r4 = r3.f130422x
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.f130422x = r4
            goto L1e
        L19:
            exe.o r3 = new exe.o
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.v
            fim.a r4 = fim.a.COROUTINE_SUSPENDED
            int r5 = r3.f130422x
            r6 = 1
            if (r5 == 0) goto L37
            if (r5 != r6) goto L2f
            com.revolut.feature.checkout.models.CheckoutOrder r1 = r3.u
            yhm.o.b(r2)
            goto L47
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            yhm.o.b(r2)
            r3.u = r1
            r3.f130422x = r6
            zjh.c r2 = r0.f130424b
            java.lang.Object r2 = r2.j(r1, r3)
            if (r2 != r4) goto L47
            return r4
        L47:
            java.util.Optional r2 = (java.util.Optional) r2
            pi3.d r3 = r1.d
            if (r3 == 0) goto La2
            java.lang.Object r2 = gj7.b.m(r2)
            r15 = r2
            c93.j r15 = (c93.j) r15
            java.lang.String r6 = r3.f236388a
            java.lang.String r7 = r3.f236389b
            b93.b r8 = r3.f236390c
            e93.b r9 = r3.d
            java.lang.String r10 = r3.e
            c93.j r11 = r3.f
            d93.b r12 = r3.f236391g
            c93.j r13 = r3.f236392h
            boolean r14 = r3.i
            java.time.Instant r2 = r3.k
            h93.r r5 = r3.f236394l
            h93.j0 r4 = r3.f236395m
            h93.l0 r0 = r3.f236396n
            r19 = r0
            dj0.d r0 = r3.o
            pi3.i r3 = r3.f236397p
            r20 = r0
            java.lang.String r0 = "cardId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r0)
            java.lang.String r0 = "preorderId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r0 = "cardCode"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            java.lang.String r0 = "brandDesign"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            java.lang.String r0 = "designFee"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "deliveryFee"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r0)
            r17 = r5
            pi3.d r5 = new pi3.d
            r16 = r2
            r21 = r3
            r18 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            goto La3
        La2:
            r5 = 0
        La3:
            r0 = 55
            r2 = 0
            com.revolut.feature.checkout.models.CheckoutOrder r0 = com.revolut.feature.checkout.models.CheckoutOrder.a(r1, r2, r5, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: exe.p.c(com.revolut.feature.checkout.models.CheckoutOrder, gim.c):java.io.Serializable");
    }
}

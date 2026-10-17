package lhk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffk.t f195385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cha.b f195386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tbk.g f195387c;
    public final kge.d d;

    public w(ffk.t pricingPlanInteractor, cha.b familyPlansInteractor, tbk.g giftReceiverInteractor, kge.d planReferralsInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(giftReceiverInteractor, "giftReceiverInteractor");
        Intrinsics.checkNotNullParameter(planReferralsInteractor, "planReferralsInteractor");
        this.f195385a = pricingPlanInteractor;
        this.f195386b = familyPlansInteractor;
        this.f195387c = giftReceiverInteractor;
        this.d = planReferralsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(lhk.b r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof lhk.q
            if (r0 == 0) goto L13
            r0 = r6
            lhk.q r0 = (lhk.q) r0
            int r1 = r0.f195369w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195369w = r1
            goto L18
        L13:
            lhk.q r0 = new lhk.q
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195369w
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
            java.lang.String r6 = r5.f195318a
            java.lang.String r5 = r5.f195320c
            r0.f195369w = r3
            tbk.g r2 = r4.f195387c
            java.lang.Object r6 = r2.a(r6, r5, r0)
            if (r6 != r1) goto L41
            return r1
        L41:
            jbk.a r6 = (jbk.a) r6
            kbk.f r5 = r6.f172651a
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r6 = r6.f172652b
            lhk.l r0 = new lhk.l
            r0.<init>(r6, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.w.a(lhk.b, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x007f, code lost:
    
        if (r13 != r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00a8, code lost:
    
        if (r13 == r1) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(lhk.f r12, gim.c r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof lhk.r
            if (r0 == 0) goto L13
            r0 = r13
            lhk.r r0 = (lhk.r) r0
            int r1 = r0.f195373w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195373w = r1
            goto L18
        L13:
            lhk.r r0 = new lhk.r
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195373w
            ffk.t r3 = r11.f195385a
            r10 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L3c
            if (r2 == r4) goto L38
            if (r2 != r10) goto L30
            yhm.o.b(r13)
            goto Lab
        L30:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L38:
            yhm.o.b(r13)
            goto L82
        L3c:
            yhm.o.b(r13)
            goto L75
        L40:
            yhm.o.b(r13)
            lhk.d r13 = r12.f195338a
            lhk.d$a r2 = lhk.d.a.f195326a
            boolean r2 = r13.equals(r2)
            if (r2 == 0) goto L88
            r0.f195373w = r5
            cha.b r12 = r11.f195386b
            ffk.h r12 = (ffk.h) r12
            dha.b r12 = r12.f134833b
            pfk.s r12 = (pfk.s) r12
            r12.getClass()
            pe2.l r13 = new pe2.l
            r2 = 0
            r13.<init>(r12, r2, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r13, r0)
            if (r12 != r1) goto L6b
            goto L6d
        L6b:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L6d:
            if (r12 != r1) goto L70
            goto L72
        L70:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L72:
            if (r12 != r1) goto L75
            goto Laa
        L75:
            rfm.f0 r12 = r3.y()
            r0.f195373w = r4
            java.lang.Object r13 = nim.a.b(r12, r0)
            if (r13 != r1) goto L82
            goto Laa
        L82:
            kotlin.jvm.internal.Intrinsics.h(r13)
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r13 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r13
            return r13
        L88:
            boolean r13 = r13 instanceof lhk.e
            if (r13 == 0) goto Lb1
            lhk.d r12 = r12.f195338a
            lhk.e r12 = (lhk.e) r12
            java.lang.String r4 = r12.f195330a
            hha.i r12 = r12.f195331b
            java.lang.Integer r8 = new java.lang.Integer
            r8.<init>(r5)
            r9 = 124(0x7c, float:1.74E-43)
            r6 = 0
            r7 = 0
            r5 = r12
            rfm.f0 r12 = ffk.t.z(r3, r4, r5, r6, r7, r8, r9)
            r0.f195373w = r10
            java.lang.Object r13 = nim.a.b(r12, r0)
            if (r13 != r1) goto Lab
        Laa:
            return r1
        Lab:
            kotlin.jvm.internal.Intrinsics.h(r13)
            com.revolut.feature.pricingplans.models.PricingPlanSubscription r13 = (com.revolut.feature.pricingplans.models.PricingPlanSubscription) r13
            return r13
        Lb1:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.w.b(lhk.f, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(lhk.g r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof lhk.s
            if (r0 == 0) goto L13
            r0 = r13
            lhk.s r0 = (lhk.s) r0
            int r1 = r0.f195380w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195380w = r1
            goto L18
        L13:
            lhk.s r0 = new lhk.s
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195380w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L4a
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            java.lang.String r5 = r12.f195340a
            hha.i r6 = r12.f195341b
            r9 = 0
            r10 = 252(0xfc, float:3.53E-43)
            ffk.t r4 = r11.f195385a
            r7 = 0
            r8 = 0
            rfm.f0 r12 = ffk.t.z(r4, r5, r6, r7, r8, r9, r10)
            r0.f195380w = r3
            java.lang.Object r13 = nim.a.b(r12, r0)
            if (r13 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r12 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.w.c(lhk.g, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(lhk.i r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof lhk.u
            if (r0 == 0) goto L13
            r0 = r13
            lhk.u r0 = (lhk.u) r0
            int r1 = r0.f195383w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195383w = r1
            goto L18
        L13:
            lhk.u r0 = new lhk.u
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195383w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L4c
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            java.lang.String r5 = r12.f195344a
            hha.i r6 = r12.f195345b
            java.lang.String r7 = r12.f195346c
            boolean r8 = r12.d
            r9 = 0
            r10 = 128(0x80, float:1.8E-43)
            ffk.t r4 = r11.f195385a
            rfm.f0 r12 = ffk.t.z(r4, r5, r6, r7, r8, r9, r10)
            r0.f195383w = r3
            java.lang.Object r13 = nim.a.b(r12, r0)
            if (r13 != r1) goto L4c
            return r1
        L4c:
            java.lang.String r12 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.w.d(lhk.i, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00e8, code lost:
    
        if (r6 == r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(lhk.k r5, gim.c r6) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.w.e(lhk.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(lhk.j r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof lhk.v
            if (r0 == 0) goto L13
            r0 = r13
            lhk.v r0 = (lhk.v) r0
            int r1 = r0.f195384w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195384w = r1
            goto L18
        L13:
            lhk.v r0 = new lhk.v
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195384w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L4a
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            java.lang.String r5 = r12.f195350a
            hha.i r6 = hha.i.ANNUAL
            r9 = 0
            r10 = 252(0xfc, float:3.53E-43)
            ffk.t r4 = r11.f195385a
            r7 = 0
            r8 = 0
            rfm.f0 r12 = ffk.t.z(r4, r5, r6, r7, r8, r9, r10)
            r0.f195384w = r3
            java.lang.Object r13 = nim.a.b(r12, r0)
            if (r13 != r1) goto L4a
            return r1
        L4a:
            java.lang.String r12 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.w.f(lhk.j, gim.c):java.lang.Object");
    }
}

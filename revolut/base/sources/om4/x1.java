package om4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class x1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp4.c0 f226742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dp4.q f226743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f226744c;
    public final a0 d;
    public final ang.f e;

    public x1(dp4.c0 creditCardInstalmentRepository, dp4.q creditCardDebitToInstalmentRepository, k0 creditCardFeatureInteractor, a0 debitToInstalmentAvailabilityInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(creditCardInstalmentRepository, "creditCardInstalmentRepository");
        Intrinsics.checkNotNullParameter(creditCardDebitToInstalmentRepository, "creditCardDebitToInstalmentRepository");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        Intrinsics.checkNotNullParameter(debitToInstalmentAvailabilityInteractor, "debitToInstalmentAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f226742a = creditCardInstalmentRepository;
        this.f226743b = creditCardDebitToInstalmentRepository;
        this.f226744c = creditCardFeatureInteractor;
        this.d = debitToInstalmentAvailabilityInteractor;
        this.e = userInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        if (r8 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof om4.s1
            if (r0 == 0) goto L13
            r0 = r8
            om4.s1 r0 = (om4.s1) r0
            int r1 = r0.f226689w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226689w = r1
            goto L18
        L13:
            om4.s1 r0 = new om4.s1
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226689w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L85
        L2b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L33:
            yhm.o.b(r8)
            goto L6a
        L37:
            yhm.o.b(r8)
            om4.a0 r8 = r7.d
            gte.a r8 = r8.f226511a
            com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardDebitToInstalment r2 = com.revolut.feature.credit.card.api.CreditCardApi$Toggles$CreditCardDebitToInstalment.f68682c
            jte.d r8 = (jte.d) r8
            boolean r8 = r8.c(r2)
            if (r8 == 0) goto L88
            ang.f r8 = r7.e
            efm.d0 r8 = r8.f(r3)
            om4.t1 r2 = om4.t1.f
            o0.a r2 = new o0.a
            r6 = 10
            r2.<init>(r6)
            ufm.i r6 = new ufm.i
            r6.<init>(r8, r2, r5)
            java.lang.String r8 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r8)
            r0.f226689w = r5
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L6a
            goto L84
        L6a:
            wi0.b r8 = (wi0.b) r8
            java.lang.String r8 = r8.f297794a
            r0.f226689w = r4
            dp4.q r2 = r7.f226743b
            x4l.c r2 = r2.d
            cp4.l r4 = new cp4.l
            r4.<init>(r8)
            java.lang.Object r8 = r2.d(r4, r3, r0)
            if (r8 != r1) goto L80
            goto L82
        L80:
            kotlin.Unit r8 = kotlin.Unit.f186387a
        L82:
            if (r8 != r1) goto L85
        L84:
            return r1
        L85:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        L88:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x1.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof om4.u1
            if (r0 == 0) goto L13
            r0 = r7
            om4.u1 r0 = (om4.u1) r0
            int r1 = r0.f226712x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226712x = r1
            goto L18
        L13:
            om4.u1 r0 = new om4.u1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226712x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            yw4.f r7 = yw4.f.POST_PURCHASE_INSTALMENT_PLANS
            r0.u = r6
            r0.f226712x = r4
            om4.k0 r2 = r5.f226744c
            java.lang.Object r7 = r2.b(r6, r7, r0)
            if (r7 != r1) goto L4a
            goto L6c
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L70
            r7 = 0
            r0.u = r7
            r0.f226712x = r3
            dp4.c0 r7 = r5.f226742a
            x4l.c r7 = r7.e
            cp4.z r2 = new cp4.z
            r2.<init>(r6)
            r6 = 0
            java.lang.Object r6 = r7.d(r2, r6, r0)
            if (r6 != r1) goto L68
            goto L6a
        L68:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L6a:
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L70:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x1.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof om4.v1
            if (r0 == 0) goto L13
            r0 = r7
            om4.v1 r0 = (om4.v1) r0
            int r1 = r0.f226722x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226722x = r1
            goto L18
        L13:
            om4.v1 r0 = new om4.v1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226722x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            yw4.f r7 = yw4.f.INSTALMENT_PLAN_VIEW
            r0.u = r6
            r0.f226722x = r4
            om4.k0 r2 = r5.f226744c
            java.lang.Object r7 = r2.b(r6, r7, r0)
            if (r7 != r1) goto L4a
            goto L6c
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L70
            r7 = 0
            r0.u = r7
            r0.f226722x = r3
            dp4.c0 r7 = r5.f226742a
            x4l.c r7 = r7.f116607g
            cp4.a0 r2 = new cp4.a0
            r2.<init>(r6)
            r6 = 0
            java.lang.Object r6 = r7.d(r2, r6, r0)
            if (r6 != r1) goto L68
            goto L6a
        L68:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L6a:
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L70:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x1.c(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof om4.w1
            if (r0 == 0) goto L13
            r0 = r7
            om4.w1 r0 = (om4.w1) r0
            int r1 = r0.f226731x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226731x = r1
            goto L18
        L13:
            om4.w1 r0 = new om4.w1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226731x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L6d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L4a
        L38:
            yhm.o.b(r7)
            yw4.f r7 = yw4.f.STATEMENT_DEFERRAL_INSTALMENT_PLANS
            r0.u = r6
            r0.f226731x = r4
            om4.k0 r2 = r5.f226744c
            java.lang.Object r7 = r2.b(r6, r7, r0)
            if (r7 != r1) goto L4a
            goto L6c
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L70
            r7 = 0
            r0.u = r7
            r0.f226731x = r3
            dp4.c0 r7 = r5.f226742a
            x4l.c r7 = r7.f
            cp4.n0 r2 = new cp4.n0
            r2.<init>(r6)
            r6 = 0
            java.lang.Object r6 = r7.d(r2, r6, r0)
            if (r6 != r1) goto L68
            goto L6a
        L68:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L6a:
            if (r6 != r1) goto L6d
        L6c:
            return r1
        L6d:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        L70:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.x1.d(java.lang.String, gim.c):java.lang.Object");
    }
}

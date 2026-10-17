package et6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class l0 implements gr6.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f129263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f129264b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jla.h f129265c;
    public final myj.e d;

    public l0(xoj.a featuresInteractor, gte.a featureToggleInteractor, jla.h productCatalogueInteractor, myj.e learnFeatureStateChecker) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(learnFeatureStateChecker, "learnFeatureStateChecker");
        this.f129263a = featuresInteractor;
        this.f129264b = featureToggleInteractor;
        this.f129265c = productCatalogueInteractor;
        this.d = learnFeatureStateChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(yoj.c r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof et6.a0
            if (r0 == 0) goto L13
            r0 = r6
            et6.a0 r0 = (et6.a0) r0
            int r1 = r0.f129186w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129186w = r1
            goto L18
        L13:
            et6.a0 r0 = new et6.a0
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129186w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            yoj.d r6 = yoj.d.DISABLED
            xoj.a r2 = r4.f129263a
            cpj.b r2 = (cpj.b) r2
            ufm.i r5 = r2.f(r5, r6)
            r0.f129186w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.l0.a(yoj.c, gim.c):java.lang.Object");
    }

    public final boolean b(String str) {
        return this.f129265c.d(str, null) == bla.c.ENABLED;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof et6.b0
            if (r0 == 0) goto L13
            r0 = r5
            et6.b0 r0 = (et6.b0) r0
            int r1 = r0.f129195w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129195w = r1
            goto L18
        L13:
            et6.b0 r0 = new et6.b0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129195w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f129195w = r3
            yoj.c r5 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            java.lang.String r5 = "FREELANCER_PAYMENT_METHODS.card_reader"
            boolean r5 = r4.b(r5)
            if (r5 == 0) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.l0.c(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof et6.c0
            if (r0 == 0) goto L13
            r0 = r5
            et6.c0 r0 = (et6.c0) r0
            int r1 = r0.f129203w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129203w = r1
            goto L18
        L13:
            et6.c0 r0 = new et6.c0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129203w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f129203w = r3
            yoj.c r5 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            java.lang.String r5 = "ACQUIRING_HARDWARE"
            boolean r5 = r4.b(r5)
            if (r5 == 0) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.l0.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof et6.d0
            if (r0 == 0) goto L13
            r0 = r5
            et6.d0 r0 = (et6.d0) r0
            int r1 = r0.f129210w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129210w = r1
            goto L18
        L13:
            et6.d0 r0 = new et6.d0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129210w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f129210w = r3
            yoj.c r5 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            java.lang.String r5 = "FREELANCER_PAYMENT_METHODS.invoices"
            boolean r5 = r4.b(r5)
            if (r5 == 0) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.l0.e(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (r9 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof et6.e0
            if (r0 == 0) goto L13
            r0 = r9
            et6.e0 r0 = (et6.e0) r0
            int r1 = r0.f129216w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129216w = r1
            goto L18
        L13:
            et6.e0 r0 = new et6.e0
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129216w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L80
        L2a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L32:
            yhm.o.b(r9)
            goto L44
        L36:
            yhm.o.b(r9)
            r0.f129216w = r4
            yoj.c r9 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r9 = r8.a(r9, r0)
            if (r9 != r1) goto L44
            goto L7f
        L44:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L89
            java.lang.String r9 = "FREELANCER_LEARN"
            boolean r9 = r8.b(r9)
            if (r9 == 0) goto L89
            myj.e r9 = r8.d
            efm.r r9 = r9.b()
            vkm.d r9 = rd0.e.b(r9)
            en6.a r2 = new en6.a
            r5 = 21
            r2.<init>(r5)
            r5 = 0
            jhi.b r9 = mo3.a.g(r9, r5, r2, r4)
            eob.e r2 = new eob.e
            r6 = 3
            r7 = 4
            r2.<init>(r6, r7, r5)
            zhm.h0 r5 = zhm.h0.f322473a
            vkm.y r9 = rd0.e.e(r9, r5, r2)
            r0.f129216w = r3
            java.lang.Object r9 = vkm.q.z(r9, r0)
            if (r9 != r1) goto L80
        L7f:
            return r1
        L80:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = pd.b.j(r9)
            if (r9 == 0) goto L89
            goto L8a
        L89:
            r4 = 0
        L8a:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r4)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.l0.f(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof et6.f0
            if (r0 == 0) goto L13
            r0 = r5
            et6.f0 r0 = (et6.f0) r0
            int r1 = r0.f129223w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129223w = r1
            goto L18
        L13:
            et6.f0 r0 = new et6.f0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129223w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f129223w = r3
            yoj.c r5 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            java.lang.String r5 = "FREELANCER_PAYMENT_METHODS.payment_links"
            boolean r5 = r4.b(r5)
            if (r5 == 0) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.l0.g(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof et6.g0
            if (r0 == 0) goto L13
            r0 = r7
            et6.g0 r0 = (et6.g0) r0
            int r1 = r0.f129229w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129229w = r1
            goto L18
        L13:
            et6.g0 r0 = new et6.g0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129229w
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3d
            if (r2 == r5) goto L39
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            yhm.o.b(r7)
            return r7
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L35:
            yhm.o.b(r7)
            goto L5f
        L39:
            yhm.o.b(r7)
            goto L4b
        L3d:
            yhm.o.b(r7)
            r0.f129229w = r5
            yoj.c r7 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r7 = r6.a(r7, r0)
            if (r7 != r1) goto L4b
            goto L6f
        L4b:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L56
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            return r7
        L56:
            r0.f129229w = r4
            java.lang.Object r7 = r6.j(r0)
            if (r7 != r1) goto L5f
            goto L6f
        L5f:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 != 0) goto L71
            r0.f129229w = r3
            java.lang.Object r7 = r6.l(r0)
            if (r7 != r1) goto L70
        L6f:
            return r1
        L70:
            return r7
        L71:
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.l0.h(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof et6.h0
            if (r0 == 0) goto L13
            r0 = r5
            et6.h0 r0 = (et6.h0) r0
            int r1 = r0.f129235w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129235w = r1
            goto L18
        L13:
            et6.h0 r0 = new et6.h0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129235w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f129235w = r3
            yoj.c r5 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L4e
            java.lang.String r5 = "FREELANCER_PAYMENT_METHODS.terminal"
            boolean r5 = r4.b(r5)
            if (r5 == 0) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.l0.i(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object j(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof et6.i0
            if (r0 == 0) goto L13
            r0 = r5
            et6.i0 r0 = (et6.i0) r0
            int r1 = r0.f129245w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129245w = r1
            goto L18
        L13:
            et6.i0 r0 = new et6.i0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129245w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f129245w = r3
            yoj.c r5 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L48
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L48:
            java.lang.String r5 = "FREELANCER_POCKETS.regular_pocket"
            boolean r5 = r4.b(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.l0.j(gim.c):java.lang.Object");
    }

    public final boolean k() {
        return b("FREELANCER_TAX_HUB") && b("FREELANCER_TAX_HUB.tax_calendar");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof et6.j0
            if (r0 == 0) goto L13
            r0 = r5
            et6.j0 r0 = (et6.j0) r0
            int r1 = r0.f129252w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129252w = r1
            goto L18
        L13:
            et6.j0 r0 = new et6.j0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129252w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f129252w = r3
            yoj.c r5 = yoj.c.FREELANCER_PHASE_1
            java.lang.Object r5 = r4.a(r5, r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L48
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        L48:
            java.lang.String r5 = "FREELANCER_POCKETS.tax_pocket"
            boolean r5 = r4.b(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: et6.l0.l(gim.c):java.lang.Object");
    }

    public final eq8.g m() {
        return new eq8.g(rd0.e.b(((cpj.b) this.f129263a).j(yoj.c.FREELANCER_PHASE_1, w4l.h.f294642c)), 8);
    }
}

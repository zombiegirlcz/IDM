package lhk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ffk.t f195374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cu8.r0 f195375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fn2.c f195376c;
    public final xoj.a d;
    public final cha.b e;
    public final a5h.g f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f195377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wik.k f195378h;
    public final sh3.a i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wik.u f195379j;

    public r0(ffk.t pricingPlanInteractor, cu8.r0 kycRequiredActionTransformer, fn2.c productCatalogueLoader, xoj.a featuresInteractor, cha.b familyPlansInteractor, a5h.g planChangeAppThemeManager, w planSubscriberActionInteractor, wik.k preorderErrorParser, sh3.a checkoutInteractor, wik.u planWaveAnimationInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(kycRequiredActionTransformer, "kycRequiredActionTransformer");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(familyPlansInteractor, "familyPlansInteractor");
        Intrinsics.checkNotNullParameter(planChangeAppThemeManager, "planChangeAppThemeManager");
        Intrinsics.checkNotNullParameter(planSubscriberActionInteractor, "planSubscriberActionInteractor");
        Intrinsics.checkNotNullParameter(preorderErrorParser, "preorderErrorParser");
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(planWaveAnimationInteractor, "planWaveAnimationInteractor");
        this.f195374a = pricingPlanInteractor;
        this.f195375b = kycRequiredActionTransformer;
        this.f195376c = productCatalogueLoader;
        this.d = featuresInteractor;
        this.e = familyPlansInteractor;
        this.f = planChangeAppThemeManager;
        this.f195377g = planSubscriberActionInteractor;
        this.f195378h = preorderErrorParser;
        this.i = checkoutInteractor;
        this.f195379j = planWaveAnimationInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d2, code lost:
    
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.pricingplans.models.PricingPlanSubscription r9, com.revolut.feature.pricingplans.models.PricingPlanSubscription r10, gim.c r11) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.r0.a(com.revolut.feature.pricingplans.models.PricingPlanSubscription, com.revolut.feature.pricingplans.models.PricingPlanSubscription, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof lhk.k0
            if (r0 == 0) goto L13
            r0 = r7
            lhk.k0 r0 = (lhk.k0) r0
            int r1 = r0.f195355w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195355w = r1
            goto L18
        L13:
            lhk.k0 r0 = new lhk.k0
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195355w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L55
        L28:
            r7 = move-exception
            goto L5a
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            cha.b r7 = r6.e     // Catch: java.lang.Throwable -> L28
            w4l.h r2 = w4l.h.f294642c     // Catch: java.lang.Throwable -> L28
            ffk.h r7 = (ffk.h) r7     // Catch: java.lang.Throwable -> L28
            kotlinx.coroutines.flow.Flow r7 = r7.f(r2)     // Catch: java.lang.Throwable -> L28
            l9j.j r2 = new l9j.j     // Catch: java.lang.Throwable -> L28
            r5 = 18
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L28
            jhi.b r7 = mo3.a.g(r7, r4, r2, r3)     // Catch: java.lang.Throwable -> L28
            r0.f195355w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = vkm.q.z(r7, r0)     // Catch: java.lang.Throwable -> L28
            if (r7 != r1) goto L55
            return r1
        L55:
            lha.g r7 = (lha.g) r7     // Catch: java.lang.Throwable -> L28
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L60
        L5a:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L60:
            java.lang.Throwable r0 = yhm.m.a(r7)
            if (r0 != 0) goto L68
            r4 = r7
            goto L75
        L68:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            java.lang.String r2 = "unable to get family plan info"
            java.lang.String r3 = "PricingPlanSubscriber"
            rd0.d.a(r1, r3, r2, r0, r7)
        L75:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.r0.b(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(com.revolut.feature.pricingplans.models.PricingPlanSubscription r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lhk.l0
            if (r0 == 0) goto L13
            r0 = r7
            lhk.l0 r0 = (lhk.l0) r0
            int r1 = r0.f195358w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195358w = r1
            goto L18
        L13:
            lhk.l0 r0 = new lhk.l0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195358w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L7d
        L28:
            r6 = move-exception
            goto L82
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            hha.i r7 = r6.f81144x
            hha.i r2 = hha.i.MONTHLY
            if (r7 != r2) goto L9d
            hha.i0 r6 = r6.f81135l
            if (r6 == 0) goto L42
            hha.h0 r6 = r6.f152315h
            goto L43
        L42:
            r6 = r4
        L43:
            hha.h0 r7 = hha.h0.MINIMUM_BALANCE
            if (r6 == r7) goto L48
            goto L9d
        L48:
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            ffk.t r6 = r5.f195374a     // Catch: java.lang.Throwable -> L28
            w4l.i r7 = w4l.i.f294643c     // Catch: java.lang.Throwable -> L28
            java.lang.String r2 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)     // Catch: java.lang.Throwable -> L28
            dha.c r6 = r6.f134850a     // Catch: java.lang.Throwable -> L28
            pfk.p0 r6 = (pfk.p0) r6     // Catch: java.lang.Throwable -> L28
            r6.getClass()     // Catch: java.lang.Throwable -> L28
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)     // Catch: java.lang.Throwable -> L28
            x4l.c r6 = r6.f     // Catch: java.lang.Throwable -> L28
            kotlin.Unit r2 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L28
            vkm.d r6 = r6.b(r2, r7)     // Catch: java.lang.Throwable -> L28
            zfd.e r6 = zi0.c.w(r6)     // Catch: java.lang.Throwable -> L28
            l9j.j r7 = new l9j.j     // Catch: java.lang.Throwable -> L28
            r2 = 19
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L28
            jhi.b r6 = mo3.a.g(r6, r4, r7, r3)     // Catch: java.lang.Throwable -> L28
            r0.f195358w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = vkm.q.z(r6, r0)     // Catch: java.lang.Throwable -> L28
            if (r7 != r1) goto L7d
            return r1
        L7d:
            nha.c r7 = (nha.c) r7     // Catch: java.lang.Throwable -> L28
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L88
        L82:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r6)
        L88:
            java.lang.Throwable r6 = yhm.m.a(r7)
            if (r6 != 0) goto L90
            r4 = r7
            goto L9d
        L90:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "unable to get minimum balance info"
            java.lang.String r2 = "PricingPlanSubscriber"
            rd0.d.a(r0, r2, r1, r6, r7)
        L9d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.r0.c(com.revolut.feature.pricingplans.models.PricingPlanSubscription, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof lhk.m0
            if (r0 == 0) goto L13
            r0 = r6
            lhk.m0 r0 = (lhk.m0) r0
            int r1 = r0.f195360w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195360w = r1
            goto L18
        L13:
            lhk.m0 r0 = new lhk.m0
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195360w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L58
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            ffk.t r6 = r5.f195374a
            w4l.h r2 = w4l.h.f294642c
            efm.r r6 = r6.v(r2)
            l9j.j r2 = new l9j.j
            r4 = 20
            r2.<init>(r4)
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f195360w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L58
            return r1
        L58:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.r0.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof lhk.n0
            if (r0 == 0) goto L13
            r0 = r7
            lhk.n0 r0 = (lhk.n0) r0
            int r1 = r0.f195361w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f195361w = r1
            goto L18
        L13:
            lhk.n0 r0 = new lhk.n0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f195361w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)     // Catch: java.lang.Throwable -> L28
            goto L5b
        L28:
            r6 = move-exception
            goto L60
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            ffk.t r7 = r5.f195374a     // Catch: java.lang.Throwable -> L28
            efm.r r6 = r7.r(r6)     // Catch: java.lang.Throwable -> L28
            vkm.d r6 = rd0.e.b(r6)     // Catch: java.lang.Throwable -> L28
            zhm.h0 r7 = zhm.h0.f322473a     // Catch: java.lang.Throwable -> L28
            vkm.q0 r6 = rd0.e.n(r6, r7)     // Catch: java.lang.Throwable -> L28
            l9j.j r7 = new l9j.j     // Catch: java.lang.Throwable -> L28
            r2 = 21
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L28
            jhi.b r6 = mo3.a.g(r6, r4, r7, r3)     // Catch: java.lang.Throwable -> L28
            r0.f195361w = r3     // Catch: java.lang.Throwable -> L28
            java.lang.Object r7 = vkm.q.z(r6, r0)     // Catch: java.lang.Throwable -> L28
            if (r7 != r1) goto L5b
            return r1
        L5b:
            hha.d r7 = (hha.d) r7     // Catch: java.lang.Throwable -> L28
            yhm.m$a r6 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L66
        L60:
            yhm.m$a r7 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r6)
        L66:
            java.lang.Throwable r6 = yhm.m.a(r7)
            if (r6 != 0) goto L6e
            r4 = r7
            goto L7b
        L6e:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            java.lang.String r1 = "unable to get pricing plan by id"
            java.lang.String r2 = "PricingPlanSubscriber"
            rd0.d.a(r0, r2, r1, r6, r7)
        L7b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.r0.e(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(zfk.b r12, lhk.k r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.r0.f(zfk.b, lhk.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(com.revolut.feature.pricingplans.models.PricingPlanSubscription r19, lhk.n r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 266
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.r0.g(com.revolut.feature.pricingplans.models.PricingPlanSubscription, lhk.n, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x009a, code lost:
    
        if (r2 == r4) goto L165;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0058 A[PHI: r0 r2
      0x0058: PHI (r0v26 lhk.k) = (r0v22 lhk.k), (r0v32 lhk.k) binds: [B:62:0x00c1, B:26:0x0053] A[DONT_GENERATE, DONT_INLINE]
      0x0058: PHI (r2v32 java.lang.Object) = (r2v26 java.lang.Object), (r2v1 java.lang.Object) binds: [B:62:0x00c1, B:26:0x0053] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d8 A[Catch: Exception -> 0x004f, PHI: r0 r2 r5
      0x00d8: PHI (r0v29 com.revolut.feature.pricingplans.models.PricingPlanSubscription) = 
      (r0v28 com.revolut.feature.pricingplans.models.PricingPlanSubscription)
      (r0v33 com.revolut.feature.pricingplans.models.PricingPlanSubscription)
     binds: [B:66:0x00d4, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r2v35 java.lang.Object) = (r2v34 java.lang.Object), (r2v1 java.lang.Object) binds: [B:66:0x00d4, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE]
      0x00d8: PHI (r5v4 ??) = (r5v6 ??), (r5v7 ??) binds: [B:66:0x00d4, B:22:0x004a] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #1 {Exception -> 0x004f, blocks: (B:22:0x004a, B:68:0x00d8, B:65:0x00c8), top: B:170:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r19v0, types: [lhk.r0] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v1, types: [lhk.k] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(lhk.k r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lhk.r0.h(lhk.k, gim.c):java.lang.Object");
    }
}

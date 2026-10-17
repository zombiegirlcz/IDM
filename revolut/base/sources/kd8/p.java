package kd8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gd8.c f182842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gd8.i f182843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kbb.c f182844c;
    public final hj8.a d;
    public final l80.e e;
    public final wsg.n f;

    public p(gd8.c juniorConsentPromptBelowGDPRRepository, gd8.i juniorConsentRepository, kbb.c juniorConfigInteractor, hj8.a juniorProfileInteractor, l80.e dateProvider, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(juniorConsentPromptBelowGDPRRepository, "juniorConsentPromptBelowGDPRRepository");
        Intrinsics.checkNotNullParameter(juniorConsentRepository, "juniorConsentRepository");
        Intrinsics.checkNotNullParameter(juniorConfigInteractor, "juniorConfigInteractor");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f182842a = juniorConsentPromptBelowGDPRRepository;
        this.f182843b = juniorConsentRepository;
        this.f182844c = juniorConfigInteractor;
        this.d = juniorProfileInteractor;
        this.e = dateProvider;
        this.f = walletInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, v6d.a r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof kd8.g
            if (r0 == 0) goto L13
            r0 = r9
            kd8.g r0 = (kd8.g) r0
            int r1 = r0.f182825y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182825y = r1
            goto L18
        L13:
            kd8.g r0 = new kd8.g
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f182823w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182825y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            v6d.a r8 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r9)
            goto L6f
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r9)
            gd8.i r9 = r6.f182843b
            gd8.p r9 = (gd8.p) r9
            r9.getClass()
            java.lang.String r2 = "loadingStrategy"
            w4l.j r4 = w4l.j.f294644c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            w4l.f r9 = r9.f
            kotlin.Unit r2 = kotlin.Unit.f186387a
            efm.r r9 = r9.e(r2, r4)
            vkm.d r9 = rd0.e.b(r9)
            k8d.s r2 = new k8d.s
            r4 = 28
            r2.<init>(r4)
            k8d.s r4 = new k8d.s
            r5 = 29
            r4.<init>(r5)
            jhi.b r9 = mo3.a.e(r9, r2, r4)
            r0.u = r7
            r0.v = r8
            r0.f182825y = r3
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L6f
            return r1
        L6f:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L75:
            boolean r0 = r9.hasNext()
            r1 = 0
            if (r0 == 0) goto L8c
            java.lang.Object r0 = r9.next()
            r2 = r0
            xc8.g r2 = (xc8.g) r2
            java.lang.String r2 = r2.f304107a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r7)
            if (r2 == 0) goto L75
            goto L8d
        L8c:
            r0 = r1
        L8d:
            xc8.g r0 = (xc8.g) r0
            if (r0 == 0) goto L93
            java.util.Map r1 = r0.f304108b
        L93:
            if (r1 != 0) goto L99
            java.util.Map r1 = zhm.r0.g()
        L99:
            java.lang.Object r7 = r1.get(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.p.a(java.lang.String, v6d.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r7, v6d.a r8, gim.c r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof kd8.h
            if (r0 == 0) goto L13
            r0 = r9
            kd8.h r0 = (kd8.h) r0
            int r1 = r0.f182828y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182828y = r1
            goto L18
        L13:
            kd8.h r0 = new kd8.h
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f182826w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182828y
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            v6d.a r8 = r0.v
            java.lang.String r7 = r0.u
            yhm.o.b(r9)
            goto L67
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            yhm.o.b(r9)
            gd8.c r9 = r6.f182842a
            r9.getClass()
            java.lang.String r2 = "loadingStrategy"
            w4l.j r4 = w4l.j.f294644c
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r2)
            x4l.c r9 = r9.d
            kotlin.Unit r2 = kotlin.Unit.f186387a
            vkm.d r9 = r9.b(r2, r4)
            kd8.f r2 = new kd8.f
            r4 = 3
            r2.<init>(r4)
            kd8.f r4 = new kd8.f
            r5 = 4
            r4.<init>(r5)
            jhi.b r9 = mo3.a.e(r9, r2, r4)
            r0.u = r7
            r0.v = r8
            r0.f182828y = r3
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L67
            return r1
        L67:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L6d:
            boolean r0 = r9.hasNext()
            r1 = 0
            if (r0 == 0) goto L84
            java.lang.Object r0 = r9.next()
            r2 = r0
            yc8.b r2 = (yc8.b) r2
            java.lang.String r2 = r2.f312565a
            boolean r2 = kotlin.jvm.internal.Intrinsics.f(r2, r7)
            if (r2 == 0) goto L6d
            goto L85
        L84:
            r0 = r1
        L85:
            yc8.b r0 = (yc8.b) r0
            if (r0 == 0) goto L94
            java.util.Map r7 = r0.f312566b
            if (r7 == 0) goto L94
            java.lang.Object r7 = r7.get(r8)
            yc8.a r7 = (yc8.a) r7
            return r7
        L94:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.p.b(java.lang.String, v6d.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e0, code lost:
    
        if (r2 == r4) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r18, v6d.a r19, gim.c r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 245
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.p.c(java.lang.String, v6d.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof kd8.j
            if (r0 == 0) goto L13
            r0 = r7
            kd8.j r0 = (kd8.j) r0
            int r1 = r0.f182832w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182832w = r1
            goto L18
        L13:
            kd8.j r0 = new kd8.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182832w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L87
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L2f:
            yhm.o.b(r7)
            w4l.j r7 = w4l.j.f294644c
            java.lang.String r2 = "loadingStrategy"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            kbb.c r7 = r6.f182844c
            java.lang.Object r2 = r7.d
            jla.h r2 = (jla.h) r2
            ne8.a r4 = ne8.a.f214420c
            java.lang.String r4 = r4.a()
            exe.j r2 = bla.b.b(r2, r4)
            sa6.o r4 = new sa6.o
            r5 = 7
            r4.<init>(r2, r5)
            kotlin.coroutines.g r2 = kotlin.coroutines.g.f186406a
            efm.r r2 = rd0.e.c(r4, r2)
            te8.g r4 = new te8.g
            r5 = 0
            r4.<init>(r7, r5)
            tcg.q r7 = new tcg.q
            r5 = 7
            r7.<init>(r5, r4)
            efm.r r7 = r2.switchMap(r7)
            java.lang.String r2 = "switchMap(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            vkm.d r7 = rd0.e.b(r7)
            kd8.f r2 = new kd8.f
            r4 = 0
            r2.<init>(r4)
            kd8.f r4 = new kd8.f
            r5 = 1
            r4.<init>(r5)
            jhi.b r7 = mo3.a.e(r7, r2, r4)
            r0.f182832w = r3
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L87
            return r1
        L87:
            lf8.a r7 = (lf8.a) r7
            lf8.d r7 = r7.f194663a
            long r0 = r7.f194667a
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r0)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.p.d(gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable e(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kd8.k
            if (r0 == 0) goto L13
            r0 = r8
            kd8.k r0 = (kd8.k) r0
            int r1 = r0.f182833w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182833w = r1
            goto L18
        L13:
            kd8.k r0 = new kd8.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182833w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r8)     // Catch: java.lang.Throwable -> L28
            goto L56
        L28:
            r7 = move-exception
            goto L63
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            r0.f182833w = r4     // Catch: java.lang.Throwable -> L28
            wsg.n r8 = r6.f     // Catch: java.lang.Throwable -> L28
            r2 = 0
            r5 = 4
            efm.r r7 = osg.b.a(r8, r7, r2, r5)     // Catch: java.lang.Throwable -> L28
            vkm.d r7 = rd0.e.b(r7)     // Catch: java.lang.Throwable -> L28
            kd8.f r8 = new kd8.f     // Catch: java.lang.Throwable -> L28
            r2 = 2
            r8.<init>(r2)     // Catch: java.lang.Throwable -> L28
            jhi.b r7 = mo3.a.g(r7, r3, r8, r4)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r8 = vkm.q.x(r7, r0)     // Catch: java.lang.Throwable -> L28
            if (r8 != r1) goto L56
            return r1
        L56:
            psg.a r8 = (psg.a) r8     // Catch: java.lang.Throwable -> L28
            boolean r7 = ta6.a.A(r8)     // Catch: java.lang.Throwable -> L28
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)     // Catch: java.lang.Throwable -> L28
            yhm.m$a r8 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L28
            goto L69
        L63:
            yhm.m$a r8 = yhm.m.INSTANCE
            yhm.n r7 = yhm.o.a(r7)
        L69:
            java.lang.Throwable r8 = yhm.m.a(r7)
            if (r8 != 0) goto L70
            goto L7b
        L70:
            zhm.h0 r7 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r3, r3, r8, r7)
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
        L7b:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.p.e(java.lang.String, gim.c):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kd8.l
            if (r0 == 0) goto L13
            r0 = r9
            kd8.l r0 = (kd8.l) r0
            int r1 = r0.f182836y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182836y = r1
            goto L18
        L13:
            kd8.l r0 = new kd8.l
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.f182834w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182836y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            long r0 = r0.v
            yhm.o.b(r9)
            goto L75
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L48
        L3a:
            yhm.o.b(r9)
            r0.u = r8
            r0.f182836y = r4
            java.lang.Object r9 = r7.d(r0)
            if (r9 != r1) goto L48
            goto L73
        L48:
            java.lang.Number r9 = (java.lang.Number) r9
            long r5 = r9.longValue()
            r9 = 0
            r0.u = r9
            r0.v = r5
            r0.f182836y = r3
            hj8.a r9 = r7.d
            w4l.j r2 = w4l.j.f294644c
            akg.n r8 = hj8.a.a(r9, r8, r2)
            kd8.f r9 = new kd8.f
            r2 = 5
            r9.<init>(r2)
            kd8.f r2 = new kd8.f
            r3 = 6
            r2.<init>(r3)
            jhi.b r8 = mo3.a.e(r8, r9, r2)
            java.lang.Object r9 = vkm.q.x(r8, r0)
            if (r9 != r1) goto L74
        L73:
            return r1
        L74:
            r0 = r5
        L75:
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r9 = (com.revolut.feature.junior_profile.api.models.JuniorBankingProfile) r9
            java.time.LocalDate r8 = r9.i
            l80.e r9 = r7.e
            l80.f r9 = (l80.f) r9
            java.time.LocalDate r9 = r9.e()
            long r8 = oc.c.s(r8, r9)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 < 0) goto L8a
            goto L8b
        L8a:
            r4 = 0
        L8b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.p.f(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r5, v6d.a r6, gim.c r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof kd8.m
            if (r0 == 0) goto L13
            r0 = r7
            kd8.m r0 = (kd8.m) r0
            int r1 = r0.f182837w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182837w = r1
            goto L18
        L13:
            kd8.m r0 = new kd8.m
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182837w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L3b
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r7)
            r0.f182837w = r3
            java.lang.Object r7 = r4.b(r5, r6, r0)
            if (r7 != r1) goto L3b
            return r1
        L3b:
            if (r7 != 0) goto L3e
            goto L3f
        L3e:
            r3 = 0
        L3f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.p.g(java.lang.String, v6d.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f2, code lost:
    
        if (skm.e0.G(r11, r0) != r1) goto L52;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r11, v6d.a r12, gim.c r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kd8.p.h(java.lang.String, v6d.a, gim.c):java.lang.Object");
    }
}

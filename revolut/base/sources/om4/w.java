package om4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp4.j f226726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final al4.n f226727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0 f226728c;
    public final hk0.a d;

    public w(dp4.j repository, al4.n creditCardInteractor, k0 creditCardFeatureInteractor, hk0.a networkFileRepository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(creditCardInteractor, "creditCardInteractor");
        Intrinsics.checkNotNullParameter(creditCardFeatureInteractor, "creditCardFeatureInteractor");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        this.f226726a = repository;
        this.f226727b = creditCardInteractor;
        this.f226728c = creditCardFeatureInteractor;
        this.d = networkFileRepository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, java.lang.String r7, gim.c r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof om4.r
            if (r0 == 0) goto L13
            r0 = r8
            om4.r r0 = (om4.r) r0
            int r1 = r0.f226674w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226674w = r1
            goto L18
        L13:
            om4.r r0 = new om4.r
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226674w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L64
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r8)
            java.lang.String r8 = "facilityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r8)
            java.lang.String r8 = "boletoId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r8)
            dp4.j r8 = r5.f226726a
            ij0.a r8 = r8.e
            java.lang.String r8 = r8.getBaseUrl()
            java.lang.String r2 = "/credit/"
            java.lang.String r4 = "/boletos/"
            java.lang.StringBuilder r6 = p.a.t(r8, r2, r6, r4, r7)
            java.lang.String r7 = "/document"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            hk0.a r7 = r5.d
            ufm.n r6 = r7.a(r6, r3)
            r0.f226674w = r3
            java.lang.Object r8 = nim.a.b(r6, r0)
            if (r8 != r1) goto L64
            return r1
        L64:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.w.a(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        if (e(r12, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r12, java.lang.String r13, gim.c r14) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r14 instanceof om4.s
            if (r0 == 0) goto L13
            r0 = r14
            om4.s r0 = (om4.s) r0
            int r1 = r0.f226687x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226687x = r1
            goto L18
        L13:
            om4.s r0 = new om4.s
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226687x
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L2b
            goto L6e
        L2b:
            r0 = move-exception
            r12 = r0
            goto L73
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            goto L5f
        L3c:
            yhm.o.b(r14)
            r0.u = r12
            r0.f226687x = r4
            dce.s0 r5 = new dce.s0
            r10 = 11
            dp4.j r6 = r11.f226726a
            r7 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L59
            goto L5b
        L59:
            kotlin.Unit r12 = kotlin.Unit.f186387a
        L5b:
            if (r12 != r1) goto L5e
            goto L6d
        L5e:
            r12 = r7
        L5f:
            kotlin.Unit r13 = kotlin.Unit.f186387a
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            r0.u = r9     // Catch: java.lang.Throwable -> L2b
            r0.f226687x = r3     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r12 = r11.e(r12, r0)     // Catch: java.lang.Throwable -> L2b
            if (r12 != r1) goto L6e
        L6d:
            return r1
        L6e:
            kotlin.Unit r12 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2b
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2b
            goto L79
        L73:
            yhm.m$a r13 = yhm.m.INSTANCE
            yhm.n r12 = yhm.o.a(r12)
        L79:
            java.lang.Throwable r12 = yhm.m.a(r12)
            if (r12 == 0) goto L88
            zhm.h0 r13 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r14 = rd0.d.f253311a
            rd0.c r14 = rd0.c.ERROR
            rd0.d.a(r14, r9, r9, r12, r13)
        L88:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.w.b(java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(8:12|41|13|29|34|(1:36)|37|38)(2:17|18))(1:19))(3:20|(1:23)|27)|24|39|25|(6:28|29|34|(0)|37|38)|27) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0074, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
    
        r11 = r14;
        r14 = r0;
        r13 = r11;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(dj0.d r13, gim.c r14, java.lang.String r15) throws java.lang.Throwable {
        /*
            r12 = this;
            boolean r0 = r14 instanceof om4.t
            if (r0 == 0) goto L13
            r0 = r14
            om4.t r0 = (om4.t) r0
            int r1 = r0.f226698y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226698y = r1
            goto L18
        L13:
            om4.t r0 = new om4.t
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f226696w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226698y
            r3 = 2
            r4 = 1
            r9 = 0
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r13 = r0.v
            yhm.o.b(r14)     // Catch: java.lang.Throwable -> L2d
            goto L6f
        L2d:
            r0 = move-exception
            r14 = r0
            goto L79
        L30:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L38:
            java.lang.String r15 = r0.u
            yhm.o.b(r14)
            goto L5c
        L3e:
            yhm.o.b(r14)
            r0.u = r15
            r0.f226698y = r4
            dce.s0 r5 = new dce.s0
            r10 = 12
            dp4.j r6 = r12.f226726a
            r7 = r13
            r8 = r15
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r13 = skm.p0.f264001a
            elm.f r13 = elm.f.f127540b
            java.lang.Object r14 = skm.e0.J(r13, r5, r0)
            if (r14 != r1) goto L5b
            goto L6d
        L5b:
            r15 = r8
        L5c:
            r13 = r14
            gl4.a r13 = (gl4.a) r13
            yhm.m$a r13 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L74
            r0.u = r9     // Catch: java.lang.Throwable -> L74
            r0.v = r14     // Catch: java.lang.Throwable -> L74
            r0.f226698y = r3     // Catch: java.lang.Throwable -> L74
            java.lang.Object r13 = r12.e(r15, r0)     // Catch: java.lang.Throwable -> L74
            if (r13 != r1) goto L6e
        L6d:
            return r1
        L6e:
            r13 = r14
        L6f:
            kotlin.Unit r14 = kotlin.Unit.f186387a     // Catch: java.lang.Throwable -> L2d
            yhm.m$a r15 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L2d
            goto L7f
        L74:
            r0 = move-exception
            r13 = r0
            r11 = r14
            r14 = r13
            r13 = r11
        L79:
            yhm.m$a r15 = yhm.m.INSTANCE
            yhm.n r14 = yhm.o.a(r14)
        L7f:
            java.lang.Throwable r14 = yhm.m.a(r14)
            if (r14 == 0) goto L8e
            zhm.h0 r15 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r0 = rd0.d.f253311a
            rd0.c r0 = rd0.c.ERROR
            rd0.d.a(r0, r9, r9, r14, r15)
        L8e:
            gl4.a r13 = (gl4.a) r13
            java.lang.String r13 = r13.f144553a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.w.c(dj0.d, gim.c, java.lang.String):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006f, code lost:
    
        if (((om4.x2) r6).M(r8, r9, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof om4.u
            if (r0 == 0) goto L13
            r0 = r9
            om4.u r0 = (om4.u) r0
            int r1 = r0.f226705x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226705x = r1
            goto L18
        L13:
            om4.u r0 = new om4.u
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226705x
            r3 = 3
            r4 = 2
            r5 = 1
            al4.n r6 = r7.f226727b
            if (r2 == 0) goto L43
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            yhm.o.b(r9)
            goto L72
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L37:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L62
        L3d:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L54
        L43:
            yhm.o.b(r9)
            r0.u = r8
            r0.f226705x = r5
            r9 = r6
            om4.x2 r9 = (om4.x2) r9
            java.lang.Object r9 = r9.L(r8, r0)
            if (r9 != r1) goto L54
            goto L71
        L54:
            r0.u = r8
            r0.f226705x = r4
            r9 = r6
            om4.x2 r9 = (om4.x2) r9
            java.lang.Object r9 = r9.H(r0)
            if (r9 != r1) goto L62
            goto L71
        L62:
            ll4.w r9 = ll4.w.MAIN_POCKET
            r2 = 0
            r0.u = r2
            r0.f226705x = r3
            om4.x2 r6 = (om4.x2) r6
            java.lang.Object r8 = r6.M(r8, r9, r0)
            if (r8 != r1) goto L72
        L71:
            return r1
        L72:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: om4.w.d(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x006a, code lost:
    
        if (r6 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof om4.v
            if (r0 == 0) goto L13
            r0 = r7
            om4.v r0 = (om4.v) r0
            int r1 = r0.f226717x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f226717x = r1
            goto L18
        L13:
            om4.v r0 = new om4.v
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f226717x
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
            yw4.f r7 = yw4.f.PAYMENT_OPTION_BOLETO
            r0.u = r6
            r0.f226717x = r4
            om4.k0 r2 = r5.f226728c
            java.lang.Object r7 = r2.b(r6, r7, r0)
            if (r7 != r1) goto L4a
            goto L6c
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L70
            r7 = 0
            r0.u = r7
            r0.f226717x = r3
            dp4.j r7 = r5.f226726a
            x4l.c r7 = r7.f
            cp4.h r2 = new cp4.h
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
        throw new UnsupportedOperationException("Method not decompiled: om4.w.e(java.lang.String, gim.c):java.lang.Object");
    }
}

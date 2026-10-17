package ubd;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sbd.h f278837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dl2.a f278838b;

    public i(sbd.h savingsAccountRepository, dl2.a savingAccountUserRegisteredIdentityProvider) {
        Intrinsics.checkNotNullParameter(savingsAccountRepository, "savingsAccountRepository");
        Intrinsics.checkNotNullParameter(savingAccountUserRegisteredIdentityProvider, "savingAccountUserRegisteredIdentityProvider");
        this.f278837a = savingsAccountRepository;
        this.f278838b = savingAccountUserRegisteredIdentityProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r11, gim.c r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof ubd.a
            if (r0 == 0) goto L13
            r0 = r12
            ubd.a r0 = (ubd.a) r0
            int r1 = r0.f278817y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278817y = r1
            goto L18
        L13:
            ubd.a r0 = new ubd.a
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.f278815w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278817y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r12)
            return r12
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            java.lang.String r11 = r0.v
            sbd.h r2 = r0.u
            yhm.o.b(r12)
        L39:
            r6 = r11
            r5 = r2
            goto L4e
        L3c:
            yhm.o.b(r12)
            sbd.h r2 = r10.f278837a
            r0.u = r2
            r0.v = r11
            r0.f278817y = r4
            java.io.Serializable r12 = r10.c(r0)
            if (r12 != r1) goto L39
            goto L6c
        L4e:
            r7 = r12
            java.lang.String r7 = (java.lang.String) r7
            r8 = 0
            r0.u = r8
            r0.v = r8
            r0.f278817y = r3
            r5.getClass()
            rhl.b r4 = new rhl.b
            r9 = 25
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L6d
        L6c:
            return r1
        L6d:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: ubd.i.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.shared.savings.models.account.SavingsAccountCreate r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ubd.b
            if (r0 == 0) goto L13
            r0 = r7
            ubd.b r0 = (ubd.b) r0
            int r1 = r0.f278820y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278820y = r1
            goto L18
        L13:
            ubd.b r0 = new ubd.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f278818w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278820y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            com.revolut.feature.shared.savings.models.account.SavingsAccountCreate r6 = r0.v
            sbd.h r2 = r0.u
            yhm.o.b(r7)
            goto L4c
        L3a:
            yhm.o.b(r7)
            sbd.h r2 = r5.f278837a
            r0.u = r2
            r0.v = r6
            r0.f278820y = r4
            java.io.Serializable r7 = r5.c(r0)
            if (r7 != r1) goto L4c
            goto L5b
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            r4 = 0
            r0.u = r4
            r0.v = r4
            r0.f278820y = r3
            java.lang.Object r6 = r2.a(r6, r7, r0)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ubd.i.b(com.revolut.feature.shared.savings.models.account.SavingsAccountCreate, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable c(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ubd.c
            if (r0 == 0) goto L13
            r0 = r5
            ubd.c r0 = (ubd.c) r0
            int r1 = r0.f278821w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278821w = r1
            goto L18
        L13:
            ubd.c r0 = new ubd.c
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278821w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)     // Catch: java.lang.Throwable -> L27
            goto L41
        L27:
            r5 = move-exception
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            yhm.m$a r5 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            dl2.a r5 = r4.f278838b     // Catch: java.lang.Throwable -> L27
            r0.f278821w = r3     // Catch: java.lang.Throwable -> L27
            java.lang.Object r5 = r5.a(r0)     // Catch: java.lang.Throwable -> L27
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Throwable -> L27
            yhm.m$a r0 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L27
            goto L4c
        L46:
            yhm.m$a r0 = yhm.m.INSTANCE
            yhm.n r5 = yhm.o.a(r5)
        L4c:
            java.lang.Throwable r0 = yhm.m.a(r5)
            if (r0 != 0) goto L53
            goto L55
        L53:
            java.lang.String r5 = ""
        L55:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ubd.i.c(gim.c):java.io.Serializable");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r6 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ubd.d
            if (r0 == 0) goto L13
            r0 = r7
            ubd.d r0 = (ubd.d) r0
            int r1 = r0.f278824y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278824y = r1
            goto L18
        L13:
            ubd.d r0 = new ubd.d
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f278822w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278824y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.v
            sbd.h r2 = r0.u
            yhm.o.b(r7)
            goto L4c
        L3a:
            yhm.o.b(r7)
            sbd.h r2 = r5.f278837a
            r0.u = r2
            r0.v = r6
            r0.f278824y = r4
            java.io.Serializable r7 = r5.c(r0)
            if (r7 != r1) goto L4c
            goto L68
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            r4 = 0
            r0.u = r4
            r0.v = r4
            r0.f278824y = r3
            x4l.c r2 = r2.f
            sbd.d r3 = new sbd.d
            r3.<init>(r6, r7)
            r6 = 0
            java.lang.Object r6 = r2.d(r3, r6, r0)
            if (r6 != r1) goto L64
            goto L66
        L64:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L66:
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ubd.i.d(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0059, code lost:
    
        if (r2.c(r0, (java.lang.String) r7, r6) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(boolean r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ubd.e
            if (r0 == 0) goto L13
            r0 = r7
            ubd.e r0 = (ubd.e) r0
            int r1 = r0.f278827y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f278827y = r1
            goto L18
        L13:
            ubd.e r0 = new ubd.e
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f278825w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f278827y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L5c
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            boolean r6 = r0.u
            sbd.h r2 = r0.v
            yhm.o.b(r7)
            goto L4c
        L3a:
            yhm.o.b(r7)
            sbd.h r2 = r5.f278837a
            r0.v = r2
            r0.u = r6
            r0.f278827y = r4
            java.io.Serializable r7 = r5.c(r0)
            if (r7 != r1) goto L4c
            goto L5b
        L4c:
            java.lang.String r7 = (java.lang.String) r7
            r4 = 0
            r0.v = r4
            r0.u = r6
            r0.f278827y = r3
            java.lang.Object r6 = r2.c(r0, r7, r6)
            if (r6 != r1) goto L5c
        L5b:
            return r1
        L5c:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ubd.i.e(boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(java.lang.String r25, long r26, java.lang.String r28, lcd.j r29, java.lang.String r30, gim.c r31) throws java.lang.Throwable {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r3 = r31
            boolean r4 = r3 instanceof ubd.f
            if (r4 == 0) goto L19
            r4 = r3
            ubd.f r4 = (ubd.f) r4
            int r5 = r4.D
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 - r6
            r4.D = r5
            goto L1e
        L19:
            ubd.f r4 = new ubd.f
            r4.<init>(r0, r3)
        L1e:
            java.lang.Object r3 = r4.B
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.D
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L54
            if (r6 == r8) goto L38
            if (r6 != r7) goto L30
            yhm.o.b(r3)
            return r3
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            long r1 = r4.A
            long r8 = r4.z
            lcd.j r6 = r4.f278830y
            java.lang.String r10 = r4.f278829x
            java.lang.String r11 = r4.f278828w
            sbd.h r12 = r4.v
            java.lang.String r13 = r4.u
            yhm.o.b(r3)
            r16 = r1
            r19 = r6
            r18 = r10
            r15 = r11
            r20 = r13
        L52:
            r14 = r12
            goto L85
        L54:
            yhm.o.b(r3)
            r3 = r30
            r4.u = r3
            sbd.h r12 = r0.f278837a
            r4.v = r12
            r6 = r25
            r4.f278828w = r6
            r9 = r28
            r4.f278829x = r9
            r10 = r29
            r4.f278830y = r10
            r4.z = r1
            r4.A = r1
            r4.D = r8
            java.io.Serializable r8 = r0.c(r4)
            if (r8 != r5) goto L78
            goto Lae
        L78:
            r16 = r1
            r20 = r3
            r15 = r6
            r3 = r8
            r18 = r9
            r19 = r10
            r8 = r16
            goto L52
        L85:
            r21 = r3
            java.lang.String r21 = (java.lang.String) r21
            r1 = 0
            r4.u = r1
            r4.v = r1
            r4.f278828w = r1
            r4.f278829x = r1
            r4.f278830y = r1
            r4.z = r8
            r4.D = r7
            r14.getClass()
            sbd.g r13 = new sbd.g
            r22 = 0
            r23 = 0
            r13.<init>(r14, r15, r16, r18, r19, r20, r21, r22, r23)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r13, r4)
            if (r1 != r5) goto Laf
        Lae:
            return r5
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ubd.i.f(java.lang.String, long, java.lang.String, lcd.j, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
    
        if (r1 == r3) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(java.lang.String r18, java.lang.String r19, java.lang.Long r20, java.lang.Long r21, gim.c r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r22
            boolean r2 = r1 instanceof ubd.g
            if (r2 == 0) goto L17
            r2 = r1
            ubd.g r2 = (ubd.g) r2
            int r3 = r2.B
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.B = r3
            goto L1c
        L17:
            ubd.g r2 = new ubd.g
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.z
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.B
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L4a
            if (r4 == r6) goto L37
            if (r4 != r5) goto L2f
            yhm.o.b(r1)
            goto L9a
        L2f:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L37:
            java.lang.String r4 = r2.f278833y
            sbd.h r6 = r2.f278832x
            java.lang.Long r7 = r2.f278831w
            java.lang.Long r8 = r2.v
            java.lang.String r9 = r2.u
            yhm.o.b(r1)
            r11 = r4
            r10 = r6
            r13 = r8
            r12 = r9
        L48:
            r14 = r7
            goto L70
        L4a:
            yhm.o.b(r1)
            r1 = r19
            r2.u = r1
            r4 = r20
            r2.v = r4
            r7 = r21
            r2.f278831w = r7
            sbd.h r8 = r0.f278837a
            r2.f278832x = r8
            r9 = r18
            r2.f278833y = r9
            r2.B = r6
            java.io.Serializable r6 = r0.c(r2)
            if (r6 != r3) goto L6a
            goto L99
        L6a:
            r12 = r1
            r13 = r4
            r1 = r6
            r10 = r8
            r11 = r9
            goto L48
        L70:
            r15 = r1
            java.lang.String r15 = (java.lang.String) r15
            r1 = 0
            r2.u = r1
            r2.v = r1
            r2.f278831w = r1
            r2.f278832x = r1
            r2.f278833y = r1
            r2.B = r5
            r10.getClass()
            pn2.c r9 = new pn2.c
            r16 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r9, r2)
            if (r1 != r3) goto L95
            goto L97
        L95:
            kotlin.Unit r1 = kotlin.Unit.f186387a
        L97:
            if (r1 != r3) goto L9a
        L99:
            return r3
        L9a:
            kotlin.Unit r1 = kotlin.Unit.f186387a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ubd.i.g(java.lang.String, java.lang.String, java.lang.Long, java.lang.Long, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r25, long r26, java.lang.String r28, lcd.j r29, java.lang.String r30, gim.c r31) throws java.lang.Throwable {
        /*
            r24 = this;
            r0 = r24
            r1 = r26
            r3 = r31
            boolean r4 = r3 instanceof ubd.h
            if (r4 == 0) goto L19
            r4 = r3
            ubd.h r4 = (ubd.h) r4
            int r5 = r4.D
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 - r6
            r4.D = r5
            goto L1e
        L19:
            ubd.h r4 = new ubd.h
            r4.<init>(r0, r3)
        L1e:
            java.lang.Object r3 = r4.B
            fim.a r5 = fim.a.COROUTINE_SUSPENDED
            int r6 = r4.D
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L54
            if (r6 == r8) goto L38
            if (r6 != r7) goto L30
            yhm.o.b(r3)
            return r3
        L30:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L38:
            long r1 = r4.A
            long r8 = r4.z
            lcd.j r6 = r4.f278836y
            java.lang.String r10 = r4.f278835x
            java.lang.String r11 = r4.f278834w
            sbd.h r12 = r4.v
            java.lang.String r13 = r4.u
            yhm.o.b(r3)
            r16 = r1
            r19 = r6
            r18 = r10
            r15 = r11
            r20 = r13
        L52:
            r14 = r12
            goto L85
        L54:
            yhm.o.b(r3)
            r3 = r30
            r4.u = r3
            sbd.h r12 = r0.f278837a
            r4.v = r12
            r6 = r25
            r4.f278834w = r6
            r9 = r28
            r4.f278835x = r9
            r10 = r29
            r4.f278836y = r10
            r4.z = r1
            r4.A = r1
            r4.D = r8
            java.io.Serializable r8 = r0.c(r4)
            if (r8 != r5) goto L78
            goto Lae
        L78:
            r16 = r1
            r20 = r3
            r15 = r6
            r3 = r8
            r18 = r9
            r19 = r10
            r8 = r16
            goto L52
        L85:
            r21 = r3
            java.lang.String r21 = (java.lang.String) r21
            r1 = 0
            r4.u = r1
            r4.v = r1
            r4.f278834w = r1
            r4.f278835x = r1
            r4.f278836y = r1
            r4.z = r8
            r4.D = r7
            r14.getClass()
            sbd.g r13 = new sbd.g
            r22 = 0
            r23 = 1
            r13.<init>(r14, r15, r16, r18, r19, r20, r21, r22, r23)
            skm.p0 r1 = skm.p0.f264001a
            elm.f r1 = elm.f.f127540b
            java.lang.Object r1 = skm.e0.J(r1, r13, r4)
            if (r1 != r5) goto Laf
        Lae:
            return r5
        Laf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ubd.i.h(java.lang.String, long, java.lang.String, lcd.j, java.lang.String, gim.c):java.lang.Object");
    }
}

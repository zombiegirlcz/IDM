package oc8;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class n extends d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final wsg.n f224123l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ic8.a f224124m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final hj8.a f224125n;
    public final ang.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ao.h f224126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final l93.f f224127q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j60.a f224128r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final pc8.a f224129s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final zf8.n f224130t;

    public n(wsg.n walletsInteractor, ic8.a juniorCardCommandsFactory, hj8.a juniorProfileInteractor, ang.f userInteractor, ao.h juniorCoparentInteractor, l93.f revolutCardsInteractor, j60.a bottomSheetDialogExtension, pc8.a juniorCardCellMapper, zf8.n juniorAccountStatesProvider) {
        Intrinsics.checkNotNullParameter(walletsInteractor, "walletsInteractor");
        Intrinsics.checkNotNullParameter(juniorCardCommandsFactory, "juniorCardCommandsFactory");
        Intrinsics.checkNotNullParameter(juniorProfileInteractor, "juniorProfileInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(juniorCoparentInteractor, "juniorCoparentInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        Intrinsics.checkNotNullParameter(bottomSheetDialogExtension, "bottomSheetDialogExtension");
        Intrinsics.checkNotNullParameter(juniorCardCellMapper, "juniorCardCellMapper");
        Intrinsics.checkNotNullParameter(juniorAccountStatesProvider, "juniorAccountStatesProvider");
        this.f224123l = walletsInteractor;
        this.f224124m = juniorCardCommandsFactory;
        this.f224125n = juniorProfileInteractor;
        this.o = userInteractor;
        this.f224126p = juniorCoparentInteractor;
        this.f224127q = revolutCardsInteractor;
        this.f224128r = bottomSheetDialogExtension;
        this.f224129s = juniorCardCellMapper;
        this.f224130t = juniorAccountStatesProvider;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r10 != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oc8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r9, gim.c r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof oc8.g
            if (r0 == 0) goto L13
            r0 = r10
            oc8.g r0 = (oc8.g) r0
            int r1 = r0.f224114y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f224114y = r1
            goto L18
        L13:
            oc8.g r0 = new oc8.g
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.f224112w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f224114y
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3e
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            boolean r9 = r0.v
            yhm.o.b(r10)
            goto L77
        L30:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L38:
            boolean r9 = r0.v
            yhm.o.b(r10)
            goto L68
        L3e:
            java.lang.String r9 = r0.u
            yhm.o.b(r10)
            goto L52
        L44:
            yhm.o.b(r10)
            r0.u = r9
            r0.f224114y = r5
            java.lang.Object r10 = r8.f3(r9, r0)
            if (r10 != r1) goto L52
            goto L76
        L52:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            r0.u = r6
            r0.v = r10
            r0.f224114y = r4
            java.lang.Object r9 = r8.h3(r9, r0)
            if (r9 != r1) goto L65
            goto L76
        L65:
            r7 = r10
            r10 = r9
            r9 = r7
        L68:
            java.lang.String r10 = (java.lang.String) r10
            r0.u = r6
            r0.v = r9
            r0.f224114y = r3
            java.lang.Object r10 = r8.g3(r10, r0)
            if (r10 != r1) goto L77
        L76:
            return r1
        L77:
            java.util.List r10 = (java.util.List) r10
            java.util.Collection r10 = (java.util.Collection) r10
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L87
            oc8.a r10 = new oc8.a
            r10.<init>(r9)
            return r10
        L87:
            oc8.b r10 = new oc8.b
            r10.<init>(r9)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: oc8.n.Z2(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x025f, code lost:
    
        if (nim.a.a(r1, r3) != r4) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0342, code lost:
    
        if (nim.a.a(r1, r3) != r4) goto L95;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0281  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bc  */
    @Override // oc8.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.String r38, gim.c r39) {
        /*
            Method dump skipped, instruction units count: 862
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: oc8.n.b3(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(java.lang.String r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof oc8.f
            if (r0 == 0) goto L13
            r0 = r6
            oc8.f r0 = (oc8.f) r0
            int r1 = r0.f224111w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f224111w = r1
            goto L18
        L13:
            oc8.f r0 = new oc8.f
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f224111w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            w4l.h r6 = w4l.h.f294642c
            zf8.n r2 = r4.f224130t
            akg.n r5 = r2.c(r5, r6)
            ob2.a r6 = new ob2.a
            r2 = 10
            r6.<init>(r2)
            r2 = 0
            jhi.b r5 = mo3.a.g(r5, r2, r6, r3)
            r0.f224111w = r3
            java.lang.Object r6 = vkm.q.x(r5, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            sf8.h r6 = (sf8.h) r6
            boolean r5 = c8g.a.l(r6)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oc8.n.c3(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d3(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof oc8.h
            if (r0 == 0) goto L13
            r0 = r7
            oc8.h r0 = (oc8.h) r0
            int r1 = r0.f224115w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f224115w = r1
            goto L18
        L13:
            oc8.h r0 = new oc8.h
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f224115w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6b
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            ang.f r7 = r5.o
            r2 = 0
            efm.r r7 = r7.k(r2)
            ao.h r4 = r5.f224126p
            efm.r r6 = r4.m(r6, r2)
            efm.r r6 = le.u1.d(r7, r6)
            obg.q r7 = new obg.q
            r2 = 5
            r7.<init>(r2)
            efm.r r6 = nim.a.w(r6, r7)
            ob2.a r7 = new ob2.a
            r2 = 8
            r7.<init>(r2)
            r2 = 0
            efm.r r6 = m70.a.g(r6, r2, r7, r3)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r7 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f224115w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L6b
            return r1
        L6b:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oc8.n.d3(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e3(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof oc8.i
            if (r0 == 0) goto L13
            r0 = r7
            oc8.i r0 = (oc8.i) r0
            int r1 = r0.f224116w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f224116w = r1
            goto L18
        L13:
            oc8.i r0 = new oc8.i
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f224116w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L71
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            ao.h r7 = r5.f224126p
            r2 = 0
            efm.r r6 = r7.m(r6, r2)
            obg.q r7 = new obg.q
            r2 = 6
            r7.<init>(r2)
            efm.r r6 = nim.a.w(r6, r7)
            ob2.a r7 = new ob2.a
            r2 = 9
            r7.<init>(r2)
            r2 = 0
            efm.r r6 = m70.a.g(r6, r2, r7, r3)
            obg.q r7 = new obg.q
            r2 = 7
            r7.<init>(r2)
            oc8.e r2 = new oc8.e
            r4 = 0
            r2.<init>(r4, r7)
            efm.r r6 = r6.map(r2)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r7 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r7)
            r0.f224116w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L71
            return r1
        L71:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: oc8.n.e3(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f3(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof oc8.j
            if (r0 == 0) goto L13
            r0 = r7
            oc8.j r0 = (oc8.j) r0
            int r1 = r0.f224117w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f224117w = r1
            goto L18
        L13:
            oc8.j r0 = new oc8.j
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f224117w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L54
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            hj8.a r7 = r5.f224125n
            w4l.h r2 = w4l.h.f294642c
            akg.n r7 = hj8.a.a(r7, r6, r2)
            f28.b0 r2 = new f28.b0
            r4 = 11
            r2.<init>(r6, r4)
            ob2.a r6 = new ob2.a
            r4 = 5
            r6.<init>(r4)
            jhi.b r6 = mo3.a.e(r7, r2, r6)
            r0.f224117w = r3
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L54
            return r1
        L54:
            com.revolut.feature.junior_profile.api.models.JuniorBankingProfile r7 = (com.revolut.feature.junior_profile.api.models.JuniorBankingProfile) r7
            boolean r6 = ta6.a.x(r7)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: oc8.n.f3(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g3(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof oc8.k
            if (r0 == 0) goto L13
            r0 = r8
            oc8.k r0 = (oc8.k) r0
            int r1 = r0.f224118w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f224118w = r1
            goto L18
        L13:
            oc8.k r0 = new oc8.k
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f224118w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L51
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            b93.d r8 = b93.d.RETAIL
            r2 = 0
            r4 = 8
            l93.f r5 = r6.f224127q
            sfm.b r7 = l93.f.k(r5, r7, r8, r2, r4)
            ob2.a r8 = new ob2.a
            r2 = 7
            r8.<init>(r2)
            r2 = 0
            efm.r r7 = m70.a.g(r7, r2, r8, r3)
            r0.f224118w = r3
            java.lang.Object r8 = nim.a.c(r7, r0)
            if (r8 != r1) goto L51
            return r1
        L51:
            java.lang.String r7 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oc8.n.g3(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h3(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof oc8.l
            if (r0 == 0) goto L13
            r0 = r8
            oc8.l r0 = (oc8.l) r0
            int r1 = r0.f224119w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f224119w = r1
            goto L18
        L13:
            oc8.l r0 = new oc8.l
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f224119w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L56
        L27:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L2f:
            yhm.o.b(r8)
            r8 = 0
            r2 = 4
            wsg.n r4 = r6.f224123l
            efm.r r7 = osg.b.a(r4, r7, r8, r2)
            ngh.i r8 = new ngh.i
            r2 = 17
            r8.<init>(r2)
            ob2.a r2 = new ob2.a
            r4 = 6
            r2.<init>(r4)
            r4 = 2
            r5 = 0
            efm.r r7 = m70.a.h(r7, r8, r5, r2, r4)
            r0.f224119w = r3
            java.lang.Object r8 = nim.a.c(r7, r0)
            if (r8 != r1) goto L56
            return r1
        L56:
            java.lang.String r7 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: oc8.n.h3(java.lang.String, gim.c):java.lang.Object");
    }
}

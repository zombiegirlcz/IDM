package sa6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ya6.q f261328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f261329b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j61.b f261330c;
    public final wj0.a d;
    public final a0 e;
    public final e f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final l93.b f261331g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final nyb.k f261332h;
    public final ang.f i;

    public j0(ya6.q donationsRepository, wsg.n walletInteractor, j61.b transactionsInteractor, wj0.a idempotencyKeyHolder, a0 pendingDonationsInteractor, e campaignsInteractor, l93.b cardsInteractor, nyb.k revPointsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(donationsRepository, "donationsRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(idempotencyKeyHolder, "idempotencyKeyHolder");
        Intrinsics.checkNotNullParameter(pendingDonationsInteractor, "pendingDonationsInteractor");
        Intrinsics.checkNotNullParameter(campaignsInteractor, "campaignsInteractor");
        Intrinsics.checkNotNullParameter(cardsInteractor, "cardsInteractor");
        Intrinsics.checkNotNullParameter(revPointsInteractor, "revPointsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f261328a = donationsRepository;
        this.f261329b = walletInteractor;
        this.f261330c = transactionsInteractor;
        this.d = idempotencyKeyHolder;
        this.e = pendingDonationsInteractor;
        this.f = campaignsInteractor;
        this.f261331g = cardsInteractor;
        this.f261332h = revPointsInteractor;
        this.i = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(sa6.j0 r4, java.lang.String r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof sa6.f0
            if (r0 == 0) goto L16
            r0 = r6
            sa6.f0 r0 = (sa6.f0) r0
            int r1 = r0.f261316w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f261316w = r1
            goto L1b
        L16:
            sa6.f0 r0 = new sa6.f0
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261316w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L52
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            ya6.q r4 = r4.f261328a
            r6 = 0
            ya6.z r4 = (ya6.z) r4
            efm.r r4 = r4.a(r5, r6)
            sa5.a r5 = new sa5.a
            r6 = 3
            r5.<init>(r6)
            r6 = 0
            efm.r r4 = m70.a.g(r4, r6, r5, r3)
            r0.f261316w = r3
            java.lang.Object r6 = nim.a.c(r4, r0)
            if (r6 != r1) goto L52
            return r1
        L52:
            java.lang.String r4 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sa6.j0.a(sa6.j0, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(sa6.j0 r6, java.lang.String r7, java.lang.String r8, gim.c r9) {
        /*
            r6.getClass()
            boolean r0 = r9 instanceof sa6.g0
            if (r0 == 0) goto L16
            r0 = r9
            sa6.g0 r0 = (sa6.g0) r0
            int r1 = r0.f261318x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f261318x = r1
            goto L1b
        L16:
            sa6.g0 r0 = new sa6.g0
            r0.<init>(r6, r9)
        L1b:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261318x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            ba6.r r6 = r0.u
            yhm.o.b(r9)
            goto La1
        L31:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L39:
            ba6.r r7 = r0.u
            sa6.j0 r7 = (sa6.j0) r7
            yhm.o.b(r9)     // Catch: java.lang.Throwable -> L41
            goto L58
        L41:
            r7 = move-exception
            goto L5d
        L43:
            yhm.o.b(r9)
            if (r7 != 0) goto L49
            return r5
        L49:
            yhm.m$a r9 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L41
            sa6.e r9 = r6.f     // Catch: java.lang.Throwable -> L41
            r0.u = r5     // Catch: java.lang.Throwable -> L41
            r0.f261318x = r4     // Catch: java.lang.Throwable -> L41
            java.lang.Object r9 = r9.a(r8, r7, r0)     // Catch: java.lang.Throwable -> L41
            if (r9 != r1) goto L58
            goto La4
        L58:
            ba6.r r9 = (ba6.r) r9     // Catch: java.lang.Throwable -> L41
            yhm.m$a r7 = yhm.m.INSTANCE     // Catch: java.lang.Throwable -> L41
            goto L63
        L5d:
            yhm.m$a r8 = yhm.m.INSTANCE
            yhm.n r9 = yhm.o.a(r7)
        L63:
            boolean r7 = r9 instanceof yhm.n
            if (r7 == 0) goto L68
            r9 = r5
        L68:
            r7 = r9
            ba6.r r7 = (ba6.r) r7
            if (r7 == 0) goto La3
            r0.u = r7
            r0.f261318x = r3
            wsg.n r8 = r6.f261329b
            com.revolut.core.model.account.AccountId$Personal r9 = com.revolut.core.model.account.AccountId.Personal.f51414a
            ufm.i r8 = r8.E(r9)
            s78.d r9 = new s78.d
            r2 = 17
            r9.<init>(r6, r2)
            sa6.a r6 = new sa6.a
            r2 = 16
            r6.<init>(r9, r2)
            pfm.a r9 = new pfm.a
            r2 = 4
            r9.<init>(r8, r6, r2)
            java.lang.String r6 = "flatMapCompletable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r9, r6)
            java.lang.Object r6 = nim.a.a(r9, r0)
            fim.a r8 = fim.a.COROUTINE_SUSPENDED
            if (r6 != r8) goto L9b
            goto L9d
        L9b:
            kotlin.Unit r6 = kotlin.Unit.f186387a
        L9d:
            if (r6 != r1) goto La0
            goto La4
        La0:
            r6 = r7
        La1:
            r1 = r6
            goto La4
        La3:
            r1 = r5
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: sa6.j0.b(sa6.j0, java.lang.String, java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(sa6.j0 r4, gim.c r5) {
        /*
            r4.getClass()
            boolean r0 = r5 instanceof sa6.h0
            if (r0 == 0) goto L16
            r0 = r5
            sa6.h0 r0 = (sa6.h0) r0
            int r1 = r0.f261322w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f261322w = r1
            goto L1b
        L16:
            sa6.h0 r0 = new sa6.h0
            r0.<init>(r4, r5)
        L1b:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261322w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r5)
            goto L57
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r5)
            ang.f r4 = r4.i
            r5 = 0
            efm.d0 r4 = r4.f(r5)
            sa6.i0 r5 = sa6.i0.f
            s1c.d r5 = new s1c.d
            r2 = 4
            r5.<init>(r2)
            ufm.i r2 = new ufm.i
            r2.<init>(r4, r5, r3)
            java.lang.String r4 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            r0.f261322w = r3
            java.lang.Object r5 = nim.a.b(r2, r0)
            if (r5 != r1) goto L57
            return r1
        L57:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: sa6.j0.c(sa6.j0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a6, code lost:
    
        if (r3 == r9) goto L59;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0195 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r17, ba6.b0 r18, boolean r19, ba6.u r20, gim.c r21) {
        /*
            Method dump skipped, instruction units count: 418
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sa6.j0.d(java.lang.String, ba6.b0, boolean, ba6.u, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(dj0.d r6, gim.c r7, java.lang.String r8) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof sa6.e0
            if (r0 == 0) goto L13
            r0 = r7
            sa6.e0 r0 = (sa6.e0) r0
            int r1 = r0.f261313w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261313w = r1
            goto L18
        L13:
            sa6.e0 r0 = new sa6.e0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261313w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L85
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            sa6.e r7 = r5.f
            r7.getClass()
            java.lang.String r2 = "donationMoney"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r6, r2)
            java.lang.String r2 = "charityId"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            ya6.d r7 = r7.f261312a
            r7.getClass()
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r2)
            w4l.f r7 = r7.d
            w4l.h r2 = w4l.h.f294642c
            efm.r r7 = r7.e(r8, r2)
            ar3.a r8 = new ar3.a
            r2 = 26
            r8.<init>(r2, r6)
            efm.r r6 = nim.a.w(r7, r8)
            vkm.d r6 = rd0.e.b(r6)
            sa5.a r7 = new sa5.a
            r8 = 4
            r7.<init>(r8)
            r8 = 0
            jhi.b r6 = mo3.a.g(r6, r8, r7, r3)
            qtb.o r7 = new qtb.o
            r2 = 3
            r4 = 20
            r7.<init>(r2, r4, r8)
            zhm.h0 r8 = zhm.h0.f322473a
            vkm.y r6 = rd0.e.e(r6, r8, r7)
            r0.f261313w = r3
            java.lang.Object r7 = vkm.q.x(r6, r0)
            if (r7 != r1) goto L85
            return r1
        L85:
            od0.i r7 = (od0.i) r7
            java.lang.Object r6 = r7.f224257a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: sa6.j0.e(dj0.d, gim.c, java.lang.String):java.lang.Object");
    }
}

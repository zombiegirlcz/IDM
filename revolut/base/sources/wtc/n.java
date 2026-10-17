package wtc;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cuc.u f299887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wsg.n f299888b;

    public n(cuc.u securityHubRepository, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(securityHubRepository, "securityHubRepository");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        this.f299887a = securityHubRepository;
        this.f299888b = walletInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007e, code lost:
    
        if (nim.a.a(r0, r1) == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r15, long r16, boolean r18, gim.c r19) throws java.lang.Throwable {
        /*
            r14 = this;
            r0 = r19
            boolean r1 = r0 instanceof wtc.l
            if (r1 == 0) goto L15
            r1 = r0
            wtc.l r1 = (wtc.l) r1
            int r2 = r1.f299881y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f299881y = r2
            goto L1a
        L15:
            wtc.l r1 = new wtc.l
            r1.<init>(r14, r0)
        L1a:
            java.lang.Object r0 = r1.f299879w
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.f299881y
            r4 = 2
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 == r5) goto L34
            if (r3 != r4) goto L2c
            yhm.o.b(r0)
            goto L81
        L2c:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L34:
            boolean r15 = r1.v
            long r5 = r1.u
            yhm.o.b(r0)
            goto L6c
        L3c:
            yhm.o.b(r0)
            r10 = r16
            r1.u = r10
            r12 = r18
            r1.v = r12
            r1.f299881y = r5
            cuc.u r0 = r14.f299887a
            r8 = r0
            cuc.z r8 = (cuc.z) r8
            r8.getClass()
            cuc.x r7 = new cuc.x
            r13 = 0
            r9 = r15
            r7.<init>(r8, r9, r10, r12, r13)
            skm.p0 r15 = skm.p0.f264001a
            elm.f r15 = elm.f.f127540b
            java.lang.Object r15 = skm.e0.J(r15, r7, r1)
            if (r15 != r2) goto L63
            goto L65
        L63:
            kotlin.Unit r15 = kotlin.Unit.f186387a
        L65:
            if (r15 != r2) goto L68
            goto L80
        L68:
            r5 = r16
            r15 = r18
        L6c:
            wsg.n r0 = r14.f299888b
            com.revolut.core.model.account.AccountId$Personal r3 = com.revolut.core.model.account.AccountId.Personal.f51414a
            efm.b r0 = r0.j0(r3)
            r1.u = r5
            r1.v = r15
            r1.f299881y = r4
            java.lang.Object r15 = nim.a.a(r0, r1)
            if (r15 != r2) goto L81
        L80:
            return r2
        L81:
            kotlin.Unit r15 = kotlin.Unit.f186387a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.n.a(java.lang.String, long, boolean, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0072, code lost:
    
        if (nim.a.a(r11, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r11, java.lang.String r12, boolean r13) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r11 instanceof wtc.m
            if (r0 == 0) goto L13
            r0 = r11
            wtc.m r0 = (wtc.m) r0
            int r1 = r0.f299885x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f299885x = r1
            goto L18
        L13:
            wtc.m r0 = new wtc.m
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f299885x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r11)
            goto L75
        L2a:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L32:
            boolean r13 = r0.u
            yhm.o.b(r11)
            goto L62
        L38:
            yhm.o.b(r11)
            r0.u = r13
            r0.f299885x = r4
            cuc.u r11 = r10.f299887a
            r5 = r11
            cuc.z r5 = (cuc.z) r5
            r5.getClass()
            ald.m r4 = new ald.m
            r9 = 9
            r8 = 0
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            skm.p0 r11 = skm.p0.f264001a
            elm.f r11 = elm.f.f127540b
            java.lang.Object r11 = skm.e0.J(r11, r4, r0)
            if (r11 != r1) goto L5c
            goto L5e
        L5c:
            kotlin.Unit r11 = kotlin.Unit.f186387a
        L5e:
            if (r11 != r1) goto L61
            goto L74
        L61:
            r13 = r7
        L62:
            wsg.n r11 = r10.f299888b
            com.revolut.core.model.account.AccountId$Personal r12 = com.revolut.core.model.account.AccountId.Personal.f51414a
            efm.b r11 = r11.j0(r12)
            r0.u = r13
            r0.f299885x = r3
            java.lang.Object r11 = nim.a.a(r11, r0)
            if (r11 != r1) goto L75
        L74:
            return r1
        L75:
            kotlin.Unit r11 = kotlin.Unit.f186387a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: wtc.n.b(gim.c, java.lang.String, boolean):java.lang.Object");
    }
}

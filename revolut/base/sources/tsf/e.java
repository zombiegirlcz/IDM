package tsf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class e implements csf.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lsf.d f274126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f274127b;

    public e(lsf.d repository, com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f274126a = repository;
        this.f274127b = transactionsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
    
        if (((mjf.b0) r11.f274127b).n(r12, null, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues r13, gim.c r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof tsf.b
            if (r0 == 0) goto L13
            r0 = r14
            tsf.b r0 = (tsf.b) r0
            int r1 = r0.f274121x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274121x = r1
            goto L18
        L13:
            tsf.b r0 = new tsf.b
            r0.<init>(r11, r14)
        L18:
            java.lang.Object r14 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274121x
            r3 = 2
            r4 = 1
            r10 = 0
            if (r2 == 0) goto L39
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r14)
            goto L63
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            java.lang.String r12 = r0.u
            yhm.o.b(r14)
            goto L56
        L39:
            yhm.o.b(r14)
            r0.u = r12
            r0.f274121x = r4
            lr.l r5 = new lr.l
            r6 = 3
            lsf.d r7 = r11.f274126a
            r9 = r12
            r8 = r13
            r5.<init>(r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r5, r0)
            if (r12 != r1) goto L55
            goto L62
        L55:
            r12 = r9
        L56:
            r0.u = r10
            r0.f274121x = r3
            com.revolut.domain.interactors.transactions.a r13 = r11.f274127b
            java.lang.Object r12 = com.revolut.domain.interactors.transactions.a.a(r13, r12, r0)
            if (r12 != r1) goto L63
        L62:
            return r1
        L63:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tsf.e.a(java.lang.String, com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (((mjf.b0) r4).n(r8, null, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.String r8, gim.c r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof tsf.c
            if (r0 == 0) goto L13
            r0 = r9
            tsf.c r0 = (tsf.c) r0
            int r1 = r0.f274123x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274123x = r1
            goto L18
        L13:
            tsf.c r0 = new tsf.c
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274123x
            r3 = 0
            com.revolut.domain.interactors.transactions.a r4 = r7.f274127b
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3b
            if (r2 == r6) goto L35
            if (r2 != r5) goto L2d
            yhm.o.b(r9)
            goto L67
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            java.lang.String r8 = r0.u
            yhm.o.b(r9)
            goto L5c
        L3b:
            yhm.o.b(r9)
            r0.u = r8
            r0.f274123x = r6
            r9 = r4
            mjf.b0 r9 = (mjf.b0) r9
            x71.e r9 = r9.f205982a
            xif.s r9 = (xif.s) r9
            r9.getClass()
            xif.r r2 = new xif.r
            r2.<init>(r9, r8, r3, r6)
            skm.p0 r9 = skm.p0.f264001a
            elm.f r9 = elm.f.f127540b
            java.lang.Object r9 = skm.e0.J(r9, r2, r0)
            if (r9 != r1) goto L5c
            goto L66
        L5c:
            r0.u = r3
            r0.f274123x = r5
            java.lang.Object r8 = com.revolut.domain.interactors.transactions.a.a(r4, r8, r0)
            if (r8 != r1) goto L67
        L66:
            return r1
        L67:
            kotlin.Unit r8 = kotlin.Unit.f186387a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: tsf.e.b(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0063, code lost:
    
        if (((mjf.b0) r11.f274127b).n(r12, null, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r12, ttf.d r13, com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues r14, gim.c r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof tsf.d
            if (r0 == 0) goto L13
            r0 = r15
            tsf.d r0 = (tsf.d) r0
            int r1 = r0.f274125x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f274125x = r1
            goto L18
        L13:
            tsf.d r0 = new tsf.d
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f274125x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r15)
            goto L66
        L2a:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L32:
            java.lang.String r12 = r0.u
            yhm.o.b(r15)
            goto L58
        L38:
            yhm.o.b(r15)
            r0.u = r12
            r0.f274125x = r4
            km2.n r4 = new km2.n
            r10 = 0
            r5 = 22
            lsf.d r6 = r11.f274126a
            r7 = r12
            r9 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            skm.p0 r12 = skm.p0.f264001a
            elm.f r12 = elm.f.f127540b
            java.lang.Object r12 = skm.e0.J(r12, r4, r0)
            if (r12 != r1) goto L57
            goto L65
        L57:
            r12 = r7
        L58:
            r13 = 0
            r0.u = r13
            r0.f274125x = r3
            com.revolut.domain.interactors.transactions.a r13 = r11.f274127b
            java.lang.Object r12 = com.revolut.domain.interactors.transactions.a.a(r13, r12, r0)
            if (r12 != r1) goto L66
        L65:
            return r1
        L66:
            kotlin.Unit r12 = kotlin.Unit.f186387a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: tsf.e.c(java.lang.String, ttf.d, com.revolut.feature.transfer_reasons.models.reason.TransferReasonsValues, gim.c):java.lang.Object");
    }
}

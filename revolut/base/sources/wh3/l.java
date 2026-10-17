package wh3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class l extends qh3.b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final y51.a f297386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final ang.f f297387m;

    public l(y51.a externalCardsInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.f297386l = externalCardsInteractor;
        this.f297387m = userInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // qh3.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(boolean r12, qg7.k r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.l.Z2(boolean, qg7.k, gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0089, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(boolean r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof wh3.j
            if (r0 == 0) goto L13
            r0 = r8
            wh3.j r0 = (wh3.j) r0
            int r1 = r0.f297382x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f297382x = r1
            goto L18
        L13:
            wh3.j r0 = new wh3.j
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f297382x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r8)
            goto L8c
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L33:
            boolean r7 = r0.u
            yhm.o.b(r8)
            goto L4d
        L39:
            yhm.o.b(r8)
            ang.f r8 = r6.f297387m
            efm.d0 r8 = r8.f(r3)
            r0.u = r7
            r0.f297382x = r5
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L4d
            goto L8b
        L4d:
            do3.n r8 = (do3.n) r8
            kotlin.jvm.internal.Intrinsics.h(r8)
            wi0.a r2 = wi0.b.Companion
            r2.getClass()
            wi0.b r2 = wi0.b.X0
            boolean r8 = te0.w.S(r8, r2)
            if (r8 == 0) goto L95
            if (r7 == 0) goto L95
            y51.a r8 = r6.f297386l
            e0f.z r8 = (e0f.z) r8
            p71.a r8 = r8.f121703a
            u21.k r8 = (u21.k) r8
            r8.getClass()
            u21.c r2 = new u21.c
            r3 = 1
            r2.<init>(r8, r3)
            ufm.c r8 = new ufm.c
            r3 = 2
            r8.<init>(r2, r3)
            java.lang.String r2 = "fromCallable(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r2)
            ufm.n r8 = te0.w.i0(r8)
            r0.u = r7
            r0.f297382x = r4
            java.lang.Object r8 = nim.a.b(r8, r0)
            if (r8 != r1) goto L8c
        L8b:
            return r1
        L8c:
            kotlin.jvm.internal.Intrinsics.h(r8)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r3 = r8.booleanValue()
        L95:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: wh3.l.b3(boolean, gim.c):java.lang.Object");
    }
}

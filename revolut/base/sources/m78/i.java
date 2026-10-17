package m78;

import kotlin.jvm.internal.Intrinsics;
import wsg.n;

/* JADX INFO: loaded from: classes4.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f203347a;

    public i(n walletInteractor, int i) {
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                this.f203347a = walletInteractor;
                break;
            case 2:
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                this.f203347a = walletInteractor;
                break;
            default:
                Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
                this.f203347a = walletInteractor;
                break;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(java.lang.String r6, gim.c r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof m78.g
            if (r0 == 0) goto L13
            r0 = r7
            m78.g r0 = (m78.g) r0
            int r1 = r0.f203343w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f203343w = r1
            goto L18
        L13:
            m78.g r0 = new m78.g
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f203343w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r7)
            goto L6c
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L2f:
            yhm.o.b(r7)
            wsg.n r7 = r5.f203347a
            r2 = 0
            efm.r r6 = r7.a0(r6, r2)
            m56.g r7 = new m56.g
            r2 = 10
            r7.<init>(r2)
            r2 = 0
            efm.r r6 = m70.a.g(r6, r2, r7, r3)
            efm.d0 r6 = r6.firstOrError()
            m62.l r7 = new m62.l
            r2 = 7
            r7.<init>(r2)
            m78.e r2 = new m78.e
            r4 = 0
            r2.<init>(r7, r4)
            r6.getClass()
            ufm.i r7 = new ufm.i
            r4 = 1
            r7.<init>(r6, r2, r4)
            java.lang.String r6 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            r0.f203343w = r3
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L6c
            return r1
        L6c:
            java.lang.String r6 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r6)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: m78.i.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(java.lang.String r17, gim.c r18) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            boolean r2 = r1 instanceof m78.h
            if (r2 == 0) goto L17
            r2 = r1
            m78.h r2 = (m78.h) r2
            int r3 = r2.f203346y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f203346y = r3
            goto L1c
        L17:
            m78.h r2 = new m78.h
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.f203344w
            fim.a r3 = fim.a.COROUTINE_SUSPENDED
            int r4 = r2.f203346y
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L40
            if (r4 == r6) goto L3a
            if (r4 != r5) goto L32
            java.util.List r2 = r2.v
            java.util.List r2 = (java.util.List) r2
            yhm.o.b(r1)
            goto L77
        L32:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L3a:
            java.lang.String r4 = r2.u
            yhm.o.b(r1)
            goto L61
        L40:
            yhm.o.b(r1)
            io3.l r8 = io3.l.CURRENT
            io3.i r10 = io3.i.INTERNAL
            io3.k r9 = io3.k.ACTIVE
            r13 = 0
            r14 = 56
            wsg.n r7 = r0.f203347a
            r11 = 0
            r12 = 0
            efm.d0 r1 = osg.b.j(r7, r8, r9, r10, r11, r12, r13, r14)
            r4 = r17
            r2.u = r4
            r2.f203346y = r6
            java.lang.Object r1 = nim.a.b(r1, r2)
            if (r1 != r3) goto L61
            goto L73
        L61:
            java.util.List r1 = (java.util.List) r1
            r7 = 0
            r2.u = r7
            r7 = r1
            java.util.List r7 = (java.util.List) r7
            r2.v = r7
            r2.f203346y = r5
            java.lang.Object r2 = r0.a(r4, r2)
            if (r2 != r3) goto L74
        L73:
            return r3
        L74:
            r15 = r2
            r2 = r1
            r1 = r15
        L77:
            xi0.b r1 = (xi0.b) r1
            kotlin.jvm.internal.Intrinsics.h(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            boolean r3 = r2 instanceof java.util.Collection
            r4 = 0
            if (r3 == 0) goto L8e
            r3 = r2
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L8e
        L8c:
            r6 = r4
            goto La8
        L8e:
            java.util.Iterator r2 = r2.iterator()
        L92:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8c
            java.lang.Object r3 = r2.next()
            io3.d r3 = (io3.d) r3
            java.lang.String r3 = r3.f163147c
            java.lang.String r5 = r1.f306286a
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r3, r5)
            if (r3 == 0) goto L92
        La8:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: m78.i.b(java.lang.String, gim.c):java.lang.Object");
    }
}

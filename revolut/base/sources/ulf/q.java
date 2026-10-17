package ulf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f280990a;

    public q(m delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f280990a = delegate;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0067 A[PHI: r3 r10 r11 r14
      0x0067: PHI (r3v4 java.util.Iterator) = (r3v3 java.util.Iterator), (r3v5 java.util.Iterator) binds: [B:14:0x003c, B:21:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r10v1 com.revolut.feature_move_money.api.model.AccountWrapper) = 
      (r10v0 com.revolut.feature_move_money.api.model.AccountWrapper)
      (r10v2 com.revolut.feature_move_money.api.model.AccountWrapper)
     binds: [B:14:0x003c, B:21:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r11v1 dj0.d) = (r11v0 dj0.d), (r11v2 dj0.d) binds: [B:14:0x003c, B:21:0x0094] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r14v3 int) = (r14v1 int), (r14v4 int) binds: [B:14:0x003c, B:21:0x0094] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x008b -> B:20:0x008e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature_move_money.api.model.AccountWrapper r14, dj0.d r15, gim.c r16, java.util.List r17) {
        /*
            r13 = this;
            r0 = r16
            boolean r1 = r0 instanceof ulf.o
            if (r1 == 0) goto L15
            r1 = r0
            ulf.o r1 = (ulf.o) r1
            int r2 = r1.A
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.A = r2
            goto L1a
        L15:
            ulf.o r1 = new ulf.o
            r1.<init>(r13, r0)
        L1a:
            java.lang.Object r0 = r1.f280986y
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r1.A
            r4 = 0
            r5 = 1
            if (r3 == 0) goto L3c
            if (r3 != r5) goto L34
            int r14 = r1.f280985x
            java.util.Iterator r3 = r1.f280984w
            dj0.d r6 = r1.v
            com.revolut.feature_move_money.api.model.AccountWrapper r7 = r1.u
            yhm.o.b(r0)
            r11 = r6
            r10 = r7
            goto L8e
        L34:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L3c:
            yhm.o.b(r0)
            r0 = r17
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            lim.q r0 = zhm.d0.Q(r0)
            java.lang.String r3 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r3)
            r3 = 10
            kli.a.g(r3, r3)
            java.lang.Object r0 = r0.f195577b
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
            java.util.Iterator r0 = kli.a.K(r0, r3, r3, r4)
            r10 = r14
            r11 = r15
            r3 = r0
            r14 = r4
        L67:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L97
            java.lang.Object r0 = r3.next()
            r8 = r0
            java.util.List r8 = (java.util.List) r8
            s56.d0 r6 = new s56.d0
            r12 = 0
            r7 = 11
            r9 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r1.u = r10
            r1.v = r11
            r1.f280984w = r3
            r1.f280985x = r14
            r1.A = r5
            java.lang.Object r0 = skm.e0.o(r6, r1)
            if (r0 != r2) goto L8e
            return r2
        L8e:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L67
            r4 = r5
        L97:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r4)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: ulf.q.a(com.revolut.feature_move_money.api.model.AccountWrapper, dj0.d, gim.c, java.util.List):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(tof.a3 r13, gim.c r14) {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ulf.q.b(tof.a3, gim.c):java.lang.Object");
    }
}

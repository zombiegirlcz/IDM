package sde;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f261866a;

    public b(com.revolut.domain.interactors.transactions.a transactionsInteractor) {
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f261866a = transactionsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(java.util.List r12, gim.c r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof sde.a
            if (r0 == 0) goto L13
            r0 = r13
            sde.a r0 = (sde.a) r0
            int r1 = r0.f261865w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261865w = r1
            goto L18
        L13:
            sde.a r0 = new sde.a
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261865w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r13)
            goto L61
        L27:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L2f:
            yhm.o.b(r13)
            boolean r13 = r12.isEmpty()
            if (r13 == 0) goto L3b
            zhm.f0 r12 = zhm.f0.f322471a
            return r12
        L3b:
            tof.s9 r5 = new tof.s9
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.Set r12 = zhm.d0.i1(r12)
            r5.<init>(r12)
            tof.i1 r12 = tof.i1.f272794a
            java.util.List r6 = zhm.u.c(r12)
            com.revolut.domain.interactors.transactions.TransactionsSort r8 = com.revolut.domain.interactors.transactions.TransactionsSort.STARTED_DATE_DESC
            r9 = 0
            r10 = 20
            com.revolut.domain.interactors.transactions.a r4 = r11.f261866a
            r7 = 0
            ufm.i r12 = com.revolut.domain.interactors.transactions.a.b(r4, r5, r6, r7, r8, r9, r10)
            r0.f261865w = r3
            java.lang.Object r13 = nim.a.b(r12, r0)
            if (r13 != r1) goto L61
            return r1
        L61:
            java.lang.String r12 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r13, r12)
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r13 = r13.iterator()
        L76:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r1 = r13.next()
            r2 = r1
            tof.a3 r2 = (tof.a3) r2
            java.lang.String r2 = r2.f272581b
            boolean r2 = r12.add(r2)
            if (r2 == 0) goto L76
            r0.add(r1)
            goto L76
        L8f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sde.b.a(java.util.List, gim.c):java.io.Serializable");
    }
}

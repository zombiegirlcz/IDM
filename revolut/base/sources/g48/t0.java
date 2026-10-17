package g48;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wsg.n f140412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f140413b;

    public t0(com.revolut.domain.interactors.transactions.a transactionsInteractor, wsg.n walletInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        this.f140412a = walletInteractor;
        this.f140413b = transactionsInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b6, code lost:
    
        if (r15 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.core.model.account.AccountId.Joint r14, gim.c r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof g48.s0
            if (r0 == 0) goto L13
            r0 = r15
            g48.s0 r0 = (g48.s0) r0
            int r1 = r0.f140410x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f140410x = r1
            goto L18
        L13:
            g48.s0 r0 = new g48.s0
            r0.<init>(r13, r15)
        L18:
            java.lang.Object r15 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140410x
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L39
            if (r2 == r3) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r15)
            goto Lb9
        L2b:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L33:
            com.revolut.core.model.account.AccountId$Joint r14 = r0.u
            yhm.o.b(r15)
            goto L57
        L39:
            yhm.o.b(r15)
            io3.l r6 = io3.l.CURRENT
            r10 = 0
            r12 = 30
            wsg.n r5 = r13.f140412a
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = r14
            efm.d0 r14 = osg.b.j(r5, r6, r7, r8, r9, r10, r11, r12)
            r0.u = r11
            r0.f140410x = r3
            java.lang.Object r15 = nim.a.b(r14, r0)
            if (r15 != r1) goto L56
            goto Lb8
        L56:
            r14 = r11
        L57:
            java.util.List r15 = (java.util.List) r15
            kotlin.jvm.internal.Intrinsics.h(r15)
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 10
            int r3 = zhm.w.t(r15, r3)
            r2.<init>(r3)
            java.util.Iterator r15 = r15.iterator()
        L6d:
            boolean r3 = r15.hasNext()
            if (r3 == 0) goto L7f
            java.lang.Object r3 = r15.next()
            io3.d r3 = (io3.d) r3
            java.lang.String r3 = r3.f163145a
            r2.add(r3)
            goto L6d
        L7f:
            java.util.Set r15 = zhm.d0.i1(r2)
            tof.va r2 = new tof.va
            r2.<init>(r15)
            tof.qb r15 = new tof.qb
            tof.v6 r3 = tof.v6.PENDING
            java.util.List r3 = zhm.u.c(r3)
            r15.<init>(r3)
            tof.i7 r6 = tof.fc.a(r2, r15)
            tof.hc r15 = new tof.hc
            java.lang.String r14 = r14.f51413b
            r2 = 0
            r15.<init>(r14, r2)
            java.util.List r7 = zhm.u.c(r15)
            r10 = 0
            r11 = 28
            com.revolut.domain.interactors.transactions.a r5 = r13.f140413b
            r8 = 0
            r9 = 0
            ufm.i r14 = com.revolut.domain.interactors.transactions.a.b(r5, r6, r7, r8, r9, r10, r11)
            r0.u = r2
            r0.f140410x = r4
            java.lang.Object r15 = nim.a.b(r14, r0)
            if (r15 != r1) goto Lb9
        Lb8:
            return r1
        Lb9:
            java.lang.String r14 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r15, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: g48.t0.a(com.revolut.core.model.account.AccountId$Joint, gim.c):java.lang.Object");
    }
}

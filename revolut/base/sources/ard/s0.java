package ard;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dtc.i f8679a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile zsc.h f8680b;

    public s0(dtc.i transactionSearchFactory) {
        Intrinsics.checkNotNullParameter(transactionSearchFactory, "transactionSearchFactory");
        this.f8679a = transactionSearchFactory;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable a(gim.c r5, java.lang.String r6, java.util.List r7) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ard.r0
            if (r0 == 0) goto L13
            r0 = r5
            ard.r0 r0 = (ard.r0) r0
            int r1 = r0.f8676y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8676y = r1
            goto L18
        L13:
            ard.r0 r0 = new ard.r0
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f8674w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f8676y
            r3 = 1
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            java.util.List r6 = r0.v
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            java.lang.String r6 = r0.u
            yhm.o.b(r5)
            goto L53
        L2e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L36:
            yhm.o.b(r5)
            zsc.h r5 = r4.f8680b
            if (r5 != 0) goto L57
            dtc.i r5 = r4.f8679a
            ufm.i r5 = r5.a()
            r0.u = r6
            r2 = r7
            java.util.List r2 = (java.util.List) r2
            r0.v = r2
            r0.f8676y = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L53
            return r1
        L53:
            zsc.h r5 = (zsc.h) r5
            r4.f8680b = r5
        L57:
            zsc.f r0 = new zsc.f
            kotlin.jvm.internal.Intrinsics.h(r5)
            zsc.l r1 = zsc.m.Companion
            r1.getClass()
            zsc.m r6 = zsc.l.a(r6)
            r0.<init>(r5, r6)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r6 = r7.iterator()
        L73:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L8c
            java.lang.Object r7 = r6.next()
            r1 = r7
            he3.h r1 = (he3.h) r1
            tof.a3 r1 = r1.f151559a
            boolean r1 = r0.a(r1)
            if (r1 == 0) goto L73
            r5.add(r7)
            goto L73
        L8c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ard.s0.a(gim.c, java.lang.String, java.util.List):java.io.Serializable");
    }
}

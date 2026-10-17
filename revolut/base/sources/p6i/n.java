package p6i;

import h6i.f0;

/* JADX INFO: loaded from: classes10.dex */
public abstract class n {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h6i.f0 r5, gim.c r6) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r6 instanceof p6i.m
            if (r0 == 0) goto L13
            r0 = r6
            p6i.m r0 = (p6i.m) r0
            int r1 = r0.f233337w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f233337w = r1
            goto L18
        L13:
            p6i.m r0 = new p6i.m
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f233337w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r6)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            goto L3f
        L27:
            r5 = move-exception
            goto L42
        L29:
            r5 = move-exception
            goto L4b
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L33:
            yhm.o.b(r6)
            r0.f233337w = r3     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r6 = r4.b(r5, r0)     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            if (r6 != r1) goto L3f
            return r1
        L3f:
            p6i.l r6 = (p6i.l) r6     // Catch: java.lang.Throwable -> L27 java.util.concurrent.CancellationException -> L29
            return r6
        L42:
            hx7.e.n(r5)
            p6i.k r6 = new p6i.k
            r6.<init>(r5)
            return r6
        L4b:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p6i.n.a(h6i.f0, gim.c):java.lang.Object");
    }

    public abstract Object b(f0 f0Var, m mVar);
}

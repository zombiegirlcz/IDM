package zq;

import ll6.i;

/* JADX INFO: loaded from: classes17.dex */
public abstract class c {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
    
        if (r5.e(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object d(zq.c r5, ar.b r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof zq.b
            if (r0 == 0) goto L13
            r0 = r7
            zq.b r0 = (zq.b) r0
            int r1 = r0.f324339y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f324339y = r1
            goto L18
        L13:
            zq.b r0 = new zq.b
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f324337w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f324339y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L58
        L2a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L32:
            ar.b r6 = r0.v
            zq.c r5 = r0.u
            yhm.o.b(r7)
            goto L4a
        L3a:
            yhm.o.b(r7)
            r0.u = r5
            r0.v = r6
            r0.f324339y = r4
            java.lang.Object r7 = r5.a(r0)
            if (r7 != r1) goto L4a
            goto L57
        L4a:
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f324339y = r3
            java.lang.Object r5 = r5.e(r6, r0)
            if (r5 != r1) goto L58
        L57:
            return r1
        L58:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zq.c.d(zq.c, ar.b, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public abstract Object a(b bVar);

    public abstract Object b(lo.c cVar);

    public Object c(ar.b bVar, i iVar) {
        return d(this, bVar, iVar);
    }

    public abstract Object e(ar.b bVar, b bVar2);
}

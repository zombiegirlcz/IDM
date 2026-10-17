package t38;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s {
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(g48.r0 r6, gim.c r7) {
        /*
            boolean r0 = r7 instanceof t38.q
            if (r0 == 0) goto L13
            r0 = r7
            t38.q r0 = (t38.q) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            t38.q r0 = new t38.q
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            yhm.o.b(r7)
            goto L60
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            yhm.o.b(r7)
            n38.q r7 = n38.q.ACTIVE
            n38.q r2 = n38.q.OFFBOARDING
            n38.q r5 = n38.q.PENDING
            n38.q[] r7 = new n38.q[]{r7, r2, r5}
            java.lang.String r2 = "elements"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r2)
            java.util.Set r7 = kotlin.collections.d.y0(r7)
            w4l.j r2 = w4l.j.f294644c
            cxe.u r6 = r6.e(r7, r2)
            szb.f r7 = new szb.f
            r2 = 13
            r7.<init>(r2)
            jhi.b r6 = mo3.a.g(r6, r4, r7, r3)
            r0.v = r3
            java.lang.Object r7 = vkm.q.z(r6, r0)
            if (r7 != r1) goto L60
            return r1
        L60:
            od0.i r7 = (od0.i) r7
            if (r7 == 0) goto L6f
            java.lang.Object r6 = r7.f224257a
            n38.a r6 = (n38.a) r6
            if (r6 == 0) goto L6f
            com.revolut.core.model.account.AccountId$Joint r6 = l38.a.c(r6)
            return r6
        L6f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t38.s.a(g48.r0, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(k38.c r4, java.util.Set r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof t38.r
            if (r0 == 0) goto L13
            r0 = r6
            t38.r r0 = (t38.r) r0
            int r1 = r0.v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.v = r1
            goto L18
        L13:
            t38.r r0 = new t38.r
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.v
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4f
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r6)
            w4l.i r6 = w4l.i.f294643c
            g48.r0 r4 = (g48.r0) r4
            cxe.u r4 = r4.e(r5, r6)
            szb.f r5 = new szb.f
            r6 = 14
            r5.<init>(r6)
            r6 = 0
            jhi.b r4 = mo3.a.g(r4, r6, r5, r3)
            r0.v = r3
            java.lang.Object r6 = vkm.q.z(r4, r0)
            if (r6 != r1) goto L4f
            return r1
        L4f:
            od0.i r6 = (od0.i) r6
            if (r6 == 0) goto L5e
            java.lang.Object r4 = r6.f224257a
            n38.a r4 = (n38.a) r4
            if (r4 == 0) goto L5e
            com.revolut.core.model.account.AccountId$Joint r4 = l38.a.c(r4)
            return r4
        L5e:
            java.lang.NullPointerException r4 = new java.lang.NullPointerException
            java.lang.String r5 = "User must have non terminated joint account to call requireAccountId()"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t38.s.b(k38.c, java.util.Set, gim.c):java.lang.Object");
    }

    public static Object c(k38.c cVar, gim.c cVar2) {
        n38.q[] elements = {n38.q.ACTIVE, n38.q.OFFBOARDING};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return b(cVar, kotlin.collections.d.y0(elements), cVar2);
    }
}

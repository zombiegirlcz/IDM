package wdm;

import kem.y;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public abstract class h {
    public static final void a(Long l2, long j2, y method) {
        Intrinsics.checkNotNullParameter(method, "method");
        if (l2 == null || l2.longValue() < 0) {
            return;
        }
        y.Companion.getClass();
        if (Intrinsics.f(method, y.e) || l2.longValue() == j2) {
            return;
        }
        throw new IllegalStateException(("Content-Length mismatch: expected " + l2 + " bytes, but received " + j2 + " bytes").toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(wdm.f r4, gim.c r5) throws java.lang.Throwable {
        /*
            boolean r0 = r5 instanceof wdm.g
            if (r0 == 0) goto L13
            r0 = r5
            wdm.g r0 = (wdm.g) r0
            int r1 = r0.f296604w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f296604w = r1
            goto L18
        L13:
            wdm.g r0 = new wdm.g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f296604w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r4 = r0.u
            wdm.f r4 = (wdm.f) r4
            yhm.o.b(r5)
            goto L4e
        L2b:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L33:
            yhm.o.b(r5)
            boolean r5 = r4 instanceof wdm.i
            if (r5 == 0) goto L3b
            return r4
        L3b:
            hem.c r5 = r4.d()
            io.ktor.utils.io.t r5 = r5.b()
            r0.u = r4
            r0.f296604w = r3
            java.lang.Object r5 = io.ktor.utils.io.n0.i(r5, r0)
            if (r5 != r1) goto L4e
            return r1
        L4e:
            jlm.k r5 = (jlm.k) r5
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            r0 = -1
            byte[] r5 = jlm.l.f(r5, r0)
            wdm.i r0 = new wdm.i
            vdm.b r1 = r4.f296601a
            fem.b r2 = r4.c()
            hem.c r4 = r4.d()
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wdm.h.b(wdm.f, gim.c):java.lang.Object");
    }
}

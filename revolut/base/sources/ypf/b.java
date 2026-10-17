package ypf;

import cw9.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f315862a;

    public b(d paymentsProductFeatureChecker) {
        Intrinsics.checkNotNullParameter(paymentsProductFeatureChecker, "paymentsProductFeatureChecker");
        this.f315862a = paymentsProductFeatureChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(prf.g r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ypf.a
            if (r0 == 0) goto L13
            r0 = r6
            ypf.a r0 = (ypf.a) r0
            int r1 = r0.f315861x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f315861x = r1
            goto L18
        L13:
            ypf.a r0 = new ypf.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f315861x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            prf.g r5 = r0.u
            yhm.o.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            cw9.d r6 = r4.f315862a
            zjh.f r6 = r6.f109573b
            java.lang.String r2 = "TRANSFER.scheduled"
            ae8.c r6 = r6.A(r2)
            r0.u = r5
            r0.f315861x = r3
            java.lang.Object r6 = vkm.q.x(r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L58
            boolean r5 = com.google.crypto.tink.shaded.protobuf.t1.q(r5)
            if (r5 != 0) goto L58
            goto L59
        L58:
            r3 = 0
        L59:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ypf.b.a(prf.g, gim.c):java.lang.Object");
    }
}

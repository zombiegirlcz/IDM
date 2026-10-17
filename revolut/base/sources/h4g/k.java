package h4g;

import b4g.m0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m0 f149371a;

    public k(m0 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f149371a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof h4g.j
            if (r0 == 0) goto L13
            r0 = r7
            h4g.j r0 = (h4g.j) r0
            int r1 = r0.f149370w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f149370w = r1
            goto L18
        L13:
            h4g.j r0 = new h4g.j
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f149370w
            b4g.m0 r3 = r6.f149371a
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L38
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2c
            yhm.o.b(r7)
            return r7
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            yhm.o.b(r7)
            goto L44
        L38:
            yhm.o.b(r7)
            r0.f149370w = r5
            java.lang.Object r7 = r3.a(r0)
            if (r7 != r1) goto L44
            goto L50
        L44:
            java.lang.String r7 = (java.lang.String) r7
            if (r7 != 0) goto L51
            r0.f149370w = r4
            java.lang.Object r7 = r3.b(r0)
            if (r7 != r1) goto L51
        L50:
            return r1
        L51:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: h4g.k.a(gim.c):java.lang.Object");
    }
}

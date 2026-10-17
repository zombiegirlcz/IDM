package bk2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l61.a f16224a;

    public b(l61.a userCompanyInteractor) {
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        this.f16224a = userCompanyInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof bk2.a
            if (r0 == 0) goto L13
            r0 = r5
            bk2.a r0 = (bk2.a) r0
            int r1 = r0.f16223w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f16223w = r1
            goto L18
        L13:
            bk2.a r0 = new bk2.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f16223w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            l61.a r5 = r4.f16224a
            ang.b r5 = (ang.b) r5
            efm.d0 r5 = r5.a()
            r0.f16223w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            l71.d r5 = (l71.d) r5
            l71.a r5 = r5.b()
            l71.a$j r0 = l71.a.j.f192480a
            boolean r5 = r5.equals(r0)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: bk2.b.a(gim.c):java.lang.Object");
    }
}

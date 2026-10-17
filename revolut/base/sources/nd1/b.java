package nd1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f214280a;

    public b(c catalogueInteractor) {
        Intrinsics.checkNotNullParameter(catalogueInteractor, "catalogueInteractor");
        this.f214280a = catalogueInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof nd1.a
            if (r0 == 0) goto L13
            r0 = r6
            nd1.a r0 = (nd1.a) r0
            int r1 = r0.f214279w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214279w = r1
            goto L18
        L13:
            nd1.a r0 = new nd1.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214279w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L63
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            nd1.c r6 = r5.f214280a
            efm.r r2 = r6.a()
            efm.r r6 = r6.b()
            efm.r r6 = kli.a.h(r2, r6)
            n8i.q0 r2 = new n8i.q0
            r4 = 22
            r2.<init>(r4)
            efm.r r6 = nim.a.w(r6, r2)
            r2 = 3
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r4, r2)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f214279w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L63
            return r1
        L63:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nd1.b.a(gim.c):java.lang.Object");
    }
}

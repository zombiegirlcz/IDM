package o5j;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements hu2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fk3.a f222448a;

    public b(fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f222448a = configurationInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hu2.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof o5j.a
            if (r0 == 0) goto L13
            r0 = r6
            o5j.a r0 = (o5j.a) r0
            int r1 = r0.f222447w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f222447w = r1
            goto L18
        L13:
            o5j.a r0 = new o5j.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f222447w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L6d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            hu2.c r6 = hu2.c.f155546a
            hu2.b r2 = hu2.b.f155545a
            boolean r6 = r6.equals(r2)
            if (r6 != 0) goto L76
            fk3.a r6 = r5.f222448a
            ik3.c r6 = (ik3.c) r6
            e7l.g$a r2 = e7l.g.a.f123406a
            efm.r r6 = r6.k(r2)
            ijj.p r2 = new ijj.p
            r4 = 3
            r2.<init>(r4)
            efm.r r6 = nim.a.w(r6, r2)
            ijj.r r2 = new ijj.r
            r4 = 2
            r2.<init>(r4)
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r2, r3)
            efm.d0 r6 = r6.firstOrError()
            java.lang.String r2 = "firstOrError(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r2)
            r0.f222447w = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L6d
            return r1
        L6d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L76
            goto L77
        L76:
            r3 = 0
        L77:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: o5j.b.a(gim.c):java.lang.Object");
    }
}

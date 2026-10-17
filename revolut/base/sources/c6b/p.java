package c6b;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p implements q5b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jla.h f21773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fk3.a f21774b;

    public p(jla.h productCatalogueInteractor, fk3.a configurationInteractor) {
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(configurationInteractor, "configurationInteractor");
        this.f21773a = productCatalogueInteractor;
        this.f21774b = configurationInteractor;
    }

    public final boolean a() {
        return this.f21773a.d("COBRANDS", null) == bla.c.ENABLED;
    }

    public final Object b(gim.c cVar) {
        return a() ? c(cVar) : Boolean.FALSE;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof c6b.o
            if (r0 == 0) goto L13
            r0 = r6
            c6b.o r0 = (c6b.o) r0
            int r1 = r0.f21772w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f21772w = r1
            goto L18
        L13:
            c6b.o r0 = new c6b.o
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f21772w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L4d
        L27:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L2f:
            yhm.o.b(r6)
            w4l.h r6 = w4l.h.f294642c
            fk3.a r2 = r5.f21774b
            ik3.c r2 = (ik3.c) r2
            e7l.g$b r4 = e7l.g.b.f123407a
            efm.r r6 = r2.l(r4, r6)
            r2 = 3
            r4 = 0
            efm.r r6 = m70.a.g(r6, r4, r4, r2)
            r0.f21772w = r3
            java.lang.Object r6 = nim.a.c(r6, r0)
            if (r6 != r1) goto L4d
            return r1
        L4d:
            e7l.f r6 = (e7l.f) r6
            boolean r6 = r6.K1
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: c6b.p.c(gim.c):java.lang.Object");
    }
}

package quf;

import ang.f;
import bla.c;
import jla.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f249439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f249440b;

    public b(f userInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f249439a = userInteractor;
        this.f249440b = productCatalogueInteractor;
    }

    public final boolean a() {
        return this.f249440b.d(muf.a.PL_TRANSPORT.getCode(), null) == c.ENABLED;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof quf.a
            if (r0 == 0) goto L13
            r0 = r6
            quf.a r0 = (quf.a) r0
            int r1 = r0.f249438w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f249438w = r1
            goto L18
        L13:
            quf.a r0 = new quf.a
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f249438w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r6)
            goto L48
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L30:
            yhm.o.b(r6)
            boolean r6 = r5.a()
            if (r6 == 0) goto L5d
            ang.f r6 = r5.f249439a
            efm.d0 r6 = r6.f(r3)
            r0.f249438w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            do3.n r6 = (do3.n) r6
            wi0.a r0 = wi0.b.Companion
            r0.getClass()
            wi0.b r0 = wi0.b.t2
            boolean r6 = te0.w.S(r6, r0)
            if (r6 == 0) goto L5d
            r3 = r4
        L5d:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: quf.b.b(gim.c):java.lang.Object");
    }
}

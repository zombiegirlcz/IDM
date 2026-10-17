package rv1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fx1.a f257678a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pre.c f257679b;

    public t(fx1.a onboardingRepository, pre.c termsInteractor) {
        Intrinsics.checkNotNullParameter(onboardingRepository, "onboardingRepository");
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.f257678a = onboardingRepository;
        this.f257679b = termsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.util.List r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof rv1.s
            if (r0 == 0) goto L13
            r0 = r8
            rv1.s r0 = (rv1.s) r0
            int r1 = r0.f257677y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f257677y = r1
            goto L18
        L13:
            rv1.s r0 = new rv1.s
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f257675w
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f257677y
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L3a
            if (r2 == r3) goto L32
            if (r2 != r4) goto L2a
            yhm.o.b(r8)
            return r8
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            int r7 = r0.v
            java.util.Iterator r2 = r0.u
            yhm.o.b(r8)
            goto L46
        L3a:
            yhm.o.b(r8)
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
            r8 = 0
            r2 = r7
            r7 = r8
        L46:
            boolean r8 = r2.hasNext()
            if (r8 == 0) goto L65
            java.lang.Object r8 = r2.next()
            com.revolut.feature.terms.api.model.TermsScope r8 = (com.revolut.feature.terms.api.model.TermsScope) r8
            pre.c r5 = r6.f257679b
            pfm.a r8 = pre.c.a(r5, r8)
            r0.u = r2
            r0.v = r7
            r0.f257677y = r3
            java.lang.Object r8 = nim.a.a(r8, r0)
            if (r8 != r1) goto L46
            goto L76
        L65:
            com.revolut.feature.apm.core.api.product.ApmBreb r7 = com.revolut.feature.apm.core.api.product.ApmBreb.f61810c
            r8 = 0
            r0.u = r8
            r0.f257677y = r4
            fx1.a r2 = r6.f257678a
            iz1.h r2 = (iz1.h) r2
            java.lang.Object r7 = r2.d(r7, r8, r0)
            if (r7 != r1) goto L77
        L76:
            return r1
        L77:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: rv1.t.a(java.util.List, gim.c):java.lang.Object");
    }
}

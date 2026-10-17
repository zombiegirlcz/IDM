package s99;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ang.f f261145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fn2.c f261146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jla.h f261147c;

    public i(ang.f userInteractor, fn2.c productCatalogueLoader, jla.h productCatalogueInteractor, j supportedCountriesConfiguration) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueLoader, "productCatalogueLoader");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(supportedCountriesConfiguration, "supportedCountriesConfiguration");
        this.f261145a = userInteractor;
        this.f261146b = productCatalogueLoader;
        this.f261147c = productCatalogueInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
    
        if (r5.f261146b.l(true, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof s99.g
            if (r0 == 0) goto L13
            r0 = r6
            s99.g r0 = (s99.g) r0
            int r1 = r0.f261143w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261143w = r1
            goto L18
        L13:
            s99.g r0 = new s99.g
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261143w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L5d
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            yhm.o.b(r6)
            goto L49
        L36:
            yhm.o.b(r6)
            ang.f r6 = r5.f261145a
            r2 = 0
            efm.d0 r6 = r6.f(r2)
            r0.f261143w = r4
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L49
            goto L5c
        L49:
            do3.n r6 = (do3.n) r6
            boolean r6 = te0.w.V(r6)
            if (r6 != 0) goto L52
            goto L70
        L52:
            r0.f261143w = r3
            fn2.c r6 = r5.f261146b
            java.lang.Object r6 = r6.l(r4, r0)
            if (r6 != r1) goto L5d
        L5c:
            return r1
        L5d:
            java.lang.String r6 = "ACCOUNT.multi_currency"
            r0 = 0
            jla.h r1 = r5.f261147c
            bla.c r6 = r1.d(r6, r0)
            int[] r0 = s99.f.f261142a
            int r1 = r6.ordinal()
            r0 = r0[r1]
            if (r0 != r4) goto L73
        L70:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldNotLaunch r6 = com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch.f78170a
            return r6
        L73:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldLaunch r0 = new com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldLaunch
            r0.<init>(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s99.i.a(gim.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r6.f261146b.l(true, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof s99.h
            if (r0 == 0) goto L13
            r0 = r7
            s99.h r0 = (s99.h) r0
            int r1 = r0.f261144w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f261144w = r1
            goto L18
        L13:
            s99.h r0 = new s99.h
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f261144w
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2b
            yhm.o.b(r7)
            goto L73
        L2b:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L33:
            yhm.o.b(r7)
            goto L49
        L37:
            yhm.o.b(r7)
            ang.f r7 = r6.f261145a
            efm.d0 r7 = r7.f(r3)
            r0.f261144w = r5
            java.lang.Object r7 = nim.a.b(r7, r0)
            if (r7 != r1) goto L49
            goto L72
        L49:
            do3.n r7 = (do3.n) r7
            java.util.Set r2 = s99.j.f261148a
            kotlin.jvm.internal.Intrinsics.h(r7)
            java.util.Collection r2 = (java.util.Collection) r2
            wi0.b[] r3 = new wi0.b[r3]
            java.lang.Object[] r2 = r2.toArray(r3)
            wi0.b[] r2 = (wi0.b[]) r2
            int r3 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)
            wi0.b[] r2 = (wi0.b[]) r2
            boolean r7 = te0.w.T(r7, r2)
            if (r7 != 0) goto L68
            goto L86
        L68:
            r0.f261144w = r4
            fn2.c r7 = r6.f261146b
            java.lang.Object r7 = r7.l(r5, r0)
            if (r7 != r1) goto L73
        L72:
            return r1
        L73:
            java.lang.String r7 = "ACCOUNT.multi_currency"
            r0 = 0
            jla.h r1 = r6.f261147c
            bla.c r7 = r1.d(r7, r0)
            int[] r0 = s99.f.f261142a
            int r1 = r7.ordinal()
            r0 = r0[r1]
            if (r0 != r5) goto L89
        L86:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldNotLaunch r7 = com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output.ShouldNotLaunch.f78170a
            return r7
        L89:
            com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldLaunch r0 = new com.revolut.feature.onboarding.api.exchange_global_access.ExchangeGlobalAccessInteractor$Output$ShouldLaunch
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: s99.i.b(gim.c):java.lang.Object");
    }
}

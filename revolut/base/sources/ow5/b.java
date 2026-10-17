package ow5;

import ang.f;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f230307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final gte.a f230308b;

    public b(f userInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f230307a = userInteractor;
        this.f230308b = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof ow5.a
            if (r0 == 0) goto L13
            r0 = r5
            ow5.a r0 = (ow5.a) r0
            int r1 = r0.f230306w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230306w = r1
            goto L18
        L13:
            ow5.a r0 = new ow5.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f230306w
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            yhm.o.b(r5)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L55
        L27:
            r5 = move-exception
            goto L6c
        L29:
            r5 = move-exception
            goto L80
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L33:
            yhm.o.b(r5)
            gte.a r5 = r4.f230308b     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            com.revolut.feature.cryptocommodity_invest.api.CryptoCommodityInvestApi$Toggles$CryptoIsraelExpansion r2 = com.revolut.feature.cryptocommodity_invest.api.CryptoCommodityInvestApi$Toggles.CryptoIsraelExpansion.f71495c     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            jte.d r5 = (jte.d) r5     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            boolean r5 = r5.c(r2)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != 0) goto L45
            java.lang.Boolean r5 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L77
        L45:
            ang.f r5 = r4.f230307a     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r2 = 0
            efm.d0 r5 = r5.f(r2)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r0.f230306w = r3     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Object r5 = nim.a.b(r5, r0)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            if (r5 != r1) goto L55
            return r1
        L55:
            java.lang.String r0 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r0)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            do3.n r5 = (do3.n) r5     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            wi0.a r0 = wi0.b.Companion     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            r0.getClass()     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            wi0.b r0 = wi0.b.M0     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            boolean r5 = te0.w.S(r5, r0)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L27 java.util.concurrent.CancellationException -> L29
            goto L77
        L6c:
            zhm.h0 r0 = zhm.h0.f322473a
            java.util.concurrent.CopyOnWriteArrayList r1 = rd0.d.f253311a
            rd0.c r1 = rd0.c.ERROR
            r2 = 0
            rd0.d.a(r1, r2, r2, r5, r0)
            r5 = r2
        L77:
            boolean r5 = pd.b.j(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        L80:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ow5.b.a(gim.c):java.lang.Object");
    }
}

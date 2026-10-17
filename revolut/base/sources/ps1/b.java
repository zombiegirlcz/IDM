package ps1;

import hs1.c;
import kotlin.jvm.internal.Intrinsics;
import mp.p;

/* JADX INFO: loaded from: classes20.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f239387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f239388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gte.a f239389c;

    public b(c repository, p streetModePaymentLocationInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(streetModePaymentLocationInteractor, "streetModePaymentLocationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f239387a = repository;
        this.f239388b = streetModePaymentLocationInteractor;
        this.f239389c = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r6, gim.c r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ps1.a
            if (r0 == 0) goto L13
            r0 = r7
            ps1.a r0 = (ps1.a) r0
            int r1 = r0.f239386x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f239386x = r1
            goto L18
        L13:
            ps1.a r0 = new ps1.a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f239386x
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            return r7
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            java.lang.String r6 = r0.u
            yhm.o.b(r7)
            goto L53
        L38:
            yhm.o.b(r7)
            wj0.b r7 = new wj0.b
            java.lang.String r2 = "payments_bizum_transfer"
            r7.<init>(r2)
            mp.p r2 = r5.f239388b
            pfm.a r7 = r2.r(r7)
            r0.u = r6
            r0.f239386x = r4
            java.lang.Object r7 = nim.a.a(r7, r0)
            if (r7 != r1) goto L53
            goto L6b
        L53:
            r7 = 0
            r0.u = r7
            r0.f239386x = r3
            hg0.n r2 = new hg0.n
            r3 = 21
            hs1.c r4 = r5.f239387a
            r2.<init>(r4, r6, r7, r3)
            skm.p0 r6 = skm.p0.f264001a
            elm.f r6 = elm.f.f127540b
            java.lang.Object r6 = skm.e0.J(r6, r2, r0)
            if (r6 != r1) goto L6c
        L6b:
            return r1
        L6c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ps1.b.a(java.lang.String, gim.c):java.lang.Object");
    }
}

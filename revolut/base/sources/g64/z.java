package g64;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sh3.a f140871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ffk.t f140872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hy2.f f140873c;
    public final l93.f d;

    public z(sh3.a checkoutInteractor, ffk.t pricingPlanInteractor, hy2.f cardDesignInteractor, l93.f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(checkoutInteractor, "checkoutInteractor");
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        Intrinsics.checkNotNullParameter(cardDesignInteractor, "cardDesignInteractor");
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f140871a = checkoutInteractor;
        this.f140872b = pricingPlanInteractor;
        this.f140873c = cardDesignInteractor;
        this.d = revolutCardsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(g64.z r4, e93.e r5, gim.c r6) {
        /*
            r4.getClass()
            boolean r0 = r6 instanceof g64.y
            if (r0 == 0) goto L16
            r0 = r6
            g64.y r0 = (g64.y) r0
            int r1 = r0.f140870w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f140870w = r1
            goto L1b
        L16:
            g64.y r0 = new g64.y
            r0.<init>(r4, r6)
        L1b:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f140870w
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r6)
            goto L47
        L2a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L32:
            yhm.o.b(r6)
            l93.f r4 = r4.d
            r6 = 0
            r2 = 225(0xe1, float:3.15E-43)
            ufm.b r4 = l93.f.g(r4, r5, r6, r2)
            r0.f140870w = r3
            java.lang.Object r6 = nim.a.b(r4, r0)
            if (r6 != r1) goto L47
            return r1
        L47:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: g64.z.a(g64.z, e93.e, gim.c):java.lang.Object");
    }
}

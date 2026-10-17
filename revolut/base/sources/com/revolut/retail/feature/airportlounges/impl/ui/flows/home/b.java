package com.revolut.retail.feature.airportlounges.impl.ui.flows.home;

import d8l.d;
import ffk.t;
import kotlin.jvm.internal.Intrinsics;
import oki.h;
import owi.c;
import yki.i;

/* JADX INFO: loaded from: classes10.dex */
public final class b extends h implements owi.b {
    public final t o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i f98973p;

    public b(t pricingPlanInteractor) {
        Intrinsics.checkNotNullParameter(pricingPlanInteractor, "pricingPlanInteractor");
        this.o = pricingPlanInteractor;
        this.f98973p = d.a(this, new or4.i(this, 11));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b r4, gim.c r5) {
        /*
            boolean r0 = r5 instanceof owi.d
            if (r0 == 0) goto L13
            r0 = r5
            owi.d r0 = (owi.d) r0
            int r1 = r0.f230455w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f230455w = r1
            goto L18
        L13:
            owi.d r0 = new owi.d
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f230455w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            yhm.o.b(r5)
            ffk.t r4 = r4.o
            efm.d0 r4 = r4.e()
            r0.f230455w = r3
            java.lang.Object r5 = nim.a.b(r4, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            java.lang.String r4 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r4)
            hha.d r5 = (hha.d) r5
            boolean r4 = hha.s.p(r5)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b.I2(com.revolut.retail.feature.airportlounges.impl.ui.flows.home.b, gim.c):java.lang.Object");
    }

    @Override // yki.j
    public final void M0() {
        l2(new a(this, null), new c(this, 0));
    }

    @Override // yki.g
    public final yki.b s() {
        return this.f98973p;
    }
}

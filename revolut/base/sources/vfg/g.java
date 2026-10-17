package vfg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xoj.a f288619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.a f288620b;

    public g(xoj.a featuresInteractor, eub.a revPointsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        this.f288619a = featuresInteractor;
        this.f288620b = revPointsAvailabilityInteractor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0064, code lost:
    
        if (r7 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof vfg.f
            if (r0 == 0) goto L13
            r0 = r7
            vfg.f r0 = (vfg.f) r0
            int r1 = r0.f288618w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f288618w = r1
            goto L18
        L13:
            vfg.f r0 = new vfg.f
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f288618w
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L67
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L32:
            yhm.o.b(r7)
            goto L4a
        L36:
            yhm.o.b(r7)
            eub.a r7 = r6.f288620b
            nyb.b r7 = (nyb.b) r7
            n1g.p r7 = r7.b()
            r0.f288618w = r4
            java.lang.Object r7 = vkm.q.x(r7, r0)
            if (r7 != r1) goto L4a
            goto L66
        L4a:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L70
            yoj.c r7 = yoj.c.MILES
            yoj.d r2 = yoj.d.DISABLED
            xoj.a r5 = r6.f288619a
            cpj.b r5 = (cpj.b) r5
            efm.r r7 = r5.m(r7, r2)
            r0.f288618w = r3
            java.lang.Object r7 = nim.a.c(r7, r0)
            if (r7 != r1) goto L67
        L66:
            return r1
        L67:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L70
            goto L71
        L70:
            r4 = 0
        L71:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vfg.g.a(gim.c):java.lang.Object");
    }

    public final boolean b() {
        if (((nyb.b) this.f288620b).f()) {
            return hx7.i.v(((cpj.b) this.f288619a).g(yoj.c.MILES, yoj.d.DISABLED).f315683b);
        }
        return false;
    }
}

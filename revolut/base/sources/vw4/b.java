package vw4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eub.a f292625a;

    public b(eub.a revPointsAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        this.f292625a = revPointsAvailabilityInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof vw4.a
            if (r0 == 0) goto L13
            r0 = r5
            vw4.a r0 = (vw4.a) r0
            int r1 = r0.f292624w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292624w = r1
            goto L18
        L13:
            vw4.a r0 = new vw4.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292624w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L43
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            eub.a r5 = r4.f292625a
            nyb.b r5 = (nyb.b) r5
            n1g.p r5 = r5.b()
            r0.f292624w = r3
            java.lang.Object r5 = vkm.q.z(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            if (r5 == 0) goto L4c
            boolean r5 = r5.booleanValue()
            goto L4d
        L4c:
            r5 = 0
        L4d:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vw4.b.a(gim.c):java.lang.Object");
    }
}

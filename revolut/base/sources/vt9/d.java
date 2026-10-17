package vt9;

import kotlin.jvm.internal.Intrinsics;
import yji.n;

/* JADX INFO: loaded from: classes5.dex */
public final class d extends n implements to9.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g6e.d f291937l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final gte.a f291938m;

    public d(g6e.d subaccountInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f291937l = subaccountInteractor;
        this.f291938m = featureToggleInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(com.revolut.feature.transfer.core.models.FundingSource r6, m1l.a r7, gim.c r8) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vt9.d.Z2(com.revolut.feature.transfer.core.models.FundingSource, m1l.a, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(java.lang.String r7, gim.c r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof vt9.c
            if (r0 == 0) goto L13
            r0 = r8
            vt9.c r0 = (vt9.c) r0
            int r1 = r0.f291936x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f291936x = r1
            goto L18
        L13:
            vt9.c r0 = new vt9.c
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f291936x
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            java.lang.String r7 = r0.u
            yhm.o.b(r8)
            goto L55
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            yhm.o.b(r8)
            w4l.j r8 = w4l.j.f294644c
            g6e.d r2 = r6.f291937l
            s6e.z r2 = (s6e.z) r2
            vkm.d r8 = r2.o(r8)
            vo8.t r2 = new vo8.t
            r5 = 23
            r2.<init>(r5)
            jhi.b r8 = mo3.a.g(r8, r3, r2, r4)
            r0.u = r7
            r0.f291936x = r4
            java.lang.Object r8 = vkm.q.x(r8, r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.Iterator r8 = r8.iterator()
        L5b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r8.next()
            r1 = r0
            com.revolut.feature.subaccount.api.models.Subaccount r1 = (com.revolut.feature.subaccount.api.models.Subaccount) r1
            java.lang.String r1 = r1.getPocketId()
            boolean r1 = kotlin.jvm.internal.Intrinsics.f(r1, r7)
            if (r1 == 0) goto L5b
            r3 = r0
        L73:
            if (r3 == 0) goto L76
            goto L77
        L76:
            r4 = 0
        L77:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r4)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: vt9.d.b3(java.lang.String, gim.c):java.lang.Object");
    }
}

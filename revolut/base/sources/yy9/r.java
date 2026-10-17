package yy9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class r implements ry9.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f317919a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f317920b;

    public r(uw1.c apmFeatureChecker, o apmProvider) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(apmProvider, "apmProvider");
        this.f317919a = apmFeatureChecker;
        this.f317920b = apmProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // ry9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r12, gim.c r13) {
        /*
            Method dump skipped, instruction units count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.r.a(java.lang.String, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof yy9.p
            if (r0 == 0) goto L13
            r0 = r5
            yy9.p r0 = (yy9.p) r0
            int r1 = r0.f317915w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f317915w = r1
            goto L1a
        L13:
            yy9.p r0 = new yy9.p
            gim.c r5 = (gim.c) r5
            r0.<init>(r4, r5)
        L1a:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f317915w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r5)
            goto L55
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            yhm.o.b(r5)
            yy9.o r5 = r4.f317920b
            gte.a r5 = r5.f317914c
            com.revolut.feature.apm.core.api.ApmToggles$ApmClipboard r2 = com.revolut.feature.apm.core.api.ApmToggles$ApmClipboard.f61778c
            jte.d r5 = (jte.d) r5
            boolean r5 = r5.c(r2)
            if (r5 == 0) goto L5e
            uw1.c r5 = r4.f317919a
            ty1.b r5 = (ty1.b) r5
            yoj.c r2 = yoj.c.APM_WERO
            pfm.z r5 = r5.c(r2)
            r0.f317915w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L5e
            goto L5f
        L5e:
            r3 = 0
        L5f:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: yy9.r.b(kotlin.coroutines.Continuation):java.lang.Object");
    }
}

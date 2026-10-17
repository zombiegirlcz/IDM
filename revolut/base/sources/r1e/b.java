package r1e;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f250978a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f250979b;

    public b(wif.a userFeaturesChecker) {
        Intrinsics.checkNotNullParameter(userFeaturesChecker, "userFeaturesChecker");
        this.f250979b = userFeaturesChecker;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r6) {
        /*
            r5 = this;
            int r0 = r5.f250978a
            switch(r0) {
                case 0: goto L51;
                default: goto L5;
            }
        L5:
            boolean r0 = r6 instanceof vvh.b
            if (r0 == 0) goto L18
            r0 = r6
            vvh.b r0 = (vvh.b) r0
            int r1 = r0.f292543w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L18
            int r1 = r1 - r2
            r0.f292543w = r1
            goto L1d
        L18:
            vvh.b r0 = new vvh.b
            r0.<init>(r5, r6)
        L1d:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292543w
            r3 = 1
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            yhm.o.b(r6)
            goto L4a
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f250979b
            wif.a r6 = (wif.a) r6
            wog.a r2 = wog.a.ACCOUNTS_WIDGET
            efm.r r6 = r6.d(r2)
            r0.f292543w = r3
            java.lang.Object r6 = nim.a.c(r6, r0)
            if (r6 != r1) goto L4a
            goto L50
        L4a:
            java.lang.String r0 = "awaitFirst(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r0)
            r1 = r6
        L50:
            return r1
        L51:
            boolean r0 = r6 instanceof r1e.a
            if (r0 == 0) goto L64
            r0 = r6
            r1e.a r0 = (r1e.a) r0
            int r1 = r0.f250977w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L64
            int r1 = r1 - r2
            r0.f250977w = r1
            goto L69
        L64:
            r1e.a r0 = new r1e.a
            r0.<init>(r5, r6)
        L69:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f250977w
            r3 = 1
            if (r2 == 0) goto L80
            if (r2 != r3) goto L78
            yhm.o.b(r6)
            goto La2
        L78:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L80:
            yhm.o.b(r6)
            java.lang.Object r6 = r5.f250979b
            xoj.a r6 = (xoj.a) r6
            yoj.c r2 = yoj.c.WEALTH_TRADING
            w4l.j r4 = w4l.j.f294644c
            cpj.b r6 = (cpj.b) r6
            efm.r r6 = r6.j(r2, r4)
            yoj.d r4 = yoj.d.DISABLED
            yoj.a r2 = hx7.l.x(r2, r4)
            r0.f250977w = r3
            clm.a r3 = clm.a.FIRST_OR_DEFAULT
            java.lang.Object r6 = nim.a.g(r6, r3, r2, r0)
            if (r6 != r1) goto La2
            goto Lac
        La2:
            yoj.a r6 = (yoj.a) r6
            boolean r6 = yoj.b.k(r6)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)
        Lac:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r1e.b.a(gim.c):java.lang.Object");
    }

    public b(xoj.a featuresInteractor) {
        Intrinsics.checkNotNullParameter(featuresInteractor, "featuresInteractor");
        this.f250979b = featuresInteractor;
    }
}

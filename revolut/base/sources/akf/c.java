package akf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f5818l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final klf.m1 f5819m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rhf.d f5820n;

    public c(klf.h0 commonDataSource, klf.m1 juniorDataSource, rhf.d entryPoint) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        this.f5818l = commonDataSource;
        this.f5819m = juniorDataSource;
        this.f5820n = entryPoint;
    }

    public final cmf.f Z2() {
        return new cmf.f(new t38.e(this.f5818l.d(), 24, this.f5819m.a(), new a(this, null)), zhm.u.c(this), "AdjustForAnalytics");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r4, java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r3 = this;
            boolean r4 = r6 instanceof akf.b
            if (r4 == 0) goto L13
            r4 = r6
            akf.b r4 = (akf.b) r4
            int r0 = r4.f5813w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f5813w = r0
            goto L1a
        L13:
            akf.b r4 = new akf.b
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f5813w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L4d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            akf.u1 r6 = akf.v1.Companion
            akf.t1 r1 = akf.t1.ADJUST_ANALYTICS
            boolean r5 = a10.b.B(r6, r1, r5)
            if (r5 == 0) goto L61
            klf.h0 r5 = r3.f5818l
            kotlinx.coroutines.flow.SharedFlow r5 = r5.d()
            r4.f5813w = r2
            java.lang.Object r6 = vkm.q.x(r5, r4)
            if (r6 != r0) goto L4d
            return r0
        L4d:
            tof.a3 r6 = (tof.a3) r6
            com.revolut.retail.core.navigation.FeatureCommand r4 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.retail.feature.adjust_analytics.api.AdjustAnalyticsFeatureConfig$AdjustAnalytics r5 = new com.revolut.retail.feature.adjust_analytics.api.AdjustAnalyticsFeatureConfig$AdjustAnalytics
            r5.<init>(r6)
            r4.<init>(r5)
            com.revolut.kompot.bridge.navigation.BridgeDestination r4 = zh9.u0.b(r4)
            r3.A2(r4)
            goto L62
        L61:
            r2 = 0
        L62:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.c.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

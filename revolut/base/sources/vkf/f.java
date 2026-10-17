package vkf;

import elf.s0;
import klf.h0;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import vdl.c1;
import vkm.q;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f289930l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f289931m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final kof.f f289932n;

    public f(h0 commonDataSource, m1 juniorDataSource, kof.f incomeSorterContentProvider) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(incomeSorterContentProvider, "incomeSorterContentProvider");
        this.f289930l = commonDataSource;
        this.f289931m = juniorDataSource;
        this.f289932n = incomeSorterContentProvider;
    }

    public final cmf.f Z2() {
        return new cmf.f(rd0.e.e(q.Q(yh5.b.d(this.f289930l.d(), this.f289931m.a()), new c1((Continuation) null, this, 10)), zhm.h0.f322473a, new b(3, null)), u.c(this), "IncomeSorterAction");
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
            boolean r4 = r6 instanceof vkf.e
            if (r4 == 0) goto L13
            r4 = r6
            vkf.e r4 = (vkf.e) r4
            int r0 = r4.f289929w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.f289929w = r0
            goto L1a
        L13:
            vkf.e r4 = new vkf.e
            gim.c r6 = (gim.c) r6
            r4.<init>(r3, r6)
        L1a:
            java.lang.Object r6 = r4.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r4.f289929w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r6)
            goto L50
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            yhm.o.b(r6)
            akf.u1 r6 = akf.v1.Companion
            akf.t1 r1 = akf.t1.SORT_INCOME
            boolean r5 = a10.b.B(r6, r1, r5)
            if (r5 != 0) goto L41
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L41:
            klf.h0 r5 = r3.f289930l
            kotlinx.coroutines.flow.SharedFlow r5 = r5.d()
            r4.f289929w = r2
            java.lang.Object r6 = vkm.q.x(r5, r4)
            if (r6 != r0) goto L50
            return r0
        L50:
            tof.a3 r6 = (tof.a3) r6
            java.lang.String r4 = r6.f272581b
            com.revolut.retail.core.navigation.FeatureCommand r5 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterCreation r6 = new com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSorterCreation
            r6.<init>(r4)
            r5.<init>(r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r4 = zh9.u0.b(r5)
            r3.A2(r4)
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: vkf.f.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

package akf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j1 extends yji.n implements elf.s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final klf.h0 f5849l;

    public j1(klf.h0 commonDataSource) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        this.f5849l = commonDataSource;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // elf.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.Object r8, java.lang.String r9, kotlin.coroutines.Continuation r10) {
        /*
            r7 = this;
            boolean r8 = r10 instanceof akf.i1
            if (r8 == 0) goto L13
            r8 = r10
            akf.i1 r8 = (akf.i1) r8
            int r0 = r8.f5844w
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.f5844w = r0
            goto L1a
        L13:
            akf.i1 r8 = new akf.i1
            gim.c r10 = (gim.c) r10
            r8.<init>(r7, r10)
        L1a:
            java.lang.Object r10 = r8.u
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.f5844w
            r2 = 1
            if (r1 == 0) goto L31
            if (r1 != r2) goto L29
            yhm.o.b(r10)
            goto L50
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            yhm.o.b(r10)
            akf.u1 r10 = akf.v1.Companion
            akf.t1 r1 = akf.t1.RETRY_PAYMENT
            boolean r9 = a10.b.B(r10, r1, r9)
            if (r9 != 0) goto L41
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L41:
            klf.h0 r9 = r7.f5849l
            kotlinx.coroutines.flow.SharedFlow r9 = r9.d()
            r8.f5844w = r2
            java.lang.Object r10 = vkm.q.x(r9, r8)
            if (r10 != r0) goto L50
            return r0
        L50:
            tof.a3 r10 = (tof.a3) r10
            tof.y6 r8 = r10.e
            int[] r9 = akf.g1.f5838a
            int r8 = r8.ordinal()
            r8 = r9[r8]
            if (r8 != r2) goto L8b
            com.revolut.kompot.bridge.navigation.BridgeDestination r8 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            com.revolut.retail.core.navigation.FinishCommand r9 = new com.revolut.retail.core.navigation.FinishCommand
            r10 = 7
            r0 = 0
            r9.<init>(r0, r0, r0, r10)
            com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration r10 = new com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig$WithInnerConfiguration
            s49.a r1 = s49.a.SINGLE_TOP
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration r3 = new com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration
            com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId$MainContainerScreenId r4 = t49.a.f267949a
            com.revolut.feature.alipay.api.navigation.AlipayDestination r5 = com.revolut.feature.alipay.api.navigation.AlipayDestination.f61060a
            com.revolut.retail.core.navigation.FeatureCommand r5 = zh9.u0.f(r5)
            r6 = 2
            r3.<init>(r4, r0, r5, r6)
            r10.<init>(r1, r3)
            com.revolut.retail.core.navigation.FeatureCommand r10 = gc0.c.f(r10)
            com.revolut.retail.core.navigation.CompositeCommand r9 = com.revolut.retail.core.navigation.a.c(r9, r10)
            r8.<init>(r9)
            r7.A2(r8)
            goto L8c
        L8b:
            r2 = 0
        L8c:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: akf.j1.c(java.lang.Object, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

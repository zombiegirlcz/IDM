package oob;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final mjb.a f227025l;

    public c(mjb.a savingsNavigationProvider) {
        Intrinsics.checkNotNullParameter(savingsNavigationProvider, "savingsNavigationProvider");
        this.f227025l = savingsNavigationProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // oob.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object Z2(java.lang.String r5, hpg.j r6, kotlin.coroutines.Continuation r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof oob.b
            if (r0 == 0) goto L13
            r0 = r7
            oob.b r0 = (oob.b) r0
            int r1 = r0.f227024x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f227024x = r1
            goto L18
        L13:
            oob.b r0 = new oob.b
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r7 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f227024x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            oob.c r5 = r0.u
            yhm.o.b(r7)
            goto L57
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r7)
            boolean r7 = r6 instanceof hpg.h
            if (r7 == 0) goto L61
            xi0.a r7 = xi0.b.Companion
            hpg.h r6 = (hpg.h) r6
            java.lang.String r2 = r6.f154532b
            r7.getClass()
            xi0.b r7 = xi0.a.a(r2)
            java.util.List r6 = r6.f154531a
            r0.u = r4
            r0.f227024x = r3
            mjb.a r2 = r4.f227025l
            hob.d r2 = (hob.d) r2
            java.lang.Object r7 = r2.c(r5, r7, r6, r0)
            if (r7 != r1) goto L56
            return r1
        L56:
            r5 = r4
        L57:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.kompot.bridge.navigation.BridgeDestination r6 = zh9.u0.b(r7)
            r5.A2(r6)
            goto L8a
        L61:
            boolean r7 = r6 instanceof hpg.i
            if (r7 == 0) goto L78
            ipg.c r6 = new ipg.c
            r6.<init>(r5)
            com.revolut.kompot.navigable.vc.ViewController r5 = r4.o2(r6)
            r6 = 0
            r7 = 2
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r0 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            yji.n.P2(r4, r5, r0, r6, r7)
            kotlin.Unit r5 = kotlin.Unit.f186387a
            goto L8a
        L78:
            boolean r5 = r6 instanceof hpg.c
            if (r5 == 0) goto L8d
            com.revolut.retail.core.navigation.FeatureCommand r5 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig$IncomeSortersList r6 = com.revolut.feature.spending_analytics.api.declaration.AnalyticsFeatureConfig.IncomeSortersList.f87417h
            r5.<init>(r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r5)
            r4.A2(r5)
        L8a:
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L8d:
            boolean r5 = r6 instanceof hpg.f
            if (r5 != 0) goto La4
            boolean r5 = r6 instanceof hpg.e
            if (r5 != 0) goto La4
            boolean r5 = r6 instanceof hpg.d
            if (r5 != 0) goto La4
            boolean r5 = r6 instanceof hpg.g
            if (r5 == 0) goto L9e
            goto La4
        L9e:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        La4:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "Action shouldn't be presented in the savings vault type!"
            r5.<init>(r6)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: oob.c.Z2(java.lang.String, hpg.j, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

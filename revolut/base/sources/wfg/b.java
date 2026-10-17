package wfg;

import kotlin.jvm.internal.Intrinsics;
import vfg.g;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements ifg.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f297112a;

    public b(g availabilityInteractor) {
        Intrinsics.checkNotNullParameter(availabilityInteractor, "availabilityInteractor");
        this.f297112a = availabilityInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof wfg.a
            if (r0 == 0) goto L13
            r0 = r5
            wfg.a r0 = (wfg.a) r0
            int r1 = r0.f297111w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f297111w = r1
            goto L18
        L13:
            wfg.a r0 = new wfg.a
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f297111w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L3d
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            r0.f297111w = r3
            vfg.g r5 = r4.f297112a
            java.lang.Object r5 = r5.a(r0)
            if (r5 != r1) goto L3d
            return r1
        L3d:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto L51
            com.revolut.retail.core.navigation.FeatureCommand r5 = new com.revolut.retail.core.navigation.FeatureCommand
            com.revolut.feature.travel.miles.api.navigation.TravelMilesFeatureConfig$Home r0 = new com.revolut.feature.travel.miles.api.navigation.TravelMilesFeatureConfig$Home
            r1 = 0
            r0.<init>(r1)
            r5.<init>(r0)
            return r5
        L51:
            com.revolut.retail.core.navigation.DummyCommand r5 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: wfg.b.a(gim.c):java.lang.Object");
    }
}

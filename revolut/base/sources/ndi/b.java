package ndi;

import eub.i;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b implements edi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f214376a;

    public b(i optInInteractor) {
        Intrinsics.checkNotNullParameter(optInInteractor, "optInInteractor");
        this.f214376a = optInInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(com.revolut.feature.rev_points.models.RevPointsOptInSource r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ndi.a
            if (r0 == 0) goto L13
            r0 = r6
            ndi.a r0 = (ndi.a) r0
            int r1 = r0.f214375x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f214375x = r1
            goto L18
        L13:
            ndi.a r0 = new ndi.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f214375x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.revolut.feature.rev_points.models.RevPointsOptInSource r5 = r0.u
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            eub.i r6 = r4.f214376a
            efm.d0 r6 = eub.i.b(r6)
            r0.u = r5
            r0.f214375x = r3
            java.lang.Object r6 = nim.a.b(r6, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            m1c.r0 r6 = (m1c.r0) r6
            m1c.x0 r6 = r6.f201447a
            m1c.x0 r0 = m1c.x0.OPTED_IN
            if (r6 != r0) goto L4e
            goto L4f
        L4e:
            r3 = 0
        L4f:
            com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination$Onboarding r6 = new com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination$Onboarding
            com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination$Onboarding$Mode$OptIn r0 = new com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination$Onboarding$Mode$OptIn
            r0.<init>(r5, r3)
            r5 = 0
            r6.<init>(r0, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ndi.b.b(com.revolut.feature.rev_points.models.RevPointsOptInSource, gim.c):java.lang.Object");
    }
}

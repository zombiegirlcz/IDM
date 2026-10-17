package dkf;

import akf.t1;
import akf.u1;
import akf.v1;
import com.revolut.feature.rev_points.buying.api.navigation.InputData;
import com.revolut.feature.rev_points.buying.api.navigation.RevPointsBuyingDestination;
import elf.s0;
import klf.h0;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p1c.i;
import yji.n;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class g extends n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f115512l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final m1 f115513m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final rul.e f115514n;
    public final i o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b f115515p;

    public g(h0 commonDataSource, m1 juniorDataSource, rul.e revPointsSpareChangeInteractor, i spareChangeNavigationResolver, b mapper) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        Intrinsics.checkNotNullParameter(revPointsSpareChangeInteractor, "revPointsSpareChangeInteractor");
        Intrinsics.checkNotNullParameter(spareChangeNavigationResolver, "spareChangeNavigationResolver");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f115512l = commonDataSource;
        this.f115513m = juniorDataSource;
        this.f115514n = revPointsSpareChangeInteractor;
        this.o = spareChangeNavigationResolver;
        this.f115515p = mapper;
    }

    public final cmf.f Z2() {
        h0 h0Var = this.f115512l;
        return new cmf.f(ta6.a.h(h0Var.d(), h0Var.c(), this.f115513m.a(), new f(this, null)), u.c(this), "LoyaltyActions");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(gim.c r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof dkf.d
            if (r0 == 0) goto L13
            r0 = r9
            dkf.d r0 = (dkf.d) r0
            int r1 = r0.f115508x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115508x = r1
            goto L18
        L13:
            dkf.d r0 = new dkf.d
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f115508x
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData r0 = r0.u
            yhm.o.b(r9)
            goto L7c
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            yhm.o.b(r9)
            goto L5a
        L39:
            yhm.o.b(r9)
            rul.e r9 = r8.f115514n
            efm.r r9 = r9.o()
            vkm.d r9 = rd0.e.b(r9)
            dee.a0 r2 = new dee.a0
            r6 = 24
            r2.<init>(r6)
            jhi.b r9 = mo3.a.g(r9, r3, r2, r5)
            r0.f115508x = r5
            java.lang.Object r9 = vkm.q.x(r9, r0)
            if (r9 != r1) goto L5a
            goto L7a
        L5a:
            od0.i r9 = (od0.i) r9
            com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData r2 = new com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData
            com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Mode$Adjust r6 = new com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Mode$Adjust
            java.lang.Object r9 = r9.f224257a
            yvh.b r9 = (yvh.b) r9
            r7 = 14
            r6.<init>(r9, r3, r7)
            r2.<init>(r6)
            r0.u = r2
            r0.f115508x = r4
            p1c.i r9 = r8.o
            a2c.e r9 = (a2c.e) r9
            java.lang.Enum r9 = r9.b(r0)
            if (r9 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r0 = r2
        L7c:
            p1c.h r9 = (p1c.h) r9
            int[] r1 = dkf.c.f115506a
            int r9 = r9.ordinal()
            r9 = r1[r9]
            if (r9 == r5) goto L9f
            if (r9 != r4) goto L99
            p1c.a r9 = new p1c.a
            r9.<init>(r0)
            com.revolut.kompot.navigable.vc.ViewController r9 = r8.o2(r9)
            com.revolut.kompot.common.ModalDestination$Style$BOTTOM_DIALOG r0 = com.revolut.kompot.common.ModalDestination.Style.BOTTOM_DIALOG.f98301a
            yji.n.P2(r8, r9, r0, r3, r4)
            goto La8
        L99:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        L9f:
            com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$Destination r9 = new com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$Destination
            r1 = 6
            r9.<init>(r0, r3, r3, r1)
            r8.A2(r9)
        La8:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: dkf.g.b3(gim.c):java.lang.Object");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        if (a10.b.B(v1.Companion, t1.MANAGE_SPARE_CHANGE, str)) {
            return b3((gim.c) continuation);
        }
        boolean z = true;
        if (Intrinsics.f(str, u1.a(t1.MANAGE_RECURRING_REV_POINTS_PURCHASE))) {
            A2(new RevPointsBuyingDestination(new InputData(true, (Integer) null, (Function1) null, 14)));
        } else if (Intrinsics.f(str, u1.a(t1.BUY_AGAIN_ONE_OFF_REV_POINTS_PURCHASE))) {
            A2(new RevPointsBuyingDestination(new InputData(false, (Integer) null, (Function1) null, 14)));
        } else {
            if (Intrinsics.f(str, u1.a(t1.SPARE_CHANGE_REFUND))) {
                return c3((gim.c) continuation);
            }
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c3(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof dkf.e
            if (r0 == 0) goto L13
            r0 = r5
            dkf.e r0 = (dkf.e) r0
            int r1 = r0.f115509w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f115509w = r1
            goto L18
        L13:
            dkf.e r0 = new dkf.e
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f115509w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L41
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            rul.e r5 = r4.f115514n
            ufm.n r5 = r5.e()
            r0.f115509w = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L41
            return r1
        L41:
            m1c.q r5 = (m1c.q) r5
            java.time.Period r5 = r5.f201439a
            r0 = 0
            if (r5 == 0) goto L60
            com.revolut.core.backend_flow.api.navigation.BackendFlowInput$a r1 = com.revolut.core.backend_flow.api.navigation.BackendFlowInput.INSTANCE
            int r5 = r5.getDays()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r2 = "sc_refund_interval"
            java.util.Map r5 = a0.d.x(r2, r5)
            r2 = 4
            java.lang.String r3 = "rev-points-spare-change-refund-transaction-details-with-param"
            com.revolut.core.backend_flow.api.navigation.BackendFlowInput r5 = com.revolut.core.backend_flow.api.navigation.BackendFlowInput.Companion.a(r1, r3, r5, r0, r2)
            goto L69
        L60:
            com.revolut.core.backend_flow.api.navigation.BackendFlowInput$a r5 = com.revolut.core.backend_flow.api.navigation.BackendFlowInput.INSTANCE
            java.lang.String r1 = "rev-points-spare-change-refund-transaction-details"
            r2 = 6
            com.revolut.core.backend_flow.api.navigation.BackendFlowInput r5 = com.revolut.core.backend_flow.api.navigation.BackendFlowInput.Companion.a(r5, r1, r0, r0, r2)
        L69:
            com.revolut.core.backend_flow.api.navigation.BackendFlowDestination r0 = new com.revolut.core.backend_flow.api.navigation.BackendFlowDestination
            r0.<init>(r5)
            r4.A2(r0)
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: dkf.g.c3(gim.c):java.lang.Object");
    }
}

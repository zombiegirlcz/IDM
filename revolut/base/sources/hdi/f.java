package hdi;

import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature_rev_points_pocket_api.RevPointsPocketApi$Toggles;
import com.revolut.feature_rev_points_pocket_api.navigation.RevPointsPocketDestination;
import com.revolut.feature_rev_points_pocket_impl.ui.add_money.RevPointsAddMoneyFlow;
import com.revolut.feature_rev_points_pocket_impl.ui.add_money.RevPointsAddMoneyFlowContract$InputData;
import com.revolut.feature_rev_points_pocket_impl.ui.flow.RevPointsPocketFlow;
import com.revolut.feature_rev_points_pocket_impl.ui.flow.RevPointsPocketFlowContract$InputData;
import com.revolut.feature_rev_points_pocket_impl.ui.flow.RevPointsPocketFlowContract$Step;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.details.RevPointsPocketDetailsScreen;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.thresholds_breakdown.RevPointsPocketThresholdsBreakdownScreen;
import com.revolut.feature_rev_points_pocket_impl.ui.screen.thresholds_breakdown.RevPointsPocketThresholdsBreakdownScreenContract$InputData;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f151462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final edi.a f151463b;

    public f(ImmutableSet deeplinkGateways, edi.a revPointsPocketDestinationProvider) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(revPointsPocketDestinationProvider, "revPointsPocketDestinationProvider");
        this.f151462a = deeplinkGateways;
        this.f151463b = revPointsPocketDestinationProvider;
    }

    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof edi.c) {
            edi.c cVar = (edi.c) descriptor;
            return cVar.a(new RevPointsPocketThresholdsBreakdownScreen(new RevPointsPocketThresholdsBreakdownScreenContract$InputData(cVar.b())));
        }
        super.c(descriptor);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // nhi.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(aii.x r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof hdi.e
            if (r0 == 0) goto L13
            r0 = r6
            hdi.e r0 = (hdi.e) r0
            int r1 = r0.f151461w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f151461w = r1
            goto L1a
        L13:
            hdi.e r0 = new hdi.e
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f151461w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            boolean r5 = r5 instanceof edi.b
            if (r5 == 0) goto L4e
            r0.f151461w = r3
            edi.a r5 = r4.f151463b
            java.lang.Object r6 = edi.a.a(r5, r0)
            if (r6 != r1) goto L43
            return r1
        L43:
            com.revolut.kompot.common.StackDestination r6 = (com.revolut.kompot.common.StackDestination) r6
            com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig r5 = zh9.u0.d(r6)
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.c(r5)
            return r5
        L4e:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hdi.f.d(aii.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nte.a
    public final List e() {
        return RevPointsPocketApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RevPointsPocketDestination.Onboarding) {
            return new RevPointsPocketFlow(new RevPointsPocketFlowContract$InputData(new RevPointsPocketFlowContract$Step.Onboarding(((RevPointsPocketDestination.Onboarding) destination).getF97798b())));
        }
        if (destination instanceof RevPointsPocketDestination.RevPointsPocketDetails) {
            return new RevPointsPocketDetailsScreen();
        }
        if (destination instanceof RevPointsPocketDestination.RevPointsAddMoneyDestination) {
            return new RevPointsAddMoneyFlow(new RevPointsAddMoneyFlowContract$InputData(((RevPointsPocketDestination.RevPointsAddMoneyDestination) destination).getF97803b()));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f151462a;
    }
}

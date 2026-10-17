package awi;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.retail.feature.airportlounges.api.AirportLoungesApi$Toggles;
import com.revolut.retail.feature.airportlounges.api.navigation.AirportLoungesFeatureConfig;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.home.LoungePassHomeFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.AirportLoungeSearchFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.lounge_search.AirportLoungeSearchFlowContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.pass_details.AirportLoungePassDetailsFlowContract$InputData;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.refund.LoungePassRefundFlow;
import com.revolut.retail.feature.airportlounges.impl.ui.flows.scheme.SchemeLoungesFlow;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f10771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final tvi.a f10772b;

    public b(ImmutableSet deeplinkGateways, tvi.a airportLoungesCommandProvider) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        Intrinsics.checkNotNullParameter(airportLoungesCommandProvider, "airportLoungesCommandProvider");
        this.f10771a = deeplinkGateways;
        this.f10772b = airportLoungesCommandProvider;
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
            boolean r0 = r6 instanceof awi.a
            if (r0 == 0) goto L13
            r0 = r6
            awi.a r0 = (awi.a) r0
            int r1 = r0.f10770w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f10770w = r1
            goto L1a
        L13:
            awi.a r0 = new awi.a
            gim.c r6 = (gim.c) r6
            r0.<init>(r4, r6)
        L1a:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f10770w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r6)
            goto L45
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            boolean r5 = r5 instanceof wvi.b
            if (r5 == 0) goto L4c
            r0.f10770w = r3
            tvi.a r5 = r4.f10772b
            fwi.a r5 = (fwi.a) r5
            com.revolut.retail.core.navigation.FeatureCommand r6 = r5.a()
            if (r6 != r1) goto L45
            return r1
        L45:
            com.revolut.retail.core.navigation.NaviCommand r6 = (com.revolut.retail.core.navigation.NaviCommand) r6
            com.revolut.kompot.bridge.navigation.BridgeDestination r5 = zh9.u0.b(r6)
            return r5
        L4c:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: awi.b.d(aii.x, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // nte.a
    public final List e() {
        return AirportLoungesApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AirportLoungesFeatureConfig.HomeDestination) {
            return new LoungePassHomeFlow();
        }
        if (destination instanceof AirportLoungesFeatureConfig.SchemeLoungesDestination) {
            return new SchemeLoungesFlow();
        }
        if (destination instanceof AirportLoungesFeatureConfig.PurchasePassDestination) {
            return new AirportLoungePassDetailsFlow(AirportLoungePassDetailsFlowContract$InputData.Checkout.f98984a);
        }
        if (destination instanceof AirportLoungesFeatureConfig.PassDetailsDestination) {
            return new AirportLoungePassDetailsFlow(0);
        }
        if (destination instanceof AirportLoungesFeatureConfig.PassRefundDestination) {
            return new LoungePassRefundFlow();
        }
        if (destination instanceof AirportLoungesFeatureConfig.FindLoungesDestination) {
            return new AirportLoungeSearchFlow(new AirportLoungeSearchFlowContract$InputData(((AirportLoungesFeatureConfig.FindLoungesDestination) destination).f98944a));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f10771a;
    }
}

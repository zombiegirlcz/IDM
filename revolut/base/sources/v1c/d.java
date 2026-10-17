package v1c;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$LoyaltyScFairValueDisclaimer;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1A;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1B;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest2A;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest2B;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServe;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServeViaSCGroup;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServeViaTxDetail;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$V2revPointsScOptinTestA;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$V2revPointsScOptinTestB;
import com.revolut.feature.rev_points.spare_change.api.RevPointsSpareChangeApi$Toggles$V2revPointsScOptinTestC;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeBreakdownControllerApi$Destination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$BridgeDestination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$Destination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullGridControllerApi$Destination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullListControllerApi$Destination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullMultiplierControllerApi$Destination;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeRefundControllerApi$Destination;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.breakdown.RevPointsSpareChangeBreakdownController;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.deactivation.RevPointsSpareChangeDeactivationController;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_banner_grid_spare_change.RevPointsSpareChangeFullBannerGridController;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_grid_spare_change.RevPointsSpareChangeFullGridController;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_list_spare_change.RevPointsSpareChangeFullListController;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.full_multiplier_spare_change.RevPointsSpareChangeFullMultiplierController;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.refund.RevPointsSpareChangeRefundController;
import com.revolut.feature.rev_points.spare_change.impl.ui.screen.spare_change.RevPointsSpareChangeController;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p1c.f;
import p1c.j;
import uyh.k0;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f285291a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof p1c.a) {
            p1c.a aVar = (p1c.a) descriptor;
            return aVar.a(new RevPointsSpareChangeController(aVar.f231888a));
        }
        if (descriptor instanceof p1c.b) {
            return ((p1c.b) descriptor).a(new RevPointsSpareChangeDeactivationController());
        }
        if (descriptor instanceof j) {
            return ((j) descriptor).a(new RevPointsSpareChangeRefundController());
        }
        if (descriptor instanceof p1c.g) {
            p1c.g gVar = (p1c.g) descriptor;
            return gVar.a(new RevPointsSpareChangeFullMultiplierController(gVar.f231893a));
        }
        if (descriptor instanceof p1c.e) {
            p1c.e eVar = (p1c.e) descriptor;
            return eVar.a(new RevPointsSpareChangeFullGridController(eVar.f231892a));
        }
        if (descriptor instanceof p1c.d) {
            p1c.d dVar = (p1c.d) descriptor;
            return dVar.a(new RevPointsSpareChangeFullBannerGridController(dVar.f231891a));
        }
        if (descriptor instanceof f) {
            return ((f) descriptor).a(new RevPointsSpareChangeFullListController());
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return v.k(RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServe.f84114c, RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServeViaTxDetail.f84116c, RevPointsSpareChangeApi$Toggles$SpareChangeRefundSelfServeViaSCGroup.f84115c, RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1A.f84110c, RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest1B.f84111c, RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest2A.f84112c, RevPointsSpareChangeApi$Toggles$RevPointsScOptinTest2B.f84113c, RevPointsSpareChangeApi$Toggles$LoyaltyScFairValueDisclaimer.f84109c, RevPointsSpareChangeApi$Toggles$V2revPointsScOptinTestA.f84117c, RevPointsSpareChangeApi$Toggles$V2revPointsScOptinTestB.f84118c, RevPointsSpareChangeApi$Toggles$V2revPointsScOptinTestC.f84119c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RevPointsSpareChangeControllerApi$BridgeDestination) {
            return gc0.c.b(new RevPointsSpareChangeController(new RevPointsSpareChangeControllerApi$InputData(((RevPointsSpareChangeControllerApi$BridgeDestination) destination).f84124a)), new ogk.b(29));
        }
        if (destination instanceof RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination) {
            return gc0.c.b(new RevPointsSpareChangeFullBannerGridController(((RevPointsSpareChangeFullBannerGridControllerApi$BridgeDestination) destination).f84136a), new c(0));
        }
        if (destination instanceof RevPointsSpareChangeFullMultiplierControllerApi$Destination) {
            return new RevPointsSpareChangeFullMultiplierController(((RevPointsSpareChangeFullMultiplierControllerApi$Destination) destination).f84144a);
        }
        if (destination instanceof RevPointsSpareChangeFullGridControllerApi$Destination) {
            return new RevPointsSpareChangeFullGridController(((RevPointsSpareChangeFullGridControllerApi$Destination) destination).f84142a);
        }
        if (destination instanceof RevPointsSpareChangeFullBannerGridControllerApi$Destination) {
            RevPointsSpareChangeFullBannerGridController revPointsSpareChangeFullBannerGridController = new RevPointsSpareChangeFullBannerGridController(((RevPointsSpareChangeFullBannerGridControllerApi$Destination) destination).f84137a);
            revPointsSpareChangeFullBannerGridController.k2(new ur2.a(destination, 14));
            k0 block = new k0(revPointsSpareChangeFullBannerGridController, destination, 10);
            Intrinsics.checkNotNullParameter(block, "block");
            revPointsSpareChangeFullBannerGridController.H = block;
            return revPointsSpareChangeFullBannerGridController;
        }
        if (destination instanceof RevPointsSpareChangeFullListControllerApi$Destination) {
            return new RevPointsSpareChangeFullListController();
        }
        if (destination instanceof RevPointsSpareChangeRefundControllerApi$Destination) {
            return new RevPointsSpareChangeRefundController();
        }
        if (destination instanceof RevPointsSpareChangeBreakdownControllerApi$Destination) {
            return new RevPointsSpareChangeBreakdownController(((RevPointsSpareChangeBreakdownControllerApi$Destination) destination).f84120a);
        }
        return null;
    }
}

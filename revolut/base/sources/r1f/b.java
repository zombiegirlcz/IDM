package r1f;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.trade_rev_points.api.TradeRevPointsApi$Toggles$TradeRevPointsRevPayMigration;
import com.revolut.feature.trade_rev_points.api.TradeRevPointsApi$Toggles$TrainsPoints;
import com.revolut.feature.trade_rev_points.api.navigation.TradeRevPointsAgentDetailsDestination;
import com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlow;
import com.revolut.feature.trade_rev_points.impl.ui.flow.agent_details.TradeRevPointsAgentDetailsFlowContract$InputData;
import com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking.TradeRevPointsAccountUnlinkingScreen;
import com.revolut.feature.trade_rev_points.impl.ui.screen.unlinking.TradeRevPointsAccountUnlinkingScreenContract$InputData;
import g1f.c;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes8.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f251005a;

    public b(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f251005a = deeplinkGateways;
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof g1f.b) {
            g1f.b bVar = (g1f.b) descriptor;
            return bVar.a(new TradeRevPointsAgentDetailsFlow(new TradeRevPointsAgentDetailsFlowContract$InputData.Details(bVar.f139586a, bVar.f139587b, bVar.f139588c)));
        }
        if (descriptor instanceof g1f.a) {
            g1f.a aVar = (g1f.a) descriptor;
            return aVar.a(new TradeRevPointsAccountUnlinkingScreen(new TradeRevPointsAccountUnlinkingScreenContract$InputData(aVar.f139584b, aVar.f139585c, aVar.f139583a)));
        }
        if (!(descriptor instanceof c)) {
            return null;
        }
        c cVar = (c) descriptor;
        return cVar.a(new TradeRevPointsAgentDetailsFlow(new TradeRevPointsAgentDetailsFlowContract$InputData.Transfer(cVar.f139589a, cVar.f139590b, cVar.f139591c, cVar.d)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(TradeRevPointsApi$Toggles$TrainsPoints.f91106c, TradeRevPointsApi$Toggles$TradeRevPointsRevPayMigration.f91105c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof TradeRevPointsAgentDetailsDestination)) {
            return null;
        }
        TradeRevPointsAgentDetailsDestination tradeRevPointsAgentDetailsDestination = (TradeRevPointsAgentDetailsDestination) destination;
        return new TradeRevPointsAgentDetailsFlow(new TradeRevPointsAgentDetailsFlowContract$InputData.Details(tradeRevPointsAgentDetailsDestination.f91107a, tradeRevPointsAgentDetailsDestination.f91108b, tradeRevPointsAgentDetailsDestination.f91109c));
    }

    @Override // aii.p
    public final Set h() {
        return this.f251005a;
    }
}

package aah;

import aii.u;
import aii.x;
import com.revolut.feature.faq.api.navigation.FaqFeatureConfig;
import com.revolut.feature.wealth.api.declaration.DetailDisclaimersDestination;
import com.revolut.feature.wealth.ui.api.navigation.DisclosuresDestination;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotOverlayFeatureConfig;
import com.revolut.kompot.common.ExternalDestination;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import z0h.g1;
import z0h.h1;
import z0h.i1;
import z0h.j1;
import z0h.k1;
import z0h.l1;
import z0h.m1;
import z0h.n1;
import z0h.o1;
import zh9.u0;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements z0h.a {
    public static ParcelableDestination a(o1 o1Var) {
        if (o1Var instanceof n1) {
            String str = ((n1) o1Var).f318541a;
            if (str.length() != 0) {
                return new ExternalDestination.Browser(str, null);
            }
        } else {
            if (o1Var instanceof j1) {
                return new BridgeDestination(gc0.c.f(new FaqFeatureConfig.Starter(((j1) o1Var).f318518a, 2)));
            }
            if (o1Var instanceof l1) {
                return null;
            }
            if (o1Var instanceof m1) {
                return new DisclosuresDestination(DisclosuresDestination.Configuration.Trading.f95906a);
            }
            if (o1Var instanceof g1) {
                return new DisclosuresDestination(DisclosuresDestination.Configuration.Commodities.f95903a);
            }
            if (Intrinsics.f(o1Var, k1.f318523a)) {
                return new DisclosuresDestination(DisclosuresDestination.Configuration.InvestCombined.f95905a);
            }
            if (o1Var instanceof i1) {
                return new BridgeDestination(gc0.c.f(new KompotOverlayFeatureConfig(new DetailDisclaimersDestination(((i1) o1Var).f318515a), yhi.b.BOTTOM_DIALOG, (Integer) null, 12)));
            }
            if (!Intrinsics.f(o1Var, h1.f318510a) && o1Var != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    @Override // z0h.a
    public final NaviCommand I0(o1 o1Var) {
        ParcelableDestination parcelableDestinationA = a(o1Var);
        if (parcelableDestinationA != null) {
            return parcelableDestinationA instanceof BridgeDestination ? ((BridgeDestination) parcelableDestinationA).f98270a : u0.e(parcelableDestinationA);
        }
        return null;
    }

    @Override // z0h.a
    public final u M0(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.d;
        return a(obj2 instanceof o1 ? (o1) obj2 : null);
    }

    @Override // z0h.a
    public final x f0(ty0.a clickData) {
        Intrinsics.checkNotNullParameter(clickData, "clickData");
        Object obj2 = clickData.d;
        if (obj2 instanceof l1) {
            return new f9i.c(new f9i.e(((l1) obj2).f318529a, false));
        }
        return null;
    }
}

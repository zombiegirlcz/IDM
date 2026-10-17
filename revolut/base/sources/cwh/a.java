package cwh;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.revolut.feature_autoinvest_ui_api.navigation.AutoInvestMoveBridgeDestination;
import com.revolut.feature_autoinvest_ui_impl.ui.move.AutoInvestMoveController;
import com.revolut.feature_autoinvest_ui_impl.ui.move.AutoInvestMoveScreenContract$InputData;
import gc0.c;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f109609a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof bwh.a) {
            bwh.a aVar = (bwh.a) descriptor;
            return aVar.a(new AutoInvestMoveController(new AutoInvestMoveScreenContract$InputData(aVar.b(), aVar.c())));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof AutoInvestMoveBridgeDestination)) {
            return null;
        }
        AutoInvestMoveBridgeDestination autoInvestMoveBridgeDestination = (AutoInvestMoveBridgeDestination) destination;
        return c.b(new AutoInvestMoveController(new AutoInvestMoveScreenContract$InputData(autoInvestMoveBridgeDestination.getF96620a(), autoInvestMoveBridgeDestination.getF96621b())), new aab.b(7));
    }
}

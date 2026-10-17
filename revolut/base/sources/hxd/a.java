package hxd;

import aii.p;
import aii.u;
import com.revolut.feature.standingordertopup.api.navigation.destination.AutoTopUpFlowDestination;
import com.revolut.feature.standingordertopup.api.navigation.destination.AutoTopUpPaymentDetailsDestination;
import com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.AutoTopUpFlow;
import com.revolut.feature.standingordertopup.impl.ui.flow.auto_top_up.AutoTopUpFlowContract$InputData;
import com.revolut.feature.standingordertopup.impl.ui.screen.payment_details.AutoTopUpPaymentDetailsScreen;
import com.revolut.feature.standingordertopup.impl.ui.screen.payment_details.AutoTopUpPaymentDetailsScreenContract$InputData;
import dki.g;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.y0;

/* JADX INFO: loaded from: classes7.dex */
public final class a implements ohi.a, p {
    @Override // ohi.a, nhi.h, aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof AutoTopUpFlowDestination) {
            AutoTopUpFlowDestination autoTopUpFlowDestination = (AutoTopUpFlowDestination) destination;
            return new AutoTopUpFlow(new AutoTopUpFlowContract$InputData(autoTopUpFlowDestination.f88174a, autoTopUpFlowDestination.f88175b, autoTopUpFlowDestination.f88176c));
        }
        if (destination instanceof AutoTopUpPaymentDetailsDestination) {
            return new AutoTopUpPaymentDetailsScreen(new AutoTopUpPaymentDetailsScreenContract$InputData(((AutoTopUpPaymentDetailsDestination) destination).f88177a));
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return y0.b(new ixd.a());
    }
}

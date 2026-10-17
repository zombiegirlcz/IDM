package sac;

import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayDeliveries;
import com.revolut.feature.revolutpay.api.config.RevolutPayFeatureConfig$RevolutPayOrderDetails;
import com.revolut.feature.revolutpay.order_tracking.api.declaration.RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayFlightTrackingInOrderDetails;
import com.revolut.feature.revolutpay.order_tracking.api.declaration.RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayOrderDetailsTransactionEntryPoint;
import com.revolut.feature.revolutpay.order_tracking.api.declaration.RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayTrackingWidget;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.deliveries.DeliveriesScreen;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking.TrackingFlow;
import com.revolut.feature.revolutpay.order_tracking.impl.ui.flow.tracking.TrackingFlowContract$InputData;
import dki.g;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f261380a;

    public c(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f261380a = deeplinkGateways;
    }

    @Override // nte.a
    public final List e() {
        return v.k(RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayTrackingWidget.f84601c, RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayFlightTrackingInOrderDetails.f84599c, RevolutPayOrderTrackingCoreApi$Toggles$RevolutPayOrderDetailsTransactionEntryPoint.f84600c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RevolutPayFeatureConfig$RevolutPayOrderDetails) {
            return new TrackingFlow(new TrackingFlowContract$InputData.OrderDetails(((RevolutPayFeatureConfig$RevolutPayOrderDetails) destination).f84292a));
        }
        if (destination instanceof RevolutPayFeatureConfig$RevolutPayDeliveries) {
            return new DeliveriesScreen();
        }
        return null;
    }

    @Override // aii.p
    public final Set h() {
        return this.f261380a;
    }
}

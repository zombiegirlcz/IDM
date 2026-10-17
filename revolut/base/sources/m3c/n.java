package m3c;

import aii.u;
import com.revolut.feature.revolut_shop.api.RevolutShopDestination$InputData;
import com.revolut.feature.revolut_shop.ui.flow.ipp_shop.IppShopFlow;
import com.revolut.feature.revolut_shop.ui.flow.ipp_shop.IppShopFlowContract$InputData;
import com.revolut.feature.revolut_shop.ui.flow.order_history.OrderHistoryFlow;
import com.revolut.feature.revolut_shop.ui.flow.order_history.OrderHistoryFlowContract$InputData;
import com.revolut.retail.feature.freelancer.revolut_shop.api.FreelancerRevolutShopDestination;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class n implements aii.p {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof h3c.a) {
            return ((h3c.a) descriptor).a(new IppShopFlow(IppShopFlowContract$InputData.Catalog.f84207a));
        }
        return null;
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof b3c.a)) {
            return null;
        }
        RevolutShopDestination$InputData revolutShopDestination$InputData = ((FreelancerRevolutShopDestination) ((b3c.a) destination)).f101491b;
        if (Intrinsics.f(revolutShopDestination$InputData, RevolutShopDestination$InputData.Catalog.f84188a)) {
            return new IppShopFlow(IppShopFlowContract$InputData.Catalog.f84207a);
        }
        if (revolutShopDestination$InputData instanceof RevolutShopDestination$InputData.Product) {
            return new IppShopFlow(new IppShopFlowContract$InputData.Product(((RevolutShopDestination$InputData.Product) revolutShopDestination$InputData).f84191a));
        }
        if (Intrinsics.f(revolutShopDestination$InputData, RevolutShopDestination$InputData.OrderHistory.f84190a)) {
            return new OrderHistoryFlow(OrderHistoryFlowContract$InputData.OrderHistory.f84219a);
        }
        if (revolutShopDestination$InputData instanceof RevolutShopDestination$InputData.OrderConfirmation) {
            return new OrderHistoryFlow(new OrderHistoryFlowContract$InputData.OrderConfirmation(((RevolutShopDestination$InputData.OrderConfirmation) revolutShopDestination$InputData).f84189a));
        }
        throw new NoWhenBranchMatchedException();
    }
}

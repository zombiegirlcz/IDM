package p7k;

import aii.u;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinkQrDestination;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksBridgeFeatureConfig;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureConfig$Details$ByCode;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksFeatureConfig$Details$ByTransferLink;
import com.revolut.retail.feature.payments.payment_links.api.navigation.PaymentLinksRequestSelectionBridgeFeatureConfig;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsContract$InputData;
import com.revolut.retail.feature.payments.payment_links.impl.ui.details.PaymentLinkDetailsScreen;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.flow.PaymentLinksTransferFlow;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.qr_link.flow.PaymentLinkQrFlow;
import com.revolut.retail.feature.payments.payment_links.impl.ui_kompot.request.PaymentLinksRequestSelectionScreen;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PaymentLinkQrDestination) {
            return new PaymentLinkQrFlow();
        }
        if (destination instanceof PaymentLinksFeatureConfig$Details$ByTransferLink.BridgeDestination) {
            return new PaymentLinkDetailsScreen(new PaymentLinkDetailsContract$InputData.ByTransferLink(((PaymentLinksFeatureConfig$Details$ByTransferLink.BridgeDestination) destination).f102175a));
        }
        if (destination instanceof PaymentLinksFeatureConfig$Details$ByCode.BridgeDestination) {
            return new PaymentLinkDetailsScreen(new PaymentLinkDetailsContract$InputData.ByCode(((PaymentLinksFeatureConfig$Details$ByCode.BridgeDestination) destination).f102173a));
        }
        if (destination instanceof PaymentLinksBridgeFeatureConfig.BridgeDestination) {
            return new PaymentLinksTransferFlow(((PaymentLinksBridgeFeatureConfig.BridgeDestination) destination).f102168a);
        }
        if (destination instanceof PaymentLinksRequestSelectionBridgeFeatureConfig.BridgeDestination) {
            return new PaymentLinksRequestSelectionScreen();
        }
        return null;
    }
}

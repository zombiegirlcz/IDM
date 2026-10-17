package x2k;

import aii.u;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.PaymentVendorsBeneCreationDestination;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.RemittanceBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.PaymentVendorsBeneCreationFlow;
import com.revolut.retail.feature.payments.bank_transfer.impl.payment_vendors_bene_creation.flow.PaymentVendorsBeneCreationFlowContract$InputData;
import com.revolut.retail.feature.payments.bank_transfer.impl.remittance_kompot.flow.RemittanceFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof RemittanceBridgeFeatureConfig.BridgeDestination) {
            return new RemittanceFlow(((RemittanceBridgeFeatureConfig.BridgeDestination) destination).f101973a);
        }
        if (destination instanceof PaymentVendorsBeneCreationDestination) {
            return new PaymentVendorsBeneCreationFlow(new PaymentVendorsBeneCreationFlowContract$InputData(((PaymentVendorsBeneCreationDestination) destination).f101969a));
        }
        return null;
    }
}

package h1a;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.feature.payments.splitbill.api.navigation.RecurringPaymentSplitManageNavigation$Destination;
import com.revolut.feature.payments.splitbill.api.navigation.RecurringPaymentSplitNavigation$Destination;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillQrDescriptor;
import com.revolut.feature.payments.splitbill.api.navigation.SplitBillsFeatureConfig;
import com.revolut.feature.payments.splitbill.impl.ui.view_itemized_split_bill_lines.ViewItemizedSplitBillLinesController;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.SplitBillsFlowContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.link_context.qr.flow.SplitBillQrFlowContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitContract$InputData;
import com.revolut.feature.payments.splitbill.impl.ui_new.manage_split.RecurringPaymentsManageSplitScreen;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlow;
import com.revolut.feature.payments.splitbill.impl.ui_new.recurring_split.RecurringSplitFlowContract$InputData;
import gc0.c;
import kotlin.jvm.internal.Intrinsics;
import n1a.d;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements ohi.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f148486a = 0;

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof SplitBillQrDescriptor) {
            SplitBillQrDescriptor splitBillQrDescriptor = (SplitBillQrDescriptor) descriptor;
            return splitBillQrDescriptor.a(new SplitBillQrFlow(new SplitBillQrFlowContract$InputData(splitBillQrDescriptor.f79827a)));
        }
        if (!(descriptor instanceof x0a.b)) {
            return null;
        }
        x0a.b bVar = (x0a.b) descriptor;
        return bVar.a(new ViewItemizedSplitBillLinesController(new d(bVar.f301538a)));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SplitBillsFeatureConfig.BridgeDestination) {
            SplitBillsFeatureConfig.BridgeDestination bridgeDestination = (SplitBillsFeatureConfig.BridgeDestination) destination;
            return new SplitBillsFlow(new SplitBillsFlowContract$InputData(bridgeDestination.f79831a, bridgeDestination.f79832b));
        }
        if (destination instanceof RecurringPaymentSplitNavigation$Destination) {
            RecurringPaymentSplitNavigation$Destination recurringPaymentSplitNavigation$Destination = (RecurringPaymentSplitNavigation$Destination) destination;
            return new RecurringSplitFlow(new RecurringSplitFlowContract$InputData(recurringPaymentSplitNavigation$Destination.f79813a, recurringPaymentSplitNavigation$Destination.f79814b));
        }
        if (destination instanceof RecurringPaymentSplitManageNavigation$Destination) {
            return c.b(new RecurringPaymentsManageSplitScreen(new RecurringPaymentsManageSplitContract$InputData(((RecurringPaymentSplitManageNavigation$Destination) destination).f79812a)), new aab.b(14));
        }
        return null;
    }
}

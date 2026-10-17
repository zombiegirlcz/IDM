package zr9;

import aii.u;
import com.revolut.feature.payments.groups.api.navigation.CreateGroupDestination;
import com.revolut.feature.payments.groups.api.navigation.PaymentsGroupsRedesignFeatureConfig;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.PaymentsGroupsBillsSelectionFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_selection.PaymentsGroupsBillsSelectionFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.PaymentsGroupsBillsSplitFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.bills_split.PaymentsGroupsBillsSplitFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlow;
import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$InputData;
import com.revolut.feature.payments.groups.impl.ui_new.flow.group_details.GroupDetailsFlowContract$Step;
import com.revolut.feature.payments.groups.impl.ui_new.group_creation.GroupCreationScreen;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof PaymentsGroupsRedesignFeatureConfig.BillSelection.BridgeDestination) {
            PaymentsGroupsRedesignFeatureConfig.BillSelection.BridgeDestination bridgeDestination = (PaymentsGroupsRedesignFeatureConfig.BillSelection.BridgeDestination) destination;
            return new PaymentsGroupsBillsSelectionFlow(new PaymentsGroupsBillsSelectionFlowContract$InputData(bridgeDestination.f79299a, bridgeDestination.f79300b));
        }
        if (destination instanceof PaymentsGroupsRedesignFeatureConfig.BillSplit.BridgeDestination) {
            PaymentsGroupsRedesignFeatureConfig.BillSplit.BridgeDestination bridgeDestination2 = (PaymentsGroupsRedesignFeatureConfig.BillSplit.BridgeDestination) destination;
            return new PaymentsGroupsBillsSplitFlow(new PaymentsGroupsBillsSplitFlowContract$InputData(bridgeDestination2.f79303a, bridgeDestination2.f79304b, bridgeDestination2.f79305c));
        }
        if (destination instanceof PaymentsGroupsRedesignFeatureConfig.GroupBillDetails.BridgeDestination) {
            PaymentsGroupsRedesignFeatureConfig.GroupBillDetails.BridgeDestination bridgeDestination3 = (PaymentsGroupsRedesignFeatureConfig.GroupBillDetails.BridgeDestination) destination;
            return new GroupDetailsFlow(new GroupDetailsFlowContract$InputData.WithStep(new GroupDetailsFlowContract$Step.BillDetails(bridgeDestination3.f79308a, bridgeDestination3.f79309b)));
        }
        if (destination instanceof PaymentsGroupsRedesignFeatureConfig.GroupDetails.BridgeDestination) {
            PaymentsGroupsRedesignFeatureConfig.GroupDetails.BridgeDestination bridgeDestination4 = (PaymentsGroupsRedesignFeatureConfig.GroupDetails.BridgeDestination) destination;
            return new GroupDetailsFlow(new GroupDetailsFlowContract$InputData.WithStep(new GroupDetailsFlowContract$Step.Overview(bridgeDestination4.f79312a, bridgeDestination4.f79313b)));
        }
        if (destination instanceof PaymentsGroupsRedesignFeatureConfig.JoinGroup.BridgeDestination) {
            return new GroupDetailsFlow(new GroupDetailsFlowContract$InputData.JoinGroup(((PaymentsGroupsRedesignFeatureConfig.JoinGroup.BridgeDestination) destination).getF79315a()));
        }
        if (destination instanceof CreateGroupDestination) {
            return new GroupCreationScreen();
        }
        return null;
    }
}

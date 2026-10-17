package xtf;

import aii.u;
import com.revolut.feature.payments.money_request.api.navigation.ManualTransferInputData;
import com.revolut.feature.transfer_request_approval.api.TransferRequestApprovalApi$Toggles;
import com.revolut.feature.transfer_request_approval.api.navigation.ManualTransferFeatureConfig;
import com.revolut.feature.transfer_request_approval.impl.ui_kompot.manual.flow.ManualTransferFlow;
import dki.g;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return TransferRequestApprovalApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ManualTransferFeatureConfig.BridgeDestination) {
            return new ManualTransferFlow(new ManualTransferInputData(((ManualTransferFeatureConfig.BridgeDestination) destination).getF92454a()));
        }
        return null;
    }
}

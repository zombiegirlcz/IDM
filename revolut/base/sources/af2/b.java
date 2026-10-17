package af2;

import aii.u;
import com.revolut.feature.apm.upi.api.UpiFeatureConfig;
import com.revolut.feature.apm.upi.impl.flow.UpiTransferFlow;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferBridgeFeatureConfig;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferFlowInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferInputData;
import com.revolut.retail.feature.payments.bank_transfer.api.navigation.BankTransferReviewDescriptor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements ue2.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uw1.c f3845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f3846b;

    public b(uw1.c apmFeatureChecker, h navigationScreenProvider) {
        Intrinsics.checkNotNullParameter(apmFeatureChecker, "apmFeatureChecker");
        Intrinsics.checkNotNullParameter(navigationScreenProvider, "navigationScreenProvider");
        this.f3845a = apmFeatureChecker;
        this.f3846b = navigationScreenProvider;
    }

    public final UpiTransferFlow a(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof BankTransferBridgeFeatureConfig.BridgeDestination)) {
            return null;
        }
        BankTransferFlowInputData.NewTransfer newTransfer = ((BankTransferBridgeFeatureConfig.BridgeDestination) destination).f101923a;
        UpiFeatureConfig.Destination.Transfer.InputData.ToBeneficiary toBeneficiary = new UpiFeatureConfig.Destination.Transfer.InputData.ToBeneficiary(newTransfer.f101940a);
        BankTransferInputData bankTransferInputData = newTransfer.f101944h;
        return this.f3846b.a(new UpiFeatureConfig.Destination.Transfer(toBeneficiary, null, bankTransferInputData.e, bankTransferInputData.f101953g, 2));
    }

    public final aii.g b(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        boolean z = descriptor instanceof BankTransferReviewDescriptor;
        h hVar = this.f3846b;
        if (z) {
            BankTransferReviewDescriptor bankTransferReviewDescriptor = (BankTransferReviewDescriptor) descriptor;
            return bankTransferReviewDescriptor.a(hVar.a(new UpiFeatureConfig.Destination.Transfer(new UpiFeatureConfig.Destination.Transfer.InputData.ToBeneficiary(bankTransferReviewDescriptor.f101962a.f101945h), null, null, null, 14)));
        }
        if (!(descriptor instanceof com.revolut.retail.feature.payments.bank_transfer.api.navigation.a)) {
            return null;
        }
        com.revolut.retail.feature.payments.bank_transfer.api.navigation.a aVar = (com.revolut.retail.feature.payments.bank_transfer.api.navigation.a) descriptor;
        return aVar.a(hVar.a(new UpiFeatureConfig.Destination.Transfer(new UpiFeatureConfig.Destination.Transfer.InputData.ToBeneficiary(aVar.f101988a.f101940a), null, null, null, 14)));
    }

    public final boolean c() {
        ty1.b bVar = (ty1.b) this.f3845a;
        bVar.getClass();
        return bVar.b(uw1.f.UPI);
    }
}

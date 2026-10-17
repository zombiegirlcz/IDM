package fp5;

import aii.u;
import com.revolut.feature.crypto.withdraw.api.CryptoWithdrawApi$Toggles;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddressHostingFlowInput;
import com.revolut.feature.crypto.withdraw.api.navigation.CryptoAddressHostingFlowDestination;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.bridge.CryptoSendDualChooserBridgeContract$Destination;
import com.revolut.feature.crypto.withdraw.impl.ui.withdrawtoaddress.bridge.CryptoSendDualChooserBridgeFlow;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.beneficiarydetails.CryptoBeneficiaryDetailsScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.hostingflow.CryptoAddressHostingFlow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class g implements ohi.a, nte.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof lo5.f)) {
            return null;
        }
        lo5.f fVar = (lo5.f) descriptor;
        return fVar.a(new CryptoBeneficiaryDetailsScreen(fVar.b()));
    }

    @Override // nte.a
    public final List e() {
        return CryptoWithdrawApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoAddressHostingFlowDestination) {
            CryptoAddressHostingFlowDestination cryptoAddressHostingFlowDestination = (CryptoAddressHostingFlowDestination) destination;
            return new CryptoAddressHostingFlow(new CryptoAddressHostingFlowInput(cryptoAddressHostingFlowDestination.getF71131a().getF71076a(), cryptoAddressHostingFlowDestination.getF71131a().getF71077b()));
        }
        if (destination instanceof CryptoSendDualChooserBridgeContract$Destination) {
            return new CryptoSendDualChooserBridgeFlow(((CryptoSendDualChooserBridgeContract$Destination) destination).getF71161a());
        }
        return null;
    }
}

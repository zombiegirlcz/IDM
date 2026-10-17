package byh;

import aii.e;
import aii.g;
import com.revolut.feature_crypto_order_details.api.CryptoOrderDetailsApi$Toggles$CryptoOrderDetailsPager;
import com.revolut.feature_crypto_order_details.api.navigation.CryptoOrderDetailsDestination;
import com.revolut.feature_crypto_order_details.impl.ui.details.CryptoOrderDetailsController;
import com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlow;
import com.revolut.feature_crypto_order_details.impl.ui.pager.CryptoOrderDetailsPagerFlowContract$InputData;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof sxh.a) {
            sxh.a aVar = (sxh.a) descriptor;
            return aVar.a(new CryptoOrderDetailsPagerFlow(new CryptoOrderDetailsPagerFlowContract$InputData(aVar.f266495a, aVar.f266496b, aVar.f266497c)));
        }
        super.c(descriptor);
        return null;
    }

    @Override // nte.a
    public final List e() {
        return u.c(CryptoOrderDetailsApi$Toggles$CryptoOrderDetailsPager.f96656c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(aii.u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoOrderDetailsDestination) {
            return new CryptoOrderDetailsController(((CryptoOrderDetailsDestination) destination).f96657a);
        }
        return null;
    }
}

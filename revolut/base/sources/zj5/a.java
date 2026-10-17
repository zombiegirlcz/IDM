package zj5;

import aii.g;
import aii.u;
import com.revolut.feature.crypto.remittance.api.navigation.CryptoRemittanceKompotFeatureConfig;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.CurrencyChooserScreen;
import com.revolut.feature.crypto.remittance.impl.ui.currency_picker.flow.CurrencyChooserFlow;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (!(descriptor instanceof com.revolut.feature.crypto.remittance.api.navigation.b)) {
            return null;
        }
        com.revolut.feature.crypto.remittance.api.navigation.b bVar = (com.revolut.feature.crypto.remittance.api.navigation.b) descriptor;
        return bVar.a(new CurrencyChooserScreen(bVar.b()));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination) {
            return new CurrencyChooserFlow(((CryptoRemittanceKompotFeatureConfig.CurrencyPickerDestination) destination).getF70943a());
        }
        return null;
    }
}

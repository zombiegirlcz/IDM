package ju5;

import aii.g;
import aii.u;
import com.revolut.feature.crypto_investments.api.CryptoInvestmentsApi$Toggles;
import com.revolut.feature.crypto_investments.api.navigation.CryptoInvestmentsFeatureConfig;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreen;
import com.revolut.feature.crypto_investments.impl.ui.screens.activity.ActivityScreenContract$InputData;
import com.revolut.feature.crypto_investments.impl.ui.screens.kompot_tax_report.TaxReportFlow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return null;
    }

    @Override // nte.a
    public final List e() {
        return CryptoInvestmentsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CryptoInvestmentsFeatureConfig.TaxReportDestination) {
            return new TaxReportFlow();
        }
        if (!(destination instanceof CryptoInvestmentsFeatureConfig.ActivityDestination)) {
            return null;
        }
        CryptoInvestmentsFeatureConfig.ActivityDestination activityDestination = (CryptoInvestmentsFeatureConfig.ActivityDestination) destination;
        return new ActivityScreen(new ActivityScreenContract$InputData(activityDestination.f71400a, activityDestination.f71401b, activityDestination.f71402c, activityDestination.d, activityDestination.e, activityDestination.f, activityDestination.f71403g));
    }
}

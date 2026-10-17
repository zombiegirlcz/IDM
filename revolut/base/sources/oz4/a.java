package oz4;

import aii.u;
import com.revolut.feature.credit.forbearance.application.api.navigation.ForbearanceKompotFeatureConfig;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsContract$InputData;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.documents.CreditForbearanceAgreementsRootFlow;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements ohi.a {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof ForbearanceKompotFeatureConfig.Agreements.AgreementsNavigationDestination) {
            return new CreditForbearanceAgreementsRootFlow(new CreditForbearanceAgreementsContract$InputData(((ForbearanceKompotFeatureConfig.Agreements.AgreementsNavigationDestination) destination).f69930a));
        }
        return null;
    }
}

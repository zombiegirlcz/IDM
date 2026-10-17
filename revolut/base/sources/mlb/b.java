package mlb;

import aii.e;
import aii.g;
import aii.p;
import aii.u;
import com.google.common.collect.ImmutableSet;
import com.revolut.feature.retail.savings.api.core.SavingsCoreApi$Toggles$FixedTermSavings;
import com.revolut.feature.retail.savings.api.core.SavingsCoreApi$Toggles$SalaryStudentHys;
import com.revolut.feature.retail.savings.api.core.info_sheets.navigation.InfoSheetDestination;
import com.revolut.feature.retail.savings.api.core.navigation.CapitalAtRiskControllerDescriptor;
import com.revolut.feature.retail.savings.api.core.navigation.SavingsReturnExampleControllerDescriptor;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.InfoSheetFlow;
import com.revolut.feature.retail.savings.impl.core.info_sheets.presentation.flow.InfoSheetFlowContract$InputData;
import com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.SavingsInterestRateExplanationContract$InputData;
import com.revolut.feature.retail.savings.impl.core.product.presentation.rate_explanation.SavingsInterestRateExplanationScreen;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.capital_at_risk.CapitalAtRiskScreen;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.return_example.SavingsReturnExampleScreen;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements p, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f206664a;

    public b(ImmutableSet deeplinkGateways) {
        Intrinsics.checkNotNullParameter(deeplinkGateways, "deeplinkGateways");
        this.f206664a = deeplinkGateways;
    }

    @Override // aii.p
    public final void b() {
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof CapitalAtRiskControllerDescriptor) {
            CapitalAtRiskControllerDescriptor capitalAtRiskControllerDescriptor = (CapitalAtRiskControllerDescriptor) descriptor;
            return capitalAtRiskControllerDescriptor.a(new CapitalAtRiskScreen(new SavingsKompotFeatureConfig$CapitalAtRiskScreen$InputData(capitalAtRiskControllerDescriptor.f83122a)));
        }
        if (descriptor instanceof SavingsReturnExampleControllerDescriptor) {
            SavingsReturnExampleControllerDescriptor savingsReturnExampleControllerDescriptor = (SavingsReturnExampleControllerDescriptor) descriptor;
            return savingsReturnExampleControllerDescriptor.a(new SavingsReturnExampleScreen(new SavingsKompotFeatureConfig$SavingsReturnExampleScreen$InputData(savingsReturnExampleControllerDescriptor.f83123a)));
        }
        if (!(descriptor instanceof a)) {
            return null;
        }
        a aVar = (a) descriptor;
        return aVar.a(new SavingsInterestRateExplanationScreen(new SavingsInterestRateExplanationContract$InputData(aVar.f206663a)));
    }

    @Override // nte.a
    public final List e() {
        return v.k(SavingsCoreApi$Toggles$SalaryStudentHys.f83119c, SavingsCoreApi$Toggles$FixedTermSavings.f83118c);
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (!(destination instanceof InfoSheetDestination)) {
            return null;
        }
        InfoSheetDestination infoSheetDestination = (InfoSheetDestination) destination;
        return new InfoSheetFlow(new InfoSheetFlowContract$InputData(infoSheetDestination.f83120a, infoSheetDestination.f83121b));
    }

    @Override // aii.p
    public final Set h() {
        return this.f206664a;
    }
}

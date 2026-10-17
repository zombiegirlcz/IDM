package gob;

import aii.u;
import com.revolut.feature.retail.savings.api.SavingsAccountApi$Toggles;
import com.revolut.feature.retail.savings.api.SavingsApi$Toggles;
import com.revolut.feature.retail.savings.api.navigation.SavingsAddMoneyDestination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$CapitalAtRiskScreen$Destination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$FundInfoScreen$Destination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$InterestAndFeesScreen$Destination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$Destination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$ProductMigration$Destination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$ProtectionAndSafetyScreen$Destination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$SavingsDetailsScreen$Destination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$SavingsReturnExampleScreen$Destination;
import com.revolut.feature.retail.savings.api.navigation.feature_config.SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination;
import com.revolut.feature.retail.savings.impl.ui.add_money.SavingsAddMoneyFlow;
import com.revolut.feature.retail.savings.impl.ui.add_money.SavingsAddMoneyFlowContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.capital_at_risk.CapitalAtRiskScreen;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.next_interest_payment.NextInterestPaymentDialogScreen;
import com.revolut.feature.retail.savings.impl.ui.common.dialogs.return_example.SavingsReturnExampleScreen;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreen;
import com.revolut.feature.retail.savings.impl.ui.details.SavingsDetailsScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoController;
import com.revolut.feature.retail.savings.impl.ui.fund_information.FundInfoControllerContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.info.interest_fees.InterestAndFeesScreen;
import com.revolut.feature.retail.savings.impl.ui.info.interest_fees.InterestAndFeesScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.info.protection.ProtectionAndSafetyScreen;
import com.revolut.feature.retail.savings.impl.ui.info.protection.ProtectionAndSafetyScreenContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.product_migration.flow.ProductMigrationFlow;
import com.revolut.feature.retail.savings.impl.ui.product_migration.flow.ProductMigrationFlowContract$InputData;
import com.revolut.feature.retail.savings.impl.ui.widgets.savings.transfer.TransferWidgetCustomisationScreen;
import com.revolut.feature.toggles.models.RemoteFeatureDefinition;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import zhm.v;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements ohi.a, nte.a {
    @Override // nhi.f
    public final aii.g c(aii.e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof ljb.c) {
            ljb.c cVar = (ljb.c) descriptor;
            return cVar.a(new ProtectionAndSafetyScreen(new ProtectionAndSafetyScreenContract$InputData(cVar.b())));
        }
        if (descriptor instanceof ljb.a) {
            ljb.a aVar = (ljb.a) descriptor;
            return aVar.a(new FundInfoController(new FundInfoControllerContract$InputData(aVar.b())));
        }
        if (!(descriptor instanceof ljb.b)) {
            return null;
        }
        ljb.b bVar = (ljb.b) descriptor;
        return bVar.a(new InterestAndFeesScreen(new InterestAndFeesScreenContract$InputData(bVar.b())));
    }

    @Override // nte.a
    public final List e() {
        s0 s0Var = new s0(2);
        s0Var.b(SavingsApi$Toggles.a().toArray(new RemoteFeatureDefinition[0]));
        s0Var.b(SavingsAccountApi$Toggles.a().toArray(new RemoteFeatureDefinition[0]));
        ArrayList arrayList = s0Var.f186433a;
        return v.k(arrayList.toArray(new RemoteFeatureDefinition[arrayList.size()]));
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination) {
            return new TransferWidgetCustomisationScreen(((SavingsKompotFeatureConfig$TransferWidgetCustomisationScreen$Destination) destination).f83171a);
        }
        if (destination instanceof SavingsKompotFeatureConfig$SavingsDetailsScreen$Destination) {
            return new SavingsDetailsScreen(new SavingsDetailsScreenContract$InputData(((SavingsKompotFeatureConfig$SavingsDetailsScreen$Destination) destination).f83168a.getF83167a()));
        }
        if (destination instanceof SavingsKompotFeatureConfig$ProtectionAndSafetyScreen$Destination) {
            return new ProtectionAndSafetyScreen(new ProtectionAndSafetyScreenContract$InputData(((SavingsKompotFeatureConfig$ProtectionAndSafetyScreen$Destination) destination).f83166a));
        }
        if (destination instanceof SavingsKompotFeatureConfig$InterestAndFeesScreen$Destination) {
            return new InterestAndFeesScreen(new InterestAndFeesScreenContract$InputData(((SavingsKompotFeatureConfig$InterestAndFeesScreen$Destination) destination).f83159a));
        }
        if (destination instanceof SavingsKompotFeatureConfig$FundInfoScreen$Destination) {
            return new FundInfoController(new FundInfoControllerContract$InputData(((SavingsKompotFeatureConfig$FundInfoScreen$Destination) destination).f83158a));
        }
        if (destination instanceof SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$Destination) {
            return new NextInterestPaymentDialogScreen(((SavingsKompotFeatureConfig$NextInterestPaymentDialogScreen$Destination) destination).f83160a);
        }
        if (destination instanceof SavingsKompotFeatureConfig$CapitalAtRiskScreen$Destination) {
            return new CapitalAtRiskScreen(((SavingsKompotFeatureConfig$CapitalAtRiskScreen$Destination) destination).f83156a);
        }
        if (destination instanceof SavingsKompotFeatureConfig$SavingsReturnExampleScreen$Destination) {
            return new SavingsReturnExampleScreen(((SavingsKompotFeatureConfig$SavingsReturnExampleScreen$Destination) destination).f83169a);
        }
        if (destination instanceof SavingsKompotFeatureConfig$ProductMigration$Destination) {
            return new ProductMigrationFlow(new ProductMigrationFlowContract$InputData(((SavingsKompotFeatureConfig$ProductMigration$Destination) destination).f83165a));
        }
        if (!(destination instanceof SavingsAddMoneyDestination)) {
            return null;
        }
        SavingsAddMoneyDestination savingsAddMoneyDestination = (SavingsAddMoneyDestination) destination;
        return new SavingsAddMoneyFlow(new SavingsAddMoneyFlowContract$InputData(savingsAddMoneyDestination.getF83154a(), savingsAddMoneyDestination.getF83155b()));
    }
}

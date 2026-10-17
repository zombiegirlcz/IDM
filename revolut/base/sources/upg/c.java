package upg;

import aii.e;
import aii.g;
import aii.u;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.vaults.api.VaultsApi$Toggles;
import com.revolut.feature.vaults.api.navigation.VaultTermsViewerDestination;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig$SpareChange$Destination;
import com.revolut.feature.vaults.api.navigation.VaultsKompotFeatureConfig$WithdrawMoneyWithResultNavigation$Destination;
import com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.SpareChangeScreen;
import com.revolut.feature.vaults.impl.ui.details.spare_change.kompot.SpareChangeScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.details.terms_viewer.VaultTermsViewerScreen;
import com.revolut.feature.vaults.impl.ui.details.terms_viewer.VaultTermsViewerScreenContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.AddMoneyFlow;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.AddMoneyFlowContract$FlowInput;
import com.revolut.feature.vaults.impl.ui.money_flow.add_money.flow.with_result_navigation.AddMoneyWithResultNavigationFlow;
import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlow;
import com.revolut.feature.vaults.impl.ui.money_flow.recurring_transfer.RecurringTransferFlowContract$FlowInput;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlow;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.WithdrawMoneyFlowContract$InputData;
import com.revolut.feature.vaults.impl.ui.money_flow.withdraw.with_result_navigation.WithdrawMoneyWithResultNavigationFlow;
import com.revolut.feature.vaults.impl.ui.savings.onboarding.eu.steps.documents_acceptance.flow.AcceptDocumentsFlow;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import pcd.s;

/* JADX INFO: loaded from: classes13.dex */
public final class c implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f282054a = 0;

    public static AddMoneyFlow a(VaultsKompotFeatureConfig.AddMoney.Config config) {
        s f94710a = config.getF94710a();
        String f94711b = config.getF94711b();
        Long f94712c = config.getF94712c();
        return new AddMoneyFlow(new AddMoneyFlowContract$FlowInput(config.getD(), config.getE(), config.getI(), f94712c, f94711b, f94710a, config.getF(), config.getF94713g(), config.getF94714h(), config.getF94715j()));
    }

    @Override // nhi.f
    public final g c(e descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (descriptor instanceof ipg.c) {
            ipg.c cVar = (ipg.c) descriptor;
            return cVar.a(new SpareChangeScreen(new SpareChangeScreenContract$InputData(cVar.b(), null)));
        }
        if (!(descriptor instanceof com.revolut.feature.vaults.api.navigation.a)) {
            return null;
        }
        com.revolut.feature.vaults.api.navigation.a aVar = (com.revolut.feature.vaults.api.navigation.a) descriptor;
        return aVar.a(gc0.c.a(a(aVar.b().f94716a), new ogk.b(27)));
    }

    @Override // nte.a
    public final List e() {
        return VaultsApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof VaultsKompotFeatureConfig.AddMoney.Destination) {
            return a(((VaultsKompotFeatureConfig.AddMoney.Destination) destination).f94716a);
        }
        if (destination instanceof VaultsKompotFeatureConfig.AddMoneyWithResultNavigation.Destination) {
            VaultsKompotFeatureConfig.AddMoneyWithResultNavigation.Destination destination2 = (VaultsKompotFeatureConfig.AddMoneyWithResultNavigation.Destination) destination;
            s f94718a = destination2.getF94723a().getF94718a();
            String f94719b = destination2.getF94723a().getF94719b();
            return new AddMoneyWithResultNavigationFlow(new AddMoneyFlowContract$FlowInput(destination2.getF94723a().getD(), destination2.getF94723a().getE(), destination2.getF94723a().getI(), destination2.getF94723a().getF94720c(), f94719b, f94718a, destination2.getF94723a().getF(), destination2.getF94723a().getF94721g(), destination2.getF94723a().getF94722h()));
        }
        if (destination instanceof VaultsKompotFeatureConfig.DocumentsAcceptance.Destination) {
            return new AcceptDocumentsFlow();
        }
        if (destination instanceof VaultsKompotFeatureConfig.WithdrawMoney.Destination) {
            return new WithdrawMoneyFlow(new WithdrawMoneyFlowContract$InputData(((VaultsKompotFeatureConfig.WithdrawMoney.Destination) destination).f94735a));
        }
        if (destination instanceof VaultsKompotFeatureConfig$WithdrawMoneyWithResultNavigation$Destination) {
            return new WithdrawMoneyWithResultNavigationFlow(new WithdrawMoneyFlowContract$InputData(((VaultsKompotFeatureConfig$WithdrawMoneyWithResultNavigation$Destination) destination).getF94736a()));
        }
        if (destination instanceof VaultsKompotFeatureConfig.RecurringTransfer.Destination) {
            VaultsKompotFeatureConfig.RecurringTransfer.Config config = ((VaultsKompotFeatureConfig.RecurringTransfer.Destination) destination).f94731a;
            return new RecurringTransferFlow(new RecurringTransferFlowContract$FlowInput(config.getF94730c(), config.getE(), config.getD(), config.getF94728a(), config.getF(), config.getF94729b()));
        }
        if (destination instanceof VaultsKompotFeatureConfig$SpareChange$Destination) {
            VaultsKompotFeatureConfig$SpareChange$Destination vaultsKompotFeatureConfig$SpareChange$Destination = (VaultsKompotFeatureConfig$SpareChange$Destination) destination;
            return new SpareChangeScreen(new SpareChangeScreenContract$InputData(vaultsKompotFeatureConfig$SpareChange$Destination.getF94732a(), vaultsKompotFeatureConfig$SpareChange$Destination.getF94733b()));
        }
        if (!(destination instanceof VaultTermsViewerDestination)) {
            return null;
        }
        VaultTermsViewerDestination vaultTermsViewerDestination = (VaultTermsViewerDestination) destination;
        String f94698a = vaultTermsViewerDestination.getF94698a();
        Clause f94699b = vaultTermsViewerDestination.getF94699b();
        boolean f94700c = vaultTermsViewerDestination.getF94700c();
        VaultTermsViewerDestination.BottomButton d = vaultTermsViewerDestination.getD();
        return new VaultTermsViewerScreen(new VaultTermsViewerScreenContract$InputData(f94698a, f94699b, f94700c, d != null ? new VaultTermsViewerScreenContract$InputData.BottomButton(d.getF94701a(), d.getF94702b()) : null));
    }
}

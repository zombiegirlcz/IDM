package sz2;

import aii.u;
import com.revolut.feature.card_management.api.CardManagementApi$Toggles;
import com.revolut.feature.card_management.api.CardManagementKompotFeatureConfig;
import com.revolut.feature.card_management.api.replace.CardReplaceDestination;
import com.revolut.feature.card_management.impl.ui.change_pin.ChangePinFlow;
import com.revolut.feature.card_management.impl.ui.change_pin.ChangePinFlowContract$InputData;
import com.revolut.feature.card_management.impl.ui.kompot.RevolutCardSettingsFlow;
import com.revolut.feature.card_management.impl.ui.kompot.RevolutCardSettingsFlowContract$InputData;
import com.revolut.feature.card_management.impl.ui.kompot.RevolutCardSettingsFlowContract$Step;
import com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlow;
import com.revolut.feature.card_management.impl.ui.kompot.replace.flow.CardReplaceFlowContract$InputData;
import dki.g;
import java.util.List;
import jte.d;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f266745a;

    public b(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f266745a = featureToggleInteractor;
    }

    @Override // nte.a
    public final List e() {
        return CardManagementApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof CardReplaceDestination) {
            if (((d) this.f266745a).c(CardManagementApi$Toggles.CardReplaceFlowKompotMigration.f64773c)) {
                return new CardReplaceFlow(new CardReplaceFlowContract$InputData(((CardReplaceDestination) destination).getF64802a()));
            }
            return null;
        }
        if (destination instanceof CardManagementKompotFeatureConfig.SettingsDestination) {
            CardManagementKompotFeatureConfig.SettingsDestination settingsDestination = (CardManagementKompotFeatureConfig.SettingsDestination) destination;
            return new RevolutCardSettingsFlow(new RevolutCardSettingsFlowContract$InputData(new RevolutCardSettingsFlowContract$Step.Settings(settingsDestination.getF64793a(), settingsDestination.getF64794b(), settingsDestination.getF64795c(), settingsDestination.getD())));
        }
        if (destination instanceof CardManagementKompotFeatureConfig.DisposableCardSettingsDestination) {
            CardManagementKompotFeatureConfig.DisposableCardSettingsDestination disposableCardSettingsDestination = (CardManagementKompotFeatureConfig.DisposableCardSettingsDestination) destination;
            return new RevolutCardSettingsFlow(new RevolutCardSettingsFlowContract$InputData(new RevolutCardSettingsFlowContract$Step.DisposableCardSettings(disposableCardSettingsDestination.getF64786a(), disposableCardSettingsDestination.getF64787b())));
        }
        if (destination instanceof CardManagementKompotFeatureConfig.ChangePinDestination) {
            return new ChangePinFlow(new ChangePinFlowContract$InputData.ChangePin(((CardManagementKompotFeatureConfig.ChangePinDestination) destination).getF64785a()));
        }
        if (destination instanceof CardManagementKompotFeatureConfig.ActivatePinDestination) {
            return new ChangePinFlow(new ChangePinFlowContract$InputData.ActivatePin(((CardManagementKompotFeatureConfig.ActivatePinDestination) destination).getF64784a()));
        }
        if (!(destination instanceof CardManagementKompotFeatureConfig.TransactionLimitDestination)) {
            return null;
        }
        CardManagementKompotFeatureConfig.TransactionLimitDestination transactionLimitDestination = (CardManagementKompotFeatureConfig.TransactionLimitDestination) destination;
        return new RevolutCardSettingsFlow(new RevolutCardSettingsFlowContract$InputData(new RevolutCardSettingsFlowContract$Step.SetTransactionLimit(transactionLimitDestination.getF64796a(), transactionLimitDestination.getF64797b(), transactionLimitDestination.getF64798c(), transactionLimitDestination.getD())));
    }
}

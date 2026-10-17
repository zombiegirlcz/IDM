package g66;

import aii.p;
import aii.u;
import com.revolut.feature.defi.settings.api.navigation.DeFiSettingsDestination;
import com.revolut.feature.defi.settings.impl.navigation.DeFiRecoveryPhraseDestination;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.DeFiRecoveryPhraseFlow;
import com.revolut.feature.defi.settings.impl.ui.recovery_phrase.flow.DeFiRecoveryPhraseFlowContract$Input;
import com.revolut.feature.defi.settings.impl.ui.settings.DeFiSettingsScreen;
import com.revolut.feature.defi.settings.impl.ui.settings.DeFiSettingsScreenContract$InputData;
import dki.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements p {
    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof DeFiSettingsDestination) {
            return new DeFiSettingsScreen(new DeFiSettingsScreenContract$InputData(((DeFiSettingsDestination) destination).f71853a));
        }
        if (destination instanceof DeFiRecoveryPhraseDestination) {
            return new DeFiRecoveryPhraseFlow(new DeFiRecoveryPhraseFlowContract$Input(((DeFiRecoveryPhraseDestination) destination).f71864a));
        }
        return null;
    }
}

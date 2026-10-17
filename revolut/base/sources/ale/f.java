package ale;

import aii.u;
import com.revolut.feature.retail.cfd.api.navigation.CfdTradingFeatureConfig$Settings$Destination;
import com.revolut.feature.tab.invest.api.declaration.InvestSettingsDestination;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f extends hih.d {
    @Override // hih.d
    public final boolean Z2(WealthAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action instanceof WealthAction.Settings;
    }

    @Override // hih.d
    public final Object b3(WealthAction wealthAction, Continuation continuation) {
        u investSettingsDestination;
        if (!Z2(wealthAction)) {
            return Unit.f186387a;
        }
        hih.a f95897b = wealthAction.getF95897b();
        switch (f95897b == null ? -1 : e.f6250a[f95897b.ordinal()]) {
            case -1:
                investSettingsDestination = new InvestSettingsDestination(hke.a.ALL_SETTINGS);
                break;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                investSettingsDestination = new InvestSettingsDestination(hke.a.ROBO);
                break;
            case 2:
                investSettingsDestination = CfdTradingFeatureConfig$Settings$Destination.f82155a;
                break;
            case 3:
            case 4:
                investSettingsDestination = new InvestSettingsDestination(hke.a.STOCKS);
                break;
            case 5:
            case 6:
            case 7:
                investSettingsDestination = new InvestSettingsDestination(hke.a.TAA);
                break;
        }
        A2(investSettingsDestination);
        return Unit.f186387a;
    }
}

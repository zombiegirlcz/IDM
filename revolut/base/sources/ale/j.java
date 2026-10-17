package ale;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.wealth.ui.api.actions.WealthAction;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class j extends hih.d {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ybl.k f6257l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final oih.k f6258m;

    public j(ybl.k tradingAccountsInteractor, oih.k wealthTaxAdvantageAccountCommandProvider) {
        Intrinsics.checkNotNullParameter(tradingAccountsInteractor, "tradingAccountsInteractor");
        Intrinsics.checkNotNullParameter(wealthTaxAdvantageAccountCommandProvider, "wealthTaxAdvantageAccountCommandProvider");
        this.f6257l = tradingAccountsInteractor;
        this.f6258m = wealthTaxAdvantageAccountCommandProvider;
    }

    public static FeatureCommand c3() {
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160141b.f83420a, null), null, null, 6)));
    }

    @Override // hih.d
    public final boolean Z2(WealthAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return action instanceof WealthAction.TeenJisaStartOnboarding;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // hih.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b3(com.revolut.feature.wealth.ui.api.actions.WealthAction r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ale.j.b3(com.revolut.feature.wealth.ui.api.actions.WealthAction, kotlin.coroutines.Continuation):java.lang.Object");
    }
}

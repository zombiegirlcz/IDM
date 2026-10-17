package jbb;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.rev10_main_screen.api.MainScreenTab;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import dy0.o;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static FeatureCommand a(MainScreenTab tab2, TabAccountsLaunchConfig tabAccountsLaunchConfig, o oVar, NaviCommand naviCommand, int i) {
        if ((i & 2) != 0) {
            tabAccountsLaunchConfig = null;
        }
        if ((i & 4) != 0) {
            oVar = null;
        }
        if ((i & 8) != 0) {
            naviCommand = null;
        }
        Intrinsics.checkNotNullParameter(tab2, "tab");
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(tab2.f83420a, oVar), tabAccountsLaunchConfig, naviCommand)));
    }
}

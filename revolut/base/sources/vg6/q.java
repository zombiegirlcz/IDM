package vg6;

import com.revolut.feature.external_accounts.api.navigation.ExternalAccountsFeatureConfig;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionData;
import com.revolut.feature.mainscreen.core.api.navigation.action.MainContainerActionId;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerNavigationId;
import com.revolut.feature.retail.main_screen.container.models.action_payload.EgiroLinkedSuccessUsecasePayload;
import com.revolut.feature.tab.accounts.api.model.TabAccountsLaunchConfig;
import com.revolut.feature.tab.accounts.models.ProductAccountDescriptor$Value;
import com.revolut.feature.tab.accounts.models.ProductAccountId;
import com.revolut.feature.tab.accounts.models.ProductId;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class q {
    public static BridgeDestination a(ExternalAccountsFeatureConfig.LinkSuccess.UseCase useCase) {
        Intrinsics.checkNotNullParameter(useCase, "useCase");
        return u0.c(new MainScreenFeatureConfig.WithAction(s49.a.AS_TOP, new MainContainerActionData(new MainContainerActionId("egiroLinkedSuccessUsecasePayload"), new EgiroLinkedSuccessUsecasePayload(useCase))));
    }

    public static BridgeDestination b(NaviCommand naviCommand, String str) {
        NaviCommand[] elements = {new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.AS_TOP, new MainContainerInnerConfiguration(new MainContainerNavigationId.NewMainScreenContainerTabId(ibb.c.f160140a.f83420a, null), new TabAccountsLaunchConfig(str != null ? new ProductAccountDescriptor$Value.Main(new ProductAccountId(str, null), ProductId.LINKED) : null, null), null, 4))), naviCommand};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return u0.b(new CompositeCommand(kotlin.collections.d.L(elements)));
    }
}

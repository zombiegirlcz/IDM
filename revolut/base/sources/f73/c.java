package f73;

import b93.d;
import com.revolut.core.model.account.AccountId;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.CompositeCommand;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import n63.j;

/* JADX INFO: loaded from: classes21.dex */
public final class c implements j {
    public final CompositeCommand c(CardScreenAction action, AccountId accountId) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        FeatureCommand featureCommand = new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277277c, null, null, 6)));
        AccountId.Joint joint = accountId instanceof AccountId.Joint ? (AccountId.Joint) accountId : null;
        return com.revolut.retail.core.navigation.a.c(featureCommand, new FeatureCommand(new CardsScreenFeatureConfig(null, joint != null ? joint.f51413b : null, null, accountId, action, 5)));
    }

    public final CompositeCommand d(CardScreenAction action, AccountId accountId, boolean z, String str) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        if (!z) {
            return c(action, accountId);
        }
        return com.revolut.retail.core.navigation.a.c(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277276b, null, null, 6))), new FeatureCommand(new CardsScreenFeatureConfig(null, str, d.YOUTH, accountId, action, 1)));
    }
}

package mw2;

import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.feature.card_screen.api.navigation.CardsCarouselFlowDestination;
import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.kompot.bridge.navigation.BridgeDestination;
import com.revolut.kompot.bridge.navigation.KompotBridgeFeatureConfig;
import com.revolut.kompot.common.ParcelableDestination;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes21.dex */
public final class g {
    public final BridgeDestination a(String cardId) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        return u0.b(new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(u49.a.f277275a, null, new FeatureCommand(new KompotBridgeFeatureConfig((ActivityAnimation) null, (ParcelableDestination) new CardsCarouselFlowDestination(null, null, null, null, new CardScreenAction.Select(cardId, 6, false, false), null, 47), false, (Integer) null, 0, 61)), 2))));
    }
}

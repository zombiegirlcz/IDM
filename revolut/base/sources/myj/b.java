package myj;

import aii.u;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig;
import com.revolut.feature.learn.shared.api.navigation.LearnKompotFeatureConfig$RewardsHome$Destination;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreen;
import com.revolut.feature.learn.shared.impl.ui.home.LearnHomeScreenContract$InputData;
import com.revolut.retail.feature.learn.api.LearnApi$Toggles;
import com.revolut.retail.feature.learn.impl.ui.glossary.GlossaryHomeScreen;
import com.revolut.retail.feature.learn.impl.ui.glossary.GlossaryHomeScreenContract$InputData;
import com.revolut.retail.feature.learn.impl.ui.rewards.RewardsHomeScreen;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
public final class b implements ohi.a, nte.a {
    @Override // nte.a
    public final List e() {
        return LearnApi$Toggles.a();
    }

    @Override // nhi.f
    public final com.revolut.kompot.navigable.a g(u destination, dki.g flowModel) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(flowModel, "flowModel");
        if (destination instanceof LearnKompotFeatureConfig.Home.Destination) {
            return new LearnHomeScreen(new LearnHomeScreenContract$InputData(((LearnKompotFeatureConfig.Home.Destination) destination).getF77970a()));
        }
        if (destination instanceof LearnKompotFeatureConfig.GlossaryHome.Destination) {
            return new GlossaryHomeScreen(new GlossaryHomeScreenContract$InputData(((LearnKompotFeatureConfig.GlossaryHome.Destination) destination).getF77968a()));
        }
        if (destination instanceof LearnKompotFeatureConfig$RewardsHome$Destination) {
            return new RewardsHomeScreen();
        }
        return null;
    }
}

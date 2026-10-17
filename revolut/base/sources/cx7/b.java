package cx7;

import android.content.Context;
import com.revolut.feature.insurance_pet.api.navigation.PetFeatureConfig;
import com.revolut.feature.insurance_pet.impl.ui.hub.flow.PetHubFlowContract$Configuration;
import com.revolut.feature.insurance_pet.impl.ui.profile.pet.PetProfileContract$Configuration;
import com.revolut.retail.core.navigation.ActivityAnimation;
import com.revolut.retail.core.navigation.ActivityNavigateCommand;
import com.revolut.retail.core.navigation.feature.FeatureConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import n08.c;
import n08.i;
import sri.m;
import vy7.f;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements uri.a {
    @Override // uri.a
    public final boolean b(FeatureConfig config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return config instanceof PetFeatureConfig;
    }

    @Override // uri.a
    public final void c(m navigator, Context context, FeatureConfig featureConfig) {
        ActivityNavigateCommand activityNavigateCommand;
        PetFeatureConfig config = (PetFeatureConfig) featureConfig;
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        if (config instanceof PetFeatureConfig.Entry) {
            ActivityAnimation activityAnimation = ((PetFeatureConfig.Entry) config).f76224a;
            f.Companion.getClass();
            activityNavigateCommand = new ActivityNavigateCommand(vy7.a.f293248b, new PetHubFlowContract$Configuration(false), null, null, 0, null, null, null, activityAnimation, false, 764);
        } else if (config instanceof PetFeatureConfig.Hub) {
            ActivityAnimation activityAnimation2 = ((PetFeatureConfig.Hub) config).f76225a;
            f.Companion.getClass();
            activityNavigateCommand = new ActivityNavigateCommand(vy7.a.f293248b, new PetHubFlowContract$Configuration(true), null, null, 0, null, null, null, activityAnimation2, false, 764);
        } else {
            if (!(config instanceof PetFeatureConfig.Profile)) {
                throw new NoWhenBranchMatchedException();
            }
            String str = ((PetFeatureConfig.Profile) config).f76226a;
            i.Companion.getClass();
            activityNavigateCommand = new ActivityNavigateCommand(c.f210886b, new PetProfileContract$Configuration(str), null, null, 0, null, null, null, null, false, 1020);
        }
        navigator.c(activityNavigateCommand);
    }
}

package b3a;

import com.revolut.feature.mainscreen.api.navigation.MainScreenFeatureConfig;
import com.revolut.feature.mainscreen.core.api.ui.screen.MainContainerInnerConfiguration;
import com.revolut.retail.core.navigation.FeatureCommand;

/* JADX INFO: loaded from: classes5.dex */
public interface a {
    static FeatureCommand a(a aVar) {
        ((v3a.b) aVar).getClass();
        return new FeatureCommand(new MainScreenFeatureConfig.WithInnerConfiguration(s49.a.SINGLE_TOP, new MainContainerInnerConfiguration(t49.a.f267950b, null, null, 4)));
    }
}

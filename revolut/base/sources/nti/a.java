package nti;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airport.security_fast_track.api.navigation.AsftFeatureConfig;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements cti.a {
    public final FeatureCommand a() {
        return new FeatureCommand(new AsftFeatureConfig.Home(null));
    }
}

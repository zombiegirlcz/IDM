package fwi;

import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.airportlounges.api.navigation.AirportLoungesFeatureConfig;
import dwi.x;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class a implements tvi.a {
    public a(x airportLoungesAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(airportLoungesAvailabilityInteractor, "airportLoungesAvailabilityInteractor");
    }

    public final FeatureCommand a() {
        return new FeatureCommand(new AirportLoungesFeatureConfig.Home(null));
    }
}

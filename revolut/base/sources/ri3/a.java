package ri3;

import com.revolut.feature.chooser.external_map.navigation.BottomChooserExternalMapDestination;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.internal.Intrinsics;
import o8b.f;
import vhi.c;

/* JADX INFO: loaded from: classes21.dex */
public final class a implements dj3.a {
    public a(b phoneInteractor, fk3.b configurationRepository, qd0.b languageProvider, f countrySuggestions) {
        Intrinsics.checkNotNullParameter(phoneInteractor, "phoneInteractor");
        Intrinsics.checkNotNullParameter(configurationRepository, "configurationRepository");
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        Intrinsics.checkNotNullParameter(countrySuggestions, "countrySuggestions");
    }

    public final FeatureCommand a(double d, double d5) {
        return c.c(new BottomChooserExternalMapDestination(d, d5), yhi.b.SOLID, null, false, 12);
    }
}

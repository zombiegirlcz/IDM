package efb;

import androidx.webkit.WebViewFeature;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereStations;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f125314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f125315b;

    public j(gte.a featureToggleInteractor, jla.h productCatalogueInteractor, l webViewMultiProfileAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(webViewMultiProfileAvailabilityInteractor, "webViewMultiProfileAvailabilityInteractor");
        this.f125314a = featureToggleInteractor;
        this.f125315b = productCatalogueInteractor;
    }

    public final boolean a() {
        return ((jte.d) this.f125314a).c(ReverywhereApi$Toggles$ReverywhereStations.f82885c) && this.f125315b.d("STATIONS", null) == bla.c.ENABLED && WebViewFeature.isFeatureSupported("MULTI_PROFILE");
    }
}

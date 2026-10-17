package efb;

import androidx.webkit.WebViewFeature;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereAirportTransfers;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f125298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f125299b;

    public a(gte.a featureToggleInteractor, jla.h productCatalogueInteractor, l webViewMultiProfileAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(webViewMultiProfileAvailabilityInteractor, "webViewMultiProfileAvailabilityInteractor");
        this.f125298a = featureToggleInteractor;
        this.f125299b = productCatalogueInteractor;
    }

    public final boolean a() {
        return ((jte.d) this.f125298a).c(ReverywhereApi$Toggles$ReverywhereAirportTransfers.f82878c) && this.f125299b.d("AIRPORT_TRANSFERS", null) == bla.c.ENABLED && WebViewFeature.isFeatureSupported("MULTI_PROFILE");
    }
}

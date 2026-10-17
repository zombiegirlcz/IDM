package efb;

import androidx.webkit.WebViewFeature;
import com.revolut.feature.retail.reverywhere.api.ReverywhereApi$Toggles$ReverywhereLuggageStorage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f125300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jla.h f125301b;

    public b(gte.a featureToggleInteractor, jla.h productCatalogueInteractor, l webViewMultiProfileAvailabilityInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(webViewMultiProfileAvailabilityInteractor, "webViewMultiProfileAvailabilityInteractor");
        this.f125300a = featureToggleInteractor;
        this.f125301b = productCatalogueInteractor;
    }

    public final boolean a() {
        return ((jte.d) this.f125300a).c(ReverywhereApi$Toggles$ReverywhereLuggageStorage.f82880c) && this.f125301b.d("LUGGAGE_STORAGE", null) == bla.c.ENABLED && WebViewFeature.isFeatureSupported("MULTI_PROFILE");
    }
}

package o76;

import com.revolut.feature.derivatives.data.api.DerivativesDataApi$Toggles$Derivatives;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f222731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f222732b;

    public d(gte.a featureToggleInteractor, h productCatalogueInteractor, k76.a derivativesExternalBlocker) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        Intrinsics.checkNotNullParameter(derivativesExternalBlocker, "derivativesExternalBlocker");
        this.f222731a = featureToggleInteractor;
        this.f222732b = productCatalogueInteractor;
    }

    public final boolean a() {
        if (!((jte.d) this.f222731a).c(DerivativesDataApi$Toggles$Derivatives.f71893c)) {
            return false;
        }
        bla.c[] elements = {bla.c.ENABLED, bla.c.INACTIVE};
        Intrinsics.checkNotNullParameter(elements, "elements");
        return kotlin.collections.d.y0(elements).contains(this.f222732b.d("CRYPTO_PERPS", null));
    }
}

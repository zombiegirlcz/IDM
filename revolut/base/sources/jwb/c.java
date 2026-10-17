package jwb;

import com.revolut.feature.rev_points.giftcards.api.RevPointsGiftcardsApi$Toggles;
import jla.h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements svb.a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f178947a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final eub.a f178948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f178949c;

    public c(eub.a revPointsAvailabilityInteractor, gte.a featureToggleInteractor, h productCatalogueInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(revPointsAvailabilityInteractor, "revPointsAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(productCatalogueInteractor, "productCatalogueInteractor");
        this.f178947a = featureToggleInteractor;
        this.f178948b = revPointsAvailabilityInteractor;
        this.f178949c = productCatalogueInteractor;
    }

    public final boolean a() {
        return ((jte.d) this.f178947a).c(RevPointsGiftcardsApi$Toggles.RevPointsGiftCards.f83617c) && (this.f178949c.d("GIFT_CARDS", null) == bla.c.ENABLED) && ((nyb.b) this.f178948b).f();
    }
}

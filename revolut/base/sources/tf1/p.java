package tf1;

import com.revolut.feature.add.new_product.api.AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class p implements of1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f270193a;

    public p(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f270193a = featureToggleInteractor;
    }

    public final boolean a() {
        return ((jte.d) this.f270193a).c(AddNewProductFeatureAvailabilityApi$Toggles$P4URevamp.f60848c);
    }
}

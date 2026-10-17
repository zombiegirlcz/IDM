package d4f;

import com.revolut.feature.wealth.ui.api.WealthUiApi$Toggles;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements vbl.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gte.a f111281a;

    public c(gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f111281a = featureToggleInteractor;
    }

    public final boolean a(vbl.a product) {
        Intrinsics.checkNotNullParameter(product, "product");
        int i = b.f111280a[product.ordinal()];
        gte.a aVar = this.f111281a;
        if (i == 1) {
            return ((jte.d) aVar).c(WealthUiApi$Toggles.StructuredNotes.f95866c);
        }
        if (i == 2) {
            return false;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ((jte.d) aVar).c(WealthUiApi$Toggles.MutualFunds.f95862c);
    }
}

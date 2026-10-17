package tmb;

import com.revolut.feature.shared.savings.models.product.ProductGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductGroup.ExplanationWithLabel f272178a;

    public g(ProductGroup.ExplanationWithLabel explanation) {
        Intrinsics.checkNotNullParameter(explanation, "explanation");
        this.f272178a = explanation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f272178a, ((g) obj2).f272178a);
    }

    public final int hashCode() {
        return this.f272178a.hashCode();
    }
}

package jmb;

import com.revolut.feature.shared.savings.models.product.ProductGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductGroup.Explanation f176513a;

    public c(ProductGroup.Explanation explanation) {
        Intrinsics.checkNotNullParameter(explanation, "explanation");
        this.f176513a = explanation;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f176513a, ((c) obj2).f176513a);
    }

    public final int hashCode() {
        return this.f176513a.hashCode();
    }
}

package zlb;

import com.revolut.feature.shared.savings.models.product.ProductGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductGroup f323213a;

    public d(ProductGroup savingsOption) {
        Intrinsics.checkNotNullParameter(savingsOption, "savingsOption");
        this.f323213a = savingsOption;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f323213a, ((d) obj2).f323213a);
    }

    public final int hashCode() {
        return this.f323213a.hashCode();
    }
}

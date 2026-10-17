package njb;

import com.revolut.feature.shared.savings.models.product.ProductGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ProductGroup.Tax f216444a;

    public k(ProductGroup.Tax tax) {
        Intrinsics.checkNotNullParameter(tax, "tax");
        this.f216444a = tax;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof k) && Intrinsics.f(this.f216444a, ((k) obj2).f216444a);
    }

    public final int hashCode() {
        return this.f216444a.hashCode();
    }
}

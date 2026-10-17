package mqd;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f207981a;

    public g(SavingsProductData savingsProduct) {
        Intrinsics.checkNotNullParameter(savingsProduct, "savingsProduct");
        this.f207981a = savingsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f207981a, ((g) obj2).f207981a);
    }

    public final int hashCode() {
        return this.f207981a.hashCode();
    }
}

package rmb;

import aii.r;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f255218a;

    public b(SavingsProductData productData) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f255218a = productData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f255218a, ((b) obj2).f255218a);
    }

    public final int hashCode() {
        return this.f255218a.hashCode();
    }
}

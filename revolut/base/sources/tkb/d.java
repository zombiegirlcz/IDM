package tkb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f271932a;

    public d(SavingsProductData productData) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f271932a = productData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f271932a, ((d) obj2).f271932a);
    }

    public final int hashCode() {
        return this.f271932a.hashCode();
    }
}

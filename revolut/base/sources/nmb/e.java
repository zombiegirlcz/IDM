package nmb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f217241a;

    public e(SavingsProductData productData) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f217241a = productData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f217241a, ((e) obj2).f217241a);
    }

    public final int hashCode() {
        return this.f217241a.hashCode();
    }
}

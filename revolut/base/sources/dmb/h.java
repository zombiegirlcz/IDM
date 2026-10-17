package dmb;

import aii.r;
import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class h implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f115881a;

    public h(SavingsProductData productData) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f115881a = productData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f115881a, ((h) obj2).f115881a);
    }

    public final int hashCode() {
        return this.f115881a.hashCode();
    }
}

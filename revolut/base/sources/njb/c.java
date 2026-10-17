package njb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f216436a;

    public c(SavingsProductData productData) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f216436a = productData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f216436a, ((c) obj2).f216436a);
    }

    public final int hashCode() {
        return this.f216436a.hashCode();
    }
}

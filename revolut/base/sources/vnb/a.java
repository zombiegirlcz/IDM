package vnb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f290777a;

    public a(SavingsProductData product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f290777a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f290777a, ((a) obj2).f290777a);
    }

    public final int hashCode() {
        return this.f290777a.hashCode();
    }
}

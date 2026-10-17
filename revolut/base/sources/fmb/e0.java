package fmb;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e0 implements f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProduct f136266a;

    public e0(SavingsProduct product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f136266a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f136266a, ((e0) obj2).f136266a);
    }

    public final int hashCode() {
        return this.f136266a.hashCode();
    }
}

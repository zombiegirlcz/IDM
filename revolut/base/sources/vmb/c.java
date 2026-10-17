package vmb;

import cli.j;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProduct f290551a;

    public c(SavingsProduct product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f290551a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && Intrinsics.f(this.f290551a, ((c) obj2).f290551a);
    }

    public final int hashCode() {
        return this.f290551a.hashCode();
    }
}

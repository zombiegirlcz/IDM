package mlb;

import aii.e;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProduct f206663a;

    public a(SavingsProduct savingsProduct) {
        Intrinsics.checkNotNullParameter(savingsProduct, "savingsProduct");
        this.f206663a = savingsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f206663a, ((a) obj2).f206663a);
    }

    public final int hashCode() {
        return this.f206663a.hashCode();
    }
}

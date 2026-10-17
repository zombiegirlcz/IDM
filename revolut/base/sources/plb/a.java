package plb;

import cli.j;
import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProduct f237315a;

    public a(SavingsProduct savingsProduct) {
        Intrinsics.checkNotNullParameter(savingsProduct, "savingsProduct");
        this.f237315a = savingsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f237315a, ((a) obj2).f237315a);
    }

    public final int hashCode() {
        return this.f237315a.hashCode();
    }
}

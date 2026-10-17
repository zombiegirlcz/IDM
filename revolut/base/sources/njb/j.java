package njb;

import com.revolut.feature.shared.savings.models.product.SavingsProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProduct.Deduction f216443a;

    public j(SavingsProduct.Deduction deduction) {
        Intrinsics.checkNotNullParameter(deduction, "deduction");
        this.f216443a = deduction;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f216443a, ((j) obj2).f216443a);
    }

    public final int hashCode() {
        return this.f216443a.hashCode();
    }
}

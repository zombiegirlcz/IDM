package ncd;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f214169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsProductData f214170b;

    public a(SavingsProductData actualProductData, SavingsProductData savingsProductData) {
        Intrinsics.checkNotNullParameter(actualProductData, "actualProductData");
        this.f214169a = actualProductData;
        this.f214170b = savingsProductData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f214169a, aVar.f214169a) && Intrinsics.f(this.f214170b, aVar.f214170b);
    }

    public final int hashCode() {
        int iHashCode = this.f214169a.hashCode() * 31;
        SavingsProductData savingsProductData = this.f214170b;
        return iHashCode + (savingsProductData == null ? 0 : savingsProductData.hashCode());
    }
}

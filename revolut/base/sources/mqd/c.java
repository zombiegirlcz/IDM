package mqd;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f207975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsProductData f207976b;

    public c(SavingsProductData savingsProduct, String jointAccountId) {
        Intrinsics.checkNotNullParameter(jointAccountId, "jointAccountId");
        Intrinsics.checkNotNullParameter(savingsProduct, "savingsProduct");
        this.f207975a = jointAccountId;
        this.f207976b = savingsProduct;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f207975a, cVar.f207975a) && Intrinsics.f(this.f207976b, cVar.f207976b);
    }

    public final int hashCode() {
        return this.f207976b.hashCode() + (this.f207975a.hashCode() * 31);
    }
}

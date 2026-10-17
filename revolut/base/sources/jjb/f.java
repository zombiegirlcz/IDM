package jjb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SavingsProductData f174812a;

    public f(SavingsProductData productData) {
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f174812a = productData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f174812a, ((f) obj2).f174812a);
    }

    public final int hashCode() {
        return this.f174812a.hashCode();
    }
}

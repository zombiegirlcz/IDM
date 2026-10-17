package pmb;

import com.revolut.feature.shared.savings.models.product.SavingsProductData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f237532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SavingsProductData f237533b;

    public e(xi0.b currency, SavingsProductData productData) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(productData, "productData");
        this.f237532a = currency;
        this.f237533b = productData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f237532a, eVar.f237532a) && Intrinsics.f(this.f237533b, eVar.f237533b);
    }

    public final int hashCode() {
        return this.f237533b.hashCode() + (this.f237532a.hashCode() * 31);
    }
}

package izd;

import aii.r;
import com.revolut.feature.statements.api.models.ProductSelection;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f169874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductSelection f169875b;

    public g(Set expandedProducts, ProductSelection productSelection) {
        Intrinsics.checkNotNullParameter(expandedProducts, "expandedProducts");
        Intrinsics.checkNotNullParameter(productSelection, "productSelection");
        this.f169874a = expandedProducts;
        this.f169875b = productSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f169874a, gVar.f169874a) && Intrinsics.f(this.f169875b, gVar.f169875b);
    }

    public final int hashCode() {
        return this.f169875b.hashCode() + (this.f169874a.hashCode() * 31);
    }
}

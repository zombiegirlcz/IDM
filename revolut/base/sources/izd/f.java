package izd;

import cli.j;
import com.revolut.feature.statements.api.models.ProductSelection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class f implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f169871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f169872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProductSelection f169873c;

    public f(List products, Set expandedProducts, ProductSelection productSelection) {
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(expandedProducts, "expandedProducts");
        Intrinsics.checkNotNullParameter(productSelection, "productSelection");
        this.f169871a = products;
        this.f169872b = expandedProducts;
        this.f169873c = productSelection;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f169871a, fVar.f169871a) && Intrinsics.f(this.f169872b, fVar.f169872b) && Intrinsics.f(this.f169873c, fVar.f169873c);
    }

    public final int hashCode() {
        return this.f169873c.hashCode() + p.a.f(this.f169871a.hashCode() * 31, 31, this.f169872b);
    }
}

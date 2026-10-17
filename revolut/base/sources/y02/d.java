package y02;

import com.revolut.feature.apm.core.api.product.ApmProduct;
import com.revolut.feature.tab.accounts.api.model.ProductAccountListAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApmProduct f310102a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductAccountListAction f310103b;

    public d(ApmProduct product, ProductAccountListAction action) {
        Intrinsics.checkNotNullParameter(product, "product");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f310102a = product;
        this.f310103b = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f310102a, dVar.f310102a) && Intrinsics.f(this.f310103b, dVar.f310103b);
    }

    public final int hashCode() {
        return this.f310103b.hashCode() + (this.f310102a.hashCode() * 31);
    }
}

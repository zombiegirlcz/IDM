package he1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class i extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueProduct f151518a;

    public i(CatalogueProduct product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f151518a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && Intrinsics.f(this.f151518a, ((i) obj2).f151518a);
    }

    public final int hashCode() {
        return this.f151518a.hashCode();
    }
}

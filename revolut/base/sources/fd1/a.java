package fd1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueProduct f133855a;

    public a(CatalogueProduct product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f133855a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f133855a, ((a) obj2).f133855a);
    }

    public final int hashCode() {
        return this.f133855a.hashCode();
    }
}

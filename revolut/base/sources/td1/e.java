package td1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends com.revolut.feature.acquiring.lite_pos.impl.ui.flow.catalogue_management.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueProduct f269912a;

    public e(CatalogueProduct product) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f269912a = product;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f269912a, ((e) obj2).f269912a);
    }

    public final int hashCode() {
        return this.f269912a.hashCode();
    }
}

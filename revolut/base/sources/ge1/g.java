package ge1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends com.revolut.feature.acquiring.lite_pos.impl.ui.screen.catalogue.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueProduct f143211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxRate f143212b;

    public g(CatalogueProduct product, TaxRate taxRate) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f143211a = product;
        this.f143212b = taxRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f143211a, gVar.f143211a) && Intrinsics.f(this.f143212b, gVar.f143212b);
    }

    public final int hashCode() {
        int iHashCode = this.f143211a.hashCode() * 31;
        TaxRate taxRate = this.f143212b;
        return iHashCode + (taxRate == null ? 0 : taxRate.hashCode());
    }
}

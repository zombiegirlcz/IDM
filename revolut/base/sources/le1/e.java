package le1;

import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueProduct;
import com.revolut.feature.acquiring.lite_pos.api.model.TaxRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueProduct f194435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaxRate f194436b;

    public e(CatalogueProduct product, TaxRate taxRate) {
        Intrinsics.checkNotNullParameter(product, "product");
        this.f194435a = product;
        this.f194436b = taxRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f194435a, eVar.f194435a) && Intrinsics.f(this.f194436b, eVar.f194436b);
    }

    public final int hashCode() {
        int iHashCode = this.f194435a.hashCode() * 31;
        TaxRate taxRate = this.f194436b;
        return iHashCode + (taxRate == null ? 0 : taxRate.hashCode());
    }
}

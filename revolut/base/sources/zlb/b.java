package zlb;

import com.revolut.data.model.Data;
import com.revolut.feature.shared.savings.models.product.ProductGroup;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f323211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ProductGroup f323212b;

    public b(Data productsData, ProductGroup productGroup) {
        Intrinsics.checkNotNullParameter(productsData, "productsData");
        this.f323211a = productsData;
        this.f323212b = productGroup;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f323211a, bVar.f323211a) && Intrinsics.f(this.f323212b, bVar.f323212b);
    }

    public final int hashCode() {
        int iHashCode = this.f323211a.hashCode() * 31;
        ProductGroup productGroup = this.f323212b;
        return iHashCode + (productGroup == null ? 0 : productGroup.hashCode());
    }
}

package le1;

import com.revolut.data.model.Data;
import com.revolut.feature.acquiring.lite_pos.api.model.CatalogueCategory;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CatalogueCategory f194431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f194432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cd1.e f194433c;
    public final boolean d;
    public final List e;

    public c(CatalogueCategory category, Data products, cd1.e shoppingCart, boolean z, List taxRates) {
        Intrinsics.checkNotNullParameter(category, "category");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(shoppingCart, "shoppingCart");
        Intrinsics.checkNotNullParameter(taxRates, "taxRates");
        this.f194431a = category;
        this.f194432b = products;
        this.f194433c = shoppingCart;
        this.d = z;
        this.e = taxRates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f194431a, cVar.f194431a) && Intrinsics.f(this.f194432b, cVar.f194432b) && Intrinsics.f(this.f194433c, cVar.f194433c) && this.d == cVar.d && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + j6.a.c((this.f194433c.hashCode() + kii.e.c(this.f194432b, this.f194431a.hashCode() * 31, 31)) * 31, 31, this.d);
    }
}

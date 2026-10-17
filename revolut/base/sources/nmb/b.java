package nmb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f217232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f217233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f217234c;
    public final wi0.b d;

    public b(List productsData, List filteredProducts, xi0.b baseCurrency, wi0.b userCountryCode) {
        Intrinsics.checkNotNullParameter(productsData, "productsData");
        Intrinsics.checkNotNullParameter(filteredProducts, "filteredProducts");
        Intrinsics.checkNotNullParameter(baseCurrency, "baseCurrency");
        Intrinsics.checkNotNullParameter(userCountryCode, "userCountryCode");
        this.f217232a = productsData;
        this.f217233b = filteredProducts;
        this.f217234c = baseCurrency;
        this.d = userCountryCode;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f217232a, bVar.f217232a) && Intrinsics.f(this.f217233b, bVar.f217233b) && Intrinsics.f(this.f217234c, bVar.f217234c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.f297794a.hashCode() + h30.l.j(this.f217234c, p.a.d(this.f217232a.hashCode() * 31, 31, this.f217233b), 31);
    }
}

package cd1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f23146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f23147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f23148c;

    public c(List categories, List products, List availableTaxRates) {
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(products, "products");
        Intrinsics.checkNotNullParameter(availableTaxRates, "availableTaxRates");
        this.f23146a = categories;
        this.f23147b = products;
        this.f23148c = availableTaxRates;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f23146a, cVar.f23146a) && Intrinsics.f(this.f23147b, cVar.f23147b) && Intrinsics.f(this.f23148c, cVar.f23148c);
    }

    public final int hashCode() {
        return this.f23148c.hashCode() + p.a.d(this.f23146a.hashCode() * 31, 31, this.f23147b);
    }
}

package t4a;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f267965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f267966b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f267967c;
    public final List d;
    public final Set e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f267968g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f267969h;

    public l(LinkedHashMap filtersWithCount, List suggestedItems, LinkedHashMap searchItems, List extraItems, Set availableFilters, boolean z, List paymentVendors) {
        Intrinsics.checkNotNullParameter(filtersWithCount, "filtersWithCount");
        Intrinsics.checkNotNullParameter(suggestedItems, "suggestedItems");
        Intrinsics.checkNotNullParameter(searchItems, "searchItems");
        Intrinsics.checkNotNullParameter(extraItems, "extraItems");
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(paymentVendors, "paymentVendors");
        this.f267965a = filtersWithCount;
        this.f267966b = suggestedItems;
        this.f267967c = searchItems;
        this.d = extraItems;
        this.e = availableFilters;
        this.f = z;
        this.f267968g = paymentVendors;
        Collection collectionValues = searchItems.values();
        boolean z3 = false;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it8 = collectionValues.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                } else if (!((List) it8.next()).isEmpty()) {
                    z3 = true;
                    break;
                }
            }
        }
        this.f267969h = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f267965a.equals(lVar.f267965a) && Intrinsics.f(this.f267966b, lVar.f267966b) && this.f267967c.equals(lVar.f267967c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && this.f == lVar.f && Intrinsics.f(this.f267968g, lVar.f267968g);
    }

    public final int hashCode() {
        return this.f267968g.hashCode() + j6.a.c(p.a.f(p.a.d(r6.b.e(this.f267967c, p.a.d(this.f267965a.hashCode() * 31, 31, this.f267966b), 31), 31, this.d), 31, this.e), 31, this.f);
    }
}

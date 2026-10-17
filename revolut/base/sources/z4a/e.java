package z4a;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f319358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f319359b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f319360c;
    public final Set d;
    public final boolean e;

    public e(LinkedHashMap filtersWithCount, List suggestedItems, LinkedHashMap searchItems, Set availableFilters) {
        Intrinsics.checkNotNullParameter(filtersWithCount, "filtersWithCount");
        Intrinsics.checkNotNullParameter(suggestedItems, "suggestedItems");
        Intrinsics.checkNotNullParameter(searchItems, "searchItems");
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        this.f319358a = filtersWithCount;
        this.f319359b = suggestedItems;
        this.f319360c = searchItems;
        this.d = availableFilters;
        Collection collectionValues = searchItems.values();
        boolean z = false;
        if (!(collectionValues instanceof Collection) || !collectionValues.isEmpty()) {
            Iterator it8 = collectionValues.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    break;
                } else if (!((List) it8.next()).isEmpty()) {
                    z = true;
                    break;
                }
            }
        }
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f319358a.equals(eVar.f319358a) && Intrinsics.f(this.f319359b, eVar.f319359b) && this.f319360c.equals(eVar.f319360c) && Intrinsics.f(this.d, eVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + r6.b.e(this.f319360c, p.a.d(this.f319358a.hashCode() * 31, 31, this.f319359b), 31);
    }
}

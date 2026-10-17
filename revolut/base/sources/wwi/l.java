package wwi;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f300680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f300681b;

    public l(String searchQuery, List items) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f300680a = searchQuery;
        this.f300681b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f300681b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f300680a, lVar.f300680a) && Intrinsics.f(this.f300681b, lVar.f300681b);
    }

    public final int hashCode() {
        return this.f300681b.hashCode() + (this.f300680a.hashCode() * 31);
    }
}

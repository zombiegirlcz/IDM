package ryj;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f258398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f258399b;

    public h(List tabs, String searchQuery) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        this.f258398a = tabs;
        this.f258399b = searchQuery;
    }

    public static h a(h hVar, ArrayList arrayList, String searchQuery, int i) {
        List tabs = arrayList;
        if ((i & 1) != 0) {
            tabs = hVar.f258398a;
        }
        if ((i & 2) != 0) {
            searchQuery = hVar.f258399b;
        }
        hVar.getClass();
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        return new h(tabs, searchQuery);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f258398a, hVar.f258398a) && Intrinsics.f(this.f258399b, hVar.f258399b);
    }

    public final int hashCode() {
        return this.f258399b.hashCode() + (this.f258398a.hashCode() * 31);
    }
}

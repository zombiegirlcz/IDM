package eaf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class l implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f124238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f124239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f124240c;

    public l(String searchQuery, h navbar, List items) {
        Intrinsics.checkNotNullParameter(searchQuery, "searchQuery");
        Intrinsics.checkNotNullParameter(navbar, "navbar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f124238a = searchQuery;
        this.f124239b = navbar;
        this.f124240c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f124240c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f124238a, lVar.f124238a) && Intrinsics.f(this.f124239b, lVar.f124239b) && Intrinsics.f(this.f124240c, lVar.f124240c);
    }

    public final int hashCode() {
        return this.f124240c.hashCode() + ((this.f124239b.hashCode() + (this.f124238a.hashCode() * 31)) * 31);
    }
}

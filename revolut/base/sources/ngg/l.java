package ngg;

import cli.o;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f215157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f215159c;

    public l(j navigation, String selectedPageItemId, List menuItems) {
        Intrinsics.checkNotNullParameter(navigation, "navigation");
        Intrinsics.checkNotNullParameter(selectedPageItemId, "selectedPageItemId");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f215157a = navigation;
        this.f215158b = selectedPageItemId;
        this.f215159c = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f215157a, lVar.f215157a) && Intrinsics.f(this.f215158b, lVar.f215158b) && Intrinsics.f(this.f215159c, lVar.f215159c);
    }

    public final int hashCode() {
        return this.f215159c.hashCode() + p.a.c(this.f215157a.f215156a.hashCode() * 31, 31, this.f215158b);
    }
}

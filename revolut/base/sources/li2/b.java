package li2;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f195403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f195404b;

    public b(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f195403a = items;
        this.f195404b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f195403a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f195403a, bVar.f195403a) && Intrinsics.f(this.f195404b, bVar.f195404b);
    }

    public final int hashCode() {
        return this.f195404b.hashCode() + (this.f195403a.hashCode() * 31);
    }
}

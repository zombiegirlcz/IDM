package v4a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f286002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f286003b;

    public g(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f286002a = items;
        this.f286003b = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f286002a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f286002a, gVar.f286002a) && Intrinsics.f(this.f286003b, gVar.f286003b);
    }

    public final int hashCode() {
        return this.f286003b.hashCode() + (this.f286002a.hashCode() * 31);
    }
}

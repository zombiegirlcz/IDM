package c9d;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22360b;

    public j(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f22359a = items;
        this.f22360b = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f22359a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f22359a, jVar.f22359a) && Intrinsics.f(this.f22360b, jVar.f22360b);
    }

    public final int hashCode() {
        return this.f22360b.hashCode() + (this.f22359a.hashCode() * 31);
    }
}

package q2e;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f241594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f241595b;

    public k(o headerState, List menuItems) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f241594a = headerState;
        this.f241595b = menuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f241594a, kVar.f241594a) && Intrinsics.f(this.f241595b, kVar.f241595b);
    }

    public final int hashCode() {
        return this.f241595b.hashCode() + (this.f241594a.hashCode() * 31);
    }

    public k() {
        this(n.f241604a, zhm.f0.f322471a);
    }
}

package f9d;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class n implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f132932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f132933b;

    public n(aim.e items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f132932a = items;
        this.f132933b = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f132932a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f132932a, nVar.f132932a) && Intrinsics.f(this.f132933b, nVar.f132933b);
    }

    public final int hashCode() {
        return this.f132933b.hashCode() + (this.f132932a.hashCode() * 31);
    }
}

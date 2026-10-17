package v17;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class n implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f285248a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f285249b;

    public n(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f285248a = items;
        this.f285249b = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f285248a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f285248a, nVar.f285248a) && Intrinsics.f(this.f285249b, nVar.f285249b);
    }

    public final int hashCode() {
        return this.f285249b.hashCode() + (this.f285248a.hashCode() * 31);
    }
}

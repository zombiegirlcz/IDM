package os9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class q implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f229276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f229277b;

    public q(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f229276a = items;
        this.f229277b = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f229276a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f229276a, qVar.f229276a) && Intrinsics.f(this.f229277b, qVar.f229277b);
    }

    public final int hashCode() {
        return this.f229277b.hashCode() + (this.f229276a.hashCode() * 31);
    }
}

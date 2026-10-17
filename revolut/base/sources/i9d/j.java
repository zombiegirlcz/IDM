package i9d;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f159638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f159639b;

    public j(aim.e items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f159638a = items;
        this.f159639b = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f159638a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f159638a, jVar.f159638a) && Intrinsics.f(this.f159639b, jVar.f159639b);
    }

    public final int hashCode() {
        return this.f159639b.hashCode() + (this.f159638a.hashCode() * 31);
    }
}

package pq7;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f238694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f238695b;

    public k(ArrayList items, List menuItems) {
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f238694a = menuItems;
        this.f238695b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f238695b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f238694a, kVar.f238694a) && this.f238695b.equals(kVar.f238695b);
    }

    public final int hashCode() {
        return this.f238695b.hashCode() + (this.f238694a.hashCode() * 31);
    }
}

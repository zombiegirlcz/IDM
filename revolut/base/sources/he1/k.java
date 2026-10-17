package he1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class k implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f151519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f151520b;

    public k(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f151519a = items;
        this.f151520b = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f151519a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f151519a, kVar.f151519a) && Intrinsics.f(this.f151520b, kVar.f151520b);
    }

    public final int hashCode() {
        return this.f151520b.hashCode() + (this.f151519a.hashCode() * 31);
    }
}

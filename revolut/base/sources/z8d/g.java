package z8d;

import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f320074a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f320075b;

    public g(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f320074a = items;
        this.f320075b = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f320074a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f320074a, gVar.f320074a) && Intrinsics.f(this.f320075b, gVar.f320075b);
    }

    public final int hashCode() {
        return this.f320075b.hashCode() + (this.f320074a.hashCode() * 31);
    }
}

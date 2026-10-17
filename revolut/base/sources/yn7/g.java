package yn7;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f315268a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f315269b;

    public g(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f315268a = items;
        this.f315269b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f315268a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f315268a, gVar.f315268a) && Intrinsics.f(this.f315269b, gVar.f315269b);
    }

    public final int hashCode() {
        return this.f315269b.hashCode() + (this.f315268a.hashCode() * 31);
    }
}

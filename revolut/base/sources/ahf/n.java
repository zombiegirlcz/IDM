package ahf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5089b;

    public n(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f5088a = items;
        this.f5089b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f5088a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f5088a, nVar.f5088a) && Intrinsics.f(this.f5089b, nVar.f5089b);
    }

    public final int hashCode() {
        return this.f5089b.hashCode() + (this.f5088a.hashCode() * 31);
    }
}

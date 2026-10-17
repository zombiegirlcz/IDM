package y6g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class n implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f311277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f311278b;

    public n(aim.e items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f311277a = items;
        this.f311278b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f311277a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f311277a, nVar.f311277a) && Intrinsics.f(this.f311278b, nVar.f311278b);
    }

    public final int hashCode() {
        return this.f311278b.hashCode() + (this.f311277a.hashCode() * 31);
    }
}

package wq1;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f299393a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f299394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f299395c;

    public m(aim.e items, List menuItems, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f299393a = items;
        this.f299394b = z;
        this.f299395c = menuItems;
    }

    @Override // jki.n
    public final List c() {
        return this.f299393a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f299393a, mVar.f299393a) && this.f299394b == mVar.f299394b && Intrinsics.f(this.f299395c, mVar.f299395c);
    }

    public final int hashCode() {
        return this.f299395c.hashCode() + j6.a.c(this.f299393a.hashCode() * 31, 31, this.f299394b);
    }
}

package cv6;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f109290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f109291b;

    public m(aim.e items, aim.e menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f109290a = items;
        this.f109291b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f109290a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f109290a, mVar.f109290a) && Intrinsics.f(this.f109291b, mVar.f109291b);
    }

    public final int hashCode() {
        return this.f109291b.hashCode() + (this.f109290a.hashCode() * 31);
    }
}

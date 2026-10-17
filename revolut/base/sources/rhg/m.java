package rhg;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class m implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f254456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f254457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f254458c;

    public m(List items, boolean z, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f254456a = items;
        this.f254457b = menuItems;
        this.f254458c = z;
    }

    @Override // cli.p
    public final List c() {
        return this.f254456a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f254456a, mVar.f254456a) && Intrinsics.f(this.f254457b, mVar.f254457b) && this.f254458c == mVar.f254458c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f254458c) + p.a.d(this.f254456a.hashCode() * 31, 31, this.f254457b);
    }
}

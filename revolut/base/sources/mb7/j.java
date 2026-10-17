package mb7;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f204177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f204178b;

    public j(aim.e menuItems, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f204177a = items;
        this.f204178b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f204177a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f204177a, jVar.f204177a) && Intrinsics.f(this.f204178b, jVar.f204178b);
    }

    public final int hashCode() {
        return this.f204178b.hashCode() + (this.f204177a.hashCode() * 31);
    }
}

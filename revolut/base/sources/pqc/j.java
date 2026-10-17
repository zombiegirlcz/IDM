package pqc;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f238724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f238725b;

    public j(List items, List menuItems) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        this.f238724a = items;
        this.f238725b = menuItems;
    }

    @Override // cli.p
    public final List c() {
        return this.f238724a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f238724a, jVar.f238724a) && Intrinsics.f(this.f238725b, jVar.f238725b);
    }

    public final int hashCode() {
        return this.f238725b.hashCode() + (this.f238724a.hashCode() * 31);
    }
}

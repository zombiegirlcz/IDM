package byi;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f19831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f19832b;

    public g(List navBarMenuItems, List items) {
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f19831a = navBarMenuItems;
        this.f19832b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f19832b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f19831a, gVar.f19831a) && Intrinsics.f(this.f19832b, gVar.f19832b);
    }

    public final int hashCode() {
        return this.f19832b.hashCode() + (this.f19831a.hashCode() * 31);
    }
}

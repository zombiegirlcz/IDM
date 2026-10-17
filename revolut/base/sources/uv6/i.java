package uv6;

import cli.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f283332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f283333b;

    public i(h navBar, List items) {
        Intrinsics.checkNotNullParameter(navBar, "navBar");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f283332a = navBar;
        this.f283333b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f283333b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f283332a, iVar.f283332a) && Intrinsics.f(this.f283333b, iVar.f283333b);
    }

    public final int hashCode() {
        return this.f283333b.hashCode() + (this.f283332a.hashCode() * 31);
    }
}

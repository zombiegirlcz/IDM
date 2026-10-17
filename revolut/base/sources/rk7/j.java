package rk7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f254761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f254762b;

    public j(List items, g navBarState) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f254761a = items;
        this.f254762b = navBarState;
    }

    @Override // jki.n
    public final List c() {
        return this.f254761a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f254761a, jVar.f254761a) && Intrinsics.f(this.f254762b, jVar.f254762b);
    }

    public final int hashCode() {
        return this.f254762b.hashCode() + (this.f254761a.hashCode() * 31);
    }
}

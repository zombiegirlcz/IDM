package m8c;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f203477a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f203478b;

    public m(l navBarState, List items) {
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f203477a = navBarState;
        this.f203478b = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f203478b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f203477a, mVar.f203477a) && Intrinsics.f(this.f203478b, mVar.f203478b);
    }

    public final int hashCode() {
        return this.f203478b.hashCode() + (this.f203477a.hashCode() * 31);
    }
}

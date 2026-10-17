package cv7;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f109309a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f109310b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f109311c;

    public m(List items, k navBarState, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f109309a = items;
        this.f109310b = navBarState;
        this.f109311c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f109309a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f109309a, mVar.f109309a) && this.f109310b.equals(mVar.f109310b) && this.f109311c == mVar.f109311c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f109311c) + ((this.f109310b.hashCode() + (this.f109309a.hashCode() * 31)) * 31);
    }
}

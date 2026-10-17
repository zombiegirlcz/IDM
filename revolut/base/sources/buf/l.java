package buf;

import aw0.j8;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class l implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j8 f18812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f18813c;

    public l(List items, j8 navBarModel, aw0.i actionFooterModel) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(actionFooterModel, "actionFooterModel");
        this.f18811a = items;
        this.f18812b = navBarModel;
        this.f18813c = actionFooterModel;
    }

    @Override // jki.n
    public final List c() {
        return this.f18811a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f18811a, lVar.f18811a) && Intrinsics.f(this.f18812b, lVar.f18812b) && Intrinsics.f(this.f18813c, lVar.f18813c);
    }

    public final int hashCode() {
        return this.f18813c.hashCode() + ((this.f18812b.hashCode() + (this.f18811a.hashCode() * 31)) * 31);
    }
}

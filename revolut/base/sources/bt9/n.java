package bt9;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f18471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f18472b;

    public n(List items, l lVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f18471a = items;
        this.f18472b = lVar;
    }

    @Override // jki.n
    public final List c() {
        return this.f18471a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f18471a, nVar.f18471a) && Intrinsics.f(this.f18472b, nVar.f18472b);
    }

    public final int hashCode() {
        int iHashCode = this.f18471a.hashCode() * 31;
        l lVar = this.f18472b;
        return iHashCode + (lVar == null ? 0 : lVar.hashCode());
    }
}

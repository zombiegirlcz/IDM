package is2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f168086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f168087b;

    public j(List items, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f168086a = items;
        this.f168087b = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f168086a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f168086a, jVar.f168086a) && this.f168087b == jVar.f168087b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f168087b) + (this.f168086a.hashCode() * 31);
    }
}

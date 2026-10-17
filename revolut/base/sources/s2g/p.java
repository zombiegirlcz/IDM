package s2g;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class p implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f259319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f259320b;

    public p(List items, List filters) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(filters, "filters");
        this.f259319a = items;
        this.f259320b = filters;
    }

    @Override // jki.n
    public final List c() {
        return this.f259319a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f259319a, pVar.f259319a) && Intrinsics.f(this.f259320b, pVar.f259320b);
    }

    public final int hashCode() {
        return this.f259320b.hashCode() + (this.f259319a.hashCode() * 31);
    }
}

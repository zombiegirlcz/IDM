package imh;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f162480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xnh.a f162481b;

    public n(Set visibleForProducts, xnh.a aVar) {
        Intrinsics.checkNotNullParameter(visibleForProducts, "visibleForProducts");
        this.f162480a = visibleForProducts;
        this.f162481b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f162480a, nVar.f162480a) && this.f162481b == nVar.f162481b;
    }

    public final int hashCode() {
        int iHashCode = this.f162480a.hashCode() * 31;
        xnh.a aVar = this.f162481b;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}

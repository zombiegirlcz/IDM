package eve;

import kotlin.jvm.internal.Intrinsics;
import yte.n;

/* JADX INFO: loaded from: classes8.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f129779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f129780b;

    public a(String currencyCode, n nVar) {
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        this.f129779a = currencyCode;
        this.f129780b = nVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f129779a, aVar.f129779a) && this.f129780b == aVar.f129780b;
    }

    public final int hashCode() {
        int iHashCode = this.f129779a.hashCode() * 31;
        n nVar = this.f129780b;
        return iHashCode + (nVar == null ? 0 : nVar.hashCode());
    }
}

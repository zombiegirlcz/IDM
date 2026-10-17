package jih;

import kotlin.jvm.internal.Intrinsics;
import vel.d;
import xi0.b;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f174489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f174490b;

    public a(b commodity, d dVar) {
        Intrinsics.checkNotNullParameter(commodity, "commodity");
        this.f174489a = commodity;
        this.f174490b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f174489a, aVar.f174489a) && Intrinsics.f(this.f174490b, aVar.f174490b);
    }

    public final int hashCode() {
        int iHashCode = this.f174489a.hashCode() * 31;
        d dVar = this.f174490b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}

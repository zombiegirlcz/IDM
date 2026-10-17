package u1a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f276371b;

    public g(dj0.d dVar, String linkId) {
        Intrinsics.checkNotNullParameter(linkId, "linkId");
        this.f276370a = linkId;
        this.f276371b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f276370a, gVar.f276370a) && Intrinsics.f(this.f276371b, gVar.f276371b);
    }

    public final int hashCode() {
        int iHashCode = this.f276370a.hashCode() * 31;
        dj0.d dVar = this.f276371b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}

package hx2;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class g implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e93.f f156365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hha.d f156366b;

    public g(e93.f cardDesign, hha.d dVar) {
        Intrinsics.checkNotNullParameter(cardDesign, "cardDesign");
        this.f156365a = cardDesign;
        this.f156366b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f156365a, gVar.f156365a) && Intrinsics.f(this.f156366b, gVar.f156366b);
    }

    public final int hashCode() {
        int iHashCode = this.f156365a.hashCode() * 31;
        hha.d dVar = this.f156366b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}

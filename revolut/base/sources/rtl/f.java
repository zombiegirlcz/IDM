package rtl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f257319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.g f257320b;

    public f(xi0.b currency, io3.g gVar) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f257319a = currency;
        this.f257320b = gVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f257319a, fVar.f257319a) && Intrinsics.f(this.f257320b, fVar.f257320b);
    }

    public final int hashCode() {
        int iHashCode = this.f257319a.hashCode() * 31;
        io3.g gVar = this.f257320b;
        return iHashCode + (gVar == null ? 0 : gVar.hashCode());
    }
}

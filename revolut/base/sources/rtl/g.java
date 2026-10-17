package rtl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f257321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io3.d f257322b;

    public g(io3.d dVar, xi0.b currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f257321a = currency;
        this.f257322b = dVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f257321a, gVar.f257321a) && Intrinsics.f(this.f257322b, gVar.f257322b);
    }

    public final int hashCode() {
        int iHashCode = this.f257321a.hashCode() * 31;
        io3.d dVar = this.f257322b;
        return iHashCode + (dVar == null ? 0 : dVar.hashCode());
    }
}

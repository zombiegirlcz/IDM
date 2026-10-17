package il4;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f162059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f162060b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f162061c;

    public a(b defaultCashback, e eVar, f fVar) {
        Intrinsics.checkNotNullParameter(defaultCashback, "defaultCashback");
        this.f162059a = defaultCashback;
        this.f162060b = eVar;
        this.f162061c = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f162059a, aVar.f162059a) && Intrinsics.f(this.f162060b, aVar.f162060b) && Intrinsics.f(this.f162061c, aVar.f162061c);
    }

    public final int hashCode() {
        int iHashCode = this.f162059a.hashCode() * 31;
        e eVar = this.f162060b;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        f fVar = this.f162061c;
        return iHashCode2 + (fVar != null ? fVar.hashCode() : 0);
    }
}

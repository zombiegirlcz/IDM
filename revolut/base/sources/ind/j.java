package ind;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final fnd.a f162813c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String id10, fnd.a aVar) {
        super(id10);
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f162812b = id10;
        this.f162813c = aVar;
    }

    @Override // ind.x
    public final String a() {
        return this.f162812b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f162812b, jVar.f162812b) && this.f162813c == jVar.f162813c;
    }

    public final int hashCode() {
        int iHashCode = this.f162812b.hashCode() * 31;
        fnd.a aVar = this.f162813c;
        return iHashCode + (aVar == null ? 0 : aVar.hashCode());
    }
}

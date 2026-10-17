package ind;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162810b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f162811c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String id10, String str) {
        super(id10);
        Intrinsics.checkNotNullParameter(id10, "id");
        this.f162810b = id10;
        this.f162811c = str;
    }

    @Override // ind.x
    public final String a() {
        return this.f162810b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f162810b, iVar.f162810b) && Intrinsics.f(this.f162811c, iVar.f162811c);
    }

    public final int hashCode() {
        int iHashCode = this.f162810b.hashCode() * 31;
        String str = this.f162811c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}

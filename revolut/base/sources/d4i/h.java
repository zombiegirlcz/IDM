package d4i;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f111333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f111334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f111335c;
    public final wi0.b d;
    public final boolean e;

    public h() {
        this(false, null, null, null, false, 63);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f111333a == hVar.f111333a && Intrinsics.f(this.f111334b, hVar.f111334b) && Intrinsics.f(this.f111335c, hVar.f111335c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e;
    }

    public final int hashCode() {
        int iHashCode = (this.f111334b.hashCode() + (Boolean.hashCode(this.f111333a) * 31)) * 31;
        xi0.b bVar = this.f111335c;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 961;
        wi0.b bVar2 = this.d;
        return Boolean.hashCode(this.e) + ((iHashCode2 + (bVar2 != null ? bVar2.f297794a.hashCode() : 0)) * 31);
    }

    public h(boolean z, g buySellFieldsArrangement, xi0.b bVar, wi0.b bVar2, boolean z3, int i) {
        z = (i & 1) != 0 ? false : z;
        buySellFieldsArrangement = (i & 2) != 0 ? f.f111332a : buySellFieldsArrangement;
        bVar = (i & 4) != 0 ? null : bVar;
        bVar2 = (i & 16) != 0 ? null : bVar2;
        z3 = (i & 32) != 0 ? false : z3;
        Intrinsics.checkNotNullParameter(buySellFieldsArrangement, "buySellFieldsArrangement");
        this.f111333a = z;
        this.f111334b = buySellFieldsArrangement;
        this.f111335c = bVar;
        this.d = bVar2;
        this.e = z3;
    }
}

package u80;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f278037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f278038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f278039c;

    public g(dj0.d money, e signType, b bVar, int i) {
        signType = (i & 2) != 0 ? e.UNSIGNED : signType;
        Intrinsics.checkNotNullParameter(money, "money");
        Intrinsics.checkNotNullParameter(signType, "signType");
        this.f278037a = money;
        this.f278038b = signType;
        this.f278039c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f278037a, gVar.f278037a) && this.f278038b == gVar.f278038b && this.f278039c == gVar.f278039c;
    }

    public final int hashCode() {
        int iHashCode = (this.f278038b.hashCode() + (this.f278037a.hashCode() * 31)) * 31;
        b bVar = this.f278039c;
        return Boolean.hashCode(false) + ((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31);
    }
}

package ps6;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f239414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f239415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f239416c;

    public k(m totalSales, l lVar, n totalTax) {
        Intrinsics.checkNotNullParameter(totalSales, "totalSales");
        Intrinsics.checkNotNullParameter(totalTax, "totalTax");
        this.f239414a = totalSales;
        this.f239415b = lVar;
        this.f239416c = totalTax;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f239414a, kVar.f239414a) && Intrinsics.f(this.f239415b, kVar.f239415b) && Intrinsics.f(this.f239416c, kVar.f239416c);
    }

    public final int hashCode() {
        int iHashCode = this.f239414a.hashCode() * 31;
        l lVar = this.f239415b;
        return this.f239416c.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31);
    }
}

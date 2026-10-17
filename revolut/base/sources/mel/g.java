package mel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f204747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u f204748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f204749c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BigDecimal f204750g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f204751h;

    public g(u actual, u reference, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, o description) {
        Intrinsics.checkNotNullParameter(actual, "actual");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f204747a = actual;
        this.f204748b = reference;
        this.f204749c = bigDecimal;
        this.d = bigDecimal2;
        this.e = bigDecimal3;
        this.f = bigDecimal4;
        this.f204750g = bigDecimal5;
        this.f204751h = description;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f204747a, gVar.f204747a) && Intrinsics.f(this.f204748b, gVar.f204748b) && Intrinsics.f(this.f204749c, gVar.f204749c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f204750g, gVar.f204750g) && Intrinsics.f(this.f204751h, gVar.f204751h);
    }

    public final int hashCode() {
        int iHashCode = (this.f204748b.hashCode() + (this.f204747a.hashCode() * 31)) * 31;
        BigDecimal bigDecimal = this.f204749c;
        int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.d;
        int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.e;
        int iHashCode4 = (iHashCode3 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.f;
        int iHashCode5 = (iHashCode4 + (bigDecimal4 == null ? 0 : bigDecimal4.hashCode())) * 31;
        BigDecimal bigDecimal5 = this.f204750g;
        return this.f204751h.hashCode() + ((iHashCode5 + (bigDecimal5 != null ? bigDecimal5.hashCode() : 0)) * 31);
    }
}

package ed3;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f124912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f124913b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f124914c;
    public final b d;
    public final String e;
    public final BigDecimal f;

    public a(BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, b creditCardPercentage, String str, BigDecimal bigDecimal4) {
        Intrinsics.checkNotNullParameter(creditCardPercentage, "creditCardPercentage");
        this.f124912a = bigDecimal;
        this.f124913b = bigDecimal2;
        this.f124914c = bigDecimal3;
        this.d = creditCardPercentage;
        this.e = str;
        this.f = bigDecimal4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f124912a, aVar.f124912a) && Intrinsics.f(this.f124913b, aVar.f124913b) && Intrinsics.f(this.f124914c, aVar.f124914c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f124912a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        BigDecimal bigDecimal2 = this.f124913b;
        int iHashCode2 = (iHashCode + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
        BigDecimal bigDecimal3 = this.f124914c;
        int iHashCode3 = (this.d.f124915a.hashCode() + ((iHashCode2 + (bigDecimal3 == null ? 0 : bigDecimal3.hashCode())) * 31)) * 31;
        String str = this.e;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        BigDecimal bigDecimal4 = this.f;
        return iHashCode4 + (bigDecimal4 != null ? bigDecimal4.hashCode() : 0);
    }
}

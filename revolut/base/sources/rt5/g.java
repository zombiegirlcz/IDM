package rt5;

import h30.l;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f257196a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f257197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f257198c;

    public g(BigDecimal rate, xi0.b from, xi0.b to6) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f257196a = from;
        this.f257197b = to6;
        this.f257198c = rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f257196a, gVar.f257196a) && Intrinsics.f(this.f257197b, gVar.f257197b) && Intrinsics.f(this.f257198c, gVar.f257198c);
    }

    public final int hashCode() {
        return this.f257198c.hashCode() + l.j(this.f257197b, this.f257196a.hashCode() * 31, 31);
    }
}

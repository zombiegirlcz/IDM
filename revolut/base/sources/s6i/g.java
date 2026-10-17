package s6i;

import h30.l;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xi0.b f260367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f260368b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f260369c;

    public g(BigDecimal rate, xi0.b sourceCurrency, xi0.b targetCurrency) {
        Intrinsics.checkNotNullParameter(sourceCurrency, "sourceCurrency");
        Intrinsics.checkNotNullParameter(targetCurrency, "targetCurrency");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f260367a = sourceCurrency;
        this.f260368b = targetCurrency;
        this.f260369c = rate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f260367a, gVar.f260367a) && Intrinsics.f(this.f260368b, gVar.f260368b) && Intrinsics.f(this.f260369c, gVar.f260369c);
    }

    public final int hashCode() {
        return this.f260369c.hashCode() + l.j(this.f260368b, this.f260367a.hashCode() * 31, 31);
    }
}

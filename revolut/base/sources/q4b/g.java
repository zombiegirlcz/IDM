package q4b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import nel.n;
import wp5.y;

/* JADX INFO: loaded from: classes6.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f242123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f242124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bfl.g f242125c;
    public final String d;
    public final boolean e;

    public g(bfl.g tradeSide, String portfolioId, BigDecimal quantity, n instrument, boolean z) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        this.f242123a = instrument;
        this.f242124b = quantity;
        this.f242125c = tradeSide;
        this.d = portfolioId;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f242123a, gVar.f242123a) && Intrinsics.f(this.f242124b, gVar.f242124b) && this.f242125c == gVar.f242125c && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + p.a.c(y.b(this.f242125c, t61.a.d(this.f242124b, this.f242123a.hashCode() * 31, 31), 31), 31, this.d);
    }
}

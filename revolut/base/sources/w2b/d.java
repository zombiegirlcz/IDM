package w2b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f294013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f294014b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294015c;
    public final BigDecimal d;
    public final boolean e;

    public d(bfl.g tradeSide, String portfolioId, BigDecimal quantity, n instrument, boolean z) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f294013a = tradeSide;
        this.f294014b = instrument;
        this.f294015c = portfolioId;
        this.d = quantity;
        this.e = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f294013a == dVar.f294013a && Intrinsics.f(this.f294014b, dVar.f294014b) && Intrinsics.f(this.f294015c, dVar.f294015c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + t61.a.d(this.d, p.a.c(a10.b.d(this.f294014b, this.f294013a.hashCode() * 31, 31), 31, this.f294015c), 31);
    }
}

package b2b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f11933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11934c;
    public final BigDecimal d;

    public b(String portfolioId, String positionId, BigDecimal assetQuantity, n instrument) {
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(assetQuantity, "assetQuantity");
        this.f11932a = portfolioId;
        this.f11933b = instrument;
        this.f11934c = positionId;
        this.d = assetQuantity;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f11932a, bVar.f11932a) && Intrinsics.f(this.f11933b, bVar.f11933b) && Intrinsics.f(this.f11934c, bVar.f11934c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(a10.b.d(this.f11933b, this.f11932a.hashCode() * 31, 31), 31, this.f11934c);
    }
}

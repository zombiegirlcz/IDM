package y2b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f310611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f310612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f310613c;
    public final String d;
    public final String e;

    public c(String portfolioId, String positionId, BigDecimal assetQuantity, n instrument) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(assetQuantity, "assetQuantity");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        this.f310611a = instrument;
        this.f310612b = assetQuantity;
        this.f310613c = portfolioId;
        this.d = positionId;
        this.e = instrument.f214596b;
    }

    @Override // y2b.e
    public final String a() {
        return this.d;
    }

    @Override // y2b.e
    public final String b() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f310611a, cVar.f310611a) && Intrinsics.f(this.f310612b, cVar.f310612b) && Intrinsics.f(this.f310613c, cVar.f310613c) && Intrinsics.f(this.d, cVar.d);
    }

    @Override // y2b.e
    public final String g() {
        return this.f310613c;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(t61.a.d(this.f310612b, this.f310611a.hashCode() * 31, 31), 31, this.f310613c);
    }
}

package xdf;

import com.revolut.shared.feature.market_data.models.domain.models.Asset;
import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;
import nel.n;

/* JADX INFO: loaded from: classes8.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f304428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f304429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f304430c;
    public final f d;
    public final BigDecimal e;

    public d(n instrument, b balance, int i, f assetDetails, BigDecimal bigDecimal) {
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(assetDetails, "assetDetails");
        this.f304428a = instrument;
        this.f304429b = balance;
        this.f304430c = i;
        this.d = assetDetails;
        this.e = bigDecimal;
        f8l.c cVar = f8l.c.SECURITY;
        String str = instrument.e;
        xi0.a aVar = xi0.b.Companion;
        String str2 = instrument.f214596b;
        aVar.getClass();
        new Asset(cVar, str, xi0.a.a(str2));
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f304428a, dVar.f304428a) && Intrinsics.f(this.f304429b, dVar.f304429b) && this.f304430c == dVar.f304430c && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.f304432a.hashCode() + j6.a.b(this.f304430c, (this.f304429b.hashCode() + (this.f304428a.hashCode() * 31)) * 31, 31)) * 31;
        BigDecimal bigDecimal = this.e;
        return iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode());
    }
}

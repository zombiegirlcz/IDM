package lgd;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f195090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f195091c;
    public final BigDecimal d;
    public final BigDecimal e;
    public final BigDecimal f;

    public d(String fromAssetId, String fromSymbol, String toSymbol, BigDecimal rate, BigDecimal bigDecimal, BigDecimal bigDecimal2) {
        Intrinsics.checkNotNullParameter(fromAssetId, "fromAssetId");
        Intrinsics.checkNotNullParameter(fromSymbol, "fromSymbol");
        Intrinsics.checkNotNullParameter(toSymbol, "toSymbol");
        Intrinsics.checkNotNullParameter(rate, "rate");
        this.f195089a = fromAssetId;
        this.f195090b = fromSymbol;
        this.f195091c = toSymbol;
        this.d = rate;
        this.e = bigDecimal;
        this.f = bigDecimal2;
    }

    public final BigDecimal a() {
        return this.e;
    }

    public final String b() {
        return this.f195089a;
    }

    public final BigDecimal c() {
        return this.d;
    }

    public final String d() {
        return this.f195091c;
    }

    public final BigDecimal e() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f195089a, dVar.f195089a) && Intrinsics.f(this.f195090b, dVar.f195090b) && Intrinsics.f(this.f195091c, dVar.f195091c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iD = t61.a.d(this.d, p.a.c(p.a.c(this.f195089a.hashCode() * 31, 31, this.f195090b), 31, this.f195091c), 31);
        BigDecimal bigDecimal = this.e;
        int iHashCode = (iD + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
        BigDecimal bigDecimal2 = this.f;
        return iHashCode + (bigDecimal2 != null ? bigDecimal2.hashCode() : 0);
    }
}

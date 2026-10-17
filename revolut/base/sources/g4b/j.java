package g4b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y49.b f140441a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BigDecimal f140442b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BigDecimal f140443c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final nel.n f140444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ej0.b f140445h;
    public final ej0.b i;

    public j(y49.b positionPerformance) {
        Intrinsics.checkNotNullParameter(positionPerformance, "positionPerformance");
        this.f140441a = positionPerformance;
        BigDecimal ZERO = positionPerformance.f310833b.f310842j;
        if (ZERO == null) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
        this.f140442b = ZERO;
        BigDecimal ZERO2 = positionPerformance.f310833b.k;
        if (ZERO2 == null) {
            ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        }
        this.f140443c = ZERO2;
        y49.e eVar = positionPerformance.f310833b;
        this.d = eVar.f;
        this.e = eVar.e;
        this.f = eVar.f310839c;
        nel.n nVar = positionPerformance.f310832a;
        this.f140444g = nVar;
        ej0.b bVar = eVar.i;
        if (bVar == null) {
            BigDecimal ZERO3 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
            bVar = new ej0.b(ZERO3, nVar.i);
        }
        this.f140445h = bVar;
        this.i = positionPerformance.f310833b.f310841h;
    }

    @Override // g4b.k
    public final dj0.d a() {
        return this.d;
    }

    @Override // g4b.k
    public final BigDecimal b() {
        return this.f140443c;
    }

    @Override // g4b.k
    public final dj0.d c() {
        return this.e;
    }

    @Override // g4b.k
    public final dj0.d d() {
        return this.f;
    }

    @Override // g4b.k
    public final ej0.b e() {
        return this.f140445h;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f140441a, ((j) obj2).f140441a);
    }

    @Override // g4b.k
    public final ej0.b f() {
        return this.i;
    }

    public final int hashCode() {
        return this.f140441a.hashCode();
    }

    @Override // g4b.k
    public final nel.n n() {
        return this.f140444g;
    }

    @Override // g4b.k
    public final BigDecimal u() {
        return this.f140442b;
    }
}

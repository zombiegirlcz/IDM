package b4b;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bfl.g f12236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nel.n f12237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12238c;
    public final e2b.a d;
    public final BigDecimal e;
    public final boolean f;

    public p(bfl.g tradeSide, nel.n instrument, String portfolioId, e2b.a orderTypeToShow, BigDecimal targetRate, boolean z) {
        Intrinsics.checkNotNullParameter(tradeSide, "tradeSide");
        Intrinsics.checkNotNullParameter(instrument, "instrument");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(orderTypeToShow, "orderTypeToShow");
        Intrinsics.checkNotNullParameter(targetRate, "targetRate");
        this.f12236a = tradeSide;
        this.f12237b = instrument;
        this.f12238c = portfolioId;
        this.d = orderTypeToShow;
        this.e = targetRate;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f12236a == pVar.f12236a && Intrinsics.f(this.f12237b, pVar.f12237b) && Intrinsics.f(this.f12238c, pVar.f12238c) && this.d == pVar.d && Intrinsics.f(this.e, pVar.e) && this.f == pVar.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + t61.a.d(this.e, (this.d.hashCode() + p.a.c(a10.b.d(this.f12237b, this.f12236a.hashCode() * 31, 31), 31, this.f12238c)) * 31, 31);
    }
}

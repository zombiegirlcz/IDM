package il4;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f162064c;
    public final LocalDate d;
    public final LocalDate e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f162065g;

    public b(String offerId, String cashbackPocketId, LocalDate startDate, LocalDate endDate, LocalDate disbursalDate, String rate, dj0.d earnsCap) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(cashbackPocketId, "cashbackPocketId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(earnsCap, "earnsCap");
        this.f162062a = offerId;
        this.f162063b = cashbackPocketId;
        this.f162064c = startDate;
        this.d = endDate;
        this.e = disbursalDate;
        this.f = rate;
        this.f162065g = earnsCap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f162062a, bVar.f162062a) && Intrinsics.f(this.f162063b, bVar.f162063b) && Intrinsics.f(this.f162064c, bVar.f162064c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f162065g, bVar.f162065g);
    }

    public final int hashCode() {
        return this.f162065g.hashCode() + p.a.c(y.a(y.a(y.a(p.a.c(this.f162062a.hashCode() * 31, 31, this.f162063b), 31, this.f162064c), 31, this.d), 31, this.e), 31, this.f);
    }
}

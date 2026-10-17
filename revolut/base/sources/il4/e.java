package il4;

import ip0.v7;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f162070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f162071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f162072c;
    public final LocalDate d;
    public final LocalDate e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f162073g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f162074h;
    public final dj0.d i;

    public e(String offerId, String cashbackPocketId, LocalDate startDate, LocalDate endDate, LocalDate disbursalDate, String rate, dj0.d earnsCap, int i, dj0.d spendsCap) {
        Intrinsics.checkNotNullParameter(offerId, "offerId");
        Intrinsics.checkNotNullParameter(cashbackPocketId, "cashbackPocketId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(earnsCap, "earnsCap");
        Intrinsics.checkNotNullParameter(spendsCap, "spendsCap");
        this.f162070a = offerId;
        this.f162071b = cashbackPocketId;
        this.f162072c = startDate;
        this.d = endDate;
        this.e = disbursalDate;
        this.f = rate;
        this.f162073g = earnsCap;
        this.f162074h = i;
        this.i = spendsCap;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f162070a, eVar.f162070a) && Intrinsics.f(this.f162071b, eVar.f162071b) && Intrinsics.f(this.f162072c, eVar.f162072c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f162073g, eVar.f162073g) && this.f162074h == eVar.f162074h && Intrinsics.f(this.i, eVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + j6.a.b(this.f162074h, v7.c(p.a.c(y.a(y.a(y.a(p.a.c(this.f162070a.hashCode() * 31, 31, this.f162071b), 31, this.f162072c), 31, this.d), 31, this.e), 31, this.f), 31, this.f162073g), 31);
    }
}

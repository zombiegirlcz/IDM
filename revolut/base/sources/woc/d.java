package woc;

import java.math.BigDecimal;
import k4l.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f298913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f298914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f298915c;
    public final int d;
    public final BigDecimal e;
    public final BigDecimal f;

    public d(dj0.d targetAmount, dj0.d dVar, c0 period, int i, BigDecimal mean, BigDecimal fee2) {
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(mean, "mean");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f298913a = targetAmount;
        this.f298914b = dVar;
        this.f298915c = period;
        this.d = i;
        this.e = mean;
        this.f = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f298913a, dVar.f298913a) && Intrinsics.f(this.f298914b, dVar.f298914b) && this.f298915c == dVar.f298915c && this.d == dVar.d && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f298913a.hashCode() * 31;
        dj0.d dVar = this.f298914b;
        return this.f.hashCode() + t61.a.d(this.e, j6.a.b(this.d, (this.f298915c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31, 31), 31);
    }
}

package woc;

import java.math.BigDecimal;
import k4l.c0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f298909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f298910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f298911c;
    public final int d;
    public final BigDecimal e;
    public final BigDecimal f;

    public a(dj0.d targetAmount, dj0.d dVar, c0 period, int i, BigDecimal mean, BigDecimal fee2) {
        Intrinsics.checkNotNullParameter(targetAmount, "targetAmount");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(mean, "mean");
        Intrinsics.checkNotNullParameter(fee2, "fee");
        this.f298909a = targetAmount;
        this.f298910b = dVar;
        this.f298911c = period;
        this.d = i;
        this.e = mean;
        this.f = fee2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f298909a, aVar.f298909a) && Intrinsics.f(this.f298910b, aVar.f298910b) && this.f298911c == aVar.f298911c && this.d == aVar.d && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f);
    }

    public final int hashCode() {
        int iHashCode = this.f298909a.hashCode() * 31;
        dj0.d dVar = this.f298910b;
        return this.f.hashCode() + t61.a.d(this.e, j6.a.b(this.d, (this.f298911c.hashCode() + ((iHashCode + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31, 31), 31);
    }
}

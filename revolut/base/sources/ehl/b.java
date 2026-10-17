package ehl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f126226c;
    public final ko3.b d;

    public b(String symbol, String ref2, LocalDate paymentDate, ko3.b couponAmount) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(couponAmount, "couponAmount");
        this.f126224a = symbol;
        this.f126225b = ref2;
        this.f126226c = paymentDate;
        this.d = couponAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f126224a, bVar.f126224a) && Intrinsics.f(this.f126225b, bVar.f126225b) && Intrinsics.f(this.f126226c, bVar.f126226c) && Intrinsics.f(this.d, bVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + y.a(p.a.c(this.f126224a.hashCode() * 31, 31, this.f126225b), 31, this.f126226c);
    }
}

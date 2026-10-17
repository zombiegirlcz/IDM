package ehl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f126273c;
    public final LocalDate d;
    public final ko3.b e;
    public final boolean f;

    public o(String symbol, String ref2, LocalDate paymentDate, LocalDate localDate, ko3.b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        this.f126271a = symbol;
        this.f126272b = ref2;
        this.f126273c = paymentDate;
        this.d = localDate;
        this.e = bVar;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f126271a, oVar.f126271a) && Intrinsics.f(this.f126272b, oVar.f126272b) && Intrinsics.f(this.f126273c, oVar.f126273c) && Intrinsics.f(this.d, oVar.d) && Intrinsics.f(this.e, oVar.e) && this.f == oVar.f;
    }

    public final int hashCode() {
        int iA = y.a(p.a.c(this.f126271a.hashCode() * 31, 31, this.f126272b), 31, this.f126273c);
        LocalDate localDate = this.d;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        ko3.b bVar = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }
}

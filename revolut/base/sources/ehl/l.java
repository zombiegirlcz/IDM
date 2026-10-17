package ehl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f126264c;
    public final LocalDate d;
    public final ko3.b e;
    public final boolean f;

    public l(String symbol, String ref2, LocalDate paymentDate, LocalDate localDate, ko3.b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        this.f126262a = symbol;
        this.f126263b = ref2;
        this.f126264c = paymentDate;
        this.d = localDate;
        this.e = bVar;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return Intrinsics.f(this.f126262a, lVar.f126262a) && Intrinsics.f(this.f126263b, lVar.f126263b) && Intrinsics.f(this.f126264c, lVar.f126264c) && Intrinsics.f(this.d, lVar.d) && Intrinsics.f(this.e, lVar.e) && this.f == lVar.f;
    }

    public final int hashCode() {
        int iA = y.a(p.a.c(this.f126262a.hashCode() * 31, 31, this.f126263b), 31, this.f126264c);
        LocalDate localDate = this.d;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        ko3.b bVar = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }
}

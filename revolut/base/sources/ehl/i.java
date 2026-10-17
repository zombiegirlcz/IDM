package ehl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes12.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f126254c;
    public final LocalDate d;
    public final ko3.b e;
    public final boolean f;

    public i(String symbol, String ref2, LocalDate paymentDate, LocalDate localDate, ko3.b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        this.f126252a = symbol;
        this.f126253b = ref2;
        this.f126254c = paymentDate;
        this.d = localDate;
        this.e = bVar;
        this.f = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f126252a, iVar.f126252a) && Intrinsics.f(this.f126253b, iVar.f126253b) && Intrinsics.f(this.f126254c, iVar.f126254c) && Intrinsics.f(this.d, iVar.d) && Intrinsics.f(this.e, iVar.e) && this.f == iVar.f;
    }

    public final int hashCode() {
        int iA = y.a(p.a.c(this.f126252a.hashCode() * 31, 31, this.f126253b), 31, this.f126254c);
        LocalDate localDate = this.d;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        ko3.b bVar = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }
}

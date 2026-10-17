package ehl;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f126283a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f126284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f126285c;
    public final double d;

    public s(String symbol, String ref2, LocalDate localDate, double d) {
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f126283a = symbol;
        this.f126284b = ref2;
        this.f126285c = localDate;
        this.d = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f126283a, sVar.f126283a) && Intrinsics.f(this.f126284b, sVar.f126284b) && Intrinsics.f(this.f126285c, sVar.f126285c) && Double.compare(this.d, sVar.d) == 0;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f126283a.hashCode() * 31, 31, this.f126284b);
        LocalDate localDate = this.f126285c;
        return Double.hashCode(this.d) + ((iC + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }
}

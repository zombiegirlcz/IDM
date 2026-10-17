package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160825c;
    public final String d;
    public final LocalDate e;
    public final double f;

    public x(String eventId, LocalDate effectiveDate, String symbol, String ref2, LocalDate localDate, double d) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f160823a = eventId;
        this.f160824b = effectiveDate;
        this.f160825c = symbol;
        this.d = ref2;
        this.e = localDate;
        this.f = d;
    }

    @Override // iel.i
    public final String b() {
        return this.f160823a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f160823a, xVar.f160823a) && Intrinsics.f(this.f160824b, xVar.f160824b) && Intrinsics.f(this.f160825c, xVar.f160825c) && Intrinsics.f(this.d, xVar.d) && Intrinsics.f(this.e, xVar.e) && Double.compare(this.f, xVar.f) == 0;
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160824b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160825c;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(wp5.y.a(this.f160823a.hashCode() * 31, 31, this.f160824b), 31, this.f160825c), 31, this.d);
        LocalDate localDate = this.e;
        return Double.hashCode(this.f) + ((iC + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

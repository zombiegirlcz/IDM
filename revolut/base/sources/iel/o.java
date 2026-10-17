package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160801c;
    public final String d;
    public final n e;

    public o(String eventId, LocalDate effectiveDate, String symbol, String ref2, n status) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(status, "status");
        this.f160799a = eventId;
        this.f160800b = effectiveDate;
        this.f160801c = symbol;
        this.d = ref2;
        this.e = status;
    }

    @Override // iel.i
    public final String b() {
        return this.f160799a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f160799a, oVar.f160799a) && Intrinsics.f(this.f160800b, oVar.f160800b) && Intrinsics.f(this.f160801c, oVar.f160801c) && Intrinsics.f(this.d, oVar.d) && this.e == oVar.e;
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160800b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160801c;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(wp5.y.a(this.f160799a.hashCode() * 31, 31, this.f160800b), 31, this.f160801c), 31, this.d);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

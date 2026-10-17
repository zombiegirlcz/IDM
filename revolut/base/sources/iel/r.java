package iel;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class r implements a, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160813c;
    public final String d;
    public final List e;

    public r(String eventId, LocalDate effectiveDate, String symbol, String ref2, List details) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f160811a = eventId;
        this.f160812b = effectiveDate;
        this.f160813c = symbol;
        this.d = ref2;
        this.e = details;
    }

    @Override // iel.s
    public final List a() {
        return this.e;
    }

    @Override // iel.i
    public final String b() {
        return this.f160811a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f160811a, rVar.f160811a) && Intrinsics.f(this.f160812b, rVar.f160812b) && Intrinsics.f(this.f160813c, rVar.f160813c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e);
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160812b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160813c;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(wp5.y.a(this.f160811a.hashCode() * 31, 31, this.f160812b), 31, this.f160813c), 31, this.d);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

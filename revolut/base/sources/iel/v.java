package iel;

import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements a, s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160819b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160820c;
    public final String d;
    public final List e;

    public v(String eventId, LocalDate effectiveDate, String symbol, String ref2, List details) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(details, "details");
        this.f160818a = eventId;
        this.f160819b = effectiveDate;
        this.f160820c = symbol;
        this.d = ref2;
        this.e = details;
    }

    @Override // iel.s
    public final List a() {
        return this.e;
    }

    @Override // iel.i
    public final String b() {
        return this.f160818a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f160818a, vVar.f160818a) && Intrinsics.f(this.f160819b, vVar.f160819b) && Intrinsics.f(this.f160820c, vVar.f160820c) && Intrinsics.f(this.d, vVar.d) && Intrinsics.f(this.e, vVar.e);
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160819b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160820c;
    }

    public final int hashCode() {
        return this.e.hashCode() + p.a.c(p.a.c(wp5.y.a(this.f160818a.hashCode() * 31, 31, this.f160819b), 31, this.f160820c), 31, this.d);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

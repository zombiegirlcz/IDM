package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160771c;
    public final String d;

    public b(String eventId, String symbol, String ref2, LocalDate effectiveDate) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        this.f160769a = eventId;
        this.f160770b = effectiveDate;
        this.f160771c = symbol;
        this.d = ref2;
    }

    @Override // iel.i
    public final String b() {
        return this.f160769a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f160769a, bVar.f160769a) && Intrinsics.f(this.f160770b, bVar.f160770b) && Intrinsics.f(this.f160771c, bVar.f160771c) && Intrinsics.f(this.d, bVar.d);
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160770b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160771c;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(wp5.y.a(this.f160769a.hashCode() * 31, 31, this.f160770b), 31, this.f160771c);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

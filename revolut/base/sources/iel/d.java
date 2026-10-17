package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160777c;
    public final String d;
    public final LocalDate e;
    public final dj0.d f;

    public d(String eventId, LocalDate effectiveDate, String symbol, String ref2, LocalDate localDate, dj0.d amount) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f160775a = eventId;
        this.f160776b = effectiveDate;
        this.f160777c = symbol;
        this.d = ref2;
        this.e = localDate;
        this.f = amount;
    }

    @Override // iel.i
    public final String b() {
        return this.f160775a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f160775a, dVar.f160775a) && Intrinsics.f(this.f160776b, dVar.f160776b) && Intrinsics.f(this.f160777c, dVar.f160777c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f);
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160776b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160777c;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(wp5.y.a(this.f160775a.hashCode() * 31, 31, this.f160776b), 31, this.f160777c), 31, this.d);
        LocalDate localDate = this.e;
        return this.f.hashCode() + ((iC + (localDate == null ? 0 : localDate.hashCode())) * 31);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class y implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160828c;
    public final String d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final w f160829g;

    public y(String eventId, LocalDate effectiveDate, String symbol, String ref2, LocalDate localDate, LocalDate paymentDate, w splitRate) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(splitRate, "splitRate");
        this.f160826a = eventId;
        this.f160827b = effectiveDate;
        this.f160828c = symbol;
        this.d = ref2;
        this.e = localDate;
        this.f = paymentDate;
        this.f160829g = splitRate;
    }

    @Override // iel.i
    public final String b() {
        return this.f160826a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f160826a, yVar.f160826a) && Intrinsics.f(this.f160827b, yVar.f160827b) && Intrinsics.f(this.f160828c, yVar.f160828c) && Intrinsics.f(this.d, yVar.d) && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && Intrinsics.f(this.f160829g, yVar.f160829g);
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160827b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160828c;
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(wp5.y.a(this.f160826a.hashCode() * 31, 31, this.f160827b), 31, this.f160828c), 31, this.d);
        LocalDate localDate = this.e;
        return this.f160829g.hashCode() + wp5.y.a((iC + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.f);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

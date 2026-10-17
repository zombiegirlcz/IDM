package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class a0 implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160768c;
    public final String d;
    public final String e;
    public final String f;

    public a0(String eventId, LocalDate effectiveDate, String symbol, String ref2, String oldSymbol, String newSymbol) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(oldSymbol, "oldSymbol");
        Intrinsics.checkNotNullParameter(newSymbol, "newSymbol");
        this.f160766a = eventId;
        this.f160767b = effectiveDate;
        this.f160768c = symbol;
        this.d = ref2;
        this.e = oldSymbol;
        this.f = newSymbol;
    }

    @Override // iel.i
    public final String b() {
        return this.f160766a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f160766a, a0Var.f160766a) && Intrinsics.f(this.f160767b, a0Var.f160767b) && Intrinsics.f(this.f160768c, a0Var.f160768c) && Intrinsics.f(this.d, a0Var.d) && Intrinsics.f(this.e, a0Var.e) && Intrinsics.f(this.f, a0Var.f);
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160767b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160768c;
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(p.a.c(p.a.c(wp5.y.a(this.f160766a.hashCode() * 31, 31, this.f160767b), 31, this.f160768c), 31, this.d), 31, this.e);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

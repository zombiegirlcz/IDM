package pvg;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eel.c f240223a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f240224b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f240225c;
    public final String d;
    public final LocalDate e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f240226g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jo3.b f240227h;
    public int i;

    public u(eel.c timeSpan, String currency, String portfolioId, String str, LocalDate date, String symbol, String ref2, jo3.b amount) {
        Intrinsics.checkNotNullParameter(timeSpan, "timeSpan");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f240223a = timeSpan;
        this.f240224b = currency;
        this.f240225c = portfolioId;
        this.d = str;
        this.e = date;
        this.f = symbol;
        this.f240226g = ref2;
        this.f240227h = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return this.f240223a == uVar.f240223a && Intrinsics.f(this.f240224b, uVar.f240224b) && Intrinsics.f(this.f240225c, uVar.f240225c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && Intrinsics.f(this.f, uVar.f) && Intrinsics.f(this.f240226g, uVar.f240226g) && Intrinsics.f(this.f240227h, uVar.f240227h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f240223a.hashCode() * 31, 31, this.f240224b), 31, this.f240225c);
        String str = this.d;
        return this.f240227h.hashCode() + p.a.c(p.a.c(wp5.y.a((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.f240226g);
    }
}

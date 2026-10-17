package mwg;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDate f209459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f209460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f209461c;
    public final dj0.d d;

    public g(LocalDate date, String symbol, String ref2, dj0.d amount) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f209459a = date;
        this.f209460b = symbol;
        this.f209461c = ref2;
        this.d = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f209459a, gVar.f209459a) && Intrinsics.f(this.f209460b, gVar.f209460b) && Intrinsics.f(this.f209461c, gVar.f209461c) && Intrinsics.f(this.d, gVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f209459a.hashCode() * 31, 31, this.f209460b), 31, this.f209461c);
    }
}

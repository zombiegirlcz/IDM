package i7h;

import java.time.Instant;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f159305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f159306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f159307c;
    public final String d;
    public final String e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f159308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Instant f159309h;
    public final jo3.b i;

    public d(String orderId, String portfolioId, String str, String state, String period, LocalDate startDate, LocalDate nextDate, Instant updatedDate, jo3.b amount) {
        Intrinsics.checkNotNullParameter(orderId, "orderId");
        Intrinsics.checkNotNullParameter(portfolioId, "portfolioId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(period, "period");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(nextDate, "nextDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f159305a = orderId;
        this.f159306b = portfolioId;
        this.f159307c = str;
        this.d = state;
        this.e = period;
        this.f = startDate;
        this.f159308g = nextDate;
        this.f159309h = updatedDate;
        this.i = amount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f159305a, dVar.f159305a) && Intrinsics.f(this.f159306b, dVar.f159306b) && Intrinsics.f(this.f159307c, dVar.f159307c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f159308g, dVar.f159308g) && Intrinsics.f(this.f159309h, dVar.f159309h) && Intrinsics.f(this.i, dVar.i);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f159305a.hashCode() * 31, 31, this.f159306b);
        String str = this.f159307c;
        return this.i.hashCode() + r6.b.c(y.a(y.a(p.a.c(p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.f159308g), 31, this.f159309h);
    }
}

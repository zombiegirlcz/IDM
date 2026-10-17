package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160791c;
    public final String d;
    public final LocalDate e;
    public final dj0.d f;

    public k(String eventId, LocalDate effectiveDate, String symbol, String ref2, LocalDate paymentDate, dj0.d amount) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f160789a = eventId;
        this.f160790b = effectiveDate;
        this.f160791c = symbol;
        this.d = ref2;
        this.e = paymentDate;
        this.f = amount;
    }

    @Override // iel.i
    public final String b() {
        return this.f160789a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f160789a, kVar.f160789a) && Intrinsics.f(this.f160790b, kVar.f160790b) && Intrinsics.f(this.f160791c, kVar.f160791c) && Intrinsics.f(this.d, kVar.d) && Intrinsics.f(this.e, kVar.e) && Intrinsics.f(this.f, kVar.f);
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160790b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160791c;
    }

    public final int hashCode() {
        return this.f.hashCode() + wp5.y.a(p.a.c(p.a.c(wp5.y.a(this.f160789a.hashCode() * 31, 31, this.f160790b), 31, this.f160791c), 31, this.d), 31, this.e);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

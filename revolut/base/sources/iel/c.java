package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160774c;
    public final String d;
    public final LocalDate e;
    public final ej0.b f;

    public c(String eventId, LocalDate effectiveDate, String symbol, String ref2, LocalDate paymentDate, ej0.b couponAmount) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        Intrinsics.checkNotNullParameter(couponAmount, "couponAmount");
        this.f160772a = eventId;
        this.f160773b = effectiveDate;
        this.f160774c = symbol;
        this.d = ref2;
        this.e = paymentDate;
        this.f = couponAmount;
    }

    @Override // iel.i
    public final String b() {
        return this.f160772a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f160772a, cVar.f160772a) && Intrinsics.f(this.f160773b, cVar.f160773b) && Intrinsics.f(this.f160774c, cVar.f160774c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f);
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160773b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160774c;
    }

    public final int hashCode() {
        return this.f.hashCode() + wp5.y.a(p.a.c(p.a.c(wp5.y.a(this.f160772a.hashCode() * 31, 31, this.f160773b), 31, this.f160774c), 31, this.d), 31, this.e);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

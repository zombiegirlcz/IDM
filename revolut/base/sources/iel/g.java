package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160780c;
    public final String d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ej0.b f160781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f160782h;

    public g(String eventId, LocalDate effectiveDate, String symbol, String ref2, LocalDate paymentDate, LocalDate localDate, ej0.b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        this.f160778a = eventId;
        this.f160779b = effectiveDate;
        this.f160780c = symbol;
        this.d = ref2;
        this.e = paymentDate;
        this.f = localDate;
        this.f160781g = bVar;
        this.f160782h = z;
    }

    @Override // iel.i
    public final String b() {
        return this.f160778a;
    }

    @Override // iel.z
    public final LocalDate c() {
        return this.f;
    }

    @Override // iel.z
    public final LocalDate d() {
        return this.e;
    }

    @Override // iel.z
    public final ej0.b e() {
        return this.f160781g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f160778a, gVar.f160778a) && Intrinsics.f(this.f160779b, gVar.f160779b) && Intrinsics.f(this.f160780c, gVar.f160780c) && Intrinsics.f(this.d, gVar.d) && Intrinsics.f(this.e, gVar.e) && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f160781g, gVar.f160781g) && this.f160782h == gVar.f160782h;
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160779b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160780c;
    }

    public final int hashCode() {
        int iA = wp5.y.a(p.a.c(p.a.c(wp5.y.a(this.f160778a.hashCode() * 31, 31, this.f160779b), 31, this.f160780c), 31, this.d), 31, this.e);
        LocalDate localDate = this.f;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        ej0.b bVar = this.f160781g;
        return Boolean.hashCode(this.f160782h) + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

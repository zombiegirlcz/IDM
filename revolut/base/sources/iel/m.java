package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class m implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160795c;
    public final String d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ej0.b f160796g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f160797h;

    public m(String eventId, LocalDate effectiveDate, String symbol, String ref2, LocalDate paymentDate, LocalDate localDate, ej0.b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        this.f160793a = eventId;
        this.f160794b = effectiveDate;
        this.f160795c = symbol;
        this.d = ref2;
        this.e = paymentDate;
        this.f = localDate;
        this.f160796g = bVar;
        this.f160797h = z;
    }

    @Override // iel.i
    public final String b() {
        return this.f160793a;
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
        return this.f160796g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f160793a, mVar.f160793a) && Intrinsics.f(this.f160794b, mVar.f160794b) && Intrinsics.f(this.f160795c, mVar.f160795c) && Intrinsics.f(this.d, mVar.d) && Intrinsics.f(this.e, mVar.e) && Intrinsics.f(this.f, mVar.f) && Intrinsics.f(this.f160796g, mVar.f160796g) && this.f160797h == mVar.f160797h;
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160794b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160795c;
    }

    public final int hashCode() {
        int iA = wp5.y.a(p.a.c(p.a.c(wp5.y.a(this.f160793a.hashCode() * 31, 31, this.f160794b), 31, this.f160795c), 31, this.d), 31, this.e);
        LocalDate localDate = this.f;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        ej0.b bVar = this.f160796g;
        return Boolean.hashCode(this.f160797h) + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

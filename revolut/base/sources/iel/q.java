package iel;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f160806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f160807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f160808c;
    public final String d;
    public final LocalDate e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ej0.b f160809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f160810h;

    public q(String eventId, LocalDate effectiveDate, String symbol, String ref2, LocalDate paymentDate, LocalDate localDate, ej0.b bVar, boolean z) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        Intrinsics.checkNotNullParameter(symbol, "symbol");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(paymentDate, "paymentDate");
        this.f160806a = eventId;
        this.f160807b = effectiveDate;
        this.f160808c = symbol;
        this.d = ref2;
        this.e = paymentDate;
        this.f = localDate;
        this.f160809g = bVar;
        this.f160810h = z;
    }

    @Override // iel.i
    public final String b() {
        return this.f160806a;
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
        return this.f160809g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f160806a, qVar.f160806a) && Intrinsics.f(this.f160807b, qVar.f160807b) && Intrinsics.f(this.f160808c, qVar.f160808c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e) && Intrinsics.f(this.f, qVar.f) && Intrinsics.f(this.f160809g, qVar.f160809g) && this.f160810h == qVar.f160810h;
    }

    @Override // iel.i
    public final LocalDate f() {
        return this.f160807b;
    }

    @Override // iel.a
    public final String getSymbol() {
        return this.f160808c;
    }

    public final int hashCode() {
        int iA = wp5.y.a(p.a.c(p.a.c(wp5.y.a(this.f160806a.hashCode() * 31, 31, this.f160807b), 31, this.f160808c), 31, this.d), 31, this.e);
        LocalDate localDate = this.f;
        int iHashCode = (iA + (localDate == null ? 0 : localDate.hashCode())) * 31;
        ej0.b bVar = this.f160809g;
        return Boolean.hashCode(this.f160810h) + ((iHashCode + (bVar != null ? bVar.hashCode() : 0)) * 31);
    }

    @Override // iel.a
    public final String i() {
        return this.d;
    }
}

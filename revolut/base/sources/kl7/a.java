package kl7;

import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f185287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f185288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f185289c;
    public final boolean d;
    public final boolean e;

    public a(dj0.d dVar, String quoteId, LocalDate effectiveDate, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(quoteId, "quoteId");
        Intrinsics.checkNotNullParameter(effectiveDate, "effectiveDate");
        this.f185287a = quoteId;
        this.f185288b = effectiveDate;
        this.f185289c = dVar;
        this.d = z;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f185287a, aVar.f185287a) && Intrinsics.f(this.f185288b, aVar.f185288b) && Intrinsics.f(this.f185289c, aVar.f185289c) && this.d == aVar.d && this.e == aVar.e;
    }

    public final int hashCode() {
        int iA = wp5.y.a(this.f185287a.hashCode() * 31, 31, this.f185288b);
        dj0.d dVar = this.f185289c;
        return Boolean.hashCode(this.e) + j6.a.c((iA + (dVar == null ? 0 : dVar.hashCode())) * 31, 31, this.d);
    }
}

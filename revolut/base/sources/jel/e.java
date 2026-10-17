package jel;

import java.math.BigDecimal;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173436a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f173437b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f173438c;
    public final f d;

    public e(BigDecimal bigDecimal, g gVar, LocalDate localDate, f fVar) {
        this.f173436a = bigDecimal;
        this.f173437b = gVar;
        this.f173438c = localDate;
        this.d = fVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f173436a, eVar.f173436a) && this.f173437b == eVar.f173437b && Intrinsics.f(this.f173438c, eVar.f173438c) && this.d == eVar.d;
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f173436a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        g gVar = this.f173437b;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        LocalDate localDate = this.f173438c;
        int iHashCode3 = (iHashCode2 + (localDate == null ? 0 : localDate.hashCode())) * 31;
        f fVar = this.d;
        return iHashCode3 + (fVar != null ? fVar.hashCode() : 0);
    }
}

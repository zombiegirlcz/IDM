package q35;

import ip0.v7;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f241826a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f241827b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f241828c;
    public final LocalDateTime d;
    public final LocalDate e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f241829g;

    public j(String id10, i iVar, LocalDate repaymentDate, LocalDateTime localDateTime, LocalDate localDate, dj0.d amount, dj0.d principal) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(repaymentDate, "repaymentDate");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(principal, "principal");
        this.f241826a = id10;
        this.f241827b = iVar;
        this.f241828c = repaymentDate;
        this.d = localDateTime;
        this.e = localDate;
        this.f = amount;
        this.f241829g = principal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f241826a, jVar.f241826a) && this.f241827b == jVar.f241827b && Intrinsics.f(this.f241828c, jVar.f241828c) && Intrinsics.f(this.d, jVar.d) && Intrinsics.f(this.e, jVar.e) && Intrinsics.f(this.f, jVar.f) && Intrinsics.f(this.f241829g, jVar.f241829g);
    }

    public final int hashCode() {
        int iHashCode = this.f241826a.hashCode() * 31;
        i iVar = this.f241827b;
        int iA = wp5.y.a((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.f241828c);
        LocalDateTime localDateTime = this.d;
        int iHashCode2 = (iA + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31;
        LocalDate localDate = this.e;
        return this.f241829g.hashCode() + v7.c((iHashCode2 + (localDate != null ? localDate.hashCode() : 0)) * 31, 31, this.f);
    }
}

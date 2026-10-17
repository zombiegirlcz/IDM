package nb8;

import ip0.v7;
import java.time.Instant;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f214006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f214007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f214008c;
    public final Instant d;
    public final e e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f214009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final d f214010h;
    public final c i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f214011j;
    public final a k;

    public b(String standingOrderId, f state, Instant createdDate, Instant updatedDate, e eVar, LocalDate startDate, LocalDate nextDate, d originator, c beneficiary, dj0.d amount, a aVar) {
        Intrinsics.checkNotNullParameter(standingOrderId, "standingOrderId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(nextDate, "nextDate");
        Intrinsics.checkNotNullParameter(originator, "originator");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f214006a = standingOrderId;
        this.f214007b = state;
        this.f214008c = createdDate;
        this.d = updatedDate;
        this.e = eVar;
        this.f = startDate;
        this.f214009g = nextDate;
        this.f214010h = originator;
        this.i = beneficiary;
        this.f214011j = amount;
        this.k = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f214006a, bVar.f214006a) && this.f214007b == bVar.f214007b && Intrinsics.f(this.f214008c, bVar.f214008c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && Intrinsics.f(this.f, bVar.f) && Intrinsics.f(this.f214009g, bVar.f214009g) && Intrinsics.f(this.f214010h, bVar.f214010h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f214011j, bVar.f214011j) && this.k == bVar.k;
    }

    public final int hashCode() {
        int iC = r6.b.c(r6.b.c((this.f214007b.hashCode() + (this.f214006a.hashCode() * 31)) * 31, 31, this.f214008c), 31, this.d);
        e eVar = this.e;
        int iC2 = v7.c(p.a.c((this.f214010h.hashCode() + y.a(y.a((iC + (eVar == null ? 0 : eVar.hashCode())) * 31, 31, this.f), 31, this.f214009g)) * 31, 31, this.i.f214012a), 31, this.f214011j);
        a aVar = this.k;
        return iC2 + (aVar != null ? aVar.hashCode() : 0);
    }
}

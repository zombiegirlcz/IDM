package ql4;

import java.time.Instant;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f247195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f247196c;
    public final int d;
    public final w e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f247197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LocalDate f247198h;

    public y(String id10, t state, Instant createdAt, int i, w schedule, String transactionId, j repaymentMethod, LocalDate localDate) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(schedule, "schedule");
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(repaymentMethod, "repaymentMethod");
        this.f247194a = id10;
        this.f247195b = state;
        this.f247196c = createdAt;
        this.d = i;
        this.e = schedule;
        this.f = transactionId;
        this.f247197g = repaymentMethod;
        this.f247198h = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof y)) {
            return false;
        }
        y yVar = (y) obj2;
        return Intrinsics.f(this.f247194a, yVar.f247194a) && this.f247195b == yVar.f247195b && Intrinsics.f(this.f247196c, yVar.f247196c) && this.d == yVar.d && Intrinsics.f(this.e, yVar.e) && Intrinsics.f(this.f, yVar.f) && this.f247197g == yVar.f247197g && Intrinsics.f(this.f247198h, yVar.f247198h);
    }

    public final int hashCode() {
        int iHashCode = (this.f247197g.hashCode() + p.a.c((this.e.hashCode() + j6.a.b(this.d, r6.b.c((this.f247195b.hashCode() + (this.f247194a.hashCode() * 31)) * 31, 31, this.f247196c), 31)) * 31, 31, this.f)) * 31;
        LocalDate localDate = this.f247198h;
        return iHashCode + (localDate == null ? 0 : localDate.hashCode());
    }
}

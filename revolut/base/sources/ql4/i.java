package ql4;

import ip0.v7;
import java.time.Instant;
import java.time.LocalDate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f247128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f247129c;
    public final int d;
    public final int e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f247130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final t f247131h;
    public final l i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final q0 f247132j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final LocalDate f247133l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final h f247134m;

    public i(String facilityId, String planId, Instant createdAt, int i, int i2, dj0.d principalAmount, dj0.d remainingTotalAmount, t state, l lVar, q0 type, dj0.d dVar, LocalDate localDate, h transactionsContent) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(principalAmount, "principalAmount");
        Intrinsics.checkNotNullParameter(remainingTotalAmount, "remainingTotalAmount");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(transactionsContent, "transactionsContent");
        this.f247127a = facilityId;
        this.f247128b = planId;
        this.f247129c = createdAt;
        this.d = i;
        this.e = i2;
        this.f = principalAmount;
        this.f247130g = remainingTotalAmount;
        this.f247131h = state;
        this.i = lVar;
        this.f247132j = type;
        this.k = dVar;
        this.f247133l = localDate;
        this.f247134m = transactionsContent;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f247127a, iVar.f247127a) && Intrinsics.f(this.f247128b, iVar.f247128b) && Intrinsics.f(this.f247129c, iVar.f247129c) && this.d == iVar.d && this.e == iVar.e && Intrinsics.f(this.f, iVar.f) && Intrinsics.f(this.f247130g, iVar.f247130g) && this.f247131h == iVar.f247131h && Intrinsics.f(this.i, iVar.i) && this.f247132j == iVar.f247132j && Intrinsics.f(this.k, iVar.k) && Intrinsics.f(this.f247133l, iVar.f247133l) && Intrinsics.f(this.f247134m, iVar.f247134m);
    }

    public final int hashCode() {
        int iHashCode = (this.f247131h.hashCode() + v7.c(v7.c(j6.a.b(this.e, j6.a.b(this.d, r6.b.c(p.a.c(this.f247127a.hashCode() * 31, 31, this.f247128b), 31, this.f247129c), 31), 31), 31, this.f), 31, this.f247130g)) * 31;
        l lVar = this.i;
        int iHashCode2 = (this.f247132j.hashCode() + ((iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31;
        dj0.d dVar = this.k;
        int iHashCode3 = (iHashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalDate localDate = this.f247133l;
        return this.f247134m.hashCode() + ((iHashCode3 + (localDate != null ? localDate.hashCode() : 0)) * 31);
    }
}

package ql4;

import ip0.v7;
import java.time.Instant;
import java.time.LocalDate;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f247137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f247138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f247139c;
    public final t d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final dj0.d f247140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f247141h;
    public final dj0.d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final LocalDate f247142j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final l f247143l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final q0 f247144m;

    public k(String id10, String facilityId, Instant createdAt, t state, int i, int i2, dj0.d principalAmount, dj0.d remainingTotalAmount, dj0.d dVar, LocalDate localDate, List transactionIds, l lVar, q0 type) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(principalAmount, "principalAmount");
        Intrinsics.checkNotNullParameter(remainingTotalAmount, "remainingTotalAmount");
        Intrinsics.checkNotNullParameter(transactionIds, "transactionIds");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f247137a = id10;
        this.f247138b = facilityId;
        this.f247139c = createdAt;
        this.d = state;
        this.e = i;
        this.f = i2;
        this.f247140g = principalAmount;
        this.f247141h = remainingTotalAmount;
        this.i = dVar;
        this.f247142j = localDate;
        this.k = transactionIds;
        this.f247143l = lVar;
        this.f247144m = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f247137a, kVar.f247137a) && Intrinsics.f(this.f247138b, kVar.f247138b) && Intrinsics.f(this.f247139c, kVar.f247139c) && this.d == kVar.d && this.e == kVar.e && this.f == kVar.f && Intrinsics.f(this.f247140g, kVar.f247140g) && Intrinsics.f(this.f247141h, kVar.f247141h) && Intrinsics.f(this.i, kVar.i) && Intrinsics.f(this.f247142j, kVar.f247142j) && Intrinsics.f(this.k, kVar.k) && Intrinsics.f(this.f247143l, kVar.f247143l) && this.f247144m == kVar.f247144m;
    }

    public final int hashCode() {
        int iC = v7.c(v7.c(j6.a.b(this.f, j6.a.b(this.e, (this.d.hashCode() + r6.b.c(p.a.c(this.f247137a.hashCode() * 31, 31, this.f247138b), 31, this.f247139c)) * 31, 31), 31), 31, this.f247140g), 31, this.f247141h);
        dj0.d dVar = this.i;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        LocalDate localDate = this.f247142j;
        int iD = p.a.d((iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31, 31, this.k);
        l lVar = this.f247143l;
        return this.f247144m.hashCode() + ((iD + (lVar != null ? lVar.hashCode() : 0)) * 31);
    }
}

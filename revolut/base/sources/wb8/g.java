package wb8;

import ip0.v7;
import java.time.Instant;
import java.time.LocalDate;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@mlm.g
public final class g {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Lazy[] f296050l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f296051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f296052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Instant f296053c;
    public final Instant d;
    public final k e;
    public final LocalDate f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f296054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f296055h;
    public final d i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f296056j;
    public final a k;

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f296050l = new Lazy[]{null, yhm.j.c(kVar, new wal.f(1)), null, null, yhm.j.c(kVar, new wal.f(2)), null, null, null, null, null, yhm.j.c(kVar, new wal.f(3))};
    }

    public /* synthetic */ g(int i, String str, l lVar, Instant instant, Instant instant2, k kVar, LocalDate localDate, LocalDate localDate2, j jVar, d dVar, dj0.d dVar2, a aVar) {
        if (2047 != (i & 2047)) {
            j1.f(e.f296049a.getDescriptor(), i, 2047);
            throw null;
        }
        this.f296051a = str;
        this.f296052b = lVar;
        this.f296053c = instant;
        this.d = instant2;
        this.e = kVar;
        this.f = localDate;
        this.f296054g = localDate2;
        this.f296055h = jVar;
        this.i = dVar;
        this.f296056j = dVar2;
        this.k = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f296051a, gVar.f296051a) && this.f296052b == gVar.f296052b && Intrinsics.f(this.f296053c, gVar.f296053c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && Intrinsics.f(this.f, gVar.f) && Intrinsics.f(this.f296054g, gVar.f296054g) && Intrinsics.f(this.f296055h, gVar.f296055h) && Intrinsics.f(this.i, gVar.i) && Intrinsics.f(this.f296056j, gVar.f296056j) && this.k == gVar.k;
    }

    public final int hashCode() {
        int iC = r6.b.c(r6.b.c((this.f296052b.hashCode() + (this.f296051a.hashCode() * 31)) * 31, 31, this.f296053c), 31, this.d);
        k kVar = this.e;
        int iC2 = v7.c(p.a.c((this.f296055h.hashCode() + y.a(y.a((iC + (kVar == null ? 0 : kVar.hashCode())) * 31, 31, this.f), 31, this.f296054g)) * 31, 31, this.i.f296048a), 31, this.f296056j);
        a aVar = this.k;
        return iC2 + (aVar != null ? aVar.hashCode() : 0);
    }

    public g(String standingOrderId, l state, Instant createdDate, Instant updatedDate, k kVar, LocalDate startDate, LocalDate nextDate, j originator, d beneficiary, dj0.d amount, a aVar) {
        Intrinsics.checkNotNullParameter(standingOrderId, "standingOrderId");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(createdDate, "createdDate");
        Intrinsics.checkNotNullParameter(updatedDate, "updatedDate");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(nextDate, "nextDate");
        Intrinsics.checkNotNullParameter(originator, "originator");
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(amount, "amount");
        this.f296051a = standingOrderId;
        this.f296052b = state;
        this.f296053c = createdDate;
        this.d = updatedDate;
        this.e = kVar;
        this.f = startDate;
        this.f296054g = nextDate;
        this.f296055h = originator;
        this.i = beneficiary;
        this.f296056j = amount;
        this.k = aVar;
    }
}

package jq4;

import ip0.v7;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;
import zhm.f0;

/* JADX INFO: loaded from: classes22.dex */
public final class c implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177413a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f177414b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f177415c;
    public final LocalDate d;
    public final LocalDate e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f177416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f177417h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f177418j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f177419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final whf.p f177420m;

    public c(String facilityId, dj0.d balance, LocalDate startDate, LocalDate endDate, LocalDate currentDate, Set pocketIds, LocalDate nextDisbursalDate, dj0.d nextDisbursalReward, LocalDate disbursalDate, String rate, dj0.d earnsCap, whf.p transactions) {
        f0 slots = f0.f322471a;
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        Intrinsics.checkNotNullParameter(nextDisbursalDate, "nextDisbursalDate");
        Intrinsics.checkNotNullParameter(nextDisbursalReward, "nextDisbursalReward");
        Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
        Intrinsics.checkNotNullParameter(slots, "slots");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(earnsCap, "earnsCap");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f177413a = facilityId;
        this.f177414b = balance;
        this.f177415c = startDate;
        this.d = endDate;
        this.e = currentDate;
        this.f = pocketIds;
        this.f177416g = nextDisbursalDate;
        this.f177417h = nextDisbursalReward;
        this.i = disbursalDate;
        this.f177418j = slots;
        this.k = rate;
        this.f177419l = earnsCap;
        this.f177420m = transactions;
    }

    @Override // jq4.g
    public final Set a() {
        return this.f;
    }

    @Override // jq4.g
    public final dj0.d b() {
        return this.f177417h;
    }

    @Override // jq4.g
    public final whf.p c() {
        return this.f177420m;
    }

    @Override // jq4.g
    public final LocalDate d() {
        return this.f177416g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f177413a, cVar.f177413a) && Intrinsics.f(this.f177414b, cVar.f177414b) && Intrinsics.f(this.f177415c, cVar.f177415c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e) && Intrinsics.f(this.f, cVar.f) && Intrinsics.f(this.f177416g, cVar.f177416g) && Intrinsics.f(this.f177417h, cVar.f177417h) && Intrinsics.f(this.i, cVar.i) && Intrinsics.f(this.f177418j, cVar.f177418j) && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f177419l, cVar.f177419l) && Intrinsics.f(this.f177420m, cVar.f177420m);
    }

    @Override // jq4.g
    public final dj0.d getBalance() {
        return this.f177414b;
    }

    public final int hashCode() {
        return this.f177420m.hashCode() + v7.c(p.a.c(p.a.d(y.a(v7.c(y.a(p.a.f(y.a(y.a(y.a(v7.c(this.f177413a.hashCode() * 31, 31, this.f177414b), 31, this.f177415c), 31, this.d), 31, this.e), 31, this.f), 31, this.f177416g), 31, this.f177417h), 31, this.i), 31, this.f177418j), 31, this.k), 31, this.f177419l);
    }
}

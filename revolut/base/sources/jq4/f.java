package jq4;

import ip0.v7;
import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f177441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f177442c;
    public final LocalDate d;
    public final LocalDate e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f177443g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f177444h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f177445j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final String f177446l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final dj0.d f177447m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final dj0.d f177448n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whf.p f177449p;

    public f(String facilityId, dj0.d balance, LocalDate startDate, LocalDate endDate, LocalDate currentDate, Set pocketIds, LocalDate nextDisbursalDate, dj0.d nextDisbursalReward, LocalDate disbursalDate, String categoryRate, String promoRate, String defaultRate, dj0.d categoryEarnsCap, dj0.d promoEarnsCap, boolean z, whf.p transactions) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        Intrinsics.checkNotNullParameter(nextDisbursalDate, "nextDisbursalDate");
        Intrinsics.checkNotNullParameter(nextDisbursalReward, "nextDisbursalReward");
        Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
        Intrinsics.checkNotNullParameter(categoryRate, "categoryRate");
        Intrinsics.checkNotNullParameter(promoRate, "promoRate");
        Intrinsics.checkNotNullParameter(defaultRate, "defaultRate");
        Intrinsics.checkNotNullParameter(categoryEarnsCap, "categoryEarnsCap");
        Intrinsics.checkNotNullParameter(promoEarnsCap, "promoEarnsCap");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f177440a = facilityId;
        this.f177441b = balance;
        this.f177442c = startDate;
        this.d = endDate;
        this.e = currentDate;
        this.f = pocketIds;
        this.f177443g = nextDisbursalDate;
        this.f177444h = nextDisbursalReward;
        this.i = disbursalDate;
        this.f177445j = categoryRate;
        this.k = promoRate;
        this.f177446l = defaultRate;
        this.f177447m = categoryEarnsCap;
        this.f177448n = promoEarnsCap;
        this.o = z;
        this.f177449p = transactions;
    }

    @Override // jq4.g
    public final Set a() {
        return this.f;
    }

    @Override // jq4.g
    public final dj0.d b() {
        return this.f177444h;
    }

    @Override // jq4.g
    public final whf.p c() {
        return this.f177449p;
    }

    @Override // jq4.g
    public final LocalDate d() {
        return this.f177443g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f177440a, fVar.f177440a) && Intrinsics.f(this.f177441b, fVar.f177441b) && Intrinsics.f(this.f177442c, fVar.f177442c) && Intrinsics.f(this.d, fVar.d) && Intrinsics.f(this.e, fVar.e) && Intrinsics.f(this.f, fVar.f) && Intrinsics.f(this.f177443g, fVar.f177443g) && Intrinsics.f(this.f177444h, fVar.f177444h) && Intrinsics.f(this.i, fVar.i) && Intrinsics.f(this.f177445j, fVar.f177445j) && Intrinsics.f(this.k, fVar.k) && Intrinsics.f(this.f177446l, fVar.f177446l) && Intrinsics.f(this.f177447m, fVar.f177447m) && Intrinsics.f(this.f177448n, fVar.f177448n) && this.o == fVar.o && Intrinsics.f(this.f177449p, fVar.f177449p);
    }

    @Override // jq4.g
    public final dj0.d getBalance() {
        return this.f177441b;
    }

    public final int hashCode() {
        return this.f177449p.hashCode() + j6.a.c(v7.c(v7.c(p.a.c(p.a.c(p.a.c(y.a(v7.c(y.a(p.a.f(y.a(y.a(y.a(v7.c(this.f177440a.hashCode() * 31, 31, this.f177441b), 31, this.f177442c), 31, this.d), 31, this.e), 31, this.f), 31, this.f177443g), 31, this.f177444h), 31, this.i), 31, this.f177445j), 31, this.k), 31, this.f177446l), 31, this.f177447m), 31, this.f177448n), 31, this.o);
    }
}

package jq4;

import ip0.v7;
import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class e implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f177431b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f177432c;
    public final LocalDate d;
    public final LocalDate e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f177433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f177434h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f177435j;
    public final String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f177436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f177437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final int f177438n;
    public final dj0.d o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final whf.p f177439p;

    public e(String facilityId, dj0.d balance, LocalDate startDate, LocalDate endDate, LocalDate currentDate, Set pocketIds, LocalDate nextDisbursalDate, dj0.d nextDisbursalReward, LocalDate disbursalDate, String rate, String defaultRate, dj0.d earnsCap, boolean z, int i, dj0.d spendsCap, whf.p transactions) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        Intrinsics.checkNotNullParameter(nextDisbursalDate, "nextDisbursalDate");
        Intrinsics.checkNotNullParameter(nextDisbursalReward, "nextDisbursalReward");
        Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
        Intrinsics.checkNotNullParameter(rate, "rate");
        Intrinsics.checkNotNullParameter(defaultRate, "defaultRate");
        Intrinsics.checkNotNullParameter(earnsCap, "earnsCap");
        Intrinsics.checkNotNullParameter(spendsCap, "spendsCap");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f177430a = facilityId;
        this.f177431b = balance;
        this.f177432c = startDate;
        this.d = endDate;
        this.e = currentDate;
        this.f = pocketIds;
        this.f177433g = nextDisbursalDate;
        this.f177434h = nextDisbursalReward;
        this.i = disbursalDate;
        this.f177435j = rate;
        this.k = defaultRate;
        this.f177436l = earnsCap;
        this.f177437m = z;
        this.f177438n = i;
        this.o = spendsCap;
        this.f177439p = transactions;
    }

    @Override // jq4.g
    public final Set a() {
        return this.f;
    }

    @Override // jq4.g
    public final dj0.d b() {
        return this.f177434h;
    }

    @Override // jq4.g
    public final whf.p c() {
        return this.f177439p;
    }

    @Override // jq4.g
    public final LocalDate d() {
        return this.f177433g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f177430a, eVar.f177430a) && Intrinsics.f(this.f177431b, eVar.f177431b) && Intrinsics.f(this.f177432c, eVar.f177432c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f177433g, eVar.f177433g) && Intrinsics.f(this.f177434h, eVar.f177434h) && Intrinsics.f(this.i, eVar.i) && Intrinsics.f(this.f177435j, eVar.f177435j) && Intrinsics.f(this.k, eVar.k) && Intrinsics.f(this.f177436l, eVar.f177436l) && this.f177437m == eVar.f177437m && this.f177438n == eVar.f177438n && Intrinsics.f(this.o, eVar.o) && Intrinsics.f(this.f177439p, eVar.f177439p);
    }

    @Override // jq4.g
    public final dj0.d getBalance() {
        return this.f177431b;
    }

    public final int hashCode() {
        return this.f177439p.hashCode() + v7.c(j6.a.b(this.f177438n, j6.a.c(v7.c(p.a.c(p.a.c(y.a(v7.c(y.a(p.a.f(y.a(y.a(y.a(v7.c(this.f177430a.hashCode() * 31, 31, this.f177431b), 31, this.f177432c), 31, this.d), 31, this.e), 31, this.f), 31, this.f177433g), 31, this.f177434h), 31, this.i), 31, this.f177435j), 31, this.k), 31, this.f177436l), 31, this.f177437m), 31), 31, this.o);
    }
}

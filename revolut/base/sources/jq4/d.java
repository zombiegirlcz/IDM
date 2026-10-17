package jq4;

import ip0.v7;
import java.time.LocalDate;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import wp5.y;

/* JADX INFO: loaded from: classes22.dex */
public final class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f177421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f177422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f177423c;
    public final LocalDate d;
    public final LocalDate e;
    public final Set f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LocalDate f177424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final dj0.d f177425h;
    public final LocalDate i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final dj0.d f177426j;
    public final dj0.d k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final dj0.d f177427l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f177428m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f177429n;
    public final whf.p o;

    public d(String facilityId, dj0.d balance, LocalDate startDate, LocalDate endDate, LocalDate currentDate, Set pocketIds, LocalDate nextDisbursalDate, dj0.d nextDisbursalReward, LocalDate disbursalDate, dj0.d targetSpends, dj0.d totalSpends, dj0.d reward, String defaultRate, boolean z, whf.p transactions) {
        Intrinsics.checkNotNullParameter(facilityId, "facilityId");
        Intrinsics.checkNotNullParameter(balance, "balance");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        Intrinsics.checkNotNullParameter(endDate, "endDate");
        Intrinsics.checkNotNullParameter(currentDate, "currentDate");
        Intrinsics.checkNotNullParameter(pocketIds, "pocketIds");
        Intrinsics.checkNotNullParameter(nextDisbursalDate, "nextDisbursalDate");
        Intrinsics.checkNotNullParameter(nextDisbursalReward, "nextDisbursalReward");
        Intrinsics.checkNotNullParameter(disbursalDate, "disbursalDate");
        Intrinsics.checkNotNullParameter(targetSpends, "targetSpends");
        Intrinsics.checkNotNullParameter(totalSpends, "totalSpends");
        Intrinsics.checkNotNullParameter(reward, "reward");
        Intrinsics.checkNotNullParameter(defaultRate, "defaultRate");
        Intrinsics.checkNotNullParameter(transactions, "transactions");
        this.f177421a = facilityId;
        this.f177422b = balance;
        this.f177423c = startDate;
        this.d = endDate;
        this.e = currentDate;
        this.f = pocketIds;
        this.f177424g = nextDisbursalDate;
        this.f177425h = nextDisbursalReward;
        this.i = disbursalDate;
        this.f177426j = targetSpends;
        this.k = totalSpends;
        this.f177427l = reward;
        this.f177428m = defaultRate;
        this.f177429n = z;
        this.o = transactions;
    }

    @Override // jq4.g
    public final Set a() {
        return this.f;
    }

    @Override // jq4.g
    public final dj0.d b() {
        return this.f177425h;
    }

    @Override // jq4.g
    public final whf.p c() {
        return this.o;
    }

    @Override // jq4.g
    public final LocalDate d() {
        return this.f177424g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f177421a, dVar.f177421a) && Intrinsics.f(this.f177422b, dVar.f177422b) && Intrinsics.f(this.f177423c, dVar.f177423c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f177424g, dVar.f177424g) && Intrinsics.f(this.f177425h, dVar.f177425h) && Intrinsics.f(this.i, dVar.i) && Intrinsics.f(this.f177426j, dVar.f177426j) && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f177427l, dVar.f177427l) && Intrinsics.f(this.f177428m, dVar.f177428m) && this.f177429n == dVar.f177429n && Intrinsics.f(this.o, dVar.o);
    }

    @Override // jq4.g
    public final dj0.d getBalance() {
        return this.f177422b;
    }

    public final int hashCode() {
        return this.o.hashCode() + j6.a.c(p.a.c(v7.c(v7.c(v7.c(y.a(v7.c(y.a(p.a.f(y.a(y.a(y.a(v7.c(this.f177421a.hashCode() * 31, 31, this.f177422b), 31, this.f177423c), 31, this.d), 31, this.e), 31, this.f), 31, this.f177424g), 31, this.f177425h), 31, this.i), 31, this.f177426j), 31, this.k), 31, this.f177427l), 31, this.f177428m), 31, this.f177429n);
    }
}

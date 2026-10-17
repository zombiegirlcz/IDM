package urj;

import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzi.b f282316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f282317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f282318c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final qzi.g f282319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f282320h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f282321j;
    public final List k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final qzi.a f282322l;

    public b(uzi.b budgetingCycle, dj0.d currentSpend, dj0.d remainingBudget, dj0.d totalBudget, dj0.d upcomingSpendings, dj0.d maxSpendPerDay, qzi.g status, long j2, int i, int i2, List categoryOverview, qzi.a budget) {
        Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
        Intrinsics.checkNotNullParameter(currentSpend, "currentSpend");
        Intrinsics.checkNotNullParameter(remainingBudget, "remainingBudget");
        Intrinsics.checkNotNullParameter(totalBudget, "totalBudget");
        Intrinsics.checkNotNullParameter(upcomingSpendings, "upcomingSpendings");
        Intrinsics.checkNotNullParameter(maxSpendPerDay, "maxSpendPerDay");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(categoryOverview, "categoryOverview");
        Intrinsics.checkNotNullParameter(budget, "budget");
        this.f282316a = budgetingCycle;
        this.f282317b = currentSpend;
        this.f282318c = remainingBudget;
        this.d = totalBudget;
        this.e = upcomingSpendings;
        this.f = maxSpendPerDay;
        this.f282319g = status;
        this.f282320h = j2;
        this.i = i;
        this.f282321j = i2;
        this.k = categoryOverview;
        this.f282322l = budget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f282316a, bVar.f282316a) && Intrinsics.f(this.f282317b, bVar.f282317b) && Intrinsics.f(this.f282318c, bVar.f282318c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f) && this.f282319g == bVar.f282319g && this.f282320h == bVar.f282320h && this.i == bVar.i && this.f282321j == bVar.f282321j && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f282322l, bVar.f282322l);
    }

    public final int hashCode() {
        return this.f282322l.hashCode() + p.a.d(j6.a.b(this.f282321j, j6.a.b(this.i, a0.d.c((this.f282319g.hashCode() + v7.c(v7.c(v7.c(v7.c(v7.c(this.f282316a.hashCode() * 31, 31, this.f282317b), 31, this.f282318c), 31, this.d), 31, this.e), 31, this.f)) * 31, 31, this.f282320h), 31), 31), 31, this.k);
    }
}

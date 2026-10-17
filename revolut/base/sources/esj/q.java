package esj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzi.b f128980a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f128981b;

    public q(uzi.b budgetingCycle, dj0.d overallBudget) {
        Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        this.f128980a = budgetingCycle;
        this.f128981b = overallBudget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f128980a, qVar.f128980a) && Intrinsics.f(this.f128981b, qVar.f128981b);
    }

    public final int hashCode() {
        return this.f128981b.hashCode() + (this.f128980a.hashCode() * 31);
    }
}

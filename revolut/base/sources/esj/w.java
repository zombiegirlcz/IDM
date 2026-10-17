package esj;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzi.b f128985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f128986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f128987c;
    public final dj0.d d;
    public final dj0.d e;
    public final dj0.d f;

    public w(uzi.b budgetingCycle, int i, dj0.d categoriesSum, dj0.d currentBudget, dj0.d lastSpendings, dj0.d enteredBudget) {
        Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
        Intrinsics.checkNotNullParameter(categoriesSum, "categoriesSum");
        Intrinsics.checkNotNullParameter(currentBudget, "currentBudget");
        Intrinsics.checkNotNullParameter(lastSpendings, "lastSpendings");
        Intrinsics.checkNotNullParameter(enteredBudget, "enteredBudget");
        this.f128985a = budgetingCycle;
        this.f128986b = i;
        this.f128987c = categoriesSum;
        this.d = currentBudget;
        this.e = lastSpendings;
        this.f = enteredBudget;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f128985a, wVar.f128985a) && this.f128986b == wVar.f128986b && Intrinsics.f(this.f128987c, wVar.f128987c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + v7.c(v7.c(v7.c(j6.a.b(this.f128986b, this.f128985a.hashCode() * 31, 31), 31, this.f128987c), 31, this.d), 31, this.e);
    }
}

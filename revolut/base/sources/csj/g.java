package csj;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f108479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f108480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uzi.b f108481c;

    public g(dj0.d overallBudget, List categoryBudgetEditingInfos, uzi.b budgetingCycle) {
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        Intrinsics.checkNotNullParameter(categoryBudgetEditingInfos, "categoryBudgetEditingInfos");
        Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
        this.f108479a = overallBudget;
        this.f108480b = categoryBudgetEditingInfos;
        this.f108481c = budgetingCycle;
    }

    public static g a(g gVar, ArrayList categoryBudgetEditingInfos) {
        dj0.d overallBudget = gVar.f108479a;
        uzi.b budgetingCycle = gVar.f108481c;
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        Intrinsics.checkNotNullParameter(categoryBudgetEditingInfos, "categoryBudgetEditingInfos");
        Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
        return new g(overallBudget, categoryBudgetEditingInfos, budgetingCycle);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return Intrinsics.f(this.f108479a, gVar.f108479a) && Intrinsics.f(this.f108480b, gVar.f108480b) && Intrinsics.f(this.f108481c, gVar.f108481c);
    }

    public final int hashCode() {
        return this.f108481c.hashCode() + p.a.d(this.f108479a.hashCode() * 31, 31, this.f108480b);
    }
}

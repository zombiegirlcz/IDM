package smd;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f264417a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f264418b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f264419c;
    public final lzi.h d;

    public h(dj0.d overallBudget, List allCategories, List budgetedCategories, lzi.h cycle) {
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        Intrinsics.checkNotNullParameter(budgetedCategories, "budgetedCategories");
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        this.f264417a = overallBudget;
        this.f264418b = allCategories;
        this.f264419c = budgetedCategories;
        this.d = cycle;
    }

    public static h a(h hVar, List allCategories, ArrayList arrayList, int i) {
        dj0.d overallBudget = hVar.f264417a;
        if ((i & 2) != 0) {
            allCategories = hVar.f264418b;
        }
        List budgetedCategories = arrayList;
        if ((i & 4) != 0) {
            budgetedCategories = hVar.f264419c;
        }
        lzi.h cycle = hVar.d;
        Intrinsics.checkNotNullParameter(overallBudget, "overallBudget");
        Intrinsics.checkNotNullParameter(allCategories, "allCategories");
        Intrinsics.checkNotNullParameter(budgetedCategories, "budgetedCategories");
        Intrinsics.checkNotNullParameter(cycle, "cycle");
        return new h(overallBudget, allCategories, budgetedCategories, cycle);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f264417a, hVar.f264417a) && Intrinsics.f(this.f264418b, hVar.f264418b) && Intrinsics.f(this.f264419c, hVar.f264419c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.d(p.a.d(this.f264417a.hashCode() * 31, 31, this.f264418b), 31, this.f264419c);
    }
}

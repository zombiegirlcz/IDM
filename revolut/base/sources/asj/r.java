package asj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f8948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f8949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f8950c;

    public r(f categoryBudgetEditingInfosState, i overallBudgetState, c analyticsCycleState) {
        Intrinsics.checkNotNullParameter(categoryBudgetEditingInfosState, "categoryBudgetEditingInfosState");
        Intrinsics.checkNotNullParameter(overallBudgetState, "overallBudgetState");
        Intrinsics.checkNotNullParameter(analyticsCycleState, "analyticsCycleState");
        this.f8948a = categoryBudgetEditingInfosState;
        this.f8949b = overallBudgetState;
        this.f8950c = analyticsCycleState;
    }

    public static r a(r rVar, d dVar, g overallBudgetState, a aVar, int i) {
        f categoryBudgetEditingInfosState = dVar;
        if ((i & 1) != 0) {
            categoryBudgetEditingInfosState = rVar.f8948a;
        }
        c analyticsCycleState = aVar;
        if ((i & 4) != 0) {
            analyticsCycleState = rVar.f8950c;
        }
        rVar.getClass();
        Intrinsics.checkNotNullParameter(categoryBudgetEditingInfosState, "categoryBudgetEditingInfosState");
        Intrinsics.checkNotNullParameter(overallBudgetState, "overallBudgetState");
        Intrinsics.checkNotNullParameter(analyticsCycleState, "analyticsCycleState");
        return new r(categoryBudgetEditingInfosState, overallBudgetState, analyticsCycleState);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f8948a, rVar.f8948a) && Intrinsics.f(this.f8949b, rVar.f8949b) && Intrinsics.f(this.f8950c, rVar.f8950c);
    }

    public final int hashCode() {
        return this.f8950c.hashCode() + ((this.f8949b.hashCode() + (this.f8948a.hashCode() * 31)) * 31);
    }
}

package asj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzi.b f8934a;

    public a(uzi.b budgetingCycle) {
        Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
        this.f8934a = budgetingCycle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f8934a, ((a) obj2).f8934a);
    }

    public final int hashCode() {
        return this.f8934a.hashCode();
    }
}

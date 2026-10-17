package nrj;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzi.b f218654a;

    public e(uzi.b budgetingCycle) {
        Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
        this.f218654a = budgetingCycle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e) && Intrinsics.f(this.f218654a, ((e) obj2).f218654a);
    }

    public final int hashCode() {
        return this.f218654a.hashCode();
    }
}

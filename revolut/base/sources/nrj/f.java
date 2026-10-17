package nrj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final uzi.b f218655a;

    public f(uzi.b budgetingCycle) {
        Intrinsics.checkNotNullParameter(budgetingCycle, "budgetingCycle");
        this.f218655a = budgetingCycle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof f) && Intrinsics.f(this.f218655a, ((f) obj2).f218655a);
    }

    public final int hashCode() {
        return this.f218655a.hashCode();
    }
}

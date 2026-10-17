package lij;

import aii.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f195534a;

    public d(String selectedPlanId) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        this.f195534a = selectedPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f195534a, ((d) obj2).f195534a);
    }

    public final int hashCode() {
        return this.f195534a.hashCode();
    }
}

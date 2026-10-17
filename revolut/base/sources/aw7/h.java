package aw7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10742a;

    public h(String selectedPlanId) {
        Intrinsics.checkNotNullParameter(selectedPlanId, "selectedPlanId");
        this.f10742a = selectedPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f10742a, ((h) obj2).f10742a);
    }

    public final int hashCode() {
        return this.f10742a.hashCode();
    }
}

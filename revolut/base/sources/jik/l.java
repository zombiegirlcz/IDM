package jik;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f174607a;

    public l(String giftedPlanId) {
        Intrinsics.checkNotNullParameter(giftedPlanId, "giftedPlanId");
        this.f174607a = giftedPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof l) && Intrinsics.f(this.f174607a, ((l) obj2).f174607a);
    }

    public final int hashCode() {
        return this.f174607a.hashCode();
    }
}

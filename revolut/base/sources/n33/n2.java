package n33;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class n2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pi3.h f211769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f211770b;

    public n2(pi3.h planCheckoutParams, String designsForPlanId) {
        Intrinsics.checkNotNullParameter(planCheckoutParams, "planCheckoutParams");
        Intrinsics.checkNotNullParameter(designsForPlanId, "designsForPlanId");
        this.f211769a = planCheckoutParams;
        this.f211770b = designsForPlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n2)) {
            return false;
        }
        n2 n2Var = (n2) obj2;
        return Intrinsics.f(this.f211769a, n2Var.f211769a) && Intrinsics.f(this.f211770b, n2Var.f211770b);
    }

    public final int hashCode() {
        return this.f211770b.hashCode() + (this.f211769a.hashCode() * 31);
    }
}

package vjj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class t extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289787b;

    public t(String subscriptionId, String mobilePlanId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        this.f289786a = subscriptionId;
        this.f289787b = mobilePlanId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof t)) {
            return false;
        }
        t tVar = (t) obj2;
        return Intrinsics.f(this.f289786a, tVar.f289786a) && Intrinsics.f(this.f289787b, tVar.f289787b);
    }

    public final int hashCode() {
        return this.f289787b.hashCode() + (this.f289786a.hashCode() * 31);
    }
}

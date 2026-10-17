package vjj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class u extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f289789b;

    public u(String mobilePlanId, String subscriptionId) {
        Intrinsics.checkNotNullParameter(mobilePlanId, "mobilePlanId");
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.f289788a = mobilePlanId;
        this.f289789b = subscriptionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f289788a, uVar.f289788a) && Intrinsics.f(this.f289789b, uVar.f289789b);
    }

    public final int hashCode() {
        return this.f289789b.hashCode() + (this.f289788a.hashCode() * 31);
    }
}

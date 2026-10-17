package vjj;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_details.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f289772a;

    public m(String subscriptionId) {
        Intrinsics.checkNotNullParameter(subscriptionId, "subscriptionId");
        this.f289772a = subscriptionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f289772a, ((m) obj2).f289772a);
    }

    public final int hashCode() {
        return this.f289772a.hashCode();
    }
}

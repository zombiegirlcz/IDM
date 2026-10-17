package lbk;

import aii.e;
import com.revolut.retail.feature.plan_gifting.api.navigation.PricingPlanSenderFlow$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanSenderFlow$InputData f193704a;

    public b(PricingPlanSenderFlow$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f193704a = inputData;
    }

    public final PricingPlanSenderFlow$InputData b() {
        return this.f193704a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f193704a, ((b) obj2).f193704a);
    }

    public final int hashCode() {
        return this.f193704a.hashCode();
    }
}

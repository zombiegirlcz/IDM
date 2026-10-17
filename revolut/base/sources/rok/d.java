package rok;

import cli.j;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$ProductIntro;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PricingPlanWaitlistLayout$ProductIntro f256030a;

    public d(PricingPlanWaitlistLayout$ProductIntro productIntro) {
        Intrinsics.checkNotNullParameter(productIntro, "productIntro");
        this.f256030a = productIntro;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f256030a, ((d) obj2).f256030a);
    }

    public final int hashCode() {
        return this.f256030a.hashCode();
    }
}

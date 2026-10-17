package wok;

import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class g extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gok.a f298944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanWaitlistEntry f298945b;

    public g(gok.a errorType, PricingPlanWaitlistEntry entry) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f298944a = errorType;
        this.f298945b = entry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f298944a == gVar.f298944a && Intrinsics.f(this.f298945b, gVar.f298945b);
    }

    public final int hashCode() {
        return this.f298945b.hashCode() + (this.f298944a.hashCode() * 31);
    }
}

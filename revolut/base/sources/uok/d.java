package uok;

import cli.j;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistEntry;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gok.a f281663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanWaitlistEntry f281664b;

    public d(gok.a errorType, PricingPlanWaitlistEntry entry) {
        Intrinsics.checkNotNullParameter(errorType, "errorType");
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.f281663a = errorType;
        this.f281664b = entry;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f281663a == dVar.f281663a && Intrinsics.f(this.f281664b, dVar.f281664b);
    }

    public final int hashCode() {
        return this.f281664b.hashCode() + (this.f281663a.hashCode() * 31);
    }
}

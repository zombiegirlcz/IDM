package gok;

import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$Button$Action;
import com.revolut.retail.feature.pricing_plans.waitlist.api.model.PricingPlanWaitlistLayout$ButtonStyle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PricingPlanWaitlistLayout$Button$Action f145183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PricingPlanWaitlistLayout$ButtonStyle f145184c;

    public c(String label, PricingPlanWaitlistLayout$Button$Action action, PricingPlanWaitlistLayout$ButtonStyle style) {
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f145182a = label;
        this.f145183b = action;
        this.f145184c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f145182a, cVar.f145182a) && Intrinsics.f(this.f145183b, cVar.f145183b) && this.f145184c == cVar.f145184c;
    }

    public final int hashCode() {
        return this.f145184c.hashCode() + ((this.f145183b.hashCode() + (this.f145182a.hashCode() * 31)) * 31);
    }
}

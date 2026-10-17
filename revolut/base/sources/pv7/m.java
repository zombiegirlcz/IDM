package pv7;

import com.revolut.data.model.Data;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class m implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Data f239986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f239987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f239988c;

    public m(Data layout, Data pricingPlanBanner, Data plan) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(pricingPlanBanner, "pricingPlanBanner");
        Intrinsics.checkNotNullParameter(plan, "plan");
        this.f239986a = layout;
        this.f239987b = pricingPlanBanner;
        this.f239988c = plan;
    }

    public static m a(m mVar, Data layout, Data pricingPlanBanner, Data plan, int i) {
        if ((i & 1) != 0) {
            layout = mVar.f239986a;
        }
        if ((i & 2) != 0) {
            pricingPlanBanner = mVar.f239987b;
        }
        if ((i & 4) != 0) {
            plan = mVar.f239988c;
        }
        mVar.getClass();
        Intrinsics.checkNotNullParameter(layout, "layout");
        Intrinsics.checkNotNullParameter(pricingPlanBanner, "pricingPlanBanner");
        Intrinsics.checkNotNullParameter(plan, "plan");
        return new m(layout, pricingPlanBanner, plan);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f239986a, mVar.f239986a) && Intrinsics.f(this.f239987b, mVar.f239987b) && Intrinsics.f(this.f239988c, mVar.f239988c);
    }

    public final int hashCode() {
        return this.f239988c.hashCode() + kii.e.c(this.f239987b, this.f239986a.hashCode() * 31, 31);
    }
}

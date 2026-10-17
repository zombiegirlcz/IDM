package imk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubProductOnboarding;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class f0 extends g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ola.b f162509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PlanHubProductOnboarding f162510b;

    public f0(ola.b introProduct, PlanHubProductOnboarding planHubProductOnboarding) {
        Intrinsics.checkNotNullParameter(introProduct, "introProduct");
        Intrinsics.checkNotNullParameter(planHubProductOnboarding, "planHubProductOnboarding");
        this.f162509a = introProduct;
        this.f162510b = planHubProductOnboarding;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj2;
        return this.f162509a == f0Var.f162509a && Intrinsics.f(this.f162510b, f0Var.f162510b);
    }

    public final int hashCode() {
        return this.f162510b.hashCode() + (this.f162509a.hashCode() * 31);
    }
}

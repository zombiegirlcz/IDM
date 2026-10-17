package ymk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlansDashboardLayout$ClickAction;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlansDashboardLayout$ClickAction f315037a;

    public m(PlansDashboardLayout$ClickAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f315037a = action;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof m) && Intrinsics.f(this.f315037a, ((m) obj2).f315037a);
    }

    public final int hashCode() {
        return this.f315037a.hashCode();
    }
}

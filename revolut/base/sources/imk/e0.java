package imk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanHubProductArticle;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class e0 extends com.revolut.retail.feature.pricing_plans.ui.impl.screens.plan_hub_v2.screen.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanHubProductArticle f162508a;

    public e0(PlanHubProductArticle productArticle) {
        Intrinsics.checkNotNullParameter(productArticle, "productArticle");
        this.f162508a = productArticle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof e0) && Intrinsics.f(this.f162508a, ((e0) obj2).f162508a);
    }

    public final int hashCode() {
        return this.f162508a.hashCode();
    }
}

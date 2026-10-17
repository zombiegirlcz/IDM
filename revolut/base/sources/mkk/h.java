package mkk;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$AvailableOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.management.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoreForFamilyScreenContract$AvailableOptions f206484a;

    public h(MoreForFamilyScreenContract$AvailableOptions availableOptions) {
        Intrinsics.checkNotNullParameter(availableOptions, "availableOptions");
        this.f206484a = availableOptions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && Intrinsics.f(this.f206484a, ((h) obj2).f206484a);
    }

    public final int hashCode() {
        return this.f206484a.hashCode();
    }
}

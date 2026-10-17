package okk;

import com.revolut.retail.feature.pricing_plans.ui.impl.screens.family_plans.more_for_family.MoreForFamilyScreenContract$AvailableOptions;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoreForFamilyScreenContract$AvailableOptions f226141a;

    public j(MoreForFamilyScreenContract$AvailableOptions options) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f226141a = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f226141a, ((j) obj2).f226141a);
    }

    public final int hashCode() {
        return this.f226141a.hashCode();
    }
}

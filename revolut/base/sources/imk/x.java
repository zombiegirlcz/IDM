package imk;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class x extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.revolut.retail.feature.pricing_plans.ui.api.models.c f162557a;

    public x(com.revolut.retail.feature.pricing_plans.ui.api.models.c style) {
        Intrinsics.checkNotNullParameter(style, "style");
        this.f162557a = style;
    }

    @Override // imk.y
    public final com.revolut.retail.feature.pricing_plans.ui.api.models.c a() {
        return this.f162557a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && this.f162557a == ((x) obj2).f162557a;
    }

    public final int hashCode() {
        return this.f162557a.hashCode();
    }
}

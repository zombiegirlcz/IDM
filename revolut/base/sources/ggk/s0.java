package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanPageLayoutAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class s0 extends u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PlanPageLayoutAsset f143777a;

    public s0(PlanPageLayoutAsset asset) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f143777a = asset;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof s0) && Intrinsics.f(this.f143777a, ((s0) obj2).f143777a);
    }

    public final int hashCode() {
        return this.f143777a.hashCode();
    }
}

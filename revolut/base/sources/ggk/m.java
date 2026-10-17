package ggk;

import com.revolut.retail.feature.pricing_plans.ui.api.models.PlanDashboardTile;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class m implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f143748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f143749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PlanDashboardTile f143750c;

    public m(String planId, boolean z, PlanDashboardTile tile) {
        Intrinsics.checkNotNullParameter(planId, "planId");
        Intrinsics.checkNotNullParameter(tile, "tile");
        this.f143748a = planId;
        this.f143749b = z;
        this.f143750c = tile;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m)) {
            return false;
        }
        m mVar = (m) obj2;
        return Intrinsics.f(this.f143748a, mVar.f143748a) && this.f143749b == mVar.f143749b && Intrinsics.f(this.f143750c, mVar.f143750c);
    }

    public final int hashCode() {
        return this.f143750c.hashCode() + j6.a.c(this.f143748a.hashCode() * 31, 31, this.f143749b);
    }
}

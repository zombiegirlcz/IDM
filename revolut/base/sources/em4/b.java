package em4;

import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import kotlin.jvm.internal.Intrinsics;
import m1c.z;

/* JADX INFO: loaded from: classes22.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hha.d f127607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f127608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPointsEarningRate f127609c;

    public b(hha.d pricingPlan, z revPointsAccountStatus, RevPointsEarningRate revPointsEarningRate) {
        Intrinsics.checkNotNullParameter(pricingPlan, "pricingPlan");
        Intrinsics.checkNotNullParameter(revPointsAccountStatus, "revPointsAccountStatus");
        this.f127607a = pricingPlan;
        this.f127608b = revPointsAccountStatus;
        this.f127609c = revPointsEarningRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f127607a, bVar.f127607a) && Intrinsics.f(this.f127608b, bVar.f127608b) && Intrinsics.f(this.f127609c, bVar.f127609c);
    }

    public final int hashCode() {
        int iHashCode = (this.f127608b.hashCode() + (this.f127607a.hashCode() * 31)) * 31;
        RevPointsEarningRate revPointsEarningRate = this.f127609c;
        return iHashCode + (revPointsEarningRate == null ? 0 : revPointsEarningRate.hashCode());
    }
}

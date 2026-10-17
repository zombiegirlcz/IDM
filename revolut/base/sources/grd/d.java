package grd;

import com.revolut.feature.spending_analytics.impl.ui.rev10.total_wealth.common.SmartEstimationAccess;
import com.revolut.retail.feature.api.custom_assets.models.CustomAsset;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CustomAsset f145992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SmartEstimationAccess f145993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f145994c;
    public final boolean d;

    public d(CustomAsset asset, SmartEstimationAccess smartEstimationAccess, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f145992a = asset;
        this.f145993b = smartEstimationAccess;
        this.f145994c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f145992a, dVar.f145992a) && Intrinsics.f(this.f145993b, dVar.f145993b) && this.f145994c == dVar.f145994c && this.d == dVar.d;
    }

    public final int hashCode() {
        int iHashCode = this.f145992a.hashCode() * 31;
        SmartEstimationAccess smartEstimationAccess = this.f145993b;
        return Boolean.hashCode(this.d) + j6.a.c((iHashCode + (smartEstimationAccess == null ? 0 : smartEstimationAccess.hashCode())) * 31, 31, this.f145994c);
    }
}

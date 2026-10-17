package p1c;

import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeFullBannerGridControllerApi$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class d implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsSpareChangeFullBannerGridControllerApi$InputData f231891a;

    public d(RevPointsSpareChangeFullBannerGridControllerApi$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f231891a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof d) && Intrinsics.f(this.f231891a, ((d) obj2).f231891a);
    }

    public final int hashCode() {
        return this.f231891a.hashCode();
    }
}

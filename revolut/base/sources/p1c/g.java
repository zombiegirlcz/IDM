package p1c;

import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$InputData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsSpareChangeControllerApi$InputData f231893a;

    public g(RevPointsSpareChangeControllerApi$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f231893a = inputData;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof g) && Intrinsics.f(this.f231893a, ((g) obj2).f231893a);
    }

    public final int hashCode() {
        return this.f231893a.f84125a.hashCode();
    }
}

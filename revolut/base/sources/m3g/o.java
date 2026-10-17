package m3g;

import com.revolut.feature.rev_points.models.RevPointsEarningRate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class o extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsEarningRate f202548a;

    public o(RevPointsEarningRate earningRate) {
        Intrinsics.checkNotNullParameter(earningRate, "earningRate");
        this.f202548a = earningRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Intrinsics.f(this.f202548a, ((o) obj2).f202548a);
    }

    public final int hashCode() {
        return this.f202548a.hashCode();
    }
}

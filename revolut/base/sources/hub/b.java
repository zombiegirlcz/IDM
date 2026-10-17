package hub;

import aii.r;
import com.revolut.feature.rev_points.spare_change.api.navigation.RevPointsSpareChangeControllerApi$Result;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsSpareChangeControllerApi$Result f155598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f155599b;

    public b(RevPointsSpareChangeControllerApi$Result revPointsSpareChangeControllerApi$Result, boolean z) {
        this.f155598a = revPointsSpareChangeControllerApi$Result;
        this.f155599b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f155598a, bVar.f155598a) && this.f155599b == bVar.f155599b;
    }

    public final int hashCode() {
        RevPointsSpareChangeControllerApi$Result revPointsSpareChangeControllerApi$Result = this.f155598a;
        return Boolean.hashCode(this.f155599b) + ((revPointsSpareChangeControllerApi$Result == null ? 0 : revPointsSpareChangeControllerApi$Result.hashCode()) * 31);
    }
}

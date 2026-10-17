package zdi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketBenefit;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPocketBenefit f321525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsPocketInfo f321526b;

    public b(RevPointsPocketBenefit selectedBenefit, RevPointsPocketInfo pointsPocketInfo) {
        Intrinsics.checkNotNullParameter(selectedBenefit, "selectedBenefit");
        Intrinsics.checkNotNullParameter(pointsPocketInfo, "pointsPocketInfo");
        this.f321525a = selectedBenefit;
        this.f321526b = pointsPocketInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f321525a, bVar.f321525a) && Intrinsics.f(this.f321526b, bVar.f321526b);
    }

    public final int hashCode() {
        return this.f321526b.hashCode() + (this.f321525a.hashCode() * 31);
    }
}

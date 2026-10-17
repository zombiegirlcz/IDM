package xdi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketBenefit;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPocketInfo f304456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsPocketBenefit f304457b;

    public i(RevPointsPocketBenefit selectedBenefit, RevPointsPocketInfo pocketInfo) {
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        Intrinsics.checkNotNullParameter(selectedBenefit, "selectedBenefit");
        this.f304456a = pocketInfo;
        this.f304457b = selectedBenefit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f304456a, iVar.f304456a) && Intrinsics.f(this.f304457b, iVar.f304457b);
    }

    public final int hashCode() {
        return this.f304457b.hashCode() + (this.f304456a.hashCode() * 31);
    }
}

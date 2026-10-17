package xdi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketBenefit;
import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class k extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPocketInfo f304459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RevPointsPocketBenefit f304460b;

    public k(RevPointsPocketBenefit selectedBenefit, RevPointsPocketInfo pocketInfo) {
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        Intrinsics.checkNotNullParameter(selectedBenefit, "selectedBenefit");
        this.f304459a = pocketInfo;
        this.f304460b = selectedBenefit;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return Intrinsics.f(this.f304459a, kVar.f304459a) && Intrinsics.f(this.f304460b, kVar.f304460b);
    }

    public final int hashCode() {
        return this.f304460b.hashCode() + (this.f304459a.hashCode() * 31);
    }
}

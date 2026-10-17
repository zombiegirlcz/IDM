package xdi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPocketInfo f304458a;

    public j(RevPointsPocketInfo pocketInfo) {
        Intrinsics.checkNotNullParameter(pocketInfo, "pocketInfo");
        this.f304458a = pocketInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && Intrinsics.f(this.f304458a, ((j) obj2).f304458a);
    }

    public final int hashCode() {
        return this.f304458a.hashCode();
    }
}

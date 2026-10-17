package lsd;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPocketInfo f199671a;

    public b(RevPointsPocketInfo revPointsPocketInfo) {
        Intrinsics.checkNotNullParameter(revPointsPocketInfo, "revPointsPocketInfo");
        this.f199671a = revPointsPocketInfo;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Intrinsics.f(this.f199671a, ((b) obj2).f199671a);
    }

    public final int hashCode() {
        return this.f199671a.hashCode();
    }
}

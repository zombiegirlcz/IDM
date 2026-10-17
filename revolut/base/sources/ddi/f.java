package ddi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPocketInfo f113227a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f113228b;

    public f(RevPointsPocketInfo pocket, List thresholds) {
        Intrinsics.checkNotNullParameter(pocket, "pocket");
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        this.f113227a = pocket;
        this.f113228b = thresholds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Intrinsics.f(this.f113227a, fVar.f113227a) && Intrinsics.f(this.f113228b, fVar.f113228b);
    }

    public final int hashCode() {
        return this.f113228b.hashCode() + (this.f113227a.hashCode() * 31);
    }
}

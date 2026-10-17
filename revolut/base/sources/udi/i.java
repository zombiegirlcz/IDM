package udi;

import com.revolut.feature_rev_points_pocket_api.model.RevPointsPocketInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsPocketInfo f279210a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f279211b;

    public i(RevPointsPocketInfo pointsPocket, List thresholds) {
        Intrinsics.checkNotNullParameter(pointsPocket, "pointsPocket");
        Intrinsics.checkNotNullParameter(thresholds, "thresholds");
        this.f279210a = pointsPocket;
        this.f279211b = thresholds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f279210a, iVar.f279210a) && Intrinsics.f(this.f279211b, iVar.f279211b);
    }

    public final int hashCode() {
        return this.f279211b.hashCode() + (this.f279210a.hashCode() * 31);
    }
}

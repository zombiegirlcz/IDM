package m1c;

import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPoints f201463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f201464b;

    public v(RevPoints points, dj0.d monetaryValue) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(monetaryValue, "monetaryValue");
        this.f201463a = points;
        this.f201464b = monetaryValue;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f201463a, vVar.f201463a) && Intrinsics.f(this.f201464b, vVar.f201464b);
    }

    public final int hashCode() {
        return this.f201464b.hashCode() + (this.f201463a.f83960a.hashCode() * 31);
    }
}

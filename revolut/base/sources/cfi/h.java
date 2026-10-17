package cfi;

import com.revolut.feature.rev_points.models.RevPoints;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPoints f23709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f23710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23711c;
    public final RevPoints d;

    public h(RevPoints points, dj0.d discount, String str, RevPoints revPoints) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        this.f23709a = points;
        this.f23710b = discount;
        this.f23711c = str;
        this.d = revPoints;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f23709a, hVar.f23709a) && Intrinsics.f(this.f23710b, hVar.f23710b) && Intrinsics.f(this.f23711c, hVar.f23711c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iC = v7.c(this.f23709a.f83960a.hashCode() * 31, 31, this.f23710b);
        String str = this.f23711c;
        int iHashCode = (iC + (str == null ? 0 : str.hashCode())) * 31;
        RevPoints revPoints = this.d;
        return iHashCode + (revPoints != null ? revPoints.f83960a.hashCode() : 0);
    }
}

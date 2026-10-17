package qig;

import cli.j;
import com.revolut.feature.rev_points.models.RevPoints;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class b implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPoints f246705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f246706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final RevPoints f246707c;

    public b(RevPoints actualPointsAmount, double d, RevPoints desiredPointsAmount) {
        Intrinsics.checkNotNullParameter(actualPointsAmount, "actualPointsAmount");
        Intrinsics.checkNotNullParameter(desiredPointsAmount, "desiredPointsAmount");
        this.f246705a = actualPointsAmount;
        this.f246706b = d;
        this.f246707c = desiredPointsAmount;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f246705a, bVar.f246705a) && Double.compare(this.f246706b, bVar.f246706b) == 0 && Intrinsics.f(this.f246707c, bVar.f246707c);
    }

    public final int hashCode() {
        return this.f246707c.f83960a.hashCode() + m72.b.c(this.f246705a.f83960a.hashCode() * 31, this.f246706b, 31);
    }
}

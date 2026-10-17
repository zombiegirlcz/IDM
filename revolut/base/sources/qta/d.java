package qta;

import h30.l;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f249051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xi0.b f249052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xi0.b f249053c;
    public final f d;
    public final List e;

    public d(double d, xi0.b from, xi0.b to6, f duration, List points) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(points, "points");
        this.f249051a = d;
        this.f249052b = from;
        this.f249053c = to6;
        this.d = duration;
        this.e = points;
    }

    public static d a(d dVar, List points) {
        double d = dVar.f249051a;
        xi0.b from = dVar.f249052b;
        xi0.b to6 = dVar.f249053c;
        f duration = dVar.d;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(to6, "to");
        Intrinsics.checkNotNullParameter(duration, "duration");
        Intrinsics.checkNotNullParameter(points, "points");
        return new d(d, from, to6, duration, points);
    }

    public final List b() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Double.compare(this.f249051a, dVar.f249051a) == 0 && Intrinsics.f(this.f249052b, dVar.f249052b) && Intrinsics.f(this.f249053c, dVar.f249053c) && this.d == dVar.d && Intrinsics.f(this.e, dVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + l.j(this.f249053c, l.j(this.f249052b, Double.hashCode(this.f249051a) * 31, 31), 31)) * 31);
    }
}

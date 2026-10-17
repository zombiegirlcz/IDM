package hw0;

import aw0.cb;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f155993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final cb f155994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f155995c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    public d(List points, boolean z, int i, int i2) {
        z = (i2 & 4) != 0 ? false : z;
        Intrinsics.checkNotNullParameter(points, "points");
        this(points, new cb(i, 0, 14), z, false);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return Intrinsics.f(this.f155993a, dVar.f155993a) && Intrinsics.f(this.f155994b, dVar.f155994b) && this.f155995c == dVar.f155995c && this.d == dVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c((this.f155994b.hashCode() + (this.f155993a.hashCode() * 31)) * 31, 31, this.f155995c);
    }

    public d(List points, cb colorScheme, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(colorScheme, "colorScheme");
        this.f155993a = points;
        this.f155994b = colorScheme;
        this.f155995c = z;
        this.d = z3;
    }
}

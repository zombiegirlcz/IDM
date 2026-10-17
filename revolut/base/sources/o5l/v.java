package o5l;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class v implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f222482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f222483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f222484c;

    public v(dj0.d points, dj0.d discount, dj0.d finalTotal) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(finalTotal, "finalTotal");
        this.f222482a = points;
        this.f222483b = discount;
        this.f222484c = finalTotal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v)) {
            return false;
        }
        v vVar = (v) obj2;
        return Intrinsics.f(this.f222482a, vVar.f222482a) && Intrinsics.f(this.f222483b, vVar.f222483b) && Intrinsics.f(this.f222484c, vVar.f222484c);
    }

    public final int hashCode() {
        return this.f222484c.hashCode() + v7.c(this.f222482a.hashCode() * 31, 31, this.f222483b);
    }
}

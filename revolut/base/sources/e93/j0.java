package e93;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class j0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f123876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f123877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f123878c;

    public j0(dj0.d points, dj0.d discount, dj0.d finalTotal) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(finalTotal, "finalTotal");
        this.f123876a = points;
        this.f123877b = discount;
        this.f123878c = finalTotal;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f123876a, j0Var.f123876a) && Intrinsics.f(this.f123877b, j0Var.f123877b) && Intrinsics.f(this.f123878c, j0Var.f123878c);
    }

    public final int hashCode() {
        return this.f123878c.hashCode() + v7.c(this.f123876a.hashCode() * 31, 31, this.f123877b);
    }
}

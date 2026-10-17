package svi;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class l0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265940a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f265941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f265942c;

    public l0(dj0.d discount, dj0.d finalPrice, String points) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f265940a = points;
        this.f265941b = discount;
        this.f265942c = finalPrice;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f265940a, l0Var.f265940a) && Intrinsics.f(this.f265941b, l0Var.f265941b) && Intrinsics.f(this.f265942c, l0Var.f265942c);
    }

    public final int hashCode() {
        return this.f265942c.hashCode() + v7.c(this.f265940a.hashCode() * 31, 31, this.f265941b);
    }
}

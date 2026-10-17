package bti;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f18596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f18597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f18598c;
    public final boolean d;

    public f(double d, dj0.d discount, dj0.d finalPrice, boolean z) {
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f18596a = d;
        this.f18597b = discount;
        this.f18598c = finalPrice;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return Double.compare(this.f18596a, fVar.f18596a) == 0 && Intrinsics.f(this.f18597b, fVar.f18597b) && Intrinsics.f(this.f18598c, fVar.f18598c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + v7.c(v7.c(Double.hashCode(this.f18596a) * 31, 31, this.f18597b), 31, this.f18598c);
    }
}

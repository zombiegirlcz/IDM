package svi;

import ip0.v7;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f265893a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dj0.d f265894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dj0.d f265895c;
    public final boolean d;

    public d0(dj0.d discount, dj0.d finalPrice, String points, boolean z) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f265893a = points;
        this.f265894b = discount;
        this.f265895c = finalPrice;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f265893a, d0Var.f265893a) && Intrinsics.f(this.f265894b, d0Var.f265894b) && Intrinsics.f(this.f265895c, d0Var.f265895c) && this.d == d0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + v7.c(v7.c(this.f265893a.hashCode() * 31, 31, this.f265894b), 31, this.f265895c);
    }
}

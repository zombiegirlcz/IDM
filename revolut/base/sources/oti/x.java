package oti;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f229702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f229703c;
    public final boolean d;

    public /* synthetic */ x(int i, String str, jo3.a aVar, jo3.a aVar2, boolean z) {
        if (15 != (i & 15)) {
            qlm.j1.f(v.f229695a.getDescriptor(), i, 15);
            throw null;
        }
        this.f229701a = str;
        this.f229702b = aVar;
        this.f229703c = aVar2;
        this.d = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f229701a, xVar.f229701a) && Intrinsics.f(this.f229702b, xVar.f229702b) && Intrinsics.f(this.f229703c, xVar.f229703c) && this.d == xVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + v7.j(this.f229703c, v7.j(this.f229702b, this.f229701a.hashCode() * 31, 31), 31);
    }

    public x(String points, jo3.a discount, jo3.a finalPrice, boolean z) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f229701a = points;
        this.f229702b = discount;
        this.f229703c = finalPrice;
        this.d = z;
    }
}

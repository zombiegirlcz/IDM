package oti;

import ip0.v7;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class j0 {

    @NotNull
    public static final i0 Companion = new i0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f229649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f229650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jo3.a f229651c;

    public /* synthetic */ j0(int i, String str, jo3.a aVar, jo3.a aVar2) {
        if (7 != (i & 7)) {
            qlm.j1.f(h0.f229641a.getDescriptor(), i, 7);
            throw null;
        }
        this.f229649a = str;
        this.f229650b = aVar;
        this.f229651c = aVar2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj2;
        return Intrinsics.f(this.f229649a, j0Var.f229649a) && Intrinsics.f(this.f229650b, j0Var.f229650b) && Intrinsics.f(this.f229651c, j0Var.f229651c);
    }

    public final int hashCode() {
        return this.f229651c.hashCode() + v7.j(this.f229650b, this.f229649a.hashCode() * 31, 31);
    }

    public j0(jo3.a discount, jo3.a finalPrice, String points) {
        Intrinsics.checkNotNullParameter(points, "points");
        Intrinsics.checkNotNullParameter(discount, "discount");
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f229649a = points;
        this.f229650b = discount;
        this.f229651c = finalPrice;
    }
}

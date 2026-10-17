package oti;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@mlm.g
public final class m1 {

    @NotNull
    public static final l1 Companion = new l1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f229666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jo3.a f229667b;

    public /* synthetic */ m1(double d, int i, jo3.a aVar) {
        if (3 != (i & 3)) {
            qlm.j1.f(k1.f229653a.getDescriptor(), i, 3);
            throw null;
        }
        this.f229666a = d;
        this.f229667b = aVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj2;
        return Double.compare(this.f229666a, m1Var.f229666a) == 0 && Intrinsics.f(this.f229667b, m1Var.f229667b);
    }

    public final int hashCode() {
        return this.f229667b.hashCode() + (Double.hashCode(this.f229666a) * 31);
    }

    public m1(double d, jo3.a finalPrice) {
        Intrinsics.checkNotNullParameter(finalPrice, "finalPrice");
        this.f229666a = d;
        this.f229667b = finalPrice;
    }
}

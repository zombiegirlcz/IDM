package svi;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class m0 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dj0.d f265946a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f265947b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l0 f265948c;

    public m0(dj0.d totalPrice, k0 planDiscount, l0 l0Var) {
        Intrinsics.checkNotNullParameter(totalPrice, "totalPrice");
        Intrinsics.checkNotNullParameter(planDiscount, "planDiscount");
        this.f265946a = totalPrice;
        this.f265947b = planDiscount;
        this.f265948c = l0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj2;
        return Intrinsics.f(this.f265946a, m0Var.f265946a) && Intrinsics.f(this.f265947b, m0Var.f265947b) && Intrinsics.f(this.f265948c, m0Var.f265948c);
    }

    public final int hashCode() {
        int iHashCode = (this.f265947b.hashCode() + (this.f265946a.hashCode() * 31)) * 31;
        l0 l0Var = this.f265948c;
        return iHashCode + (l0Var == null ? 0 : l0Var.hashCode());
    }
}

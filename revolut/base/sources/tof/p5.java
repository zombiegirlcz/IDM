package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class p5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272988a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r5 f272989b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q5 f272990c;
    public final n5 d;
    public final l5 e;
    public final Long f;

    public p5(String id10, r5 type, q5 paymentMethod, n5 n5Var, l5 l5Var, Long l2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(paymentMethod, "paymentMethod");
        this.f272988a = id10;
        this.f272989b = type;
        this.f272990c = paymentMethod;
        this.d = n5Var;
        this.e = l5Var;
        this.f = l2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p5)) {
            return false;
        }
        p5 p5Var = (p5) obj2;
        return Intrinsics.f(this.f272988a, p5Var.f272988a) && this.f272989b == p5Var.f272989b && this.f272990c == p5Var.f272990c && Intrinsics.f(this.d, p5Var.d) && Intrinsics.f(this.e, p5Var.e) && Intrinsics.f(this.f, p5Var.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f272990c.hashCode() + ((this.f272989b.hashCode() + (this.f272988a.hashCode() * 31)) * 31)) * 31;
        n5 n5Var = this.d;
        int iHashCode2 = (iHashCode + (n5Var == null ? 0 : n5Var.hashCode())) * 31;
        l5 l5Var = this.e;
        int iHashCode3 = (iHashCode2 + (l5Var == null ? 0 : l5Var.hashCode())) * 31;
        Long l2 = this.f;
        return iHashCode3 + (l2 != null ? l2.hashCode() : 0);
    }
}

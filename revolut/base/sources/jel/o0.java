package jel;

import java.math.BigDecimal;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BigDecimal f173525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Boolean f173526b;

    public o0(BigDecimal bigDecimal, Boolean bool) {
        this.f173525a = bigDecimal;
        this.f173526b = bool;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj2;
        return Intrinsics.f(this.f173525a, o0Var.f173525a) && Intrinsics.f(this.f173526b, o0Var.f173526b);
    }

    public final int hashCode() {
        BigDecimal bigDecimal = this.f173525a;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        Boolean bool = this.f173526b;
        return iHashCode + (bool != null ? bool.hashCode() : 0);
    }
}

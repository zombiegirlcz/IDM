package tof;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f5 implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f272749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g5 f272750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n1 f272751c;

    public f5(String juniorUserId, g5 g5Var, n1 n1Var) {
        Intrinsics.checkNotNullParameter(juniorUserId, "juniorUserId");
        this.f272749a = juniorUserId;
        this.f272750b = g5Var;
        this.f272751c = n1Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f5)) {
            return false;
        }
        f5 f5Var = (f5) obj2;
        return Intrinsics.f(this.f272749a, f5Var.f272749a) && this.f272750b == f5Var.f272750b && Intrinsics.f(this.f272751c, f5Var.f272751c);
    }

    public final int hashCode() {
        int iHashCode = this.f272749a.hashCode() * 31;
        g5 g5Var = this.f272750b;
        int iHashCode2 = (iHashCode + (g5Var == null ? 0 : g5Var.hashCode())) * 31;
        n1 n1Var = this.f272751c;
        return iHashCode2 + (n1Var != null ? n1Var.hashCode() : 0);
    }
}

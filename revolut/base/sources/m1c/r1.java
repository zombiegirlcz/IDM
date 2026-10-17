package m1c;

import com.revolut.feature.rev_points.models.RevPointsTransaction;
import kotlin.jvm.internal.Intrinsics;
import tof.a3;

/* JADX INFO: loaded from: classes6.dex */
public final class r1 implements fd0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RevPointsTransaction f201449a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a3 f201450b;

    public r1(RevPointsTransaction revPointsTransaction, a3 a3Var) {
        Intrinsics.checkNotNullParameter(revPointsTransaction, "revPointsTransaction");
        this.f201449a = revPointsTransaction;
        this.f201450b = a3Var;
    }

    @Override // fd0.c
    public final String a() {
        return this.f201449a.f84054a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj2;
        return Intrinsics.f(this.f201449a, r1Var.f201449a) && Intrinsics.f(this.f201450b, r1Var.f201450b);
    }

    public final int hashCode() {
        int iHashCode = this.f201449a.hashCode() * 31;
        a3 a3Var = this.f201450b;
        return iHashCode + (a3Var == null ? 0 : a3Var.hashCode());
    }
}

package le;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class s0 extends c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f194383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y1 f194384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f194385c;
    public final v0 d;
    public final List e;

    public s0(List list, u0 u0Var, q1 q1Var, v0 v0Var, List list2) {
        this.f194383a = list;
        this.f194384b = u0Var;
        this.f194385c = q1Var;
        this.d = v0Var;
        this.e = list2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof c2)) {
            return false;
        }
        c2 c2Var = (c2) obj2;
        List list = this.f194383a;
        if (list == null) {
            if (((s0) c2Var).f194383a != null) {
                return false;
            }
        } else if (!list.equals(((s0) c2Var).f194383a)) {
            return false;
        }
        y1 y1Var = this.f194384b;
        if (y1Var == null) {
            if (((s0) c2Var).f194384b != null) {
                return false;
            }
        } else if (!y1Var.equals(((s0) c2Var).f194384b)) {
            return false;
        }
        q1 q1Var = this.f194385c;
        if (q1Var == null) {
            if (((s0) c2Var).f194385c != null) {
                return false;
            }
        } else if (!q1Var.equals(((s0) c2Var).f194385c)) {
            return false;
        }
        s0 s0Var = (s0) c2Var;
        return this.d.equals(s0Var.d) && this.e.equals(s0Var.e);
    }

    public final int hashCode() {
        List list = this.f194383a;
        int iHashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        y1 y1Var = this.f194384b;
        int iHashCode2 = (iHashCode ^ (y1Var == null ? 0 : y1Var.hashCode())) * 1000003;
        q1 q1Var = this.f194385c;
        return (((((q1Var != null ? q1Var.hashCode() : 0) ^ iHashCode2) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Execution{threads=");
        sb6.append(this.f194383a);
        sb6.append(", exception=");
        sb6.append(this.f194384b);
        sb6.append(", appExitInfo=");
        sb6.append(this.f194385c);
        sb6.append(", signal=");
        sb6.append(this.d);
        sb6.append(", binaries=");
        return t61.a.q("}", this.e, sb6);
    }
}

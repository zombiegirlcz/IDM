package le;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends e2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s0 f194375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f194376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f194377c;
    public final Boolean d;
    public final d2 e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f194378g;

    public r0(s0 s0Var, List list, List list2, Boolean bool, d2 d2Var, List list3, int i) {
        this.f194375a = s0Var;
        this.f194376b = list;
        this.f194377c = list2;
        this.d = bool;
        this.e = d2Var;
        this.f = list3;
        this.f194378g = i;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof e2)) {
            return false;
        }
        r0 r0Var = (r0) ((e2) obj2);
        List list = r0Var.f;
        d2 d2Var = r0Var.e;
        Boolean bool = r0Var.d;
        List list2 = r0Var.f194377c;
        List list3 = r0Var.f194376b;
        if (!this.f194375a.equals(r0Var.f194375a)) {
            return false;
        }
        List list4 = this.f194376b;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        List list5 = this.f194377c;
        if (list5 == null) {
            if (list2 != null) {
                return false;
            }
        } else if (!list5.equals(list2)) {
            return false;
        }
        Boolean bool2 = this.d;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        d2 d2Var2 = this.e;
        if (d2Var2 == null) {
            if (d2Var != null) {
                return false;
            }
        } else if (!d2Var2.equals(d2Var)) {
            return false;
        }
        List list6 = this.f;
        if (list6 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list6.equals(list)) {
            return false;
        }
        return this.f194378g == r0Var.f194378g;
    }

    public final int hashCode() {
        int iHashCode = (this.f194375a.hashCode() ^ 1000003) * 1000003;
        List list = this.f194376b;
        int iHashCode2 = (iHashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.f194377c;
        int iHashCode3 = (iHashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.d;
        int iHashCode4 = (iHashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        d2 d2Var = this.e;
        int iHashCode5 = (iHashCode4 ^ (d2Var == null ? 0 : d2Var.hashCode())) * 1000003;
        List list3 = this.f;
        return ((iHashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.f194378g;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Application{execution=");
        sb6.append(this.f194375a);
        sb6.append(", customAttributes=");
        sb6.append(this.f194376b);
        sb6.append(", internalKeys=");
        sb6.append(this.f194377c);
        sb6.append(", background=");
        sb6.append(this.d);
        sb6.append(", currentProcessDetails=");
        sb6.append(this.e);
        sb6.append(", appProcessDetails=");
        sb6.append(this.f);
        sb6.append(", uiOrientation=");
        return j6.a.v(sb6, "}", this.f194378g);
    }
}

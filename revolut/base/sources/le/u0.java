package le;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f194395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f194397c;
    public final y1 d;
    public final int e;

    public u0(String str, String str2, List list, y1 y1Var, int i) {
        this.f194395a = str;
        this.f194396b = str2;
        this.f194397c = list;
        this.d = y1Var;
        this.e = i;
    }

    public final boolean equals(Object obj2) {
        String str;
        y1 y1Var;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof y1) {
            u0 u0Var = (u0) ((y1) obj2);
            y1 y1Var2 = u0Var.d;
            String str2 = u0Var.f194396b;
            if (this.f194395a.equals(u0Var.f194395a) && ((str = this.f194396b) != null ? str.equals(str2) : str2 == null) && this.f194397c.equals(u0Var.f194397c) && ((y1Var = this.d) != null ? y1Var.equals(y1Var2) : y1Var2 == null) && this.e == u0Var.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f194395a.hashCode() ^ 1000003) * 1000003;
        String str = this.f194396b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f194397c.hashCode()) * 1000003;
        y1 y1Var = this.d;
        return ((iHashCode2 ^ (y1Var != null ? y1Var.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("Exception{type=");
        sb6.append(this.f194395a);
        sb6.append(", reason=");
        sb6.append(this.f194396b);
        sb6.append(", frames=");
        sb6.append(this.f194397c);
        sb6.append(", causedBy=");
        sb6.append(this.d);
        sb6.append(", overflowCount=");
        return j6.a.v(sb6, "}", this.e);
    }
}

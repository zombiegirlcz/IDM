package le;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0 extends t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f194276a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f194277b;

    public h0(List list, String str) {
        this.f194276a = list;
        this.f194277b = str;
    }

    public final boolean equals(Object obj2) {
        String str;
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof t1) {
            h0 h0Var = (h0) ((t1) obj2);
            String str2 = h0Var.f194277b;
            if (this.f194276a.equals(h0Var.f194276a) && ((str = this.f194277b) != null ? str.equals(str2) : str2 == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f194276a.hashCode() ^ 1000003) * 1000003;
        String str = this.f194277b;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb6 = new StringBuilder("FilesPayload{files=");
        sb6.append(this.f194276a);
        sb6.append(", orgId=");
        return v0.a.i(sb6, this.f194277b, "}");
    }
}

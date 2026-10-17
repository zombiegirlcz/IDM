package le;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h1 extends j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f194278a;

    public h1(List list) {
        this.f194278a = list;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof j2)) {
            return false;
        }
        return this.f194278a.equals(((h1) ((j2) obj2)).f194278a);
    }

    public final int hashCode() {
        return this.f194278a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return t61.a.q("}", this.f194278a, new StringBuilder("RolloutsState{rolloutAssignments="));
    }
}

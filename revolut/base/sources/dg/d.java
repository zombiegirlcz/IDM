package dg;

import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashSet f114559a;

    public d(HashSet hashSet) {
        this.f114559a = hashSet;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        return this.f114559a.equals(((d) obj2).f114559a);
    }

    public final int hashCode() {
        return this.f114559a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "RolloutsState{rolloutAssignments=" + this.f114559a + "}";
    }
}

package yb;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class n extends x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f312122a;

    public n(ArrayList arrayList) {
        this.f312122a = arrayList;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        return this.f312122a.equals(((n) ((x) obj2)).f312122a);
    }

    public final int hashCode() {
        return this.f312122a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return "BatchedLogRequest{logRequests=" + this.f312122a + "}";
    }
}

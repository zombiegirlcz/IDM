package qzb;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements aii.r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f250500a;

    public j(boolean z) {
        this.f250500a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f250500a == ((j) obj2).f250500a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f250500a);
    }
}

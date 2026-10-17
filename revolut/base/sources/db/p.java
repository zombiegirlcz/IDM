package db;

/* JADX INFO: loaded from: classes16.dex */
public final class p implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f112625a;

    public p(boolean z) {
        this.f112625a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f112625a == ((p) obj2).f112625a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f112625a);
    }

    public final String toString() {
        return "Payload(positionToScrollChanged=" + this.f112625a + ")";
    }
}

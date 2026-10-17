package g4b;

/* JADX INFO: loaded from: classes6.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f140456a;

    public p(boolean z) {
        this.f140456a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof p) && this.f140456a == ((p) obj2).f140456a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f140456a);
    }
}

package he3;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151569a;

    public n(int i) {
        this.f151569a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof n) && this.f151569a == ((n) obj2).f151569a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f151569a);
    }

    public n() {
        this(1);
    }
}

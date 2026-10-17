package ur;

/* JADX INFO: loaded from: classes17.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f282221a;

    public c() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof c) && this.f282221a == ((c) obj2).f282221a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f282221a);
    }

    public c(int i) {
        this.f282221a = i;
    }
}

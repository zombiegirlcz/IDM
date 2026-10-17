package u0h;

/* JADX INFO: loaded from: classes9.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f276199a;

    public b(int i) {
        this.f276199a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f276199a == ((b) obj2).f276199a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f276199a);
    }
}

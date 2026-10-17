package tx0;

/* JADX INFO: loaded from: classes20.dex */
public final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f275295a;

    public z3(int i) {
        this.f275295a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof z3) && this.f275295a == ((z3) obj2).f275295a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f275295a);
    }
}

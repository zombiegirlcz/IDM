package z0c;

/* JADX INFO: loaded from: classes6.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f318211a;

    public j(int i) {
        this.f318211a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f318211a == ((j) obj2).f318211a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f318211a);
    }
}

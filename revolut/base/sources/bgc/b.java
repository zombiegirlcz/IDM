package bgc;

/* JADX INFO: loaded from: classes6.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f15175a;

    public b(double d) {
        this.f15175a = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Double.compare(this.f15175a, ((b) obj2).f15175a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f15175a);
    }
}

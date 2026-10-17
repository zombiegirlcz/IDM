package djc;

/* JADX INFO: loaded from: classes6.dex */
public final class o implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f115310a;

    public o(double d) {
        this.f115310a = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof o) && Double.compare(this.f115310a, ((o) obj2).f115310a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f115310a);
    }
}

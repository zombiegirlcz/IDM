package uid;

/* JADX INFO: loaded from: classes7.dex */
public final class b extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f280381a;

    public b(double d) {
        this.f280381a = d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && Double.compare(this.f280381a, ((b) obj2).f280381a) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f280381a);
    }
}

package adl;

/* JADX INFO: loaded from: classes12.dex */
public final class b extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f3460b;

    public b(int i) {
        super(a0.d.h(i, "D"));
        this.f3460b = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b) && this.f3460b == ((b) obj2).f3460b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f3460b);
    }
}

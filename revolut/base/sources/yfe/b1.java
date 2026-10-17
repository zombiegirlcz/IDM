package yfe;

/* JADX INFO: loaded from: classes8.dex */
public final class b1 extends y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f313243a;

    public b1(int i) {
        this.f313243a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof b1) && this.f313243a == ((b1) obj2).f313243a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f313243a);
    }
}

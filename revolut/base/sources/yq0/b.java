package yq0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f315956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f315957b;

    public b() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f315956a == bVar.f315956a && this.f315957b == bVar.f315957b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f315957b) + (Integer.hashCode(this.f315956a) * 31);
    }

    public b(int i) {
        this.f315956a = -1;
        this.f315957b = -1;
    }
}

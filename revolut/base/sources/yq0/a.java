package yq0;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f315953a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f315954b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f315955c;
    public int d;

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f315953a == aVar.f315953a && this.f315954b == aVar.f315954b && Float.compare(this.f315955c, aVar.f315955c) == 0 && this.d == aVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + m72.b.b(this.f315955c, j6.a.b(this.f315954b, Integer.hashCode(this.f315953a) * 31, 31), 31);
    }
}

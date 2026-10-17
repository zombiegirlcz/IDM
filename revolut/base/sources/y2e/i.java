package y2e;

/* JADX INFO: loaded from: classes7.dex */
public final class i extends lk0.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f310644a;

    public i(int i) {
        this.f310644a = i;
    }

    @Override // lk0.f
    public final int a() {
        return 10;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof i) && this.f310644a == ((i) obj2).f310644a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f310644a) + (Integer.hashCode(10) * 31);
    }
}

package nc5;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements aii.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f214153a;

    public h(int i) {
        this.f214153a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f214153a == ((h) obj2).f214153a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f214153a);
    }
}

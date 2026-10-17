package wu;

/* JADX INFO: loaded from: classes17.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f300045a;

    public h() {
        this(0);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f300045a == ((h) obj2).f300045a;
    }

    public final int hashCode() {
        return Long.hashCode(this.f300045a);
    }

    public h(int i) {
        this.f300045a = 0L;
    }
}

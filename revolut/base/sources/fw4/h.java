package fw4;

/* JADX INFO: loaded from: classes22.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f138578a;

    public h(boolean z) {
        this.f138578a = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof h) && this.f138578a == ((h) obj2).f138578a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f138578a);
    }
}

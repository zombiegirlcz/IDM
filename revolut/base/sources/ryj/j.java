package ryj;

/* JADX INFO: loaded from: classes11.dex */
public final class j implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f258401a;

    public j(int i) {
        this.f258401a = i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof j) && this.f258401a == ((j) obj2).f258401a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f258401a);
    }
}

package pq0;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f238631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f238632b;

    public b(boolean z, boolean z3) {
        this.f238631a = z;
        this.f238632b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f238631a == bVar.f238631a && this.f238632b == bVar.f238632b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f238632b) + (Boolean.hashCode(this.f238631a) * 31);
    }
}

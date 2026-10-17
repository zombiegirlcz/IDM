package hx0;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f156314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f156315b;

    public j(int i, long j2) {
        this.f156314a = i;
        this.f156315b = j2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f156314a == jVar.f156314a && this.f156315b == jVar.f156315b;
    }

    public final int hashCode() {
        return Long.hashCode(this.f156315b) + (Integer.hashCode(this.f156314a) * 31);
    }
}

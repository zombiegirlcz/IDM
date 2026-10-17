package ba0;

/* JADX INFO: loaded from: classes19.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13876b;

    public j(int i, int i2) {
        this.f13875a = i;
        this.f13876b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f13875a == jVar.f13875a && this.f13876b == jVar.f13876b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f13876b) + (Integer.hashCode(this.f13875a) * 31);
    }
}

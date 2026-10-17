package nq1;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f218353a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f218354b;

    public a(int i, int i2) {
        this.f218353a = i;
        this.f218354b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f218353a == aVar.f218353a && this.f218354b == aVar.f218354b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f218354b) + (Integer.hashCode(this.f218353a) * 31);
    }
}

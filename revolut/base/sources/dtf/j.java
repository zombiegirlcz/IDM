package dtf;

/* JADX INFO: loaded from: classes9.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f117452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f117453b;

    public j(int i, int i2) {
        this.f117452a = i;
        this.f117453b = i2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f117452a == jVar.f117452a && this.f117453b == jVar.f117453b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f117453b) + (Integer.hashCode(this.f117452a) * 31);
    }
}

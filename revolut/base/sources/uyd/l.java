package uyd;

/* JADX INFO: loaded from: classes7.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f284218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f284219b;

    public l(int i, boolean z) {
        this.f284218a = i;
        this.f284219b = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l)) {
            return false;
        }
        l lVar = (l) obj2;
        return this.f284218a == lVar.f284218a && this.f284219b == lVar.f284219b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f284219b) + (Integer.hashCode(this.f284218a) * 31);
    }
}

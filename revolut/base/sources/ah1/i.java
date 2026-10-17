package ah1;

/* JADX INFO: loaded from: classes20.dex */
public final class i implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f4858b;

    public i(boolean z, boolean z3) {
        this.f4857a = z;
        this.f4858b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f4857a == iVar.f4857a && this.f4858b == iVar.f4858b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4858b) + (Boolean.hashCode(this.f4857a) * 31);
    }
}

package m2f;

/* JADX INFO: loaded from: classes8.dex */
public final class p implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f201987a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f201988b;

    public p(boolean z, boolean z3) {
        this.f201987a = z;
        this.f201988b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f201987a == pVar.f201987a && this.f201988b == pVar.f201988b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f201988b) + (Boolean.hashCode(this.f201987a) * 31);
    }
}

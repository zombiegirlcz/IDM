package uk2;

/* JADX INFO: loaded from: classes21.dex */
public final class b implements cli.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f280642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f280643b;

    public b(boolean z, boolean z3) {
        this.f280642a = z;
        this.f280643b = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return this.f280642a == bVar.f280642a && this.f280643b == bVar.f280643b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f280643b) + (Boolean.hashCode(this.f280642a) * 31);
    }
}

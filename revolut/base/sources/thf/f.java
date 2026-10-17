package thf;

/* JADX INFO: loaded from: classes8.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f271370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f271371b;

    public f() {
        this(false, 3);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f271370a == fVar.f271370a && this.f271371b == fVar.f271371b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f271371b) + (Boolean.hashCode(this.f271370a) * 31);
    }

    public f(boolean z, int i) {
        boolean z3 = (i & 1) == 0;
        z = (i & 2) != 0 ? true : z;
        this.f271370a = z3;
        this.f271371b = z;
    }
}

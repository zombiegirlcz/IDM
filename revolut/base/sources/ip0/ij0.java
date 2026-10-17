package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ij0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164707c;

    public ij0(boolean z, boolean z3, boolean z4) {
        this.f164705a = z;
        this.f164706b = z3;
        this.f164707c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ij0)) {
            return false;
        }
        ij0 ij0Var = (ij0) obj2;
        return this.f164705a == ij0Var.f164705a && this.f164706b == ij0Var.f164706b && this.f164707c == ij0Var.f164707c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164707c) + j6.a.c(Boolean.hashCode(this.f164705a) * 31, 31, this.f164706b);
    }
}

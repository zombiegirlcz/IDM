package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class f8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164214c;
    public final boolean d;

    public f8(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f164212a = z;
        this.f164213b = z3;
        this.f164214c = z4;
        this.d = z6;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f8)) {
            return false;
        }
        f8 f8Var = (f8) obj2;
        return this.f164212a == f8Var.f164212a && this.f164213b == f8Var.f164213b && this.f164214c == f8Var.f164214c && this.d == f8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f164212a) * 31, 31, this.f164213b), 31, this.f164214c);
    }
}

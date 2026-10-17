package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class i8 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164661c;
    public final boolean d;

    public i8(boolean z, boolean z3, boolean z4, boolean z6) {
        this.f164659a = z;
        this.f164660b = z3;
        this.f164661c = z4;
        this.d = z6;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) obj2;
        return this.f164659a == i8Var.f164659a && this.f164660b == i8Var.f164660b && this.f164661c == i8Var.f164661c && this.d == i8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(j6.a.c(Boolean.hashCode(this.f164659a) * 31, 31, this.f164660b), 31, this.f164661c);
    }
}

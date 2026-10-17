package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class il0 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164711b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164712c;

    public il0(boolean z, boolean z3, boolean z4) {
        this.f164710a = z;
        this.f164711b = z3;
        this.f164712c = z4;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f164710a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof il0)) {
            return false;
        }
        il0 il0Var = (il0) obj2;
        return this.f164710a == il0Var.f164710a && this.f164711b == il0Var.f164711b && this.f164712c == il0Var.f164712c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164712c) + j6.a.c(Boolean.hashCode(this.f164710a) * 31, 31, this.f164711b);
    }
}

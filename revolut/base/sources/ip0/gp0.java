package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class gp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164460a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164461b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164462c;

    public gp0(boolean z, boolean z3, boolean z4) {
        this.f164460a = z;
        this.f164461b = z3;
        this.f164462c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof gp0)) {
            return false;
        }
        gp0 gp0Var = (gp0) obj2;
        return this.f164460a == gp0Var.f164460a && this.f164461b == gp0Var.f164461b && this.f164462c == gp0Var.f164462c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164462c) + j6.a.c(Boolean.hashCode(this.f164460a) * 31, 31, this.f164461b);
    }
}

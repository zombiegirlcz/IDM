package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class rn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166217c;

    public rn0(boolean z, boolean z3, boolean z4) {
        this.f166215a = z;
        this.f166216b = z3;
        this.f166217c = z4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof rn0)) {
            return false;
        }
        rn0 rn0Var = (rn0) obj2;
        return this.f166215a == rn0Var.f166215a && this.f166216b == rn0Var.f166216b && this.f166217c == rn0Var.f166217c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f166217c) + j6.a.c(Boolean.hashCode(this.f166215a) * 31, 31, this.f166216b);
    }
}

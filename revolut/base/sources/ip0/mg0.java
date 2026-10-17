package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class mg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165376a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165377b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165378c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165379g;

    public mg0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f165376a = z;
        this.f165377b = z3;
        this.f165378c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165379g = z29;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof mg0)) {
            return false;
        }
        mg0 mg0Var = (mg0) obj2;
        return this.f165376a == mg0Var.f165376a && this.f165377b == mg0Var.f165377b && this.f165378c == mg0Var.f165378c && this.d == mg0Var.d && this.e == mg0Var.e && this.f == mg0Var.f && this.f165379g == mg0Var.f165379g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165379g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165376a) * 31, 31, this.f165377b), 31, this.f165378c), 31, this.d), 31, this.e), 31, this.f);
    }
}

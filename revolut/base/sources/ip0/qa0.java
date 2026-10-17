package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class qa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165951c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public qa0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f165949a = z;
        this.f165950b = z3;
        this.f165951c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof qa0)) {
            return false;
        }
        qa0 qa0Var = (qa0) obj2;
        return this.f165949a == qa0Var.f165949a && this.f165950b == qa0Var.f165950b && this.f165951c == qa0Var.f165951c && this.d == qa0Var.d && this.e == qa0Var.e && this.f == qa0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165949a) * 31, 31, this.f165950b), 31, this.f165951c), 31, this.d), 31, this.e);
    }
}

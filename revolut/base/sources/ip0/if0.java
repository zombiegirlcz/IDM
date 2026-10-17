package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class if0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164686c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164687g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164688h;

    public if0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31) {
        this.f164684a = z;
        this.f164685b = z3;
        this.f164686c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164687g = z29;
        this.f164688h = z31;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof if0)) {
            return false;
        }
        if0 if0Var = (if0) obj2;
        return this.f164684a == if0Var.f164684a && this.f164685b == if0Var.f164685b && this.f164686c == if0Var.f164686c && this.d == if0Var.d && this.e == if0Var.e && this.f == if0Var.f && this.f164687g == if0Var.f164687g && this.f164688h == if0Var.f164688h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164688h) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164684a) * 31, 31, this.f164685b), 31, this.f164686c), 31, this.d), 31, this.e), 31, this.f), 31, this.f164687g);
    }
}

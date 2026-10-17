package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class f70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164208c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164210h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f164211j;

    public f70(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f164206a = z;
        this.f164207b = z3;
        this.f164208c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164209g = z29;
        this.f164210h = z31;
        this.i = z41;
        this.f164211j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f70)) {
            return false;
        }
        f70 f70Var = (f70) obj2;
        return this.f164206a == f70Var.f164206a && this.f164207b == f70Var.f164207b && this.f164208c == f70Var.f164208c && this.d == f70Var.d && this.e == f70Var.e && this.f == f70Var.f && this.f164209g == f70Var.f164209g && this.f164210h == f70Var.f164210h && this.i == f70Var.i && this.f164211j == f70Var.f164211j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164211j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164206a) * 31, 31, this.f164207b), 31, this.f164208c), 31, this.d), 31, this.e), 31, this.f), 31, this.f164209g), 31, this.f164210h), 31, this.i);
    }
}

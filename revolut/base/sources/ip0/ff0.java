package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ff0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164252c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164253g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f164254h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f164255j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f164256l;

    public ff0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74) {
        this.f164250a = z;
        this.f164251b = z3;
        this.f164252c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164253g = z29;
        this.f164254h = z31;
        this.i = z41;
        this.f164255j = z49;
        this.k = z54;
        this.f164256l = z74;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ff0)) {
            return false;
        }
        ff0 ff0Var = (ff0) obj2;
        return this.f164250a == ff0Var.f164250a && this.f164251b == ff0Var.f164251b && this.f164252c == ff0Var.f164252c && this.d == ff0Var.d && this.e == ff0Var.e && this.f == ff0Var.f && this.f164253g == ff0Var.f164253g && this.f164254h == ff0Var.f164254h && this.i == ff0Var.i && this.f164255j == ff0Var.f164255j && this.k == ff0Var.k && this.f164256l == ff0Var.f164256l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164256l) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164250a) * 31, 31, this.f164251b), 31, this.f164252c), 31, this.d), 31, this.e), 31, this.f), 31, this.f164253g), 31, this.f164254h), 31, this.i), 31, this.f164255j), 31, this.k);
    }
}

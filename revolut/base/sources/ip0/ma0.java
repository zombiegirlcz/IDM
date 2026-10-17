package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ma0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f165344a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f165345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f165346c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f165347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f165348h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f165349j;

    public ma0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49) {
        this.f165344a = z;
        this.f165345b = z3;
        this.f165346c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f165347g = z29;
        this.f165348h = z31;
        this.i = z41;
        this.f165349j = z49;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ma0)) {
            return false;
        }
        ma0 ma0Var = (ma0) obj2;
        return this.f165344a == ma0Var.f165344a && this.f165345b == ma0Var.f165345b && this.f165346c == ma0Var.f165346c && this.d == ma0Var.d && this.e == ma0Var.e && this.f == ma0Var.f && this.f165347g == ma0Var.f165347g && this.f165348h == ma0Var.f165348h && this.i == ma0Var.i && this.f165349j == ma0Var.f165349j;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f165349j) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f165344a) * 31, 31, this.f165345b), 31, this.f165346c), 31, this.d), 31, this.e), 31, this.f), 31, this.f165347g), 31, this.f165348h), 31, this.i);
    }
}

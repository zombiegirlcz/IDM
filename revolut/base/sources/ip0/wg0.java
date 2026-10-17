package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class wg0 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167022a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167023b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167024c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f167025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f167026h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f167027j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f167028l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f167029m;

    public wg0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74, boolean z83) {
        this.f167022a = z;
        this.f167023b = z3;
        this.f167024c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f167025g = z29;
        this.f167026h = z31;
        this.i = z41;
        this.f167027j = z49;
        this.k = z54;
        this.f167028l = z74;
        this.f167029m = z83;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f167029m;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wg0)) {
            return false;
        }
        wg0 wg0Var = (wg0) obj2;
        return this.f167022a == wg0Var.f167022a && this.f167023b == wg0Var.f167023b && this.f167024c == wg0Var.f167024c && this.d == wg0Var.d && this.e == wg0Var.e && this.f == wg0Var.f && this.f167025g == wg0Var.f167025g && this.f167026h == wg0Var.f167026h && this.i == wg0Var.i && this.f167027j == wg0Var.f167027j && this.k == wg0Var.k && this.f167028l == wg0Var.f167028l && this.f167029m == wg0Var.f167029m;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f167029m) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167022a) * 31, 31, this.f167023b), 31, this.f167024c), 31, this.d), 31, this.e), 31, this.f), 31, this.f167025g), 31, this.f167026h), 31, this.i), 31, this.f167027j), 31, this.k), 31, this.f167028l);
    }
}

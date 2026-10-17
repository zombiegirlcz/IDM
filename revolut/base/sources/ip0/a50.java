package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class a50 implements qv0.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163390a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163391b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163392c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f163394h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f163395j;
    public final boolean k;

    public a50(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54) {
        this.f163390a = z;
        this.f163391b = z3;
        this.f163392c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163393g = z29;
        this.f163394h = z31;
        this.i = z41;
        this.f163395j = z49;
        this.k = z54;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a50)) {
            return false;
        }
        a50 a50Var = (a50) obj2;
        return this.f163390a == a50Var.f163390a && this.f163391b == a50Var.f163391b && this.f163392c == a50Var.f163392c && this.d == a50Var.d && this.e == a50Var.e && this.f == a50Var.f && this.f163393g == a50Var.f163393g && this.f163394h == a50Var.f163394h && this.i == a50Var.i && this.f163395j == a50Var.f163395j && this.k == a50Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163390a) * 31, 31, this.f163391b), 31, this.f163392c), 31, this.d), 31, this.e), 31, this.f), 31, this.f163393g), 31, this.f163394h), 31, this.i), 31, this.f163395j);
    }
}

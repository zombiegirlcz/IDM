package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class cj implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163744a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163745b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163746c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163747g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f163748h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f163749j;
    public final boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f163750l;

    public cj(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41, boolean z49, boolean z54, boolean z74) {
        this.f163744a = z;
        this.f163745b = z3;
        this.f163746c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163747g = z29;
        this.f163748h = z31;
        this.i = z41;
        this.f163749j = z49;
        this.k = z54;
        this.f163750l = z74;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f163750l;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof cj)) {
            return false;
        }
        cj cjVar = (cj) obj2;
        return this.f163744a == cjVar.f163744a && this.f163745b == cjVar.f163745b && this.f163746c == cjVar.f163746c && this.d == cjVar.d && this.e == cjVar.e && this.f == cjVar.f && this.f163747g == cjVar.f163747g && this.f163748h == cjVar.f163748h && this.i == cjVar.i && this.f163749j == cjVar.f163749j && this.k == cjVar.k && this.f163750l == cjVar.f163750l;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f163750l) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163744a) * 31, 31, this.f163745b), 31, this.f163746c), 31, this.d), 31, this.e), 31, this.f), 31, this.f163747g), 31, this.f163748h), 31, this.i), 31, this.f163749j), 31, this.k);
    }
}

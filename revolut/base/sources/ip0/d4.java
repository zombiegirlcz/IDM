package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class d4 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163838c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f163839g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f163840h;
    public final boolean i;

    public d4(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29, boolean z31, boolean z41) {
        this.f163836a = z;
        this.f163837b = z3;
        this.f163838c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f163839g = z29;
        this.f163840h = z31;
        this.i = z41;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.i;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d4)) {
            return false;
        }
        d4 d4Var = (d4) obj2;
        return this.f163836a == d4Var.f163836a && this.f163837b == d4Var.f163837b && this.f163838c == d4Var.f163838c && this.d == d4Var.d && this.e == d4Var.e && this.f == d4Var.f && this.f163839g == d4Var.f163839g && this.f163840h == d4Var.f163840h && this.i == d4Var.i;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.i) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163836a) * 31, 31, this.f163837b), 31, this.f163838c), 31, this.d), 31, this.e), 31, this.f), 31, this.f163839g), 31, this.f163840h);
    }
}

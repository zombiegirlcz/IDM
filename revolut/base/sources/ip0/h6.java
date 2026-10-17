package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class h6 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f164510a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f164511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f164512c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f164513g;

    public h6(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f164510a = z;
        this.f164511b = z3;
        this.f164512c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f164513g = z29;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f164513g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h6)) {
            return false;
        }
        h6 h6Var = (h6) obj2;
        return this.f164510a == h6Var.f164510a && this.f164511b == h6Var.f164511b && this.f164512c == h6Var.f164512c && this.d == h6Var.d && this.e == h6Var.e && this.f == h6Var.f && this.f164513g == h6Var.f164513g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f164513g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f164510a) * 31, 31, this.f164511b), 31, this.f164512c), 31, this.d), 31, this.e), 31, this.f);
    }
}

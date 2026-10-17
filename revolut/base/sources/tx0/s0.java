package tx0;

/* JADX INFO: loaded from: classes20.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f275237a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f275238b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f275239c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f275240g;

    public s0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12, boolean z29) {
        this.f275237a = z;
        this.f275238b = z3;
        this.f275239c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
        this.f275240g = z29;
    }

    public final boolean a() {
        return this.f275239c;
    }

    public final boolean b() {
        return this.d;
    }

    public final boolean c() {
        return this.f275237a;
    }

    public final boolean d() {
        return this.f;
    }

    public final boolean e() {
        return this.f275240g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return this.f275237a == s0Var.f275237a && this.f275238b == s0Var.f275238b && this.f275239c == s0Var.f275239c && this.d == s0Var.d && this.e == s0Var.e && this.f == s0Var.f && this.f275240g == s0Var.f275240g;
    }

    public final boolean f() {
        return this.f275238b;
    }

    public final boolean g() {
        return this.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f275240g) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f275237a) * 31, 31, this.f275238b), 31, this.f275239c), 31, this.d), 31, this.e), 31, this.f);
    }
}

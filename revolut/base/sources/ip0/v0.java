package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class v0 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166751c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public v0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f166749a = z;
        this.f166750b = z3;
        this.f166751c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj2;
        return this.f166749a == v0Var.f166749a && this.f166750b == v0Var.f166750b && this.f166751c == v0Var.f166751c && this.d == v0Var.d && this.e == v0Var.e && this.f == v0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166749a) * 31, 31, this.f166750b), 31, this.f166751c), 31, this.d), 31, this.e);
    }
}

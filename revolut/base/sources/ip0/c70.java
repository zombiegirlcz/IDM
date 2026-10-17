package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class c70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163693c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public c70(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f163691a = z;
        this.f163692b = z3;
        this.f163693c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c70)) {
            return false;
        }
        c70 c70Var = (c70) obj2;
        return this.f163691a == c70Var.f163691a && this.f163692b == c70Var.f163692b && this.f163693c == c70Var.f163693c && this.d == c70Var.d && this.e == c70Var.e && this.f == c70Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163691a) * 31, 31, this.f163692b), 31, this.f163693c), 31, this.d), 31, this.e);
    }
}

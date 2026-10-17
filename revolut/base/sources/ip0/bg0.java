package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class bg0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163607c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public bg0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11, boolean z12) {
        this.f163605a = z;
        this.f163606b = z3;
        this.f163607c = z4;
        this.d = z6;
        this.e = z11;
        this.f = z12;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bg0)) {
            return false;
        }
        bg0 bg0Var = (bg0) obj2;
        return this.f163605a == bg0Var.f163605a && this.f163606b == bg0Var.f163606b && this.f163607c == bg0Var.f163607c && this.d == bg0Var.d && this.e == bg0Var.e && this.f == bg0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + j6.a.c(j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163605a) * 31, 31, this.f163606b), 31, this.f163607c), 31, this.d), 31, this.e);
    }
}

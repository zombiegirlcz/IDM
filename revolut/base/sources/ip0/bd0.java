package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class bd0 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f163583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f163584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f163585c;
    public final boolean d;
    public final boolean e;

    public bd0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f163583a = z;
        this.f163584b = z3;
        this.f163585c = z4;
        this.d = z6;
        this.e = z11;
    }

    @Override // qv0.b
    public final boolean a() {
        return this.e;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof bd0)) {
            return false;
        }
        bd0 bd0Var = (bd0) obj2;
        return this.f163583a == bd0Var.f163583a && this.f163584b == bd0Var.f163584b && this.f163585c == bd0Var.f163585c && this.d == bd0Var.d && this.e == bd0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f163583a) * 31, 31, this.f163584b), 31, this.f163585c), 31, this.d);
    }
}

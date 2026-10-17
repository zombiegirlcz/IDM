package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class ua0 implements qv0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f166639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f166640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f166641c;
    public final boolean d;
    public final boolean e;

    public ua0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f166639a = z;
        this.f166640b = z3;
        this.f166641c = z4;
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
        if (!(obj2 instanceof ua0)) {
            return false;
        }
        ua0 ua0Var = (ua0) obj2;
        return this.f166639a == ua0Var.f166639a && this.f166640b == ua0Var.f166640b && this.f166641c == ua0Var.f166641c && this.d == ua0Var.d && this.e == ua0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f166639a) * 31, 31, this.f166640b), 31, this.f166641c), 31, this.d);
    }
}

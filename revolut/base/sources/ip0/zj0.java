package ip0;

/* JADX INFO: loaded from: classes19.dex */
public final class zj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f167475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f167476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f167477c;
    public final boolean d;
    public final boolean e;

    public zj0(boolean z, boolean z3, boolean z4, boolean z6, boolean z11) {
        this.f167475a = z;
        this.f167476b = z3;
        this.f167477c = z4;
        this.d = z6;
        this.e = z11;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof zj0)) {
            return false;
        }
        zj0 zj0Var = (zj0) obj2;
        return this.f167475a == zj0Var.f167475a && this.f167476b == zj0Var.f167476b && this.f167477c == zj0Var.f167477c && this.d == zj0Var.d && this.e == zj0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + j6.a.c(j6.a.c(j6.a.c(Boolean.hashCode(this.f167475a) * 31, 31, this.f167476b), 31, this.f167477c), 31, this.d);
    }
}
